package CalculatorClasses;

import java.util.NavigableMap;
import java.util.Scanner;
import CalculatorClasses.Operation;

import static java.lang.System.*;

public class Calculator {

    private static int result;
    private static Operation operation= new Operation();

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String value1 = scan.next();
        operation.SetValue(scan.next());
        String value2 = scan.next();
        scan.close();

        if ((isDigit(value1)==false)&&(isDigit(value2)==false))
        {
            RomanNumeral x = new RomanNumeral(value1);
            RomanNumeral y = new RomanNumeral(value2);

    if((x.toInt() > 0 && x.toInt()<=10)&&(y.toInt()>0&& y.toInt()<=10)){
            switch (operation.GetValue()) {
                case "+":
                    result = operation.sum(x.toInt(), y.toInt());
                    break;
                case "-":
                    result = operation.difference(x.toInt(), y.toInt());
                    break;
                case "*":
                    result = operation.multiplication(x.toInt(), y.toInt());
                    break;
                case "/":
                    result = operation.division(x.toInt(), y.toInt());
                    break;
            }
            RomanNumeral xz = new RomanNumeral(result);
            out.println (xz.toString());
        }
    else { out.println("Значения не попадают в диапазон");}
        }

        else if ((isDigit(value1)==true)&&(isDigit(value2)==true)){

           int x= Integer.parseInt(value1);
            int y= Integer.parseInt(value2);
            if((x> 0 && x<=10)&&(y>0&& y<=10)){
            switch (operation.GetValue()) {
                case "+":
                    result = operation.sum( x,y);
                    break;
                case "-":
                    result = operation.difference(x,y);
                    break;
                case "*":
                    result = operation.multiplication(x,y);
                    break;
                case "/":
                    result = operation.division(x,y);
                    break;
            }
            out.println ( result);

        }
        else { out.println("Значения не попадают в диапазон");}
        }
        else {
            out.println("Вы ввели некорректные значения");
        }




    }

        public static boolean isDigit(String s) throws NumberFormatException {
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }






