package com.company;


public class Analysis {
    private String[] inStrArray; //отформатированные данные от пользователя
    private int[] inIntArray; //массив с кодами данных(1 = арабское число, 2 = римское число, 3 = оператор)

    public Analysis(String[] inStrArray, int[] inIntArray) {
        this.inStrArray = inStrArray;
        this.inIntArray = inIntArray;
    }
    public int[] getCalcArray(){
        int[] calcArray = new int[4]; //массив с числами для калькулятора ([операнд 1, код оператора, операнд 2, флаг системы(араб=0, рим=1)])
        for (int i=0; i<inStrArray.length; i++){
            if(inIntArray[i]==1){
                calcArray[i]=Integer.parseInt(inStrArray[i]);
            }else if(inIntArray[i]==3){
                switch (inStrArray[i]) {
                    case "+" -> calcArray[i] = 1;
                    case "-" -> calcArray[i] = 2;
                    case "*" -> calcArray[i] = 3;
                    case "/" -> calcArray[i] = 4;
                }
            }else if(inIntArray[i]==2){
                calcArray[3]=1;
                switch (inStrArray[i]){
                    case "I" -> calcArray[i] = 1;
                    case "II" -> calcArray[i] = 2;
                    case "III" -> calcArray[i] = 3;
                    case "IV" -> calcArray[i] = 4;
                    case "V" -> calcArray[i] = 5;
                    case "VI" -> calcArray[i] = 6;
                    case "VII" -> calcArray[i] = 7;
                    case "VIII" -> calcArray[i] = 8;
                    case "IX" -> calcArray[i] = 9;
                    case "X" -> calcArray[i] = 10;
                }
            }
        }
        return calcArray;
    }

}
