package com.pathtech.kuppurugaddigemutt;

/**
 * Created by BHAVYASHREE on 3/13/2017.
 */

public class PoojaDataProvider  {
    private int app_name_resourcee;
    private String app_nameeee;

    public PoojaDataProvider(int app_name_resourcee,String app_nameee)
    {
        this.setApp_name_resource(app_name_resourcee);
        this.setApp_namee(app_nameee);
    }

    public void setApp_name_resource(int app_name_resourcee) {
        this.app_name_resourcee = app_name_resourcee;
    }

    public String getApp_namee() {
        return app_nameeee;
    }

    public void setApp_namee(String app_nameee) {
        this.app_nameeee = app_nameee;
    }

}


