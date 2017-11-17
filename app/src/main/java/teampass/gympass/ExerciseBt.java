package teampass.gympass;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import teampass.gympass.adapter.CustomAdapter;
import teampass.gympass.adapter.ListBaiTap;
import teampass.gympass.adapter.ListNhomBaiTap;
import teampass.gympass.bean.Exercise;
import teampass.gympass.bean.NhomBaiTap;
import teampass.gympass.model.Menu;

import static teampass.gympass.R.drawable.bung1;
import static teampass.gympass.R.drawable.cc;
import static teampass.gympass.R.drawable.fitness;
import static teampass.gympass.R.drawable.gym;
import static teampass.gympass.R.drawable.threedays;

public class ExerciseBt extends AppCompatActivity {
    private ListView lv_exercise;
    private ArrayList<Exercise> list = new ArrayList<Exercise>();
    private DatabaseOpenHelper mDBHelper;
    private SQLiteDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_bt);

        SharedPreferences sharedPreferences = getSharedPreferences("exerciseData", Context.MODE_PRIVATE);
        int id_nhom = sharedPreferences.getInt("id_nhom",0);

        lv_exercise = (ListView) findViewById(R.id.lv_exercise);
        final DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        final List<Exercise> listNhom = databaseAccess.getExercisesByID(id_nhom);
        this.list.addAll(listNhom);
        databaseAccess.close();

        ListBaiTap adapter = new ListBaiTap(ExerciseBt.this, R.layout.item_menu, list);
        lv_exercise.setAdapter(adapter);

        this.lv_exercise.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                SharedPreferences sharedPreferences = getSharedPreferences("exerciseData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("id", list.get(i).getId());
                editor.commit();
                Intent intent = new Intent(ExerciseBt.this, ExerciseDetail.class);
                startActivity(intent);
//                databaseAccess.open();
//                List<Exercise> listExercise = databaseAccess.getExercisesByID(listNhom.get(i).getId());
//                for(int j=0;j<listExercise.size();j++){
//                    //System.out.println(listTextNote.get(j).getContent());
//                }
            }
        });
    }

}
