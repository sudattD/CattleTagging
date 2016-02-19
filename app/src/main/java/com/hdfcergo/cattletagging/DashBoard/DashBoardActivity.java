package com.hdfcergo.cattletagging.DashBoard;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hdfcergo.cattletagging.R;
import com.hdfcergo.cattletagging.Utility.FontChangeCrawler;

import java.util.ArrayList;

public class DashBoardActivity extends AppCompatActivity {


    private RecyclerView rv;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager llm;
    private Context mContext;
    private Toolbar toolbar;


    ArrayList<DashboardDataDummy> recyclerViewData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_rredesign);


        initializeViews();
    }

    private void initializeViews() {


        mContext = this;

        recyclerViewData = new ArrayList<DashboardDataDummy>();
        recyclerViewData.add(new DashboardDataDummy("Village - Mahar Kala","Taluka - Chomu","4 leads/ 22 cattles","2 Assigned/20 Unassigned"));
        recyclerViewData.add(new DashboardDataDummy("Village - Manda Bhinda","Taluka - Chomu","3 leads/ 12 cattles","4 Assigned/8 Unassigned"));
        recyclerViewData.add(new DashboardDataDummy("Village - Deesa","Taluka - Chomu","2 leads/ 15 cattles","10 Assigned/5 Unassigned"));
        recyclerViewData.add(new DashboardDataDummy("Village - Jasara","Taluka - Deesa","1 leads/ 9 cattles","6 Assigned/3 Unassigned"));
        recyclerViewData.add(new DashboardDataDummy("Village - Kasauli","Taluka - Deesa","1 leads/ 20 cattles","10 Assigned/10 Unassigned"));

        recyclerViewData.add(new DashboardDataDummy("Village - Mahar Kala","Taluka - Chomu","4 leads/ 22 cattles","2 Assigned/20 Unassigned"));
        recyclerViewData.add(new DashboardDataDummy("Village - Manda Bhinda","Taluka - Chomu","3 leads/ 12 cattles","4 Assigned/8 Unassigned"));
        recyclerViewData.add(new DashboardDataDummy("Village - Deesa","Taluka - Chomu","2 leads/ 15 cattles","10 Assigned/5 Unassigned"));
        recyclerViewData.add(new DashboardDataDummy("Village - Jasara","Taluka - Deesa","1 leads/ 9 cattles","6 Assigned/3 Unassigned"));
        recyclerViewData.add(new DashboardDataDummy("Village - Kasauli","Taluka - Deesa","1 leads/ 20 cattles","10 Assigned/10 Unassigned"));


        rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);




        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        rv.setLayoutManager(llm);


        DashBoardAdapter adapter = new DashBoardAdapter(recyclerViewData,mContext);
        rv.setAdapter(adapter);


        //Setting up texts
        getSupportActionBar().setTitle("Dashboard " + "(4)" + "(11)" + "(81)");


        //mAdapter = new DashBoardAdapter(myDataset);

    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);

        FontChangeCrawler fontChanger = new FontChangeCrawler(getAssets(), "HelveticaNeueLTStd-Roman.otf");
        fontChanger.replaceFonts((ViewGroup) this.findViewById(android.R.id.content));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dashboard_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        item.setChecked(!item.isChecked());
        CharSequence message;
        switch(item.getItemId()){


            case R.id.action_filter:
                openDialogue();
                break;

            case R.id.action_gone:



                break;
            default:
                return super.onContextItemSelected(item);
        }
        // Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        //toast.show();
        return true;
    }
    private void openDialogue() {

        final CharSequence[] items = {" Lead Number "," Proposal Number "," RM Name "," Loan Account Number "
                ," Date ", " Case ID ", " Assigned ", " Not Assigned ", " Pending For QC "};
        final ArrayList seletedItems=new ArrayList();

        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Filter Options")
                .setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int indexSelected, boolean isChecked) {
                        if (isChecked) {
                            // If the user checked the item, add it to the selected items
                            seletedItems.add(indexSelected);
                        } else if (seletedItems.contains(indexSelected)) {
                            // Else, if the item is already in the array, remove it
                            seletedItems.remove(Integer.valueOf(indexSelected));
                        }
                    }
                }).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        //  Your code when user clicked on OK
                        //  You can write the code  to save the selected item here
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        //  Your code when user clicked on Cancel
                    }
                }).create();
        dialog.show();
    }
}
