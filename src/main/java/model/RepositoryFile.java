package model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository{
    private Mapper mapper;
    private FileOperation fileOperation;

    public RepositoryFile(Mapper mapper, FileOperation fileOperation) {
        this.mapper = mapper;
        this.fileOperation = fileOperation;
    }
    @Override
    public Note getNote(int id) throws Exception {
        List<Note> listNotes = getAllNotes();
        for (Note currentNote : listNotes) {
            if (currentNote.getId() == id) {
                return currentNote;
            }
        }
        throw new Exception("запись не найдена");
    }

    @Override
    public List<Note> getAllNotes(){
        List<Note> notes = new ArrayList<>();
        List<String> lines = fileOperation.readText();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }

    @Override
    public void createNote(Note note) {
        List<Note> notes = getAllNotes();
        notes.add(note);
        fileOperation.saveText(getLines(notes));

    }
    @Override
    public int getLastId() throws Exception {
        List<Note> listNotes = getAllNotes();
        if (listNotes.size() == 0) {
            return 0;
        }
        int id = 0;
        for (Note note: listNotes) {
            int currentId = note.getId();
            if (currentId > id) {
                id = currentId;
            }
        }
        return id;
    }

    private List<String> getLines(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note note : notes) {
            lines.add(mapper.map((Note) note));
        }
        return lines;
    }
    @Override
    public Note updateNote(Note note, Fields field, Object param) {
        List<Note> list = getAllNotes();
        if (field == Fields.HEAD){
            note.setHead((String) param);
        } else if (field == Fields.TEXT) {
            note.setText((String) param);
        }

        fileOperation.saveText(getLines(list));
        return note;
    }

    @Override
    public Note deleteNote(int id) {
        List<Note> list = getAllNotes();
        int indexForRemove = list.indexOf(id);
        Note removedNote = list.remove(indexForRemove);
        fileOperation.saveText(getLines(list));
        return removedNote;
    }


}
