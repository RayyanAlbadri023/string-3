public int countTriple(String str) {
    int count = 0;
    for (int r = 0; r <= str.length() - 3; r++) {
        if (str.charAt(r) == str.charAt(r + 1) && str.charAt(r) == str.charAt(r + 2)) {
            count = count + 1;
        }
    }
    return count;
}
