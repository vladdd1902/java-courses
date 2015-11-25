import java.lang.Math;

public class Solution{

public static void main(String[] arg) throws Exception
{

double a = Double.parseDouble(arg[0]);
String s = arg[1];
double b = Double.parseDouble(arg[2]);

switch(s)
{

case "+":
System.out.println("Сумма 1-го и 2-го чисел ровна " + (a+b));
break;

case "-":
System.out.println("Разница 1-го и 2-го чисел ровна " + (a-b));
break;

case "/":
System.out.println("Деление 1-го на 2-го число ровно " + (a/b));
break;

case "^":
System.out.println("Возведение 1-го числа в степень 2-го ровно " + Math.pow(a,b));
break;

case "!":
System.out.println("Умножение 1-го на 2-го число ровно " + (a*b));
break;

default:
System.out.println("Такой операции нету!");

}



}
}






