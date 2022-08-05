package T09.Q5;

import java.io.IOException;

public class Sample {

    public static void main(String[] args) {
        try (SampleResource2 resource = new SampleResource2()) {
            resource.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (SampleResource resource = new SampleResource()) {
            resource.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
