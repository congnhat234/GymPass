package teampass.gympass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NutritionActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txt,txt2,txt3,txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);

        txt = (TextView) findViewById(R.id.textView);
        txt2 = (TextView) findViewById(R.id.textView2);
        txt3 = (TextView) findViewById(R.id.textView3);
        txt4 = (TextView) findViewById(R.id.textView4);

        txt.setOnClickListener(this);
        txt2.setOnClickListener(this);
        txt3.setOnClickListener(this);
        txt4.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.textView:
                Intent intent = new Intent(NutritionActivity.this, Nutrition_01Activity.class);
                startActivity(intent);
                break;
            case R.id.textView2:
                Intent intent1 = new Intent(NutritionActivity.this, Nutrition_02Activity.class);
                startActivity(intent1);
                break;
            case R.id.textView3:
                Intent intent2 = new Intent(NutritionActivity.this, Nutrition_03Activity.class);
                startActivity(intent2);
                break;
            case R.id.textView4:
                Intent intent3 = new Intent(NutritionActivity.this, Nutrition_04Activity.class);
                startActivity(intent3);
                break;
        }


    }
}
