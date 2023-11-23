package com.example.jaymogal.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.jaymogal.Movie0;
import com.example.jaymogal.Movie1;
import com.example.jaymogal.R;
import com.example.jaymogal.bus;
import com.example.jaymogal.bus1;
import com.example.jaymogal.bus2;
import com.example.jaymogal.databinding.FragmentHomeBinding;

import java.net.Inet4Address;

public class HomeFragment extends Fragment {
    Activity context;

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        context=getActivity();

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
       return  root;
    }
    public  void onStart(){
        super.onStart();
        ImageView img=(ImageView) context.findViewById(R.id.imageView2);
        ImageView img1=(ImageView) context.findViewById(R.id.imageView6);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, bus1.class);
                startActivity(intent);
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, Movie0.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}