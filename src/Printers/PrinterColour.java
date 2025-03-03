package Printers;

public enum PrinterColour {
    GREEN,
    YELLOW,
    RED,
    RESET;

    public static String getPrinterColour(PrinterColour printerColour){
        return switch (printerColour){
            case GREEN -> "\033[0;32m";
            case YELLOW -> "\033[33m";
            case RED -> "\033[31m";
            case RESET -> "\u001B[0m";
        };
    }



}
