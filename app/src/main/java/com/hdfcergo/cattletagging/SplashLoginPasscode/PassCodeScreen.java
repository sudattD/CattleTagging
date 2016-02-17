package com.hdfcergo.cattletagging.SplashLoginPasscode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import com.hdfcergo.cattletagging.DashBoard.DashBoardActivity;
import com.hdfcergo.cattletagging.R;

public class PassCodeScreen extends AppCompatActivity {

    TextView goButton;
    EditText passcodeEdt;
    private CheckBox chkEye;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_code_screen);

        getSupportActionBar().hide();
        initializeViews();


    }

    private void initializeViews() {


        goButton = (TextView) findViewById(R.id.passcodeBtn);
        chkEye = (CheckBox) findViewById(R.id.chkEye);
        passcodeEdt = (EditText) findViewById(R.id.passcodeEdt);



        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PassCodeScreen.this, DashBoardActivity.class));
            }
        });

        chkEye.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked) {
                    passcodeEdt.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    passcodeEdt.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });

    }
}
