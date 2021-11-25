package com.company;


public class Format {
    private final String data;

    public Format(String data) {
        this.data = data;
    }
    int[] types = new int[10];
    public String[] getStrOutArr() throws ScannerException {
        String trimmed = data.trim();
        String upped = trimmed.toUpperCase();
        String[] outArr = upped.split(" ");
        int counter = 0;
        for (String str : outArr){
            switch (str) {
                case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" -> types[counter] = 1;
                case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" -> types[counter] = 2;
                case "+", "-", "*", "/" -> types[counter] = 3;
                default -> throw new ScannerException("операнд " + (counter + 1) + " является недопустимым]\n");
            }
            counter++;
        }
        if (types[0]!=types[2]){
            throw new ScannerException("используются одновременно две разные системы счисления");
        }
        if (types[1]!=3){
            throw new ScannerException("недопустимая операция");
        }
        return outArr;
    }
    public int[] getIntOutArr(){
        return types;
    }
}

