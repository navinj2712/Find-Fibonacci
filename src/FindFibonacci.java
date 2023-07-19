import java.util.Scanner;

public class FindFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int output = findFibonacci(number);
        System.out.println("Output : " + output);
    }

    private static int findFibonacci(int number) {
        if (number == 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }
        return findFibonacci(number - 1) + findFibonacci(number - 2);
    }

}
