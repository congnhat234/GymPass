package teampass.gympass;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgcustom;
    private ImageView imgworkout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int secondsDelayed = 3;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(MainActivity.this, ExerciseActivity.class));
                finish();
            }
        }, secondsDelayed * 1000);
    }


//        Intent intent = new Intent(this, ExerciseActivity.class);
//
//        startActivity(intent);
//
//        finish();
//
//        imgcustom = (ImageView)
//
//                findViewById(R.id.img_custom);
//
//        imgworkout = (ImageView)
//
//                findViewById(R.id.img_workout);
//        imgcustom.setOnClickListener(new View.OnClickListener()
//
//        {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, NutritionActivity.class);
//                startActivity(intent);
//            }
//        });
//        imgworkout.setOnClickListener(new View.OnClickListener()
//
//        {
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, WorkoutsActivity.class);
//                startActivity(intent);
//            }
//
//        });
//
//
//    }
}
