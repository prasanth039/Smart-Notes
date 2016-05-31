package com.prasanth.smartnotes.data;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseHelper {
    private static FirebaseHelper INSTANCE;
    private DatabaseReference notesNode;
    private static String NOTE_NODE = "notes";

    public static FirebaseHelper getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FirebaseHelper();
        }
        return INSTANCE;
    }

    public void init() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        firebaseDatabase.setPersistenceEnabled(true);
        notesNode = firebaseDatabase.getReference(NOTE_NODE);
        notesNode.keepSynced(true);
    }

    public void saveNote(Note note) {
    }
}
