public class Question5 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int exp1 = calc.add(
                        calc.multiply(3, 4),
                        calc.multiply(5, 7)
                    );
        exp1 = calc.square(exp1);

        int part1 = calc.square(calc.add(4, 7));
        int part2 = calc.square(calc.add(8, 3));
        int exp2 = calc.add(part1, part2);

        System.out.println("Result of expression 1: " + exp1);
        System.out.println("Result of expression 2: " + exp2);
    }
}
