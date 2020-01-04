package com.example.flaxiblefragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.flaxiblefragment.MainActivity;
import com.example.flaxiblefragment.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btnThird = getView().findViewById(R.id.secondButton);
        btnThird.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                ThirdFragment thirdFragment = new ThirdFragment();
                FragmentManager mfragmentManager = getFragmentManager();

                if (mfragmentManager != null) {
                    mfragmentManager
                            .beginTransaction()
                            .replace(R.id.frame_content, thirdFragment, ThirdFragment.class.getSimpleName())
                            .addToBackStack(null)
                            .commit();
                }
            }
        });

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment Kedua");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("second_fragment.xml");
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setHasOptionsMenu(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            getFragmentManager().popBackStack();
        }
        return super.onOptionsItemSelected(item);
    }
}
