package com.example.a10118327_uas_akb.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.a10118327_uas_akb.R;

public class AccountFragment extends Fragment{

    private Button btn_exit;

    public AccountFragment (){
        // EMty
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_account, container, false);
       // btn_exit = view.findViewById(R.id.btn_exit);
       // btn_exit.setOnClickListener(new View.OnClickListener() {

          //  @Override
          //  public void onClick(View view) {
           //     // TODO Auto-generated method stub
          //      System.exit(0);
         //   }
        //});
        return view;
    }

}
// 6 AGUSTUS 2021
//10118327
// DERAN DERIYANA FAUZZAN
//IF-8


