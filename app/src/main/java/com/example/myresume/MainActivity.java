package com.example.myresume;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox;
    CheckBox checkBoxEdu;
    TextView textView;
    TextView textView2;
    TextView textView3;
    SeekBar seekBar;
    SeekBar seekBar2;
    SeekBar seekBar3;

    @SuppressLint({"MissingInflatedId", "ClickableViewAccessibility"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        checkBox = findViewById(R.id.work);
        checkBoxEdu = findViewById(R.id.educationalBackground);
        textView = findViewById(R.id.psa);
        textView2 = findViewById(R.id.intellismart);
        textView3 = findViewById(R.id.educational);
        seekBar = findViewById(R.id.javaSeek);
        seekBar2 = findViewById(R.id.cSharpSeek);
        seekBar3 = findViewById(R.id.jsSeek);

       checkBox.setOnCheckedChangeListener((checkBox, isChecked) -> {
           if (isChecked) {
               textView.setVisibility(View.VISIBLE);
               textView2.setVisibility(View.VISIBLE);
           } else {
               textView.setVisibility(View.GONE);
               textView2.setVisibility(View.GONE);
           }
       });

        checkBoxEdu.setOnCheckedChangeListener((checkBoxEdu, isEnabled) -> {
            if (isEnabled) {
                textView3.setVisibility(View.VISIBLE);
            } else {
                textView3.setVisibility(View.GONE);
            }

        });

        seekBar.setOnTouchListener((v, event) -> true);
        seekBar2.setOnTouchListener((v, event) -> true);
        seekBar3.setOnTouchListener((v, event) -> true);
    }
}