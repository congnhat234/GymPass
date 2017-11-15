package teampass.gympass;

/**
 * Created by Cong Nhat on 11/10/2017.
 */

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import teampass.gympass.bean.Exercise;
import teampass.gympass.bean.NhomBaiTap;
import teampass.gympass.bean.NhomWorkout;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    /**
     * Private constructor to aboid object creation from outside classes.
     *
     * @param context
     */
    private DatabaseAccess(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
    }

    /**
     * Return a singleton instance of DatabaseAccess.
     *
     * @param context the Context
     * @return the instance of DabaseAccess
     */
    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    /**
     * Open the database connection.
     */
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    /**
     * Close the database connection.
     */
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }

    /**
     * Read all quotes from the database.
     *
     * @return a List of quotes
     */
    public List<NhomBaiTap> getAllNhomBaiTap() {
        List<NhomBaiTap> listNhom = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM nhom_baitap", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            NhomBaiTap obj = new NhomBaiTap();
            obj.setId(Integer.parseInt(cursor.getString(0)));
            obj.setTennhom(cursor.getString(1));
            obj.setHinhanh(cursor.getString(2));

            // Thêm vào danh sách.
            listNhom.add(obj);
            cursor.moveToNext();
        }
        cursor.close();
        return listNhom;
    }
    public List<NhomWorkout> getAllNhomWorkout() {
        List<NhomWorkout> listNhom = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM nhom_workout", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            NhomWorkout obj = new NhomWorkout();
            obj.setId(cursor.getString(0));
            obj.setTennhom(cursor.getString(1));
            obj.setHinhanh(cursor.getString(2));

            // Thêm vào danh sách.
            listNhom.add(obj);
            cursor.moveToNext();
        }
        cursor.close();
        return listNhom;
    }
    public List<Exercise> getAllExercises() {
        List<Exercise> listExercise = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM exercises", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Exercise exercise = new Exercise();
            exercise.setId(Integer.parseInt(cursor.getString(0)));
            exercise.setTenbaitap(cursor.getString(1));
            exercise.setHinhanh(cursor.getString(2));
            exercise.setChitiet(cursor.getString(3));
            exercise.setId_nhom(Integer.parseInt(cursor.getString(4)));
            exercise.setId_workout(cursor.getString(5));

            // Thêm vào danh sách.
            listExercise.add(exercise);
            cursor.moveToNext();
        }
        cursor.close();
        return listExercise;
    }
    public List<Exercise> getExercisesByID(int id_nhom) {
        List<Exercise> listExercise = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM exercises WHERE id_nhom = " + id_nhom, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Exercise exercise = new Exercise();
            exercise.setId(Integer.parseInt(cursor.getString(0)));
            exercise.setTenbaitap(cursor.getString(1));
            exercise.setHinhanh(cursor.getString(2));
            exercise.setChitiet(cursor.getString(3));
            exercise.setId_nhom(Integer.parseInt(cursor.getString(4)));
            exercise.setId_workout(cursor.getString(5));

            // Thêm vào danh sách.
            listExercise.add(exercise);
            cursor.moveToNext();
        }
        cursor.close();
        return listExercise;
    }
    public List<Exercise> getExercisesByID(String id_nhom) {
        List<Exercise> listExercise = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM exercises WHERE id_workout LIKE '%" + id_nhom + "%'", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Exercise exercise = new Exercise();
            exercise.setId(Integer.parseInt(cursor.getString(0)));
            exercise.setTenbaitap(cursor.getString(1));
            exercise.setHinhanh(cursor.getString(2));
            exercise.setChitiet(cursor.getString(3));
            exercise.setId_nhom(Integer.parseInt(cursor.getString(4)));
            exercise.setId_workout(cursor.getString(5));

            // Thêm vào danh sách.
            listExercise.add(exercise);
            cursor.moveToNext();
        }
        cursor.close();
        return listExercise;
    }
    public Exercise getExerciseByID(int id_exercise) {
        Exercise exercise = new Exercise();
        Cursor cursor = database.rawQuery("SELECT * FROM exercises WHERE id = " + id_exercise, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            exercise.setId(Integer.parseInt(cursor.getString(0)));
            exercise.setTenbaitap(cursor.getString(1));
            exercise.setHinhanh(cursor.getString(2));
            exercise.setChitiet(cursor.getString(3));
            exercise.setId_nhom(Integer.parseInt(cursor.getString(4)));
            exercise.setId_workout(cursor.getString(5));
            cursor.moveToNext();
        }
        cursor.close();
        return exercise;
    }
}

