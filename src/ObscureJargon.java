import java.util.Scanner;

public class ObscureJargon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which obscure term would you like to read about?");
        switch (in.nextLine()) {
            case "LTC":
                new LTC();
                break;
            default:
                System.out.println("That ain't a- y'know what, forget this.");
        }
    }
}