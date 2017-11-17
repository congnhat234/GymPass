package teampass.gympass;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import teampass.gympass.adapter.ListNhomBaiTap;
import teampass.gympass.bean.Exercise;
import teampass.gympass.bean.NhomBaiTap;

public class ExerciseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private ListView lv_exercise;
    private ArrayList<NhomBaiTap> list = new ArrayList<NhomBaiTap>();
    private DatabaseOpenHelper mDBHelper;
    private SQLiteDatabase mDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slide_bar_action);
        menu_main();
        //doCreateFakeData();
        lv_exercise = (ListView) findViewById(R.id.lv_exercise);
        final DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        final List<NhomBaiTap> listNhom = databaseAccess.getAllNhomBaiTap();
        this.list.addAll(listNhom);
        databaseAccess.close();

        ListNhomBaiTap adapter = new ListNhomBaiTap(ExerciseActivity.this, R.layout.item_menu, list);
        lv_exercise.setAdapter(adapter);
        this.lv_exercise.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                SharedPreferences sharedPreferences = getSharedPreferences("exerciseData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("id_nhom", list.get(i).getId());
                editor.commit();
                Intent intent = new Intent(ExerciseActivity.this, ExerciseBt.class);
                startActivity(intent);
//                databaseAccess.open();
//                List<Exercise> listExercise = databaseAccess.getExercisesByID(listNhom.get(i).getId());
//                for(int j=0;j<listExercise.size();j++){
//                    //System.out.println(listTextNote.get(j).getContent());
//                }
            }
        });
    }

    public void menu_main() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
            // Handle the camera action
        } else if (id == R.id.nav_workout) {
            Intent intent = new Intent(ExerciseActivity.this, WorkoutsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_nutrition) {
            Intent intent = new Intent(ExerciseActivity.this, NutritionActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_music) {

        } else if (id == R.id.nav_more) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
