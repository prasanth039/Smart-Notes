package com.prasanth.smartnotes.edit;

import com.prasanth.smartnotes.data.FirebaseHelper;
import com.prasanth.smartnotes.data.Note;

public class EditModel implements EditMVP.Model {
    FirebaseHelper firebaseHelper;

    public void EditModel() {
        firebaseHelper = FirebaseHelper.getInstance();
    }

    @Override
    public void saveNote(Note note) {
        firebaseHelper.saveNote(note);
    }
}
