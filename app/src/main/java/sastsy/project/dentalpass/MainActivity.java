package sastsy.project.dentalpass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.dentalpass.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton[] imageButtons_list = new ImageButton[32];
        final int[] clicked_tooth = {0};
        Tooth[] tooth_list = new Tooth[32];

        int[] imageButtons_id = {R.id.imageButton1, R.id.imageButton2, R.id.imageButton3, R.id.imageButton4,
                R.id.imageButton5, R.id.imageButton6, R.id.imageButton7, R.id.imageButton8, R.id.imageButton9,
                R.id.imageButton10, R.id.imageButton11, R.id.imageButton12, R.id.imageButton13, R.id.imageButton14,
                R.id.imageButton15, R.id.imageButton16, R.id.imageButton17, R.id.imageButton18, R.id.imageButton19,
                R.id.imageButton20, R.id.imageButton21, R.id.imageButton22, R.id.imageButton23, R.id.imageButton24,
                R.id.imageButton25, R.id.imageButton26, R.id.imageButton27, R.id.imageButton28, R.id.imageButton29,
                R.id.imageButton30, R.id.imageButton31, R.id.imageButton32};

        int[] redImages_id = {R.drawable.red1, R.drawable.red2, R.drawable.red3, R.drawable.red4, R.drawable.red5,
                R.drawable.red6, R.drawable.red7, R.drawable.red8, R.drawable.red9, R.drawable.red10,
                R.drawable.red11, R.drawable.red12, R.drawable.red13, R.drawable.red14, R.drawable.red15,
                R.drawable.red16, R.drawable.red17, R.drawable.red18, R.drawable.red19, R.drawable.red20,
                R.drawable.red21, R.drawable.red22, R.drawable.red23, R.drawable.red24, R.drawable.red25,
                R.drawable.red26, R.drawable.red27, R.drawable.red28, R.drawable.red29, R.drawable.red30,
                R.drawable.red31, R.drawable.red32};

        int[] whiteImages_id = {R.drawable.white1, R.drawable.white2, R.drawable.white3, R.drawable.white4,
                R.drawable.white5, R.drawable.white6, R.drawable.white7, R.drawable.white8, R.drawable.white9,
                R.drawable.white10, R.drawable.white11, R.drawable.white12, R.drawable.white13, R.drawable.white14,
                R.drawable.white15, R.drawable.white16, R.drawable.white17, R.drawable.white18, R.drawable.white19,
                R.drawable.white20, R.drawable.white21, R.drawable.white22, R.drawable.white23, R.drawable.white24,
                R.drawable.white25, R.drawable.white26, R.drawable.white27, R.drawable.white28, R.drawable.white29,
                R.drawable.white30, R.drawable.white31, R.drawable.white32};

        TextView textView = findViewById(R.id.textView);
        /*Button backgroundButton = findViewById(R.id.backgroundButton);
        backgroundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButtons_list[clicked_tooth[0]].setImageResource(whiteImages_id[clicked_tooth[0]]);
            }
        });*/

        Button tooth_specialities_btn = findViewById(R.id.button9);
        tooth_specialities_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChangeActivity.class);
                intent.putExtra("tooth", tooth_list[clicked_tooth[0]]);
                startActivity(intent);
            }
        });

        for (int i = 0; i <= 31; ++i) {
            imageButtons_list[i] = findViewById(imageButtons_id[i]);
            tooth_list[i] = new Tooth(i + 1);
            int finalI = i;
            imageButtons_list[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageButtons_list[clicked_tooth[0]].setImageResource(whiteImages_id[clicked_tooth[0]]);
                    clicked_tooth[0] = finalI;
                    imageButtons_list[finalI].setImageResource(redImages_id[finalI]);
                    textView.setText(tooth_list[finalI].name);
                    tooth_specialities_btn.setVisibility(View.VISIBLE);

                }
            });
        }
    }

}