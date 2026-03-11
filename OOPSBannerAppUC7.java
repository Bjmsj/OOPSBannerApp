public class OOPSBannerAppUC7 {

    /**
     * Inner static class to store character and its banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character letter
         * @param pattern ASCII pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to create character patterns
     */
    static CharacterPatternMap[] createPatterns() {

        CharacterPatternMap o = new CharacterPatternMap('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        CharacterPatternMap p = new CharacterPatternMap('P', new String[]{
                "****  ",
                "*   * ",
                "*   * ",
                "****  ",
                "*     ",
                "*     ",
                "*     "
        });

        CharacterPatternMap s = new CharacterPatternMap('S', new String[]{
                " **** ",
                "*     ",
                "*     ",
                " ***  ",
                "    * ",
                "    * ",
                "****  "
        });

        return new CharacterPatternMap[]{o, p, s};
    }

    public static void main(String[] args) {

        CharacterPatternMap[] patterns = createPatterns();

        CharacterPatternMap o = patterns[0];
        CharacterPatternMap p = patterns[1];
        CharacterPatternMap s = patterns[2];

        String[] oPattern = o.getPattern();
        String[] pPattern = p.getPattern();
        String[] sPattern = s.getPattern();

        for (int i = 0; i < oPattern.length; i++) {

            StringBuilder line = new StringBuilder();

            line.append(oPattern[i]).append(" ")
                .append(oPattern[i]).append(" ")
                .append(pPattern[i]).append(" ")
                .append(sPattern[i]);

            System.out.println(line);
        }
    }
}