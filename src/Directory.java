import java.util.ArrayList;
import java.util.List;

/**
 * Created by apurvatripathi on 2/5/19.
 */
public class Directory {
    public String directoryName;
    public Directory parent;
    public List<Directory> subdirectories;

    public Directory(String name ){
        this.directoryName = name;
        this.subdirectories = new ArrayList<>();
    }

    public void addDirectory(Directory child){
        subdirectories.add(child);
    }
}
