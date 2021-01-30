package com.example.pncalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button exitButton;
    Button calculateBtn;
    private Spinner spinTerm;
    private Spinner spinType;
    private Spinner spinMode;
    private String term;
    private String type;
    private String mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loanTypeSpinner();
        weekTermSpinner();
        modeSpinner();

        exitButton = findViewById(R.id.btnExit);
        exitButton.setOnClickListener(v -> {
            finish();
            System.exit(0);
        });

        calculateBtn = (Button) findViewById(R.id.btnCalculate);
        calculateBtn.setOnClickListener(MainActivity.this);
    }

    public void onClick(View v){
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);
        i.putExtra("TERM", term);
        i.putExtra("MODE",mode);
        i.putExtra("TYPE", type);
    }

    public void loanTypeSpinner(){
        spinType = findViewById(R.id.loanTypeSpinner);
        List<String> list = new ArrayList<>();
        list.add("Sikap/OL-Cellphone");
        list.add("Sikap 2/Housing/UNLAD");
        list.add("Educational-Elem");
        list.add("Educational-HS/College");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinType.setAdapter(dataAdapter);

        spinType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                type = spinType.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void weekTermSpinner(){
        spinTerm = findViewById(R.id.termSpinner);
        List<String> list = new ArrayList<>();
        list.add("12");
        list.add("16");
        list.add("20");
        list.add("23");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinTerm.setAdapter(dataAdapter);
        spinTerm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                term = spinTerm.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        }
        );

    }

    public void modeSpinner(){
        spinMode = findViewById(R.id.modeSpinner);
        List<String> list = new ArrayList<>();
        list.add("weekly");
        list.add("monthly");
        list.add("semi-monthly");
        list.add("lumpsum");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinMode.setAdapter(dataAdapter);

        spinMode.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mode = spinMode.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
