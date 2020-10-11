package lw9.ex5;

public class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
}