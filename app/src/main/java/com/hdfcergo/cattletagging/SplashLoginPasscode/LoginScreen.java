package com.hdfcergo.cattletagging.SplashLoginPasscode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import com.hdfcergo.cattletagging.CattleFormFilling.CattleFormFilling;
import com.hdfcergo.cattletagging.CattleTaggingFragments.CattleFragmentsContainerActivity;
import com.hdfcergo.cattletagging.DashBoard.DashBoardActivity;
import com.hdfcergo.cattletagging.LeadSummaryActivity.CattleLeadSummaryActivity;
import com.hdfcergo.cattletagging.R;

public class LoginScreen extends AppCompatActivity {

    TextView loginClick;
    private CheckBox chkEye;
    private EditText passcodeEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        getSupportActionBar().hide();
        initializeViews();
    }

    private void initializeViews() {

        loginClick = (TextView) findViewById(R.id.loginBtn);
        chkEye = (CheckBox) findViewById(R.id.chkEye);
        passcodeEdt = (EditText)findViewById(R.id.passwordEdt);

        loginClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(LoginScreen.this, PassCodeScreen.class));
               // startActivity(new Intent(LoginScreen.this, CattleLeadSummaryActivity.class));

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
