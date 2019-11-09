package com.example.preferencesettingsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class PreferencesExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences_example);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_for_fragment, new MyPreferenceFragment())
                .commit();
    }
}
