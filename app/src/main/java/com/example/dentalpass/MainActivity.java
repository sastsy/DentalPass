package com.example.dentalpass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton[] imageButtons_list = new ImageButton[32];

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

        for (int i = 0; i <= 31; ++i) {
            imageButtons_list[i] = findViewById(imageButtons_id[i]);
            int finalI = i;
            imageButtons_list[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageButtons_list[finalI].setImageResource(redImages_id[finalI]);
                }
            });
        }
    }
}