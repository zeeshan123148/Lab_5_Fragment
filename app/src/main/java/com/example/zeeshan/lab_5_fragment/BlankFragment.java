package com.example.zeeshan.lab_5_fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class BlankFragment extends Fragment {

    EditText text;
    Button btn;

    Communicator communicate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(context instanceof MainActivity){

        }

    }

    interface Communicator {
        void supplyData(String data);
    }


}
