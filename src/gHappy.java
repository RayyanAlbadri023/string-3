public boolean gHappy(String str) {
    int length = str.length();
    for (int r = 0; r < length; r++) {
        if (str.charAt(r) == 'g') {
            boolean leftG = (r > 0) && (str.charAt(r - 1) == 'g');
            boolean rightG = (r < length - 1) && (str.charAt(r + 1) == 'g');
            if (!leftG && !rightG) {
                return false;
            }
        }
    }
    return true;
}

