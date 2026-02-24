class OOPSBannerApp5 {

    static void main(String[] args) {

        // Define and populate the banner lines at declaration
        String[] lines = {
            String.join(" ", "  *****  ", "  *****  ", "  *****  ", "  *****  "),
            String.join(" ", " *     * ", " *     * ", " *     * ", " *       "),
            String.join(" ", "*       *", "*     *  ", "*     *  ", " *       "),
            String.join(" ", "*       *", " *     * ", "  *****  ", "  *****  "),
            String.join(" ", "*       *", " *     * ", " *       ", "      *  "),
            String.join(" ", " *     * ", " *     * ", " *       ", " *     * "),
            String.join(" ", "  *****  ", "  *****  ", " *       ", "  *****  ")
        };

        // Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}