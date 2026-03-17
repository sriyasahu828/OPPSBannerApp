feature/UC8-BannerPrintStatements
import java.util.HashMap;

public class OPPSBannerApp {

    // Creates a HashMap containing ASCII art patterns
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for O
        charMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // Pattern for P
        charMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        // Pattern for S
        charMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return charMap;
    }

    // Displays banner message
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        // Loop through each row
        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            // Loop through each character
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                sb.append(pattern[line]).append("  ");
            }

            System.out.println(sb.toString());
        }
    }

    // Main Method
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}
=======

public class OOPSBannerApp {

    public static String[] getOPattern() {
        return new String[]{
                "   ***   ",
                "  ** **  ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                "  ** **  ",
                "   ***   "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      ",
                " **      "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " **   ** ",
                " **      ",
                "  *****  ",
                "      ** ",
                " **   ** ",
                "  *****  "
        };
    }

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }
}
=======
public class OPPSBannerApp {



    public static void main(String[] args) {

        String[] lines = new String[10];

        lines[0] = String.join("   ", "   **   ", "   **   ", " ********** ", "   ********* ");
        lines[1] = String.join("   ", " **  ** ", " **  ** ", " **      ** ", " **         ");
        lines[2] = String.join("   ", "*      *", "*      *", " **      ** ", "*           ");
        lines[3] = String.join("   ", "*      *", "*      *", " **      ** ", "*           ");
        lines[4] = String.join("   ", "*      *", "*      *", " ********** ", " ********   ");
        lines[5] = String.join("   ", "*      *", "*      *", " ********** ", "         ** ");
        lines[6] = String.join("   ", "*      *", "*      *", " **         ", "           *");
        lines[7] = String.join("   ", "*      *", "*      *", " **         ", "           *");
        lines[8] = String.join("   ", " **  ** ", " **  ** ", " **         ", "         ** ");
        lines[9] = String.join("   ", "   **   ", "   **   ", " **         ", "*********   ");

        for (String line : lines) {
            System.out.println(line);
        }
 main
