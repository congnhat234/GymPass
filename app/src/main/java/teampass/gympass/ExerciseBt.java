package teampass.gympass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import teampass.gympass.adapter.CustomAdapter;
import teampass.gympass.model.Menu;

import static teampass.gympass.R.drawable.bung1;
import static teampass.gympass.R.drawable.cc;
import static teampass.gympass.R.drawable.fitness;
import static teampass.gympass.R.drawable.gym;
import static teampass.gympass.R.drawable.threedays;

public class ExerciseBt extends AppCompatActivity {
    private ListView lvDay1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_bt);
        listmenu();
    }
    public void listmenu() {
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
        lvDay1 = (ListView) findViewById(R.id.lv_exercisebt);
        lvDay1.setAdapter(customAdapter1);

    }
}
