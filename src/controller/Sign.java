package controller;

public enum Sign {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DEVIDE("/");

    private String stringValue;
    Sign(String s) {
        stringValue = s;
    }

    public String getStringValue() {
        return stringValue;
    }
}
