public class OOPSBannerAppUC6 {

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < o.length; i++) {
            System.out.println(
                String.join(" ",
                    o[i],
                    o[i],
                    p[i],
                    s[i]
                )
            );
        }
    }

    // Helper method for letter O
    static String[] getOPattern() {
        return new String[]{
            "    ***    ",
            "  **   **  ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            "  **   **  ",
            "    ***    ",
            "           "
        };
    }

    // Helper method for letter P
    static String[] getPPattern() {
        return new String[]{
            " ******   ",
            " **   **  ",
            " **   **  ",
            " ******   ",
            " **       ",
            " **       ",
            " **       ",
            " **       ",
            " **       "
        };
    }

    // Helper method for letter S
    static String[] getSPattern() {
        return new String[]{
            "  *****   ",
            " **       ",
            " **       ",
            "  *****   ",
            "       ** ",
            "       ** ",
            "       ** ",
            "       ** ",
            "  *****   "
        };
    }
}