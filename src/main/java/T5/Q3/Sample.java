package T5.Q3;

import java.io.FileReader;

public class Sample {
    public static void main(String[] args) throws Exception {
        FileReader reader = null;
        try {
           reader = new FileReader("src/resources/sample.txt");
           int i = 0;

           while ((i = reader.read()) != -1 ) {
               char c = (char) i;
               System.out.print(c);
           }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
