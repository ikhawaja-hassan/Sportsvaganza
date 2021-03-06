package com.asad.sportsvaganza.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.asad.sportsvaganza.Models.FootballLiveModel;
import com.asad.sportsvaganza.R;

import java.util.List;

public class FootballLiveAdapter extends RecyclerView.Adapter<FootballLiveAdapter.FootballLiveViewHolder> {

    private List<FootballLiveModel> footballLiveModelList;
    private Context context;

    public FootballLiveAdapter(List<FootballLiveModel> footballLiveModelList, Context context){
        this.footballLiveModelList = footballLiveModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public FootballLiveViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.listitem_football_live, parent, false);
        return new FootballLiveViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FootballLiveViewHolder holder, int position) {
        holder.mteamA3.setText(footballLiveModelList.get(position).teamA3);
        holder.mteamB3.setText(footballLiveModelList.get(position).teamB3);
        holder.mscoreA3.setText(footballLiveModelList.get(position).scoreA3);
        holder.mscoreB3.setText(footballLiveModelList.get(position).scoreB3);
    }

    @Override
    public int getItemCount() {
        return footballLiveModelList.size();
    }

    public class FootballLiveViewHolder extends RecyclerView.ViewHolder{
        TextView mteamA3;
        TextView mteamB3;
        TextView mscoreA3;
        TextView mscoreB3;

        public FootballLiveViewHolder(@NonNull View itemView) {
            super(itemView);
            mteamA3 = itemView.findViewById(R.id.textView_teamAName3);
            mteamB3 = itemView.findViewById(R.id.textView_teamBName3);
            mscoreA3 = itemView.findViewById(R.id.textView_scoreA3);
            mscoreB3 = itemView.findViewById(R.id.textView_scoreB3);
        }
    }

}
