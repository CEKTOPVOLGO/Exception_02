package TASK_04;
/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string = null;
        boolean flag = true;
        while(flag) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите непустую строку: ");
                string = scanner.nextLine();
                if(string.length() == 0){
                    throw new Exception();
                }
                flag = false;
            } catch (Exception e) {
                System.out.println("Пустые строки вводить нельзя!");
            }
        }

        System.out.println("Вы ввели: " + string);
    }
}
