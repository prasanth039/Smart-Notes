package com.prasanth.smartnotes.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prasanth.smartnotes.R;
import com.prasanth.smartnotes.data.Note;
import com.prasanth.smartnotes.edit.EditNoteActivity;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeFragment extends Fragment implements HomeMVP.View {

    public static final String TAG = HomeFragment.class.getSimpleName();

    @Bind(R.id.note_view)
    RecyclerView recyclerView;

    private HomeMVP.Presenter presenter;

    @Override
    public void showLoading() {
    }

    public static HomeFragment newInstance() {
        HomeFragment homeFragment = new HomeFragment();
        return homeFragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter = new HomePresenter(this);
        presenter.onLoaded();
    }

    public void loadGridView(List<Note> notes) {
        HomeAdapter adapter = new HomeAdapter();
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(layoutManager);
        adapter.setNotes(notes);
    }

    @OnClick(R.id.fab)
    void handleFABTap() {
        Intent intent = new Intent(getActivity(), EditNoteActivity.class);
        getActivity().startActivity(intent);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
