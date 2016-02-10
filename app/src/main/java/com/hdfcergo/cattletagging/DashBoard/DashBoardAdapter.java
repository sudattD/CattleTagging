package com.hdfcergo.cattletagging.DashBoard;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdfcergo.cattletagging.R;

import java.util.List;


/**
 * Created by davesuda on 2/9/2016.
 */
public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.PersonViewHolder> {

    List<DummyDataDashboard> dummyDataDashboards;




     DashBoardAdapter(List<DummyDataDashboard> dummyDataDashboards)
    {
        this.dummyDataDashboards = dummyDataDashboards;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dashboard_item,parent,false);
        PersonViewHolder pvh  = new PersonViewHolder(v);


        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {

        PersonViewHolder.personName.setText(dummyDataDashboards.get(position).name);
        PersonViewHolder.personAge.setText(dummyDataDashboards.get(position).age);
        PersonViewHolder.personPhoto.setImageResource(dummyDataDashboards.get(position).photoId);


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
        CardView cv;
        static TextView personName;
        static TextView personAge;
        static ImageView personPhoto;

        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            personName = (TextView) itemView.findViewById(R.id.person_name);
            personAge = (TextView) itemView.findViewById(R.id.person_age);
            personPhoto = (ImageView) itemView.findViewById(R.id.person_photo);
        }
    }


}
