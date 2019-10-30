package com.asad.sportsvaganza.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.asad.sportsvaganza.Adapters.CricketFixturesAdapter;
import com.asad.sportsvaganza.Adapters.FootballFixturesAdapter;
import com.asad.sportsvaganza.R;


public class CricketLiveFragment extends Fragment {

    public CricketLiveFragment(){

    }

    public static CricketLiveFragment newInstance() {
        CricketLiveFragment fragment = new CricketLiveFragment();
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
        View view = inflater.inflate(R.layout.fragment_cricket_live, viewGroup, false);
        RecyclerView cricket_fixtures_live = view.findViewById(R.id.cricket_live_list);
        cricket_fixtures_live.setLayoutManager(new LinearLayoutManager(getContext()));
        String[] matches = {"match 1", "match 2", "match 3", "match 4", "match 5", "match 6", "match 7", "match 8", "match 9", "match 10", "match 11", "match 12", "match 13", "match 14", "match 15", "match 16", "match 17"};
        cricket_fixtures_live.setAdapter(new CricketFixturesAdapter(matches));

        return view;
    }
}
