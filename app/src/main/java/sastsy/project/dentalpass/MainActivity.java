package sastsy.project.dentalpass;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.Layout;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dentalpass.R;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private static  final int REQUEST_ACCESS_TYPE = 1;
    private int clicked_tooth = 0;
    private Tooth[] tooth_list = new Tooth[32];
    private ImageButton[] imageButtons_list = new ImageButton[32];
    private String[] tooth_state_list;
    private boolean[] checked_state;
    private ArrayList<Integer> copylist_of_state = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tooth_state_list = getResources().getStringArray(R.array.tooth_state);
        checked_state = new boolean[tooth_state_list.length];
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
        Button change_tooth_state_button = findViewById(R.id.change_btn);
        change_tooth_state_button.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialog);
            builder.setTitle(tooth_list[clicked_tooth].name.toUpperCase());
            for (int i = 0; i < checked_state.length; ++i) {
                if (tooth_list[clicked_tooth].state.contains(i)) checked_state[i] = true;
                else checked_state[i] = false;
            }
            builder.setMultiChoiceItems(tooth_state_list, checked_state, (dialog, which, isChecked) -> {
                if (isChecked) {
                    if (!copylist_of_state.contains(which)) copylist_of_state.add(which);
                }
                else copylist_of_state.remove(Integer.valueOf(which));
            });
            builder.setCancelable(false);
            builder.setPositiveButton("СОХРАНИТЬ", (dialog, which) -> {
                tooth_list[clicked_tooth].state = new ArrayList<>(copylist_of_state);
            });
            builder.setNegativeButton("ОТМЕНИТЬ", (dialog, which) -> {
                dialog.dismiss();
            });
            AlertDialog change_state_dialog = builder.create();
            change_state_dialog.show();
        });

        Button add_event_btn = findViewById(R.id.button10);
        add_event_btn.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialog);
            builder.setTitle(R.string.AlertDialogEvent);
            View view = getLayoutInflater().inflate(R.layout.event_dialog, null);
            CalendarView date = findViewById(R.id.date);
            EditText place = findViewById(R.id.place);
            EditText doctor = findViewById(R.id.doctor);
            EditText comment = findViewById(R.id.comment);

            builder.setCancelable(false);
            builder.setPositiveButton("СОХРАНИТЬ", (dialog, which) -> {
                Event event = new Event(String.valueOf(date.getDate()), place.getText().toString(), doctor.getText().toString(), comment.getText().toString());
                tooth_list[clicked_tooth].addEvent(event);
            });
            builder.setNegativeButton("ОТМЕНИТЬ", (dialog, which) -> {
                dialog.dismiss();
            });

            AlertDialog add_event_dialog = builder.create();
            add_event_dialog.setView(view);
            add_event_dialog.show();
        });
        Button tooth_specialities_btn = findViewById(R.id.button9);
        tooth_specialities_btn.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialog);
        });

        for (int i = 0; i <= 31; ++i) {
            imageButtons_list[i] = findViewById(imageButtons_id[i]);
            tooth_list[i] = new Tooth(i + 1);
            int finalI = i;
            imageButtons_list[i].setOnClickListener(v -> {
                imageButtons_list[clicked_tooth].setImageResource(whiteImages_id[clicked_tooth]);
                clicked_tooth = finalI;
                imageButtons_list[finalI].setImageResource(redImages_id[finalI]);
                textView.setText(tooth_list[finalI].name);
                tooth_specialities_btn.setVisibility(View.VISIBLE);
            });
        }
    }

    /*@Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
            TextView textView = findViewById(R.id.textView);
            boolean[] state_list = data.getBooleanArrayExtra("state_list");
            // tooth_list[clicked_tooth].state = state_list;
            // textView.setText(Arrays.toString(tooth_list[clicked_tooth].state));
    }*/

}

