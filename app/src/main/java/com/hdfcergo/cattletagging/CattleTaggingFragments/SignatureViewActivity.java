package com.hdfcergo.cattletagging.CattleTaggingFragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.gcacace.signaturepad.views.SignaturePad;
import com.hdfcergo.cattletagging.R;

public class SignatureViewActivity extends AppCompatActivity {


    Bundle bundle;
    SignaturePad mSignaturePad;
    TextView clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signature_view);

        initializeViews();

    }

    private void initializeViews() {

        bundle = getIntent().getExtras();
        getSupportActionBar().setSubtitle(bundle.getString("lead"));
        clear = (TextView) findViewById(R.id.tv_clear);
        mSignaturePad = (SignaturePad) findViewById(R.id.signature_pad);


        mSignaturePad.setOnSignedListener(new SignaturePad.OnSignedListener() {
            @Override
            public void onSigned() {
                //Event triggered when the pad is signed
            }

            @Override
            public void onClear() {
                //Event triggered when the pad is cleared
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSignaturePad.clear();
            }
        });


    }
}
