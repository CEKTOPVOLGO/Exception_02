package TASK_01;
/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Number());

    }
    public static float Number(){
        Float number = (float) 0;
        boolean flag = true;
        while (flag){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите дробное число: ");
                number = scanner.nextFloat();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Введено не дробное число. ");
            }
        }

        return number;
    }
}
