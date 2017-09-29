package teampass.gympass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import teampass.gympass.adapter.CustomAdapter;
import teampass.gympass.model.Menu;

import static teampass.gympass.R.drawable.abs;
import static teampass.gympass.R.drawable.back;
import static teampass.gympass.R.drawable.bung1;
import static teampass.gympass.R.drawable.burnfat;
import static teampass.gympass.R.drawable.cc;
import static teampass.gympass.R.drawable.chest;
import static teampass.gympass.R.drawable.fitness;
import static teampass.gympass.R.drawable.gotay;
import static teampass.gympass.R.drawable.gym;
import static teampass.gympass.R.drawable.leg;
import static teampass.gympass.R.drawable.shouders;
import static teampass.gympass.R.drawable.threedays;

/**
 * Created by DELL on 9/22/2017.
 */

public class Workouts_2daysPerWeek extends AppCompatActivity {
    private ListView lvDay1;
    private ListView lvDay2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workouts_2daysperweek);
        final ArrayList<Menu> arrayList1 = new ArrayList<>();
        Menu menu1 = new Menu(cc, "Thể hình");
        Menu menu2 = new Menu(fitness, "Fitness");
        Menu menu3 = new Menu(gym, "Lifting");
        Menu menu4 = new Menu(threedays, "Kế hoạch tập 3 ngày");
        Menu menu5 = new Menu(bung1, "Kế hoạch tập 3 ngày tại nhà");
//        Menu menu6 = new Menu(burnfat, "Đốt mỡ");
//        Menu menu7 = new Menu(abs, "Abs burnner");

        arrayList1.add(menu1);
        arrayList1.add(menu2);
        arrayList1.add(menu3);
        arrayList1.add(menu4);
        arrayList1.add(menu5);
//        arrayList1.add(menu6);
//        arrayList1.add(menu7);

        CustomAdapter customAdapter1 = new CustomAdapter(this, R.layout.test, arrayList1);
        lvDay1 = (ListView) findViewById(R.id.lv_workouts_day1);
        lvDay1.setAdapter(customAdapter1);
        final ArrayList<Menu> arrayList2 = new ArrayList<>();
        Menu menu8 = new Menu(chest, "Chest");
        Menu menu9 = new Menu(gotay, "Arms");
        Menu menu10 = new Menu(leg, "Legs");
        Menu menu11 = new Menu(shouders, "Shouders");
        Menu menu12 = new Menu(back, "Back");
        arrayList2.add(menu8);
        arrayList2.add(menu9);
        arrayList2.add(menu10);
        arrayList2.add(menu11);
        arrayList2.add(menu12);

        CustomAdapter customAdapter2 = new CustomAdapter(this, R.layout.test, arrayList2);
        lvDay2 = (ListView) findViewById(R.id.lv_workouts_day2);
        lvDay2.setAdapter(customAdapter2);


//        lvDay1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                switch (position) {
//                    case 0:
//                        Intent intent = new Intent(WorkoutsActivity.this, WorkoutsThehinh.class);
//                        startActivity(intent);
//                        break;
//                    case 1:
//                        Intent intent1 = new Intent(WorkoutsActivity.this, WorkoutsThehinh.class);
//                        startActivity(intent1);
//                        break;
//
//
//                }
//            }
//        });
//    }
//}



    }
}
