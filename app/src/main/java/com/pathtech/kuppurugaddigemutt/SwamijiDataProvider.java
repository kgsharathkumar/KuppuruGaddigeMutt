package com.pathtech.kuppurugaddigemutt;

/**
 * Created by BHAVYASHREE on 3/12/2017.
 */

public class SwamijiDataProvider {
    private int app_name_resourcee;
    private String app_nameee;

    public SwamijiDataProvider(int app_name_resourcee,String app_nameee)
    {
        this.setApp_name_resource(app_name_resourcee);
        this.setApp_namee(app_nameee);
    }

    public void setApp_name_resource(int app_name_resourcee) {
        this.app_name_resourcee = app_name_resourcee;
    }

    public String getApp_namee() {
        return app_nameee;
    }

    public void setApp_namee(String app_nameee) {
        this.app_nameee = app_nameee;
    }

}
