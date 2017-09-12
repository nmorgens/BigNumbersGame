package com.example.nathanmorgenstern.bignumbergame2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.util.Random;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int leftNumber;
    private int rightNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setNumbers();
    }
    public void setNumbers(){
        Random rand = new Random();

        leftNumber  = rand.nextInt(10);
        rightNumber = rand.nextInt(10);

        Button leftButton  = (Button) findViewById(R.id.leftButton);
        leftButton.setText(leftNumber+"");

        Button rightButton = (Button) findViewById(R.id.rightButton);
        rightButton.setText(rightNumber+"");
        }

    public void onClickLeft(View view) {
        if (leftNumber >= rightNumber) {
            //correct
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        }
        else{
            //wrong
            Toast.makeText(this, "Duh!", Toast.LENGTH_SHORT).show();
        }
        setNumbers();
    }

    public void onClickRight(View view){
        if (rightNumber >= leftNumber) {
            //correct
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        }
        else{
            //wrong
            Toast.makeText(this, "Duh!", Toast.LENGTH_SHORT).show();
        }
        setNumbers();
    }
}
