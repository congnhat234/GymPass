package teampass.gympass;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.jar.Attributes;

import static teampass.gympass.R.drawable.cc;

public class MainActivity extends AppCompatActivity {
    private ListView lvWorkouts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        lvWorkouts = (ListView) findViewById(R.id.lv_workouts);
        ArrayList<Menu> arrayList = new ArrayList<>();
        Menu menu1 = new Menu(cc, "Thể Hình");
        Menu menu2 = new Menu(cc, "Thể Hình");
        Menu menu3 = new Menu(cc, "Thể Hình");
        arrayList.add(menu1);
        arrayList.add(menu2);
        arrayList.add(menu3);

        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.test, arrayList);
        lvWorkouts.setAdapter(customAdapter);
    }
}
