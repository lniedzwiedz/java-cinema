package printer;

public enum ConsoleColor {

    GREEN("\033[0;32m"),
    YELLOW("\033[33m"),
    RED("\033[31m"),
    RESET("\u001B[0m");

    private final String code;

    ConsoleColor(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }
}
