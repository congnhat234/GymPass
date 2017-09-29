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
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import teampass.gympass.adapter.ListMenu;
import teampass.gympass.model.Menun;

public class NutritionActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private ListView lv_nutrition;
    private ArrayList<Menun> menuns = new ArrayList<Menun>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slide_bar_action_nutrition);
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

        doCreateFakeData();
        lv_nutrition= (ListView) findViewById(R.id.lv_nutrition);

        ListMenu adapter=new ListMenu(NutritionActivity.this,R.layout.item_menu,menuns);
        lv_nutrition.setAdapter(adapter);
        lv_nutrition.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent = new Intent(NutritionActivity.this, Nutrition_01Activity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(NutritionActivity.this, Nutrition_02Activity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(NutritionActivity.this, Nutrition_03Activity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(NutritionActivity.this, Nutrition_04Activity.class);
                        startActivity(intent3);
                        break;
                }
            }
        });
//        txt = (TextView) findViewById(R.id.textView);
//        txt2 = (TextView) findViewById(R.id.textView2);
//        txt3 = (TextView) findViewById(R.id.textView3);
//        txt4 = (TextView) findViewById(R.id.textView4);
//
//        txt.setOnClickListener(this);
//        txt2.setOnClickListener(this);
//        txt3.setOnClickListener(this);
//        txt4.setOnClickListener(this);


    }


//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.textView:
//                Intent intent = new Intent(NutritionActivity.this, Nutrition_01Activity.class);
//                startActivity(intent);
//                break;
//            case R.id.textView2:
//                Intent intent1 = new Intent(NutritionActivity.this, Nutrition_02Activity.class);
//                startActivity(intent1);
//                break;
//            case R.id.textView3:
//                Intent intent2 = new Intent(NutritionActivity.this, Nutrition_03Activity.class);
//                startActivity(intent2);
//                break;
//            case R.id.textView4:
//                Intent intent3 = new Intent(NutritionActivity.this, Nutrition_04Activity.class);
//                startActivity(intent3);
//                break;
//        }
//
//
//    }

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
            Intent intent = new Intent(NutritionActivity.this, ExerciseActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_workout) {
            Intent intent = new Intent(NutritionActivity.this, WorkoutsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_nutrition) {

        } else if (id == R.id.nav_music) {

        } else if (id == R.id.nav_more) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void doCreateFakeData(){
        Menun m1=new Menun(R.drawable.tangcan,"THỰC ĐƠN TĂNG CÂN");
        Menun m2=new Menun(R.drawable.diet,"THỰC ĐƠN GIẢM CÂN");
        Menun m3=new Menun(R.drawable.protein,"THỰC ĐƠN TĂNG CƠ");
        Menun m4=new Menun(R.drawable.foodothers,"THỰC PHẨM BỔ SUNG");


        menuns.add(m1);
        menuns.add(m2);
        menuns.add(m3);
        menuns.add(m4);

    }
}
