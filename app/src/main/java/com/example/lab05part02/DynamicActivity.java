package com.example.lab05part02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            BlankFragment frag1 = new BlankFragment();
            fragmentTransaction.replace(R.id.activity_dynamic, frag1);
        }
        else {
            BlankFragment2 frag2 = new BlankFragment2();
            fragmentTransaction.replace(R.id.activity_dynamic, frag2);
        }

        fragmentTransaction.commit();
    }
}
