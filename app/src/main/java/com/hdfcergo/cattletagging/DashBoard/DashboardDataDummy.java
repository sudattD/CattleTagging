package com.hdfcergo.cattletagging.DashBoard;

import java.util.List;

/**
 * Created by davesuda on 2/10/2016.
 */
public class DashboardDataDummy {

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getTaluka() {
        return taluka;
    }

    public void setTaluka(String taluka) {
        this.taluka = taluka;
    }

    public String getLeadCattles() {
        return leadCattles;
    }

    public void setLeadCattles(String leadCattles) {
        this.leadCattles = leadCattles;
    }

    public String getAssigned() {
        return assigned;
    }

    public void setAssigned(String assigned) {
        this.assigned = assigned;
    }

    public String getNotAssigned() {
        return notAssigned;
    }

    public void setNotAssigned(String notAssigned) {
        this.notAssigned = notAssigned;
    }

    public List<DashboardDataDummy> getDashboardDataDummies() {
        return dashboardDataDummies;
    }

    public void setDashboardDataDummies(List<DashboardDataDummy> dashboardDataDummies) {
        this.dashboardDataDummies = dashboardDataDummies;
    }

    String village,taluka,leadCattles,assigned,notAssigned;




    DashboardDataDummy(String village, String taluka, String leadCattles, String assigned) {
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
