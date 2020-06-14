package com.example.covidtracker;

import android.content.Context;
import android.net.ConnectivityManager;

public class DataConnection {

    public static boolean checkInternetConnection(Context context){

        ConnectivityManager connectivityManager=(ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return (connectivityManager.getActiveNetworkInfo()!=null && connectivityManager.getActiveNetworkInfo().isAvailable()&&connectivityManager.getActiveNetworkInfo().isConnected());
    }

}
