public String notReplace(String str) {
    StringBuilder result = new StringBuilder();
    int r = 0;

    while (r < str.length()) {
        if (r + 1 < str.length() && str.substring(r, r + 2).equals("is")) {
            boolean beforeOK = (r == 0) || !Character.isLetter(str.charAt(r - 1));
            boolean afterOK = (r + 2 == str.length()) || !Character.isLetter(str.charAt(r + 2));

            if (beforeOK && afterOK) {
                result.append("is not");
                r += 2;
                continue;
            }
        }

        result.append(str.charAt(r));
        r++;
    }

    return result.toString();
}
