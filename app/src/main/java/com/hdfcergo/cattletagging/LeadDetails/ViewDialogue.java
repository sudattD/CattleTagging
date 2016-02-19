package com.hdfcergo.cattletagging.LeadDetails;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.hdfcergo.cattletagging.R;

/**
 * Created by davesuda on 2/18/2016.
 */
public class ViewDialogue extends Dialog {

    public ViewDialogue(Context context) {
        super(context);

    }

    public void showDialog(Context activity, String status, String remark, int x, int y) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.popup_dialogue);

        TextView txtStatus = (TextView) dialog.findViewById(R.id.txt_status);
        txtStatus.setText("Status: " + status);
        TextView txtRemark = (TextView) dialog.findViewById(R.id.txt_remarks);
        txtRemark.setText("Remark: " + remark);

        WindowManager.LayoutParams wmlp = dialog.getWindow().getAttributes();
        dialog.getWindow()
                .getAttributes().windowAnimations = R.style.DialogAnimation;
        //wmlp.gravity = Gravity.RIGHT;
        //Toast.makeText(getContext(),"X="+x+":Y="+y,Toast.LENGTH_SHORT).show();

        wmlp.x = x;   //x position
        wmlp.y = y;   //y position

        dialog.show();

    }

}
