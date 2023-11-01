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

    List<ProfileHor> lstProfHor;

    RecyclerView idRecyclerView, idRecyclerProfileHor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        idRecyclerView = view.findViewById(R.id.idRecyclerViewHomeProfile);

        idRecyclerProfileHor = view.findViewById(R.id.idRecProfiles);


        lstHomeContents = new ArrayList<>();
        lstProfHor = new ArrayList<>();

        lstProfHor.add(
                new ProfileHor(
                        "Seu story",
                        R.drawable.usu
                )
        );
        lstProfHor.add(
                new ProfileHor(
                        "Seu story",
                        R.drawable.usu
                )
        );
        lstProfHor.add(
                new ProfileHor(
                        "Seu story",
                        R.drawable.usu
                )
        );
        lstProfHor.add(
                new ProfileHor(
                        "Seu story",
                        R.drawable.usu
                )
        );
        lstProfHor.add(
                new ProfileHor(
                        "Seu story",
                        R.drawable.usu
                )
        );
        lstProfHor.add(
                new ProfileHor(
                        "Seu story",
                        R.drawable.usu
                )
        );
        lstProfHor.add(
                new ProfileHor(
                        "Seu story",
                        R.drawable.usu
                )
        );
        lstProfHor.add(
                new ProfileHor(
                        "Seu story",
                        R.drawable.usu
                )
        );

        lstHomeContents.add(
                new HomeContents(
                        "Flores do campo",
                        "Santo Antônio do Pinhal",
                        R.drawable.rosas
                )
        );
        lstHomeContents.add(
                new HomeContents(
                        "Poppies",
                        "Amaro da Serra",
                        R.drawable.poppies
                )
        );
        lstHomeContents.add(
                new HomeContents(
                        "Lótus do campo",
                        "Santana do Parnaíba",
                        R.drawable.lotus
                )
        );

        HomeAdapter adapter = new HomeAdapter(getContext(), lstHomeContents);

        ProfileAdapterHorizontal adapterHorizontal = new ProfileAdapterHorizontal(getContext(), lstProfHor);

        idRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, true));

        idRecyclerProfileHor.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, true));

        idRecyclerProfileHor.hasFixedSize();

        idRecyclerView.hasFixedSize();

        idRecyclerProfileHor.setAdapter(adapterHorizontal);

        idRecyclerView.setAdapter(adapter);


        return view;
    }
}