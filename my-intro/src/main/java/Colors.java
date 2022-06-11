import java.util.Scanner;

public class Colors {
    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wpisz literę");
            String letter = scanner.nextLine().trim();
            if (letter.length()<= 2){
                return letter;
            }
            System.out.println("Dozwolona tylko jedna letera");
        }
    }
    public String guessColor() {
        String newLetter = getLetter();
        switch (newLetter) {
            case "G": return "Green";
            case "Y": return "Yellow";
            case "B": return "Blue";
            case "R": return "Red";
            default:
                System.out.println("Nie znany kolor");
        }
        return guessColor();
    }
    public static void main(String[] args) {
        Colors colors = new Colors();
        System.out.println(colors.guessColor());
    }
}