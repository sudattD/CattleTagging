package com.hdfcergo.cattletagging.LeadSummaryActivity;

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

import com.hdfcergo.cattletagging.CattleFormFilling.CattleFormFilling;
import com.hdfcergo.cattletagging.DashBoard.DashBoardAdapter;
import com.hdfcergo.cattletagging.DashBoard.DashboardDataDummy;
import com.hdfcergo.cattletagging.LeadDetails.LeadDetailActivity;
import com.hdfcergo.cattletagging.LeadDetails.LeadDetailsAdapter;
import com.hdfcergo.cattletagging.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davesuda on 2/12/2016.
 */
public class LeadCattleAdapter extends RecyclerView.Adapter<LeadCattleAdapter.PersonViewHolder> {

    List<LeadCattleData> dashboardDataDummies;
    private Context context;



    LeadCattleAdapter(List<LeadCattleData> dashboardDataDummies,Context mcont)
    {
        this.dashboardDataDummies = dashboardDataDummies;
        context = mcont;
    }


    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cattle_item_redesign,parent,false);
        PersonViewHolder pvh  = new PersonViewHolder(v);


        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {


        final LeadCattleData leadCattleData = dashboardDataDummies.get(position);
        PersonViewHolder.cattleName.setText(dashboardDataDummies.get(position).cattle);
        PersonViewHolder.statusImage.setImageResource(dashboardDataDummies.get(position).imageIcon);

        List<String> cattleInfo = new ArrayList<>();


        PersonViewHolder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // Toast.makeText(context, "Card view"+dashboardDataDummies.get(position).cattle, Toast.LENGTH_SHORT).show();
                context.startActivity(new Intent(context,CattleFormFilling.class).putExtra("cattle", leadCattleData.cattle));


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

    public static class PersonViewHolder extends RecyclerView.ViewHolder  {
        static CardView cv;
        static TextView cattleName;
        static ImageView statusImage;


        PersonViewHolder(View itemView) {

            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            cattleName = (TextView) itemView.findViewById(R.id.tv_cattleName);
            statusImage = (ImageView)itemView.findViewById(R.id.img_status);

        }
    }


}