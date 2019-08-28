package com.pathtech.kuppurugaddigemutt;

/**
 * Created by BHAVYASHREE on 12/16/2016.
 */

public class AppDataProvider  {
    private int app_name_resource;
    private String app_namee;

    public int getApp_name_resource() {
        return app_name_resource;
    }
    public AppDataProvider(int app_name_resource,String app_namee)
    {
        this.setApp_name_resource(app_name_resource);
        this.setApp_namee(app_namee);
    }

    public void setApp_name_resource(int app_name_resource) {
        this.app_name_resource = app_name_resource;
    }

    public String getApp_namee() {
        return app_namee;
    }

    public void setApp_namee(String app_namee) {
        this.app_namee = app_namee;
    }

}
