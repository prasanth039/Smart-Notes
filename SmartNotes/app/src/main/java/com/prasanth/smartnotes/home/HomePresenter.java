package com.prasanth.smartnotes.home;

/**
 * Created by Prasanth on 5/22/2016.
 */

public class HomePresenter implements HomeMVP.Presenter {
    private HomeMVP.View view;

    private HomeMVP.Model model;

    public HomePresenter(HomeMVP.View view) {
        this.view = view;
        model = new DummyModel();
    }

    @Override
    public void onLoaded() {
        view.loadGridView(model.getNotes());
    }
}
