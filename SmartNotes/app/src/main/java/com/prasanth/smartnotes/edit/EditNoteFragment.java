package com.prasanth.smartnotes.edit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prasanth.smartnotes.R;

public class EditNoteFragment extends Fragment {
    public static final String TAG = EditNoteFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public static EditNoteFragment newInstance() {
        EditNoteFragment EditNoteFragment = new EditNoteFragment();
        return EditNoteFragment;
    }


}
