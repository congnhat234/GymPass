package teampass.gympass;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import teampass.gympass.adapter.ListMenu;
import teampass.gympass.model.Menun;

public class ExerciseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private ListView lv_exercise;
    private ArrayList<Menun> menuns=new ArrayList<Menun>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slide_bar_action);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        doCreateFakeData();
        lv_exercise=(ListView)findViewById(R.id.lv_exercise);

        ListMenu adapter=new ListMenu(ExerciseActivity.this,R.layout.item_menu,menuns);
        lv_exercise.setAdapter(adapter);
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
    private void doCreateFakeData(){
        Menun m1=new Menun(R.drawable.bung,"BỤNG");
        Menun m2=new Menun(R.drawable.lung,"LƯNG");
        Menun m3=new Menun(R.drawable.bapchan,"BẮP TAY");
        Menun m4=new Menun(R.drawable.nguc,"NGỰC");
        Menun m5=new Menun(R.drawable.cangtay,"CẲNG TAY");
        Menun m6=new Menun(R.drawable.bapchan,"BẮP CHÂN");

        menuns.add(m1);
        menuns.add(m2);
        menuns.add(m3);
        menuns.add(m4);
        menuns.add(m5);
        menuns.add(m6);
    }
}
