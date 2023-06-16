package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ApplicationAdapter extends BaseAdapter {
    private List<CustomApplication> applicationList;
    private LayoutInflater inflater;

    public ApplicationAdapter(Context context, List<CustomApplication> applications) {
        this.applicationList = applications;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return applicationList.size();
    }

    @Override
    public Object getItem(int position) {
        return applicationList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.item_application, parent, false);
        }

        CustomApplication application = applicationList.get(position);

        TextView nameTextView = view.findViewById(R.id.nameTextView);
        TextView dateTextView = view.findViewById(R.id.dateTextView);
        TextView typeTextView = view.findViewById(R.id.typeTextView);

        nameTextView.setText(application.getName());
        dateTextView.setText(application.getDate());
        typeTextView.setText(application.getType());

        return view;
    }
}

