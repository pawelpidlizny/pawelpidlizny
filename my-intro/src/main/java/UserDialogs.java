import java.util.Scanner;

public class UserDialogs {
    public static String getUsername(){
        Scanner scanner = new Scanner(System.in);
        //[1]

        while (true){
            //[2]
            System.out.println("Wpisz swoeje imię:");
            //[3]
            String name = scanner.nextLine().trim();
            //[4]
            if (name.length()>=2){
                //[5]
                return name;
                //[6]
            }
            System.out.println("Imię jest za krótkie. Spróbuj ponownie.");
        }
    }
}
