
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
    }
}







