package com.hdfcergo.cattletagging.SplashLoginPasscode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hdfcergo.cattletagging.CattleFormFilling.CattleFormFilling;
import com.hdfcergo.cattletagging.CattleTaggingFragments.CattleFragmentsContainerActivity;
import com.hdfcergo.cattletagging.DashBoard.DashBoardActivity;
import com.hdfcergo.cattletagging.LeadSummaryActivity.CattleLeadSummaryActivity;
import com.hdfcergo.cattletagging.R;

public class LoginScreen extends AppCompatActivity {

    TextView loginClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);


        initializeViews();
    }

    private void initializeViews() {

        loginClick = (TextView) findViewById(R.id.loginBtn);

        loginClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // startActivity(new Intent(LoginScreen.this, DashBoardActivity.class));
                startActivity(new Intent(LoginScreen.this, CattleLeadSummaryActivity.class));

            }
        });

    }


}
