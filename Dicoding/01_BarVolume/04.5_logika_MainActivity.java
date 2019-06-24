Double toDouble(String str) {
    try {
        return Double.valueOf(str);
    } catch (NumberFormatException e) {
        return null;
    }
}
