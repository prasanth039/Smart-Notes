package com.prasanth.smartnotes.edit;

import com.prasanth.smartnotes.data.Note;

/**
 * Created by prasanth on 31/05/16.
 */

public interface EditMVP {
    interface Presenter {
        void saveNote(Note note);
    }

    interface View {
        void onNoteSave();
    }

    interface Model {
        void saveNote(Note note);
    }
}
