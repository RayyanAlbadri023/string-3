public int sumDigits(String str) {
    int sum = 0;
    for (int r = 0; r < str.length(); r++) {
        char c = str.charAt(r);
        if (Character.isDigit(c)) {
            sum = sum + (c - '0');  // Convert char digit to int and add
        }
    }
    return sum;
}
