package T09.Q9;

public class TroubleMaker {
    public static void main(String[] args) {
        try (final var  a = new TroubleResource();) {
             throw new Exception();
        } catch (RuntimeException e) {
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        }
    }
}
