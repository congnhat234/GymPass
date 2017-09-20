package teampass.gympass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import teampass.gympass.adapter.ListMenu;
import teampass.gympass.model.Menun;

public class Nutrition_01Activity extends AppCompatActivity {
    private ListView lvTangcan;
    private ArrayList<Menun> mMenun = new ArrayList<Menun>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_01);
        doCreateFakeData();

        lvTangcan = (ListView) findViewById(R.id.lvTangcan);
        ListMenu adapter = new ListMenu(Nutrition_01Activity.this, R.layout.item_menu, mMenun);
        lvTangcan.setAdapter(adapter);
    }
    private void doCreateFakeData() {
        Menun m1 = new Menun(R.drawable.tangcant2, "Thực đơn thứ 2");
        Menun m2 = new Menun(R.drawable.tangcant3, "Thực đơn thứ 3");
        Menun m3 = new Menun(R.drawable.tangcant4, "Thực đơn thứ 4");
        Menun m4 = new Menun(R.drawable.tangcant5, "Thực đơn thứ 5");
        Menun m5 = new Menun(R.drawable.tangcant6, "Thực đơn thứ 6");
        Menun m6 = new Menun(R.drawable.tangcant7, "Thực đơn thứ 7");
        Menun m7 = new Menun(R.drawable.tangcancn, "Thực đơn chủ nhật");

        mMenun.add(m1);
        mMenun.add(m2);
        mMenun.add(m3);
        mMenun.add(m4);
        mMenun.add(m5);
        mMenun.add(m6);
        mMenun.add(m7);
    }
}
