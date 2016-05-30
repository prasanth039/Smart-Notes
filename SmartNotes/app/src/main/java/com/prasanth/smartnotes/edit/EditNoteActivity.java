package com.prasanth.smartnotes.edit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.prasanth.smartnotes.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class EditNoteActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        setTitle(getString(R.string.notes_title));
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.edit_content,
                EditNoteFragment.newInstance(), EditNoteFragment.TAG).commit();
        }
    }
}
