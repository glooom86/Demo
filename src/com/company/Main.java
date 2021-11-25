package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScannerException {
        System.out.println("Введите выражение, разделяя члены пробелом:");
        Scanner in = new Scanner(System.in);
        String newData = in.nextLine();
        in.close();

        Format format = new Format(newData);
        String[] formatStrOutArr = format.getStrOutArr();   //массив с операндами и оператором
        int[] formatIntOutArr = format.getIntOutArr();  //массив с типами операторов и операндов

        Analysis analysis = new Analysis(formatStrOutArr, formatIntOutArr);
        int[] analyseOutArray = analysis.getCalcArray();

        Calc calc = new Calc(analyseOutArray);
        calc.main();


    }
}
