package sastsy.project.dentalpass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dentalpass.R;

import java.util.ArrayList;

public class ChangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

        CheckBox checkBox = findViewById(R.id.checkBox);
        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        CheckBox checkBox4 = findViewById(R.id.checkBox4);
        CheckBox checkBox5 = findViewById(R.id.checkBox5);
        CheckBox checkBox6 = findViewById(R.id.checkBox6);
        CheckBox checkBox7 = findViewById(R.id.checkBox7);
        CheckBox checkBox8 = findViewById(R.id.checkBox8);


        Button save_btn = findViewById(R.id.button3);
        save_btn.setOnClickListener(v -> {
            boolean[] checked = {checkBox.isChecked(), checkBox1.isChecked(), checkBox2.isChecked(),
                    checkBox3.isChecked(), checkBox4.isChecked(), checkBox5.isChecked(),
                    checkBox6.isChecked(), checkBox7.isChecked(), checkBox8.isChecked()};
            Intent intent = new Intent();
            intent.putExtra("state_list", checked);
            setResult(RESULT_OK, intent);
            finish();
        });
        ImageButton back_btn = findViewById(R.id.imageButton);
        back_btn.setOnClickListener(v -> finish());
    }
}
