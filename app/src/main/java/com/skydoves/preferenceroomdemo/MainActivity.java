package com.skydoves.preferenceroomdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.skydoves.preferenceroom.InjectPreference;
import com.skydoves.preferenceroom.PreferenceComponent;

public class MainActivity extends AppCompatActivity {

    public int aaa = 10;

    @InjectPreference
    public int test;

    @InjectPreference
    public Preference_UserProfile userProfile;

    @InjectPreference
    public PrefsComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PreferenceComponent_PrefsComponent component = PreferenceComponent_PrefsComponent.init(this);

        component.UserProfile().putUserName("PreferenceRoom Test");

        TextView textView = findViewById(R.id.textView);
        textView.setText(component.UserProfile().getUserName());
    }
}
