package com.ming.cmprickerlib.recycler;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * 作者：NB的LittleWhite
 * <p>
 * 邮箱：zhan_0313@163.com
 */
public class CmPickerAdapter<T> extends RecyclerView.Adapter<CmPickerAdapter.ScrollPickerAdapterHorder>{
    @NonNull
    @Override
    public CmPickerAdapter.ScrollPickerAdapterHorder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CmPickerAdapter.ScrollPickerAdapterHorder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class ScrollPickerAdapterHorder extends RecyclerView.ViewHolder{


        public ScrollPickerAdapterHorder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
