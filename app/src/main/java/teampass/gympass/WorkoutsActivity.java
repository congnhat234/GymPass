package teampass.gympass;

        import android.content.Context;
        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.database.sqlite.SQLiteDatabase;
        import android.support.design.widget.NavigationView;
        import android.support.v4.view.GravityCompat;
        import android.support.v4.widget.DrawerLayout;
        import android.support.v7.app.ActionBarDrawerToggle;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.Toolbar;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListView;

        import java.util.ArrayList;
        import java.util.List;

        import teampass.gympass.adapter.ListNhomBaiTap;
        import teampass.gympass.adapter.ListNhomWorkout;
        import teampass.gympass.bean.Exercise;
        import teampass.gympass.bean.NhomWorkout;

public class WorkoutsActivity  extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private ListView lvWorkouts;
    private ArrayList<NhomWorkout> list = new ArrayList<NhomWorkout>();
    private DatabaseOpenHelper mDBHelper;
    private SQLiteDatabase mDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slide_bar_action_workout);
        //begin_menu
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //end_menu

        lvWorkouts = (ListView) findViewById(R.id.lv_workouts);
        final DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        final List<NhomWorkout> listNhom = databaseAccess.getAllNhomWorkout();
        this.list.addAll(listNhom);
        databaseAccess.close();

        ListNhomWorkout adapter = new ListNhomWorkout(WorkoutsActivity.this, R.layout.item_menu, list);
        lvWorkouts.setAdapter(adapter);
        this.lvWorkouts.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                SharedPreferences sharedPreferences = getSharedPreferences("myData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("soA", i);
                editor.commit();

                databaseAccess.open();
                List<Exercise> listTextNote = databaseAccess.getExercisesByID(listNhom.get(i).getId());
                for(int j=0;j<listTextNote.size();j++){
                    System.out.println(listTextNote.get(j).getChitiet());
                }
                Intent intent = new Intent(WorkoutsActivity.this, WorkoutsThehinh.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_exercise) {
            Intent intent = new Intent(WorkoutsActivity.this, ExerciseActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_workout) {

        } else if (id == R.id.nav_nutrition) {
            Intent intent = new Intent(WorkoutsActivity.this, NutritionActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_music) {

        } else if (id == R.id.nav_more) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}




