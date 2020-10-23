package com.oleg.fragments;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.oleg.R;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ItemViewHolder> {

    private final List<String> mItems;


    public RVAdapter(List<String> mItems) {
        this.mItems = mItems;

    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        private final TextView mTextView;

        public ItemViewHolder(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.list_item);
        }
    }

    @Override
    public void onBindViewHolder(ItemViewHolder itemViewHolder, int i) {
        itemViewHolder.mTextView.setText(mItems.get(i));
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row, viewGroup, false);
        return new ItemViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
