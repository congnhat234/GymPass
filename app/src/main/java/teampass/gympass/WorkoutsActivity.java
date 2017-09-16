package teampass.gympass;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
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

public class WorkoutsActivity  extends AppCompatActivity  {
    private ListView lvWorkouts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_workouts);
        lvWorkouts = (ListView) findViewById(R.id.lv_workouts);
        ArrayList<Menu> arrayList = new ArrayList<>();
        Menu menu1 = new Menu(cc, "Thể hình");
        Menu menu2 = new Menu(fitness, "Fitness");
        Menu menu3 = new Menu(gym, "Lifting");
        Menu menu4 = new Menu(threedays, "Kế hoạch tập 3 ngày");
        Menu menu5 = new Menu(bung1, "Kế hoạch tập 3 ngày tại nhà");
        Menu menu6 = new Menu(burnfat, "Đốt mỡ");
        Menu menu7 = new Menu(abs, "Abs burnner");
        Menu menu8 = new Menu(chest, "Chest");
        Menu menu9 = new Menu(gotay, "Arms");
        Menu menu10 = new Menu(leg, "Legs");
        Menu menu11= new Menu(shouders, "Shouders");
        Menu menu12= new Menu(back, "Back");
        arrayList.add(menu1);
        arrayList.add(menu2);
        arrayList.add(menu3);
        arrayList.add(menu4);
        arrayList.add(menu5);
        arrayList.add(menu6);
        arrayList.add(menu7);
        arrayList.add(menu8);
        arrayList.add(menu9);
        arrayList.add(menu10);
        arrayList.add(menu11);
        arrayList.add(menu12);

        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.test, arrayList);
        lvWorkouts.setAdapter(customAdapter);
    }


}
