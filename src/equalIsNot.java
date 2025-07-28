public boolean equalIsNot(String str) {
    int countIs = 0;
    int countNot = 0;
    for (int r = 0; r <= str.length() - 2; r++) {
        if (str.substring(r, r + 2).equals("is")) {
            countIs++;
        }
    }
    for (int r = 0; r <= str.length() - 3; r++) {
        if (str.substring(r, r + 3).equals("not")) {
            countNot++;
        }
    }
    return countIs == countNot;
}
