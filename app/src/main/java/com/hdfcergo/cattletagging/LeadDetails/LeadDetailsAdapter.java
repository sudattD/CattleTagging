package com.hdfcergo.cattletagging.LeadDetails;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hdfcergo.cattletagging.DashBoard.DashBoardAdapter;
import com.hdfcergo.cattletagging.DashBoard.DashboardDataDummy;
import com.hdfcergo.cattletagging.R;

import java.util.List;

/**
 * Created by davesuda on 2/11/2016.
 */
public class LeadDetailsAdapter extends RecyclerView.Adapter<LeadDetailsAdapter.PersonViewHolder> {

    List<LeadDataDummy> dashboardDataDummies;
    private Context context;



    LeadDetailsAdapter(List<LeadDataDummy> dashboardDataDummies,Context mcont)
    {
        this.dashboardDataDummies = dashboardDataDummies;
        context = mcont;
    }


    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.leaddetail_item,parent,false);
        PersonViewHolder pvh  = new PersonViewHolder(v);


        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {

        PersonViewHolder.beneficieryName.setText(dashboardDataDummies.get(position).beneficieryName);
        PersonViewHolder.loanAccountNo.setText(dashboardDataDummies.get(position).loanNo);
        PersonViewHolder.leadNo.setText(dashboardDataDummies.get(position).leadNo);
        PersonViewHolder.leadDate.setText(dashboardDataDummies.get(position).leadGeneratedDate);
        PersonViewHolder.noOfCattles.setText(dashboardDataDummies.get(position).noOfCattles);



        PersonViewHolder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, "Card view", Toast.LENGTH_SHORT).show();
                // context.startActivity(new Intent(context,LeadDetailActivity.class));


            }
        });


        PersonViewHolder.knowStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, "Image view", Toast.LENGTH_SHORT).show();
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
