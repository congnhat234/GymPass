package teampass.gympass;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import teampass.gympass.adapter.ListNhomBaiTap;
import teampass.gympass.bean.NhomBaiTap;


/**
 * Created by DELL on 9/21/2017.
 */

public class WorkoutsThehinh extends AppCompatActivity {
    private ListView lv_workout_option;
    private ArrayList<NhomBaiTap> mMenun = new ArrayList<NhomBaiTap>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workouts_thehinh);
        doCreateFakeData();
        lv_workout_option = (ListView) findViewById(R.id.lv_workout_option);
        final ListNhomBaiTap adapter = new ListNhomBaiTap(WorkoutsThehinh.this, R.layout.item_menu, mMenun);
        lv_workout_option.setAdapter(adapter);
        this.lv_workout_option.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        SharedPreferences sharedPreferences = getSharedPreferences("myData", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("day","2day");
                        editor.commit();
                        break;
                    case 1:
                        sharedPreferences = getSharedPreferences("myData", Context.MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.putString("day","3day");
                        editor.commit();
                        break;
                    case 2:
                        sharedPreferences = getSharedPreferences("myData", Context.MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.putString("day","4day");
                        editor.commit();
                        break;
                }
                Intent intent = new Intent(WorkoutsThehinh.this, Workouts_2daysPerWeek.class);
                startActivity(intent);
            }
        });
    }
    private void doCreateFakeData() {
        NhomBaiTap m1 = new NhomBaiTap(1, "2 ngày mỗi tuần", "time");
        NhomBaiTap m2 = new NhomBaiTap(2, "3 ngày mỗi tuần", "time");
        NhomBaiTap m3 = new NhomBaiTap(3, "4 ngày mỗi tuần", "time");

        mMenun.add(m1);
        mMenun.add(m2);
        mMenun.add(m3);
    }

    }

