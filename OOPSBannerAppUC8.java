import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    /**
     * Create and return character pattern map
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        patterns.put('P', new String[]{
                "****  ",
                "*   * ",
                "*   * ",
                "****  ",
                "*     ",
                "*     ",
                "*     "
        });

        patterns.put('S', new String[]{
                " **** ",
                "*     ",
                "*     ",
                " ***  ",
                "    * ",
                "    * ",
                "****  "
        });

        return patterns;
    }

    /**
     * Render banner for given message
     */
    public static void renderBanner(String message, Map<Character, String[]> patterns) {

        int height = patterns.get('O').length;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patterns.get(ch);

                line.append(pattern[row]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = buildCharacterPatterns();

        String message = "OOPS";

        renderBanner(message, patterns);
    }
}