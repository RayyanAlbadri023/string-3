public String sameEnds(String str) {
    String answer = "";
    int len = str.length();

    for (int r = 1; r <= len / 2; r++) {
        String start = str.substring(0, r);
        String end = str.substring(len - r);
        if (start.equals(end)) {
            answer = start;
        }
    }

    return answer;
}
