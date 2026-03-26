public static void main(String[] args) {
        Map<Character, String[]> patternMap = new HashMap<>();

        String[] patternO = {
            " *** ",
            "* *",
            "* *",
            "* *",
            " *** "
        };

        String[] patternP = {
            "**** ",
            "* *",
            "**** ",
            "* ",
            "* "
        };

        String[] patternS = {
            " ****",
            "* ",
            " *** ",
            "    *",
            "**** "
        };

        patternMap.put('O', patternO);
        patternMap.put('P', patternP);
        patternMap.put('S', patternS);

        String word = "OOPS";
        int patternHeight = 5;

        for (int i = 0; i < patternHeight; i++) {
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    System.out.print(pattern[i] + "   ");
                }
            }
            System.out.println();
        }
    }
}
