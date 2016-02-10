package com.hdfcergo.cattletagging.DashBoard;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hdfcergo.cattletagging.R;

import java.util.List;


/**
 * Created by davesuda on 2/9/2016.
 */
public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.PersonViewHolder> {

    List<DummyDataDashboard> dummyDataDashboards;
    private Context context;



     DashBoardAdapter(List<DummyDataDashboard> dummyDataDashboards,Context mcont)
    {
        this.dummyDataDashboards = dummyDataDashboards;
        context = mcont;
    }


    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dashboard_item_re,parent,false);
        PersonViewHolder pvh  = new PersonViewHolder(v);


        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {

        PersonViewHolder.villageName.setText(dummyDataDashboards.get(position).village);
        PersonViewHolder.talukaName.setText(dummyDataDashboards.get(position).taluka);
        PersonViewHolder.leadCattles.setText(dummyDataDashboards.get(position).leadCattles);
        PersonViewHolder.assigned.setText(dummyDataDashboards.get(position).assigned);
        PersonViewHolder.unAssigned.setText(dummyDataDashboards.get(position).notAssigned);



        PersonViewHolder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, "Card view", Toast.LENGTH_SHORT).show();


            }
        });



    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return dummyDataDashboards.size();
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
