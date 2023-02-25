package ru.mirea.mesheryakov.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private Button btnCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAml);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        //checkBox = findViewById(R.id.checkBox);
        CheckBox btnCheckBox = findViewById(R.id.checkBox);

        View.OnClickListener oclBtnWhoAmi = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Мой номер по списку № 9");
                btnCheckBox.toggle();
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmi);

        View.OnClickListener oclBtnItIsNotMe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Это не я сделал");
                btnCheckBox.toggle();
            }
        };
        btnItIsNotMe.setOnClickListener(oclBtnItIsNotMe);
    }
}