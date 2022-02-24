package com.company;
import java.util.Objects;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    System.out.println("Загадайте число от 1 до 2,147,483,647");
    int B = 1;
    int E = 2_147_483_647;
    int x = B + (E - B)/2;
    Scanner sc= new Scanner(System.in);
    System.out.println("Ваше число " + x +"?");
    System.out.println("1. Больше  2. Меньше  3. Ты угадал!");
    String comand = sc.nextLine();
    while (!Objects.equals(comand, "3")){
        if (!Objects.equals(comand, "2")){
            if (!Objects.equals(comand, "1")){
                System.out.println("Error! Неверная команда!");
                System.out.println("Ваше число " + x +"?");
                System.out.println("1. Больше  2. Меньше  3. Ты угадал!");
                comand = sc.nextLine();
            }
        }
        if (Objects.equals(comand, "1")){
            B = x;
            x = B + (E - B)/2;
            System.out.println("Ваше число " + x +"?");
            System.out.println("1. Больше  2. Меньше  3. Ты угадал!");
            comand = sc.nextLine();
            if (x == 2147483646){
                if(Objects.equals(comand, "1")){
                    System.out.println("Ваше число " + (x+1) +"?");
                    System.out.println("1. Больше  2. Меньше  3. Ты угадал!");
                    comand = sc.nextLine();
                }
            }
        } else if (Objects.equals(comand, "2")){
            E = x;
            x = B + (E - B)/2;
            System.out.println("Ваше число " + x +"?");
            System.out.println("1. Больше  2. Меньше  3. Ты угадал!");
            comand = sc.nextLine();
        }
    }
    System.out.println("Ура! Я снова угадал!))");
    }
}
