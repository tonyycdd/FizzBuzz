public class Multiples {
    public static void main(String[] args) {

        int num_M = 0;

        for (int i = 0; i < 1000; i++){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 && divisibleBy5) {
                num_M++;
            }
        }
        System.out.println(num_M);
    }
}