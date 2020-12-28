package com.liuhengfei.driver;

import com.liuhengfei.beans.AppFavorites;
import com.liuhengfei.beans.EnvIn;

public class AppFavoritesDriver extends BasebeanDriver {
    private AppFavoritesDriver(){};
    private static AppFavoritesDriver instance;
    public static AppFavoritesDriver getInstance()
    {
        if(instance==null)
        {
            instance = new AppFavoritesDriver();
        }
        return instance;
    }
    @Override
    protected EnvIn generateBean() {
        AppFavorites favorites = new AppFavorites();

        favorites.setId(rand.nextInt(favorNum));
        favorites.setRes_id(rand.nextInt(allResNum));
        //favorites.setUserid(rand.nextInt(10));
        favorites.setAdd_time((System.currentTimeMillis() - rand.nextInt(99999999)) + "");

        return favorites;
    }
}
