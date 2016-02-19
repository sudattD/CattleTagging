package com.hdfcergo.cattletagging.LeadSummaryActivity;

/**
 * Created by davesuda on 2/12/2016.
 */
public class LeadCattleData {

    public String getCattle() {
        return cattle;
    }

    public void setCattle(String cattle) {
        this.cattle = cattle;
    }

    public int getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(int imageIcon) {
        this.imageIcon = imageIcon;
    }

    public int getLeftImageColor() {
        return leftImageColor;
    }

    public void setLeftImageColor(int leftImageColor) {
        this.leftImageColor = leftImageColor;
    }

    String cattle;
    int imageIcon;
    int leftImageColor;

    LeadCattleData(String cattleName,int statusImage)
    {


        this.cattle = cattleName;
        this.imageIcon = statusImage;
    }


    LeadCattleData(int leftImagecolor,String cattleName,int statusImage)
    {

        this.leftImageColor = leftImagecolor;
        this.cattle = cattleName;
        this.imageIcon = statusImage;
    }

}
