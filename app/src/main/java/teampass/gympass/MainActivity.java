package teampass.gympass;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgcustom;
    private ImageView imgworkout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sliding_menu);
        imgcustom = (ImageView) findViewById(R.id.img_custom);
        imgworkout = (ImageView) findViewById(R.id.img_workout);
        imgcustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NutritionActivity.class);
                startActivity(intent);
            }
        });
        imgworkout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WorkoutsActivity.class);
                startActivity(intent);
            }

        });

    }
}
