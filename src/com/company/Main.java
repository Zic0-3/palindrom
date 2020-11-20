package com.company;

public class Main {

    static boolean CzyToPalindrom(String a) {
        int i = 0;
        int j = a.length() - 1;
        while (i < j) {
            if (a.charAt(i) != a.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "ala";

        if (CzyToPalindrom(a))
            System.out.print("tak");
        else
            System.out.print("nie");
    }
}