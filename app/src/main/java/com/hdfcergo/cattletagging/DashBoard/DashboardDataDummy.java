package com.hdfcergo.cattletagging.DashBoard;

import java.util.List;

/**
 * Created by davesuda on 2/10/2016.
 */
public class DashboardDataDummy {

    String village,taluka,leadCattles,assigned,notAssigned;




    DashboardDataDummy(String village, String taluka, String leadCattles, String assigned, String notAssigned) {
        this.village = village;
        this.taluka = taluka;
        this.leadCattles = leadCattles;
        this.assigned = assigned;
        this.notAssigned = notAssigned;
    }

    private List<DashboardDataDummy> dashboardDataDummies;


    private void initializeData()
    {/*
        dashboardDataDummies =  new ArrayList<>();
        dashboardDataDummies.add(new DashboardDataDummy("Sudatt Dave","28 years old", R.drawable.logo));
        dashboardDataDummies.add(new DashboardDataDummy("Shraddha Dave","28 years old", R.drawable.logo));
        dashboardDataDummies.add(new DashboardDataDummy("Samaya Dave","28 years old", R.drawable.logo));*/
    }

}
