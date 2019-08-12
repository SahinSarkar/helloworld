import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileUtilsTesting {
    public static void main(String[] args) throws IOException {
        File file = new File("testDir");
        FileUtils.deleteDirectory(file);
    }
}
