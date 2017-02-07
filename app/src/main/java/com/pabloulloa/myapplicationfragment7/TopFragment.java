package com.pabloulloa.myapplicationfragment7;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by pabloulloa on 2017-02-04.
 * This class is for the top fragment
 */

public class TopFragment extends Fragment {

    private InformationSearcher interfaceImplemetor;
    //Interface
    // for communication wiht its parent activity
    // what is an interface
    public interface InformationSearcher
    {
        public void searchForOrigin(String orign);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.interfaceImplemetor = (InformationSearcher) context;
    }

    //send make a view with the layout onCreate event
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState)
    {
        return inflater.inflate(R.layout.fragment_top,container,false);
        // return a view with the layout and container ? (container= view group)
    }

    // create button listner just after component are create
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListView findInformation = (ListView) getActivity().findViewById(R.id.origin);


        findInformation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                //ListView orginList =  (ListView) getActivity().findViewById(R.id.origin);
                interfaceImplemetor.searchForOrigin(parent.getItemAtPosition(position).toString());
                // When clicked, show a toast with the TextView text
                Toast.makeText(getActivity().getApplicationContext(),
                        "hello", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
