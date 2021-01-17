package com.example.contaking.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

    private Button ricomincia;


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

        point1 = (TextView) view.findViewById(R.id.point1);
        point2 = (TextView) view.findViewById(R.id.point2);
        point3 = (TextView) view.findViewById(R.id.poin3);
        point4 = (TextView) view.findViewById(R.id.point4);

        ricomincia = (Button) view.findViewById(R.id.button2);

        //array con tutti i punteggi
        int[] point = {Data.getPlayer1point(),Data.getPlayer2point(),Data.getPlayer3point(),Data.getPlayer4point()};
        bubbleSort(point);//ordinanto in modo crescente

        ArrayList<TextView> punt = new ArrayList<>();
        punt.add(point4);
        punt.add(point3);
        punt.add(point2);
        punt.add(point1);
        ArrayList<TextView> text = new ArrayList<>();
        text.add(postp_4);
        text.add(postp_3);
        text.add(postp_2);
        text.add(postp_1);

        for(int i = 0; i<point.length; i++){
           if(point[i] == Data.getPlayer1point()){
               punt.get(i).setText(Data.getPlayer1point());
               text.get(i).setText(Data.getPlayer1());
           }else if(point[i] == Data.getPlayer2point()){
               punt.get(i).setText(Data.getPlayer2point());
               text.get(i).setText(Data.getPlayer2());
           }else if(point[i] == Data.getPlayer3point()){
               punt.get(i).setText(Data.getPlayer3point());
               text.get(i).setText(Data.getPlayer3());
           }else if(point[i] == Data.getPlayer4point()){
               punt.get(i).setText(Data.getPlayer4point());
               text.get(i).setText(Data.getPlayer4());
           }
        }
        ricomincia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(Data.getPlayer1point());
                System.out.println(Data.getPlayer2point());
                System.out.println(Data.getPlayer3point());
                System.out.println(Data.getPlayer4point());
                Data.deleteData();
                NavHostFragment.findNavController(FinePartita.this)
                        .navigate(R.id.action_navigation_finePartita_to_navigation_NumPlayer);
            }
        });

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