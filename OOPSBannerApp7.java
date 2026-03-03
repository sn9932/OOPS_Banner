class OOPSBannerApp7 {

    static class CharacterPatternMap {
        char character;
        String[] patterns;

        CharacterPatternMap(char character, String[] patterns) {
            this.character = character;
            this.patterns = patterns;
        }

        char getCharacter() {
            return character;
        }

        String[] getPatterns() {
            return patterns;
        }
    }

    static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
            }),
            new CharacterPatternMap('P', new String[] {
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
            }),
            new CharacterPatternMap('S', new String[] {
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
            }),
            new CharacterPatternMap(' ', new String[] {
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
            })
        };
        return charMaps;
    }

    static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPatterns();
            }
        }
        return new String[] { "?", "?", "?", "?", "?" }; // fallback for unknown chars
    }

    static void printMessage(String message, CharacterPatternMap[] charMaps) {
        message = message.toUpperCase();
        int height = charMaps[0].getPatterns().length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < message.length(); j++) {
                String[] pattern = getCharacterPattern(message.charAt(j), charMaps);
                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}