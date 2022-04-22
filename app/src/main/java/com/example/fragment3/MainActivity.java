package com.example.fragment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
FirstFrangment firstFrangment;
SecondFragment secondFragment;
Button button;
int showfragments=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        firstFrangment = new FirstFrangment();
        secondFragment = new SecondFragment();

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.frameLayout,firstFrangment);
        fragmentTransaction.commit();
        showfragments=1;

    }  public void onclick(View view){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

        if (showfragments ==1){
            fragmentTransaction.replace(R.id.frameLayout,secondFragment);
            fragmentTransaction.commit();
            showfragments = 2;
        }
        else {
            fragmentTransaction.replace(R.id.frameLayout,firstFrangment);
            fragmentTransaction.commit();
            showfragments = 1;
        }
    }
}