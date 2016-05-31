package com.prasanth.smartnotes.data;

import android.graphics.Color;

import java.util.Calendar;
import java.util.Date;

/**
 * Model class to represents the note.
 */
public class Note {

    private String noteDetail;
    private Date dateCreated;
    private Date dateModified;
    private int color;

    public Note() {
        dateCreated = Calendar.getInstance().getTime();
        dateModified = Calendar.getInstance().getTime();
        color = Color.WHITE;
    }

    public String getNoteDetail() {
        return noteDetail;
    }

    public void setNoteDetail(String noteDetail) {
        this.noteDetail = noteDetail;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
