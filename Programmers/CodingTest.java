package Programmers;

import java.util.Scanner;

public class CodingTest {

    public void solution() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String val = "";

        for (char b : a.toCharArray()) {
            if (Character.isLowerCase(b)) {
                val += Character.toUpperCase(b);
            } else {
                val += Character.toLowerCase(b);
            }
        }
        System.out.println(val);
    }

    public void solution2() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = a + b;

        System.out.println(a + " + " + b + " = " + num);
    }

    public void solution3() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a + b);
    }

    public void solution4() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] ab = a.split("");
        for (String b : ab) {
            System.out.println(ab + " ");
        }
        System.out.println();
    }
}



