package com.hdfcergo.cattletagging.DashBoard;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hdfcergo.cattletagging.R;


/**
 * Created by davesuda on 2/9/2016.
 */
public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.ViewHolder> {

    private String[] mDataset;


    @Override
    public DashBoardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);

       // ViewHolder vh = new ViewHolder(v);
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }


    public DashBoardAdapter(String[] myDataset) {
        mDataset = myDataset;
    }
}
