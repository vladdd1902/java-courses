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
System.out.println("����� 1-�� � 2-�� ����� ����� " + (a+b));
break;

case "-":
System.out.println("������� 1-�� � 2-�� ����� ����� " + (a-b));
break;

case "/":
System.out.println("������� 1-�� �� 2-�� ����� ����� " + (a/b));
break;

case "^":
System.out.println("���������� 1-�� ����� � ������� 2-�� ����� " + Math.pow(a,b));
break;

case "!":
System.out.println("��������� 1-�� �� 2-�� ����� ����� " + (a*b));
break;

default:
System.out.println("����� �������� ����!");

}



}
}






