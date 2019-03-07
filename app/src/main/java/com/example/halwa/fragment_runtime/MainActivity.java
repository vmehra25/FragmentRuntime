package com.example.halwa.fragment_runtime;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager ;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        if(findViewById(R.id.framelayout)!=null) {

           if(savedInstanceState!=null)

           { return;}

            FragmentTransaction ft = fragmentManager.beginTransaction();

            AFragment blankFragment = new AFragment();

            ft.add(R.id.framelayout, blankFragment, null);

            ft.commit();
        }
    }
}
