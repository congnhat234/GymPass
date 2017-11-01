package teampass.gympass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import teampass.gympass.adapter.ListMenu;
import teampass.gympass.model.Menun;

public class Nutrition_04Activity extends AppCompatActivity {
    private ListView lvThucpham;
    private ArrayList<Menun> mMenun = new ArrayList<Menun>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_04);
        doCreateFakeData();

        lvThucpham = (ListView) findViewById(R.id.lvThucpham);
        ListMenu adapter = new ListMenu(Nutrition_04Activity.this,R.layout.item_menu,mMenun);
        lvThucpham.setAdapter(adapter);
    }

    private void doCreateFakeData() {
        Menun m1 = new Menun(R.drawable.thucpham1, "Thực phẩm----");
        Menun m2 = new Menun(R.drawable.thucpham2, "Thực phẩm----");
        Menun m3 = new Menun(R.drawable.thucpham3, "Thực phẩm----");
        Menun m4 = new Menun(R.drawable.thucpham4, "Thực phẩm----");
        Menun m5 = new Menun(R.drawable.thucpham5, "Thực phẩm----");
        Menun m6 = new Menun(R.drawable.thucpham6, "Thực phẩm---- ");
        Menun m7 = new Menun(R.drawable.thucpham7, "Thực phẩm----");
        Menun m8 = new Menun(R.drawable.thucpham8, "Thực phẩm----");

        mMenun.add(m1);
        mMenun.add(m2);
        mMenun.add(m3);
        mMenun.add(m4);
        mMenun.add(m5);
        mMenun.add(m6);
        mMenun.add(m7);
        mMenun.add(m8);
    }
}
