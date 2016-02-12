package com.hdfcergo.cattletagging.CattleFormFilling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import com.hdfcergo.cattletagging.R;

public class CattleFormFilling extends AppCompatActivity {


    CheckBox check_leadDetails,check_contactDetails;
    LinearLayout ll_leadDetails,ll_contactDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cattle_form_filling);


        initializeViews();
    }

    private void initializeViews() {


        check_contactDetails = (CheckBox)findViewById(R.id.check_contact);
        check_leadDetails = (CheckBox)findViewById(R.id.check_LeadDetails);
        ll_contactDetails = (LinearLayout)findViewById(R.id.ll_contact);
        ll_leadDetails = (LinearLayout)findViewById(R.id.ll_leaddetails);


        ll_leadDetails.setVisibility(View.VISIBLE);
       // check_leadDetails.setChecked(false);



        check_contactDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check_contactDetails.isChecked()) {
                    ll_contactDetails.setVisibility(View.VISIBLE);
                    ll_leadDetails.setVisibility(View.GONE);
                    check_leadDetails.setChecked(false);
                } else {

                    ll_contactDetails.setVisibility(View.GONE);
                   // ll_leadDetails.setVisibility(View.VISIBLE);
                }
            }
        });

        check_leadDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check_leadDetails.isChecked())
                {
                    ll_contactDetails.setVisibility(View.GONE);
                    ll_leadDetails.setVisibility(View.VISIBLE);
                    check_contactDetails.setChecked(false);
                }
                else
                {

                   // ll_contactDetails.setVisibility(View.GONE);
                    ll_leadDetails.setVisibility(View.GONE);
                }
            }
        });

    }
}