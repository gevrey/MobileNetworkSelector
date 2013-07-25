package com.gevrey.mobilenetworkselector;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;

import com.gevrey.mobilenetworkselector.data.Provider;

public class MainActivity extends ListActivity
{
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.providers);
        ProviderAdapter listViewAdapter = new ProviderAdapter(this, getProviderList());
		
        setListAdapter(listViewAdapter);
    }
    
    ArrayList<Provider> getProviderList()
    {
    	ArrayList<Provider> providers = new ArrayList<Provider>();
    	
//		ConnectivityManager myConnectivity = 
//				(ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);
//		NetworkInfo[] myNetworks = myConnectivity.getAllNetworkInfo();
//		
//		for (int i=0; i < myNetworks.length; i++)
//		{
//			NetworkInfo myInfo = myNetworks[i];
//			String name = myInfo.toString();
//		}
		
    	providers.add(new Provider("test1"));
    	providers.add(new Provider("test2"));
    	providers.add(new Provider("test3"));
    	providers.add(new Provider("test CG"));
    	

    	
    	return providers;
    	
    }
}


