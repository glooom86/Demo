package com.company;

public class Calc {
    private int[] inIntArray;
    public Calc(int[] inIntArray) {
        this.inIntArray = inIntArray;
    }
    public void main() throws ScannerException {
        int preResult = 0;
        switch (inIntArray[1]) {
            case 1:
                preResult = inIntArray[0] + inIntArray[2];
                break;
            case 2:
                preResult = inIntArray[0] - inIntArray[2];
                break;
            case 3:
                preResult = (int) (inIntArray[0] * inIntArray[2]);
                break;
            case 4:
                preResult = (int) (inIntArray[0] / inIntArray[2]);
        }
        String romeResult="";

        if (inIntArray[3] == 1) { //если числа в римской системе
            if (preResult < 1) { //если результат операции меньше 1
                throw new ScannerException("Римские числа не могут быть менее I");
            }
            if (preResult >= 1 && preResult <= 10) { //если результат от 1 до 10
                ToRome toRome = new ToRome(preResult);
                romeResult=toRome.getRome();
            }
            if (preResult>10){
                int dec = preResult/10*10;
                int num = preResult%10;
                ToRome toRomeDec = new ToRome(dec);
                ToRome toRomeNum = new ToRome(num);
                String strRomeDec = toRomeDec.getRome();
                String strRomeNum = toRomeNum.getRome();
                romeResult= strRomeDec+strRomeNum;
            }
            System.out.println(romeResult);
        }
        else {
            System.out.println(preResult);
        }
    }
}
