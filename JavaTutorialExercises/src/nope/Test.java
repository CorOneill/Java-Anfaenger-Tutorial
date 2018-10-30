package nope;

public class Test {
    public static void main(String[] args) {
        long difInMillis = 86400000;
            long difInDays =  difInMillis / 1000 / 60 / 60 / 24;
            System.out.println("DIFF: " + difInDays);
    }
}
