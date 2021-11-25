package com.company;

public class ToRome {
    private int arab;
    public ToRome(int arab){
        this.arab = arab;
    }
    public String getRome(){
        String romeSymbol = "";
        switch (arab) {
            case 1 -> romeSymbol = "I";
            case 2 -> romeSymbol = "II";
            case 3 -> romeSymbol = "III";
            case 4 -> romeSymbol = "IV";
            case 5 -> romeSymbol = "V";
            case 6 -> romeSymbol = "VI";
            case 7 -> romeSymbol = "VII";
            case 8 -> romeSymbol = "VIII";
            case 9 -> romeSymbol = "IX";
            case 10 -> romeSymbol = "X";
            case 20 -> romeSymbol = "XX";
            case 30 -> romeSymbol = "XXX";
            case 40 -> romeSymbol = "XL";
            case 50 -> romeSymbol = "L";
            case 60 -> romeSymbol = "LX";
            case 70 -> romeSymbol = "LXX";
            case 80 -> romeSymbol = "LXXX";
            case 90 -> romeSymbol = "XC";
            case 100 -> romeSymbol = "C";
        }
        return romeSymbol;
    }
}
