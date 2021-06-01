package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Lawrence";
        names[1] = "Tom";
        names[2] = "Sara";
        System.out.println(Arrays.toString(names));

        String[] names2 = new String[names.length+1];
        String name4="John";
        int in=0;
        for (String n:names) {
            names2[in]=n; in++;
        }
        names2[in] = name4;
        System.out.println(Arrays.toString(names2));
        names = names2;


        for (int i = 0; i < names.length; i++) {
            switch (i) {
                case 0:
                    System.out.println(names[0]+ " Доброе утро");
                    break;
                case 1:
                    System.out.println(names[1]+" Добрый день");
                    break;
                case 2:
                    System.out.println(names[2]+" Добрый вечер");
                    break;
                case 3:
                    System.out.println(names[3]+" Удачи");
                    break;

            }

        }


    }

}
