import java.util.Scanner;

public class ObscureJargon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Which obscure term would you like to read about? " +
                    "\n  (1) LTC \n  (2) Warp-Skipping \n  (3) Capture-Baiting " +
                    "\n  (4) The Enemy Control Glitch \n  (5) Jealousy \n  (6) Quit");
            switch (in.nextInt()) {
                case 1:
                    new LTC();
                    break;
                case 2:
                    new warpSkip();
                    break;
                case 3:
                    new captureBait();
                    break;
                case 4:
                    new EnemyControlGlitch();
                    break;
                case 5:
                    new Jealousy();
                    break;
                case 6:
                    System.exit(1);
                default:
                    System.out.println("Sorry pal, that ain't an option.");
            }
        }

    }
}
