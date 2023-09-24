import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the currenty rate");
        double currenty = scanner.nextDouble();
        System.out.println("Enter amount of money");
        int hryvna = scanner.nextInt();
        int amount = (int)(hryvna / currenty);
        double change = hryvna - amount*currenty;
        System.out.println("You can byu" + amount);
        System.out.println("Change is" + change);
    }
}