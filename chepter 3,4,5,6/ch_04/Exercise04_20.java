import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String charracter = scanner.next();
        System.out.println("length "+charracter.length()+" first character "+charracter.charAt(0));


    }
}