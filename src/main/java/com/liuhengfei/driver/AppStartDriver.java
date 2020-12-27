package com.liuhengfei.driver;

public class AppStartDriver extends BasebeanDriver{
    private AppStartDriver instance;
    private AppStartDriver(){};

    public AppStartDriver getInstance() {
        if(instance==null)
        {
            instance = new AppStartDriver();
        }
        return instance;
    }

}
