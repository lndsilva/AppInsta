package br.com.etecia.appinsta;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    List<HomeContents> lstHomeContents;

    RecyclerView idRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        idRecyclerView = view.findViewById(R.id.idRecyclerViewHomeProfile);

        lstHomeContents = new ArrayList<>();

        lstHomeContents.add(
                new HomeContents(
                        "Flores do campo",
                        "Santo Antônio do Pinhal",
                        R.drawable.rosas
                )
        );

        HomeAdapter adapter = new HomeAdapter(getContext(), lstHomeContents);

        idRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, true));

        idRecyclerView.hasFixedSize();

        idRecyclerView.setAdapter(adapter);


        return view;
    }
}