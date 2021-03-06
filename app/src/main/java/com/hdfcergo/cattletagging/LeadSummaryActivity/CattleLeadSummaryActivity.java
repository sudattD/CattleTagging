package com.hdfcergo.cattletagging.LeadSummaryActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.hdfcergo.cattletagging.CattleFormFilling.CattleFormFilling;
import com.hdfcergo.cattletagging.CattleTaggingFragments.SignatureViewActivity;
import com.hdfcergo.cattletagging.DashBoard.DashBoardAdapter;
import com.hdfcergo.cattletagging.DashBoard.DashboardDataDummy;
import com.hdfcergo.cattletagging.R;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;
import java.util.List;

public class CattleLeadSummaryActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    private RecyclerView rv;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager llm;
    private Context mContext;
    ArrayList<LeadCattleData> recyclerViewData;
    List<String> categories = new ArrayList<String>();
    Bundle bundle;
    TextView tv1,tv2,tv3;


    ArrayAdapter<String> adapter;
    private String[] cattleStatus = {"Cattle not available","Cattle available","survey done"};

    //Cattle not Available
    //Farmer not available
    //Appointment Taken
    boolean cattNot  = false;
    boolean farmerNot = false;
    boolean appointnot = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_cattle_lead_summary);
        setContentView(R.layout.act_lead_summary_redesign);
        
        initializeView();


    }

    private void initializeView() {


        mContext = this;
        bundle = getIntent().getExtras();
        tv1 = (TextView) findViewById(R.id.tv_cattlenotavalable);
        tv2 = (TextView) findViewById(R.id.tv_farmetnotavailable);
        tv3 = (TextView) findViewById(R.id.tv_appointmenttaken);

        recyclerViewData = new ArrayList<LeadCattleData>();
        recyclerViewData.add(new LeadCattleData(Color.parseColor("#669900"),"Cattle 1",R.drawable.rightrat));
        recyclerViewData.add(new LeadCattleData(Color.parseColor("#669900"),"Cattle 2",R.drawable.rightrat));
        recyclerViewData.add(new LeadCattleData(Color.parseColor("#669900"),"Cattle 3",R.drawable.rightrat));
        recyclerViewData.add(new LeadCattleData(Color.parseColor("#C43635"),"Cattle 4",0));
        recyclerViewData.add(new LeadCattleData(Color.parseColor("#669900"),"Cattle 5",R.drawable.rightrat));
        recyclerViewData.add(new LeadCattleData(Color.parseColor("#C43635"),"Cattle 6", 0));



       //recyclerViewData.add(new LeadCattleData(Color.parseColor("#C43635"),"Cattle 1",0));

       /* MaterialBetterSpinner spinner = (MaterialBetterSpinner)findViewById(R.id.spinner_status);
        adapter = new ArrayAdapter<String>(mContext,  R.layout.spinner_layout, cattleStatus);
        spinner.setAdapter(adapter);*/


        rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);




        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        rv.setLayoutManager(llm);


        LeadCattleAdapter adapter = new LeadCattleAdapter(recyclerViewData,mContext,bundle.getString("lead"));
        rv.setAdapter(adapter);


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        getSupportActionBar().setTitle("Lead Summary");
        getSupportActionBar().setSubtitle(bundle.getString("lead"));



        //Textview color changes initially for 3 options of cattle status
       // tv1.setTextColor(Color.parseColor("#ffffff"));
       // tv1.setBackgroundResource(R.drawable.curve_sharp);
       // cattNot = true;

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.cattlelead_menu, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {



        switch (item.getItemId())
        {
            case R.id.action_signature:
                startActivity(new Intent(CattleLeadSummaryActivity.this, SignatureViewActivity.class).putExtra("lead",(bundle.getString("lead"))));
                break;

            case R.id.action_search:

                break;
            case R.id.action_gotoform:

                startActivity(new Intent(CattleLeadSummaryActivity.this, CattleFormFilling.class).putExtra("lead",(bundle.getString("lead"))));

                break;
        }
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }



    public void CattleNotAvailable(View v)
    {



        if(!cattNot)
        {

            tv1.setTextColor(Color.parseColor("#ffffff"));   //selected
            tv1.setBackgroundResource(R.drawable.curve_sharp);//selected

            tv2.setTextColor(Color.parseColor("#838383"));
            tv2.setBackgroundResource(R.drawable.bg_greyish);

            tv3.setTextColor(Color.parseColor("#838383"));
            tv3.setBackgroundResource(R.drawable.bg_greyish);

            cattNot = true;
            farmerNot = false;
            appointnot = false;
        }
        else
        {
            tv1.setTextColor(Color.parseColor("#838383"));  //unselected
            tv1.setBackgroundResource(R.drawable.bg_greyish); //unselected
            cattNot = false;

        }

     /*   if(!cattNot)
        {
            tv1.setTextColor(Color.parseColor("#ffffff"));
            tv1.setBackgroundResource(R.drawable.curve_sharp);
            farmerNot = true;
            appointnot = true;
            cattNot = true;

        }
        else
        {
            tv1.setTextColor(Color.parseColor("#000000"));
            tv1.setBackgroundResource(R.drawable.bg_transparent);
            cattNot = false;


        }*/


    }

    public void FarmernotAvailable(View v)
    {

            if(!farmerNot)
            {
                tv2.setTextColor(Color.parseColor("#ffffff"));
                tv2.setBackgroundResource(R.drawable.curve_sharp);

                tv1.setTextColor(Color.parseColor("#838383"));
                tv1.setBackgroundResource(R.drawable.bg_greyish);

                tv3.setTextColor(Color.parseColor("#838383"));
                tv3.setBackgroundResource(R.drawable.bg_greyish);

                farmerNot = true;
                cattNot = false;
                appointnot = false;
            }
        else
            {
                tv2.setTextColor(Color.parseColor("#838383"));
                tv2.setBackgroundResource(R.drawable.bg_greyish);
                farmerNot = false;

            }



    }

    public void AppointmentTaken(View v)
    {


        if(!appointnot)
        {
            tv3.setTextColor(Color.parseColor("#ffffff"));
            tv3.setBackgroundResource(R.drawable.curve_sharp);


            tv1.setTextColor(Color.parseColor("#838383"));
            tv1.setBackgroundResource(R.drawable.bg_greyish);

            tv2.setTextColor(Color.parseColor("#838383"));
            tv2.setBackgroundResource(R.drawable.bg_greyish);

            appointnot = true;
            cattNot = false;
            farmerNot = false;
        }

        else
        {
            tv3.setTextColor(Color.parseColor("#838383"));
            tv3.setBackgroundResource(R.drawable.bg_greyish);
            appointnot = false;
        }


    }
}
