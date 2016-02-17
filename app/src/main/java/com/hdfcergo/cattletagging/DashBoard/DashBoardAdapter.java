package com.hdfcergo.cattletagging.DashBoard;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.hdfcergo.cattletagging.LeadDetails.LeadDetailActivity;
import com.hdfcergo.cattletagging.R;

import java.util.List;


/**
 * Created by davesuda on 2/9/2016.
 */

//search bar -http://javapapers.com/android/android-searchview-action-bar-tutorial/
public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.PersonViewHolder> {

    List<DashboardDataDummy> dashboardDataDummies;
    private Context context;



     DashBoardAdapter(List<DashboardDataDummy> dashboardDataDummies,Context mcont)
    {
        this.dashboardDataDummies = dashboardDataDummies;
        context = mcont;
    }


    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dashboard_item_newdesign,parent,false);
        PersonViewHolder pvh  = new PersonViewHolder(v);


        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {


       final DashboardDataDummy data_on_position = dashboardDataDummies.get(position);

        PersonViewHolder.villageName.setText(dashboardDataDummies.get(position).village);
        PersonViewHolder.talukaName.setText(dashboardDataDummies.get(position).taluka);
        PersonViewHolder.leadCattles.setText(dashboardDataDummies.get(position).leadCattles);
        PersonViewHolder.assigned.setText(dashboardDataDummies.get(position).assigned);
        PersonViewHolder.unAssigned.setText(dashboardDataDummies.get(position).notAssigned);



        PersonViewHolder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(context, "Card view"+data_on_position.village.split("-")[1].trim(), Toast.LENGTH_SHORT).show();

                //Toast.makeText(context, "Card view"+data_on_position.taluka.split("-")[1].trim(), Toast.LENGTH_SHORT).show();
                context.startActivity(new Intent(context, LeadDetailActivity.class)
                        .putExtra("village",data_on_position.village.split("-")[1].trim())
                        .putExtra("taluka",data_on_position.taluka.split("-")[1].trim()));



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
        static TextView villageName;
        static TextView talukaName,leadCattles,assigned,unAssigned;


        PersonViewHolder(View itemView) {

            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            villageName = (TextView) itemView.findViewById(R.id.village);
            talukaName = (TextView) itemView.findViewById(R.id.taluka);
            leadCattles = (TextView) itemView.findViewById(R.id.leads_cattles);
            assigned =  (TextView) itemView.findViewById(R.id.assigned);
            unAssigned = (TextView) itemView.findViewById(R.id.unassigned);
        }
    }


}
