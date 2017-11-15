package teampass.gympass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import teampass.gympass.adapter.ListNhomBaiTap;
import teampass.gympass.bean.NhomBaiTap;

public class Nutrition_01Activity extends AppCompatActivity {
    private ListView lvTangcan;
    private ArrayList<NhomBaiTap> mMenun = new ArrayList<NhomBaiTap>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_01);
        //doCreateFakeData();

        lvTangcan = (ListView) findViewById(R.id.lvTangcan);
        final ListNhomBaiTap adapter = new ListNhomBaiTap(Nutrition_01Activity.this, R.layout.item_menu, mMenun);
        lvTangcan.setAdapter(adapter);
        lvTangcan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                switch (position){
//                    case 0:
//                        Intent intent = new Intent(Nutrition_01Activity.this, MainActivity.class);
//                        startActivity(intent);
//                        break;
//                    case 1:
//                        Intent intent1 = new Intent(Nutrition_01Activity.this, Nutrition_02Activity.class);
//                        startActivity(intent1);
//                        break;
//                    case 2:
//                        Intent intent2 = new Intent(Nutrition_01Activity.this, Nutrition_03Activity.class);
//                        startActivity(intent2);
//                        break;
//                    case 3:
//                        Intent intent3 = new Intent(Nutrition_01Activity.this, Nutrition_04Activity.class);
//                        startActivity(intent3);
//                        break;
//                }
            }
        });
    }

//    private void doCreateFakeData() {
//        Menun m1 = new Menun(R.drawable.tangcant2, "Thực đơn thứ 2");
//        Menun m2 = new Menun(R.drawable.tangcant3, "Thực đơn thứ 3");
//        Menun m3 = new Menun(R.drawable.tangcant4, "Thực đơn thứ 4");
//        Menun m4 = new Menun(R.drawable.tangcant5, "Thực đơn thứ 5");
//        Menun m5 = new Menun(R.drawable.tangcant6, "Thực đơn thứ 6");
//        Menun m6 = new Menun(R.drawable.tangcant7, "Thực đơn thứ 7");
//        Menun m7 = new Menun(R.drawable.tangcancn, "Thực đơn chủ nhật");
//
//        mMenun.add(m1);
//        mMenun.add(m2);
//        mMenun.add(m3);
//        mMenun.add(m4);
//        mMenun.add(m5);
//        mMenun.add(m6);
//        mMenun.add(m7);
//    }

}
