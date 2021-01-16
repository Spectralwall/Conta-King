package com.example.contaking.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.contaking.Model.Data;
import com.example.contaking.R;

public class win_domino extends Fragment {

    Button player1;
    Button player2;
    Button player3;
    Button player4;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_win_domino, container, false);

        player1 = (Button) view.findViewById(R.id.button3);
        player2 = (Button) view.findViewById(R.id.button5);
        player3 = (Button) view.findViewById(R.id.button6);
        player4 = (Button) view.findViewById(R.id.button7);

        player1.setText(Data.getPlayer1());
        player2.setText(Data.getPlayer2());
        player3.setText(Data.getPlayer3());
        player4.setText(Data.getPlayer4());

        player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data.setDomino(Data.getPlayer1());
                NavHostFragment.findNavController(win_domino.this)
                        .navigate(R.id.action_navigation_win_domino_to_navigation_domino);
            }
        });
        player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data.setDomino(Data.getPlayer2());
                NavHostFragment.findNavController(win_domino.this)
                        .navigate(R.id.action_navigation_win_domino_to_navigation_domino);
            }
        });
        player3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data.setDomino(Data.getPlayer3());
                NavHostFragment.findNavController(win_domino.this)
                        .navigate(R.id.action_navigation_win_domino_to_navigation_domino);
            }
        });
        player4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data.setDomino(Data.getPlayer4());
                NavHostFragment.findNavController(win_domino.this)
                        .navigate(R.id.action_navigation_win_domino_to_navigation_domino);
            }
        });

        return  view;
    }
}