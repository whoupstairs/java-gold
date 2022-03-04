package T5.Q2;

import java.io.File;
import java.io.FileFilter;

public class Sample2 {
    public static void main(String[] args) {

        File rootDir = new File(".");

        FileFilter filter = (path) -> {
            if (path.isDirectory()) {
                return true;
            }
            if (path.getName().endsWith(".java")) {
                return true;
            }
            return false;
        };

        showTree(rootDir, filter,"");
    }

    private static void showTree(File dir, FileFilter filter, String indent) {
        final var files = dir.listFiles(filter);
        for (File file : files) {
            System.out.println(indent + file.getName());
            if (file.isDirectory()) {
                showTree(file, filter,indent + " ");
            }
        }
    }
}
