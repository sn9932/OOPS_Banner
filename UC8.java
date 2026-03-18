import java.util.HashMap;
import java.util.Map;

class Input {

    // Method to create character patterns using HashMap
    public static Map<Character, String[]> createPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        // Pattern for 'O'
        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // Pattern for 'P'
        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        // Pattern for 'S'
        map.put('S', new String[]{
                " *** ",
                "*    ",
                " *** ",
                "    *",
                " *** "
        });

        return map;
    }

    // Method to display banner
    public static void printBanner(String text, Map<Character, String[]> map) {

        int height = 5; // each character has 5 rows

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = map.get(ch);
                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    // Main method
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        String word = "OOPS";

        printBanner(word, patternMap);
    }
}