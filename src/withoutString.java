public String withoutString(String base, String remove) {
    String lowerBase = base.toLowerCase();
    String lowerRemove = remove.toLowerCase();
    String result = "";
    int r = 0;
    while (r < base.length()) {
        if (r <= base.length() - remove.length() &&
                lowerBase.substring(r, r + remove.length()).equals(lowerRemove)) {
            r += remove.length();
        } else {
            result += base.charAt(r);
            r++;
        }
    }
    return result;
}
