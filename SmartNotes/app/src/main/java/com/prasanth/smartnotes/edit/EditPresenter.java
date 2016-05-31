package com.prasanth.smartnotes.edit;

import com.prasanth.smartnotes.data.Note;

public class EditPresenter implements EditMVP.Presenter {

    private EditMVP.Model editModel;
    private EditMVP.View editView;

    public EditPresenter(EditMVP.View view) {
        editModel = new EditModel();
        editView = view;
    }

    @Override
    public void saveNote(Note note) {
        editModel.saveNote(note);
    }
}
