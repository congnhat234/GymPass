package teampass.gympass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import teampass.gympass.adapter.ListNhomBaiTap;
import teampass.gympass.bean.NhomBaiTap;

public class Nutrition_03Activity extends AppCompatActivity {
    private ListView lvTangco;
    private ArrayList<NhomBaiTap> mMenun = new ArrayList<NhomBaiTap>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_03);
        //doCreateFakeData();

        lvTangco = (ListView) findViewById(R.id.lvTangco);
        ListNhomBaiTap adapter = new ListNhomBaiTap(Nutrition_03Activity.this, R.layout.item_menu, mMenun);
        lvTangco.setAdapter(adapter);
    }

//    private void doCreateFakeData() {
//        Menun m1 = new Menun(R.drawable.tangcot2, "Thực đơn thứ 2");
//        Menun m2 = new Menun(R.drawable.tangcot3, "Thực đơn thứ 3");
//        Menun m3 = new Menun(R.drawable.tangcot4, "Thực đơn thứ 4");
//        Menun m4 = new Menun(R.drawable.tangcot5, "Thực đơn thứ 5");
//        Menun m5 = new Menun(R.drawable.tangcot6, "Thực đơn thứ 6");
//        Menun m6 = new Menun(R.drawable.tangcot7, "Thực đơn thứ 7");
//        Menun m7 = new Menun(R.drawable.tangcot8, "Thực đơn chủ nhật");
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
