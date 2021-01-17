package com.example.contaking.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.contaking.Model.Data;
import com.example.contaking.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class FinePartita extends Fragment {

    private TextView postp_1;
    private TextView postp_2;
    private TextView postp_3;
    private TextView postp_4;

    private TextView point1;
    private TextView point2;
    private TextView point3;
    private TextView point4;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fine_partita, container, false);

        postp_1 = (TextView) view.findViewById(R.id.G1);
        postp_2 = (TextView) view.findViewById(R.id.G2);
        postp_3 = (TextView) view.findViewById(R.id.G3);
        postp_4 = (TextView) view.findViewById(R.id.G4);

        //array con tutti i punteggi
        int[] point = {Data.getPlayer1point(),Data.getPlayer2point(),Data.getPlayer3point(),Data.getPlayer4point()};
        bubbleSort(point);


        return view;
    }

    void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]){
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}