public class Add {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("The sum of the arguments passed is " + sum);
    }
}
// compile by javac Add.java
// run by java Add 1 4 7 4 5 78
