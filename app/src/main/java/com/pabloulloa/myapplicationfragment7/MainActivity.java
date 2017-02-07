package com.pabloulloa.myapplicationfragment7;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopFragment.InformationSearcher{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    // what to do in case interface communicate
    @Override
    public void  searchForOrigin(String orign) {
        BottomFragment bottomFragment = (BottomFragment) getFragmentManager().findFragmentById(R.id.bottomFragment);
        String result = "About "+ orign  ;
        bottomFragment.displayInformation(result);
    }
}


