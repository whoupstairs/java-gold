package T5.Q2;

import java.io.File;

public class Sample {
    public static void main(String[] args) {

        File rootDir = new File(".");
        showTree(rootDir, "");
    }

    private static void showTree(File dir, String indent) {
        final var files = dir.listFiles();
        for (File file : files) {
            System.out.println(indent + file.getName());
            if (file.isDirectory()) {
                showTree(file, indent + " ");
            }
        }
    }
}
