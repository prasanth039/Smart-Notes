package com.prasanth.smartnotes.edit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.prasanth.smartnotes.R;
import com.prasanth.smartnotes.data.Note;

import butterknife.Bind;
import butterknife.ButterKnife;

public class EditNoteActivity extends AppCompatActivity implements EditMVP.View {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    EditMVP.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        setTitle(getString(R.string.notes_title));
        presenter = new EditPresenter(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.edit_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save_item:
                presenter.saveNote(new Note());
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onNoteSave() {
        finish();
    }
}
