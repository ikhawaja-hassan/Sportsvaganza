package com.asad.sportsvaganza.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.asad.sportsvaganza.Adapters.FootballLiveAdapter;
import com.asad.sportsvaganza.Models.FootballLiveModel;
import com.asad.sportsvaganza.R;

import java.util.ArrayList;
import java.util.List;

public class FootballLiveFragment extends Fragment {

    public FootballLiveFragment(){

    }

    public static FootballLiveFragment newInstance() {
        FootballLiveFragment fragment = new FootballLiveFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_football_live, viewGroup, false);
        RecyclerView football_live_list = view.findViewById(R.id.football_live_list);
        football_live_list.setLayoutManager(new LinearLayoutManager(getContext()));
        football_live_list.setAdapter(new FootballLiveAdapter(feedItems(), getContext()));
        
        return view;
    }

    private List<FootballLiveModel> feedItems(){
        List<FootballLiveModel> demoItems = new ArrayList<>();
        demoItems.add(new FootballLiveModel("Team A", "Team B", "1", "0"));
        demoItems.add(new FootballLiveModel("Team C", "Team D", "0", "0"));

        return demoItems;
    }

}
