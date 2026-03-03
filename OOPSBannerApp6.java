class OOPSBannerApp6 {

    static String[] getOPattern() {
        return new String[]{
            "  *****  ",
            " *     * ",
            "*       *",
            "*       *",
            "*       *",
            " *     * ",
            "  *****  "
        };
    }

    static String[] getPPattern() {
        return new String[]{
            " *****   ",
            "*     *  ",
            "*     *  ",
            " *****   ",
            "*        ",
            "*        ",
            "*        "
        };
    }

    static String[] getSPattern() {
        return new String[]{
            "  *****  ",
            " *     * ",
            "*        ",
            "  *****  ",
            "       * ",
            " *     * ",
            "  *****  "
        };
    }


    static void main(String[] args) {

        // Get patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop to assemble and print each line of "OOPS"
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + "  " +
                oPattern[i] + "  " +
                pPattern[i] + "  " +
                sPattern[i]
            );
        }
    }
}