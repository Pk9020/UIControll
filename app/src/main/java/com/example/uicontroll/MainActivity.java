package com.example.uicontroll;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private CheckBox ch1,ch2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton=(ToggleButton)findViewById(R.id.toggleButton);
        ch1=findViewById(R.id.check_box);
        ch2=findViewById(R.id.check_box2);


        ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b){
                    // do something
                    Toast.makeText(MainActivity.this, "you check male", Toast.LENGTH_SHORT).show();
                }else {
                    //do something else
                    Toast.makeText(MainActivity.this, "Unchecked", Toast.LENGTH_SHORT).show();
                }

            }
        });


        ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b){
                    // do something
                    Toast.makeText(MainActivity.this, "you check female", Toast.LENGTH_SHORT).show();
                }else {
                    //do something else
                    Toast.makeText(MainActivity.this, "Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (toggleButton.isChecked())
                {
                    Toast.makeText(MainActivity.this, "turn ON the button", Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText(MainActivity.this, "turn OFF the button", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void openAlert(View view) {
        AlertDialog.Builder myAlert=new AlertDialog.Builder(this);
        myAlert.setTitle("exit");
        myAlert.setMessage("are you sure ?");
        myAlert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
             finish();
            }
        });

        myAlert.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        myAlert.show();
    }

    public void openProgress(View view) {
    }
}
