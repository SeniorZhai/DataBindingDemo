package io.github.seniorzhai.databindingdemo;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import io.github.seniorzhai.databindingdemo.databinding.ItemGridBinding;
import io.github.seniorzhai.databindingdemo.model.PlainUser;

/**
 * Created by zhaitao on 15/8/16.
 */
public class MyAdapter extends BaseAdapter {
    private List<PlainUser> mList;
    private ItemGridBinding binding;
    private LayoutInflater inflater;

    public MyAdapter(List<PlainUser> list, LayoutInflater inflater) {
        this.inflater = inflater;
        mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public PlainUser getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.item_grid, parent, false);
            convertView = binding.getRoot();
            convertView.setTag(binding);
        } else {
            binding = (ItemGridBinding) convertView.getTag();
        }
        binding.setVariable(io.github.seniorzhai.databindingdemo.BR.user, getItem(position));
        convertView.setBackgroundColor(RandomColor.getColor());
        return convertView;
    }
}
