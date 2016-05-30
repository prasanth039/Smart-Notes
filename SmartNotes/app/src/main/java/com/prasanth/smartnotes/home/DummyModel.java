package com.prasanth.smartnotes.home;

import com.prasanth.smartnotes.datamodel.Note;

import java.util.ArrayList;
import java.util.List;


public class DummyModel implements HomeMVP.Model {
    @Override
    public List<Note> getNotes() {
        List<Note> noteList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Note note = new Note();
            note.setNoteDetail("This is a test");
            noteList.add(note);
        }
        return noteList;
    }

}
