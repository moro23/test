package com.example.loops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countUp(View view){
        //you have activated the count function
        Log.i("message", "Add to the exiting count");
        int x = 0;

        while (true){
            //Add 1 to each count
            x++;
            Log.i("message", "x=" + "" + x);

            //check is x is equal to 3
            if (x ==3){
                //break out of the loop
                break;
            }

        }


    }

    public void countDown(View view){
        //display countDown function
        Log.i("message", "In count down function");
        int x = 4;

        while(true){
            x--;
            Log.i("message", "x=" + ""+ x);

            if (x == 1){
                //break out of the loop
                break;
            }
        }



    }


    public void nested(View view){
        //display entry message into this function
        Log.i("message", "In nested function");

        for(int i=0; i < 3; i++){

            for(int j=3; i >0; i--){
                Log.i("message", "i=" + i + " j=" + j);
            }
        }

    }
}