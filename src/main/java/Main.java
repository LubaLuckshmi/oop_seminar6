import controller.NoteController;
import model.*;
import view.View;

public class Main {
    public static void main(String[] args) {

            FileOperation fileOperation = new FileOperationTxt("notes.txt");
            Repository repository = new RepositoryFile(new NotesMapper(), fileOperation);
            NoteController controller = new NoteController(repository);
            View view = new View(controller);
            view.run();

    }
}
