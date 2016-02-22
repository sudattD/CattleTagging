package com.hdfcergo.cattletagging.LeadDetails;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.hdfcergo.cattletagging.R;

/**
 * Created by davesuda on 2/16/2016.
 */
public class CustomDialogueClass  extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    public Button yes, no;

   CustomDialogueClass(Activity a)
   {
       super(a);
   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.popup_dialogue);
       // yes = (Button) findViewById(R.id.btn_yes);
       // no = (Button) findViewById(R.id.btn_no);
        //yes.setOnClickListener(this);
        //no.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {

    }
}