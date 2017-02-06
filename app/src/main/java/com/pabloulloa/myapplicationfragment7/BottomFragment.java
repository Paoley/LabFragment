package com.pabloulloa.myapplicationfragment7;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by pabloulloa on 2017-02-04.
 * This fagment class is to create a fargment on the lower part of an activitu
 */

public class BottomFragment extends Fragment {



    //send make a view with the layout onCreate event
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState)
    {
        return inflater.inflate(R.layout.fragment_bottom,container,false);
        // return a view with the layout and container ? (container= view group)


    }


    //finds and set the result in textEdir
    public void displayInformation(String result )
    {
        EditText resultField = (EditText) getActivity().findViewById(R.id.queryResult);
        resultField.setText(result);
    }
}
