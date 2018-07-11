import java.util.Scanner;

public class AppearanceTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string;
        System.out.println("Please enter a string");
        string = input.nextLine();

        System.out.println("Enter a character that you want to count:");
        char ch = input.next().charAt(0);

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("The frequency of character " + ch + " in " + "\"" + string +"\"" + " is: " + count);


    }






}
