package com.prasanth.smartnotes.home;

import com.prasanth.smartnotes.datamodel.Note;

import java.util.List;

/**
 * Base interface to design all kind of methods to include.
 */
public interface HomeMVP {

    /**
     * Interface for all view related actions
     */
    interface View {
        void showLoading();

        void loadGridView(List<Note> notes);
    }

    interface Presenter {
        void onLoaded();
    }

    interface Model {
        List<Note> getNotes();
    }
}
