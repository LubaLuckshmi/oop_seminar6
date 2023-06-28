package model;

public class NotesMapper implements Mapper{
    public String map(Note note) {
        return String.format("%s,%s,%s", note.getId(), note.getHead(), note.getText());
    }

    public Note map(String line) {
        String[] lines = line.split(",");
        return new Note(Integer.parseInt(lines[0]), lines[1], lines[2]);
    }
}

