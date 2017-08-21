package com.example.ahmedgalal.numbershaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class number {
        int number;

        public boolean isTriangular() {
            int x = 1;
            int triangularnumber = 1;

            while (triangularnumber < number){
                x++;
                triangularnumber = triangularnumber + x ;
            }
            if (triangularnumber == number) {
                return true;
            }
            else {
                return false;
            }
        }

        public boolean isSquare() {
            double squareroot = Math.sqrt(number);

            if (squareroot == Math.floor(squareroot)) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    public void onTest (View view) {
        EditText getnumber = (EditText) findViewById(R.id.editText2);
        String Message = "";

        if (getnumber.getText().toString().isEmpty()) {
            Message = "Please Enter a number";
        } else {
            number mynumber = new number();
            mynumber.number = Integer.parseInt(getnumber.getText().toString());

            if (mynumber.isSquare()) {
                if (mynumber.isTriangular()) {
                    Message = mynumber.number + " is both triangular and square";
                } else {
                    Message = mynumber.number + " is square but not triangular";
                }
            } else {
                if (mynumber.isTriangular()) {
                    Message = mynumber.number + " is triangular but not square";
                } else {
                    Message = mynumber.number + " is neither square nor triangular";
                }
            }

            Toast.makeText(getApplicationContext(), Message, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
