public class Demo {
    public static void main(String[] args) {
        EvenOddNumber checker = new EvenOddNumber();
        
        int[] testNumbers = {56,53,67,23,98,346,79};
        
        System.out.println("Even/Odd Number Checker:");
        System.out.println("");
        
        for (int num : testNumbers) {
            boolean isEven = checker.findEvenOrOdd(num);
            if (isEven) {
                System.out.println(num + " is an EVEN number");
            } else {
                System.out.println(num + " is an ODD number");
            }
        }
    }
}
