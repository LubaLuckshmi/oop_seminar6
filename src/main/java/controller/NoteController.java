package controller;

import model.Fields;
import model.Note;
import model.Repository;

import java.util.List;

public class NoteController {
    private final Repository repository;

    public NoteController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) {
        repository.createNote(note);
    }

    public Note deleteNote(int id) {
        return repository.deleteNote(id);
    }


    public Note readNote(int noteId) throws Exception{
        return repository.getNote(noteId);
    }

    public List<Note> getNotes() {
        return repository.getAllNotes();
    }


    public void updateNote(Note note, Fields field, Object param) {
        repository.updateNote(note, field, param);
    }
    public int getLastId() throws Exception {
        return repository.getLastId();
    }

}
