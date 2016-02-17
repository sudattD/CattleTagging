package com.hdfcergo.cattletagging.LeadDetails;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.hdfcergo.cattletagging.LeadSummaryActivity.CattleLeadSummaryActivity;
import com.hdfcergo.cattletagging.R;
import com.hdfcergo.cattletagging.Utility.FindLocation;

import java.util.List;

/**
 * Created by davesuda on 2/11/2016.
 */
public class LeadDetailsAdapter extends RecyclerView.Adapter<LeadDetailsAdapter.PersonViewHolder> {

    List<LeadDataDummy> dashboardDataDummies;
    private Context mContext;
    Point p;
    static View viewObject;
    int[] location;
    Activity a;

    LeadDetailsAdapter(List<LeadDataDummy> dashboardDataDummies,Context mcont,Activity a)
    {
        this.dashboardDataDummies = dashboardDataDummies;
        mContext = mcont;
        this.a = a;
       location = new int[2];
        p = new Point();



    }


    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.leadstatus_item,parent,false);
        PersonViewHolder pvh  = new PersonViewHolder(v);


        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {


        final LeadDataDummy leadDataDummy =  dashboardDataDummies.get(position);
        PersonViewHolder.beneficieryName.setText(dashboardDataDummies.get(position).beneficieryName);
        PersonViewHolder.loanAccountNo.setText(dashboardDataDummies.get(position).loanNo);
        PersonViewHolder.leadNo.setText(dashboardDataDummies.get(position).leadNo);
        PersonViewHolder.leadDate.setText(dashboardDataDummies.get(position).leadGeneratedDate);
        PersonViewHolder.noOfCattles.setText(dashboardDataDummies.get(position).noOfCattles);



        PersonViewHolder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // Toast.makeText(context, "Card view", Toast.LENGTH_SHORT).show();
                mContext.startActivity(new Intent(mContext, CattleLeadSummaryActivity.class)
                        .putExtra("lead",leadDataDummy.leadNo.split("-")[1].trim())
                .putExtra("person",leadDataDummy.beneficieryName.split("-")[1].trim()));


            }
        });


        PersonViewHolder.knowStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // Toast.makeText(context, "Image view", Toast.LENGTH_SHORT).show();
                if (p != null)
                {

                    Log.d("location", locateView(PersonViewHolder.knowStatus) + "");
                    showPopup();
                   // showPopup(a);
            }

            }
        });




    }

    private void showPopup() {


        CustomDialogueClass cdc = new CustomDialogueClass(a);
        cdc.show();


       /* final Dialog dialog = new Dialog(mContext);
        dialog.setContentView(R.layout.popup_dialogue);
        //dialog.setTitle("Cattle - Status");
       // TextView msg = (TextView) dialog.findViewById(R.id.dialog_message);
       // msg.setText("Remarks - Lorel Ipsum");
        TextView dialogButton = (TextView) dialog
                .findViewById(R.id.close_button);
        dialogButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                dialog.dismiss();
            }
        });

        dialog.show();*/
    }

    public  Rect locateView(View v)
    {
        int[] loc_int = new int[2];
        if (v == null) return null;
        try
        {
            v.getLocationOnScreen(loc_int);
        } catch (NullPointerException npe)
        {
            //Happens when the view doesn't exist on screen anymore.
            return null;
        }
        Rect location = new Rect();
        location.left = loc_int[0];
        location.top = loc_int[1];
        location.right = location.left + v.getWidth();
        location.bottom = location.top + v.getHeight();
        return location;
    }


    private void showPopup(final Activity context) {
        int popupWidth = 200;
        int popupHeight = 150;

        // Inflate the popup_layout.xml
        LinearLayout viewGroup = (LinearLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup_layout, viewGroup);

        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Some offset to align the popup a bit to the right, and a bit down, relative to button's position.
        int OFFSET_X = 30;
        int OFFSET_Y = 30;

        // Clear the default translucent background
        popup.setBackgroundDrawable(new BitmapDrawable());

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.TOP|Gravity.LEFT, locateView(PersonViewHolder.knowStatus).left, locateView(PersonViewHolder.knowStatus).bottom);

        // Getting a reference to Close button, and close the popup when clicked.
        Button close = (Button) layout.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                popup.dismiss();
            }
        });
    }



    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return dashboardDataDummies.size();
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        static CardView cv;
        static TextView beneficieryName;
        static TextView loanAccountNo,leadNo,leadDate,noOfCattles;

        static ImageView knowStatus;


        PersonViewHolder(View itemView) {

            super(itemView);
            viewObject = itemView;
            cv = (CardView) itemView.findViewById(R.id.cv);
            beneficieryName = (TextView) itemView.findViewById(R.id.tv_beneficiery);
            loanAccountNo = (TextView) itemView.findViewById(R.id.tv_loanaccount);
            leadNo = (TextView) itemView.findViewById(R.id.tv_leadno);
            leadDate =  (TextView) itemView.findViewById(R.id.tv_date);
            noOfCattles = (TextView) itemView.findViewById(R.id.tv_cattles);

            knowStatus = (ImageView) itemView.findViewById(R.id.img_status);
        }
    }




}
