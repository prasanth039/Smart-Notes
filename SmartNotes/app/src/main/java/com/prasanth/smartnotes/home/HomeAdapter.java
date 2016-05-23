package com.prasanth.smartnotes.home;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.prasanth.smartnotes.R;
import com.prasanth.smartnotes.datamodel.Note;

import java.util.ArrayList;
import java.util.List;

/**
 * Adapter class for home fragment. This adapter helps to load the grid.
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.NoteHolder> {

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    private List<Note> notes = new ArrayList<>();

    @Override
    public NoteHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_recycler_item, parent, false);
        return new NoteHolder(v);
    }

    @Override
    public void onBindViewHolder(NoteHolder holder, int position) {
        holder.noteView.setText(notes.get(position).getNoteDetail());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public class NoteHolder extends RecyclerView.ViewHolder {
        TextView noteView;

        public NoteHolder(View itemView) {
            super(itemView);
            noteView = (TextView) itemView.findViewById(R.id.note_text);
        }
    }
}
