package com.example.rtarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView res;
    Button sumar;
    EditText num1, num2;
    int resultado = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res = findViewById(R.id.res);
        sumar = findViewById(R.id.sumar);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);


        sumar.setOnClickListener(this);

        res.setText(String.valueOf(resultado));






    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.sumar:
                String R1, R2;
                int numR1, numR2;

                R1 = num1.getText().toString();
                R2 = num2.getText().toString();

                numR1 = Integer.parseInt(R1);
                numR2 = Integer.parseInt(R2);

                resultado =   numR1+numR2  ;

                res.setText(String.valueOf(resultado));

                break;


        }







    }
}
