package io.github.seniorzhai.databindingdemo.model;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import io.github.seniorzhai.databindingdemo.BR;
import io.github.seniorzhai.databindingdemo.R;
import io.github.seniorzhai.databindingdemo.RandomColor;
import io.github.seniorzhai.databindingdemo.databinding.ItemGridBinding;

/**
 * Created by zhaitao on 15/8/16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.BindingHolder> {

    private List<PlainUser> mList;

    public RecyclerAdapter(List<PlainUser> list) {
        mList = list;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemGridBinding itemGridBinding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_grid, parent, false);
        BindingHolder holder = new BindingHolder(itemGridBinding);
        return holder;
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        PlainUser user = mList.get(position);
        holder.getBinding().setVariable(BR.user, user);
        holder.getBinding().getRoot().setBackgroundColor(RandomColor.getColor());
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class BindingHolder extends RecyclerView.ViewHolder {
        private final ViewDataBinding binding;

        public BindingHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public ViewDataBinding getBinding() {
            return binding;
        }
    }
}
