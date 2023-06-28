package model;

import java.util.List;

public interface FileOperation {

    List<String> readText();
    void saveText(List<String> lines);

}
