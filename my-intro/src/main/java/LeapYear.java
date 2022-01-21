import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("W pisz rok :");

        int year = scanner.nextInt();

        if (year % 4 == 0) {
            System.out.println("Ten rok nie jest rokiem przestępnym (ma 365 dni");
        } else if (year % 100 == 0){
            System.out.println("Czy rok przestępny ");
        } else if (year % 400 == 0){
            System.out.println("Nie jest rokiem przestępnym ");
        } else{
            System.out.println("Ten Rok jest rokiem przestępnym (ma 366 dni).");
        }
    }
}
