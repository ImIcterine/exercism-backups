class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        char[] arr = identifier.toCharArray();
        boolean kebabCase = false;

        for (char ch: arr) {
            if (ch == ' ') {
                builder.append('_');
                continue;
            }

            if (ch == '-') {
                kebabCase = true;
                continue;
            }

            if (Character.isDigit(ch)) {
                switch (ch) {
                    case '4':
                        builder.append('a');
                        continue;
                    case '3':
                        builder.append('e');
                        continue;
                    case '0':
                        builder.append('o');
                        continue;
                    case '1':
                        builder.append('l');
                        continue;
                    case '7':
                        builder.append('t');
                        continue;
                }
                continue;
            }

            if (!Character.isLetter(ch)) {
                continue;
            }

            builder.append(kebabCase ? Character.toUpperCase(ch) : ch);
            kebabCase = false;
        }

        return builder.toString();
    }
}
