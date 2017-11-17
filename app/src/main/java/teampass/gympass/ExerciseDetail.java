package teampass.gympass;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

import teampass.gympass.adapter.ListBaiTap;
import teampass.gympass.bean.Exercise;

public class ExerciseDetail extends AppCompatActivity {
    private TextView tv_exercise;
    private ImageView img_exercise_detail;
    private ArrayList<Exercise> list = new ArrayList<Exercise>();
    private DatabaseOpenHelper mDBHelper;
    private SQLiteDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercises_detail);
        tv_exercise = (TextView) findViewById(R.id.tv_exercise);
        img_exercise_detail = (ImageView) findViewById(R.id.img_exercise_detail);

        SharedPreferences sharedPreferences = getSharedPreferences("exerciseData", Context.MODE_PRIVATE);
        int id_exercise = sharedPreferences.getInt("id",0);

        final DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        final Exercise exercise = databaseAccess.getExerciseByID(id_exercise);
        databaseAccess.close();
        tv_exercise.setText(exercise.getChitiet());
        img_exercise_detail.setImageResource(getDrawable(getBaseContext(),exercise.getHinhanh()));
    }
    public static int getDrawable(Context context, String name) {
        Assert.assertNotNull(context);
        Assert.assertNotNull(name);
        return context.getResources().getIdentifier(name,"drawable", context.getPackageName());
    }

}
