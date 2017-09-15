package teampass.gympass;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    private ListView lvWorkouts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.list_view);
       lvWorkouts=(ListView)findViewById(R.id.lv_workouts);
        ArrayList<Menu> arrayList = new ArrayList<>();
        Menu menu1 =new Menu("Thể Hình", Color.BLUE);
        Menu menu2 =new Menu("Fitness", Color.BLUE);
        Menu menu3 =new Menu("Lifting", Color.BLUE);
        Menu menu4 =new Menu("Kế hoạch tập 3 ngày", Color.BLUE);
        Menu menu5 =new Menu("Kế hoạch tập 3 ngày tại nhà", Color.BLUE);
        arrayList.add(menu1);
        arrayList.add(menu2);
        arrayList.add(menu3);
        arrayList.add(menu4);
        arrayList.add(menu5);
        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.test, arrayList);
        lvWorkouts.setAdapter(customAdapter);
    }

}