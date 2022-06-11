import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        //[1]

        while (true) {
            //[2]
            System.out.println("Wpisz swoeje imię:");
            //[3]
            String name = scanner.nextLine().trim();
            //[4]
            if (name.length() >= 2) {
                //[5]
                return name;
                //[6]
            }
            System.out.println("Imię jest za krótkie. Spróbuj ponownie.");
        }
    }
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");

            String calc = scanner.nextLine().trim().toUpperCase(); //[1]
            switch (calc) {

                case "A": return "ADD";
                case "S": return "SUB";
                case "D": return "DIV";
                case "M": return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }
    public static int getValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }
}
