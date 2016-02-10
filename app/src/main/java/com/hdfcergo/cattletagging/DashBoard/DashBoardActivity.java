package com.hdfcergo.cattletagging.DashBoard;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hdfcergo.cattletagging.R;

import java.util.ArrayList;

public class DashBoardActivity extends AppCompatActivity {


    private RecyclerView rv;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager llm;
    private Context mContext;

    ArrayList<DummyDataDashboard> persons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);


        initializeViews();
    }

    private void initializeViews() {


        mContext = this;
        persons = new ArrayList<DummyDataDashboard>();
        persons.add(new DummyDataDashboard("Sudatt Dave","28 years old", R.drawable.logo));
        persons.add(new DummyDataDashboard("Shraddha Dave","28 years old", R.drawable.logo));
        persons.add(new DummyDataDashboard("Samaya Dave","28 years old", R.drawable.logo));

         rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);




        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        rv.setLayoutManager(llm);


        DashBoardAdapter adapter = new DashBoardAdapter(persons);
        rv.setAdapter(adapter);

        //mAdapter = new DashBoardAdapter(myDataset);

    }
}
