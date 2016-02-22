package com.hdfcergo.cattletagging.LeadDetails;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hdfcergo.cattletagging.DashBoard.DashBoardAdapter;
import com.hdfcergo.cattletagging.DashBoard.DashboardDataDummy;
import com.hdfcergo.cattletagging.R;

import java.util.ArrayList;

public class LeadDetailActivity extends AppCompatActivity {


    private RecyclerView rv;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager llm;
    private Context mContext;
    TextView tv_village,tv_taluka;
    RelativeLayout rl_villageview;
    ArrayList<LeadDataDummy> recyclerViewData;
    Bundle bundle;
    public static boolean villageview = false;
    public static final int IDM_ONE = 101;
    public static final int IDM_TWO = 102;
    public static final int IDM_THREE = 103;
    public static final int IDM_FOUR = 104;
    public static final int IDM_FIVE = 105;
    public static final int IDM_SIX = 106;
    public static final int IDM_GROUP = 201;
    public static final int IDM_GROUP2 = 202;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lead_detail_screens);

        initializeViews();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);


        rl_villageview.getHeight();
        Log.d("HEIGHT",+rl_villageview.getLayoutParams().height+"");


    }

    private void initializeViews() {

        mContext = this;
        tv_village = (TextView) findViewById(R.id.village);
        tv_taluka =(TextView)findViewById(R.id.taluka);
        rl_villageview = (RelativeLayout) findViewById(R.id.villageView);
        bundle = getIntent().getExtras();
        recyclerViewData = new ArrayList<LeadDataDummy>();
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Dada Bhai Pathan","Loan Account number - 00xx5674532","Lead number - CT88765432","Lead Generated Date - 09/07/2015","No. of cattles - 2 Tat : 24 hrs"));
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Kareem Lala","Loan Account number - 00xx4874532","Lead number - CT546789","Lead Generated Date - 19/01/2015","No. of cattles - 14 Tat : 12 hrs"));
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Kareem Lala","Loan Account number - 00xx4874532","Lead number - CT546789","Lead Generated Date - 19/01/2015","No. of cattles - 14 Tat : 12 hrs"));
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Kareem Lala","Loan Account number - 00xx4874532","Lead number - CT546789","Lead Generated Date - 19/01/2015","No. of cattles - 14 Tat : 12 hrs"));
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Kareem Lala","Loan Account number - 00xx4874532","Lead number - CT546789","Lead Generated Date - 19/01/2015","No. of cattles - 14 Tat : 12 hrs"));
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Kareem Lala","Loan Account number - 00xx4874532","Lead number - CT546789","Lead Generated Date - 19/01/2015","No. of cattles - 14 Tat : 12 hrs"));
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Kareem Lala","Loan Account number - 00xx4874532","Lead number - CT546789","Lead Generated Date - 19/01/2015","No. of cattles - 14 Tat : 12 hrs"));
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Kareem Lala","Loan Account number - 00xx4874532","Lead number - CT546789","Lead Generated Date - 19/01/2015","No. of cattles - 14 Tat : 12 hrs"));



        rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        rv.setLayoutManager(llm);

        LeadDetailsAdapter adapter = new LeadDetailsAdapter(recyclerViewData,mContext,this);
        rv.setAdapter(adapter);

        //setting up texts
        getSupportActionBar().setTitle(bundle.getString("village")+"->"+bundle.getString("taluka"));
        tv_village.setText("Village - "+bundle.getString("village"));
        tv_taluka.setText("Taluka - "+bundle.getString("taluka"));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.leaddetails_menu, menu);
        return true;
       /* SubMenu subMenu1 = menu.addSubMenu("Radio submenu");
        subMenu1.add(IDM_GROUP, IDM_ONE, Menu.NONE, "Item one").setCheckable(true);
        subMenu1.add(IDM_GROUP, IDM_TWO, Menu.NONE, "Item two").setCheckable(true);
        subMenu1.add(IDM_GROUP, IDM_THREE, Menu.NONE, "Item three").setCheckable(true);
        subMenu1.setGroupCheckable(IDM_GROUP, true, true);

        SubMenu subMenu2 = menu.addSubMenu("Checkbox submenu");
        subMenu2.add(IDM_GROUP2, IDM_FOUR, Menu.NONE, "Item four").setCheckable(true);
        subMenu2.add(IDM_GROUP2, IDM_FIVE, Menu.NONE, "Item five").setCheckable(true);
        subMenu2.add(IDM_GROUP2, IDM_SIX, Menu.NONE, "Item six").setCheckable(true);
        subMenu2.setGroupCheckable(IDM_GROUP2, true, false);

        return super.onCreateOptionsMenu(menu);*/

    }


    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        item.setChecked(!item.isChecked());
        CharSequence message;
        switch(item.getItemId()){
            case IDM_ONE:
                message = "First item selected";
                break;
            case IDM_TWO:
                message = "Second item selected";
                break;
            case IDM_THREE:
                message = "Third item selected";
                break;
            case IDM_FOUR:
                message = "Fourth item selected";
                break;
            case IDM_FIVE:
                message = "Fifth item selected";
                break;
            case IDM_SIX:
                message = "Sixth item selected";
                break;

            case R.id.action_filter:
                openDialogue();
                break;

            case R.id.action_gone:

                if(!villageview)
                {
                    rl_villageview.setVisibility(View.VISIBLE);
                    villageview = true;
                }
                else
                {
                    rl_villageview.setVisibility(View.GONE);
                    villageview = false;
                }

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
