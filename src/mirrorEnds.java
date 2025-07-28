public String mirrorEnds(String str) {
    String answer = "";
    int len = str.length();
    for (int r = 0; r < len; r++) {
        if (str.charAt(r) == str.charAt(len - r - 1)) {
            answer += str.charAt(r);
        } else {
            break;
        }
    }
    return answer;
}
