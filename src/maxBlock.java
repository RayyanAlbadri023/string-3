public int maxBlock(String str) {
    if (str.length() == 0) {
        return 0;
    }
    int max = 1;
    int count = 1;
    for (int r = 1; r < str.length(); r++) {
        if (str.charAt(r) == str.charAt(r - 1)) {
            count = count + 1;
            if (count > max) {
                max = count;
            }
        } else {
            count = 1;
        }
    }
    return max;
}
