package methods;

import java.util.Scanner;

public class Palindrom {

    static boolean isPalindrom(int number) {
        int temp = number;
        int reverseNumber = 0;
        boolean isPalindrom = false;
        while (temp != 0) {
            int lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) isPalindrom = true;

        return isPalindrom;
    }

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("if this number is a palindrome: ");
        number = scanner.nextInt();

        System.out.println(isPalindrom(number));
    }
}
