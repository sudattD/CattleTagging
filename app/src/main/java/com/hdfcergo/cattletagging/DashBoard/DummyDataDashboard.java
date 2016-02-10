package com.hdfcergo.cattletagging.DashBoard;

import com.hdfcergo.cattletagging.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davesuda on 2/10/2016.
 */
public class DummyDataDashboard {

    String village,taluka,leadCattles,assigned,notAssigned;




    DummyDataDashboard(String village, String taluka, String leadCattles,String assigned,String notAssigned) {
        this.village = village;
        this.taluka = taluka;
        this.leadCattles = leadCattles;
        this.assigned = assigned;
        this.notAssigned = notAssigned;
    }

    private List<DummyDataDashboard> dummyDataDashboards;


    private void initializeData()
    {/*
        dummyDataDashboards =  new ArrayList<>();
        dummyDataDashboards.add(new DummyDataDashboard("Sudatt Dave","28 years old", R.drawable.logo));
        dummyDataDashboards.add(new DummyDataDashboard("Shraddha Dave","28 years old", R.drawable.logo));
        dummyDataDashboards.add(new DummyDataDashboard("Samaya Dave","28 years old", R.drawable.logo));*/
    }

}
