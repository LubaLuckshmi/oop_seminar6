package model;

import java.util.List;

public interface Repository {
    List<Note> getAllNotes();
    void createNote(Note note);

    Note updateNote(Note note, Fields field, Object param);

    Note deleteNote(int id);

Note getNote(int id) throws Exception;

     int getLastId() throws Exception;


}
