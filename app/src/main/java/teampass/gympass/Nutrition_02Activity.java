package teampass.gympass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import teampass.gympass.adapter.ListNhomBaiTap;
import teampass.gympass.bean.NhomBaiTap;

public class Nutrition_02Activity extends AppCompatActivity {
    private ListView lvGiamcan;
    private ArrayList<NhomBaiTap> mMenun = new ArrayList<NhomBaiTap>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_02);
        //doCreateFakeData();

        lvGiamcan = (ListView) findViewById(R.id.lvGiamcan);
        ListNhomBaiTap adapter = new ListNhomBaiTap(Nutrition_02Activity.this, R.layout.item_menu, mMenun);
        lvGiamcan.setAdapter(adapter);
    }

//    private void doCreateFakeData() {
//        Menun m1 = new Menun(R.drawable.giamcant2, "Thực đơn thứ 2");
//        Menun m2 = new Menun(R.drawable.giamcant3, "Thực đơn thứ 3");
//        Menun m3 = new Menun(R.drawable.giamcant4, "Thực đơn thứ 4");
//        Menun m4 = new Menun(R.drawable.giamcant5, "Thực đơn thứ 5");
//        Menun m5 = new Menun(R.drawable.giamcant6, "Thực đơn thứ 6");
//        Menun m6 = new Menun(R.drawable.giamcant7, "Thực đơn thứ 7");
//        Menun m7 = new Menun(R.drawable.giamcant8, "Thực đơn chủ nhật");
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
