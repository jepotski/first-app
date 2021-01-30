package com.example.pncalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity2 extends AppCompatActivity{

//    TextView rLoanType;
//    TextView rLoanTerm;
//    TextView rMode;
//    TextView rLoanAmount;
//    TextView rLRF;
//    TextView rInterest;
//    TextView rLoanProceeds;
//    TextView rReleaseDate;
//    TextView rFirstPayment;
//    TextView rLastPayment;
//    TextView rAmort;

   // private  int term;
         String termString;
         String typeString;
         String modeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView rTerm   = findViewById(R.id.resultLoanTerm);
        TextView rMode = findViewById(R.id.resultMode);
        TextView rType = findViewById(R.id.resultLoanType);

//        Bundle extras = getIntent().getExtras();
//        if(extras!=null) {
            termString = getIntent().getStringExtra("TERM");
            modeString = getIntent().getStringExtra("MODE");
            typeString = getIntent().getStringExtra("TYPE");

        int term = Integer.parseInt(termString);
        rTerm.setText(term);
        rMode.setText(modeString);
        rType.setText(typeString);


//        viewView();
//        resultView();

    }

/*
    private void resultView() {
        rLoanTerm.setText(term);
        rLoanType.setText(term);
        rMode.setText(term);
        rLoanAmount.setText(term);
        rLRF.setText(term);
        rInterest.setText(term);
        rLoanProceeds.setText(term);
        rReleaseDate.setText(term);
        rFirstPayment.setText(term);
        rLastPayment.setText(term);
        rAmort.setText(term);
    }
*/

    public void backFunction(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

/*    public void viewView(){
           rLoanType = findViewById(R.id.resultLoanType);
           rLoanTerm = findViewById(R.id.resultLoanTerm);
           rMode = findViewById(R.id.resultMode);
           rLoanAmount = findViewById(R.id.resultLoanAmount);
           rLRF = findViewById(R.id.resultLRF);
           rInterest = findViewById(R.id.resultInterest);
           rLoanProceeds = findViewById(R.id.resultLoanProceeds);
           rReleaseDate = findViewById(R.id.resultDateRelease);
           rFirstPayment = findViewById(R.id.resultFirstPayment);
           rLastPayment = findViewById(R.id.resultlastPayment);
           rAmort = findViewById(R.id.resultAmort);
    }*/


}
