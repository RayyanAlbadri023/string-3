public int sumNumbers(String str) {
    int sum = 0;
    String number = "";
    for (int r = 0; r < str.length(); r++) {
        char c = str.charAt(r);
        if (Character.isDigit(c)) {
            number = number + c;
        } else {
            if (!number.equals("")) {
                sum = sum + Integer.parseInt(number);
                number = "";
            }
        }
    }
    if (!number.equals("")) {
        sum = sum + Integer.parseInt(number);
    }
    return sum;
}
