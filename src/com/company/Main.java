package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("menu:1=dikdörtgenin alanı ve çevresi");
        System.out.println("menu:2=karenin alanı ve çevresi");
        System.out.println("menu:3=dairenin alanı ve çevresi");
        Scanner klavye = new Scanner(System.in);
        System.out.println("yapacağınız işlemi seçiniz");
        byte menu= klavye.nextByte();
        switch (menu){
            case 1:
                System.out.println("dikdörtgenin uzun kenarını giriniz");
                int uzunk= klavye.nextInt();
                System.out.println("dikdörtgenin kısakenarını giriniz");
                int kısak= klavye.nextInt();
                int alan,çevre;
                alan=kısak*uzunk;
                çevre=2*(kısak+uzunk);
                System.out.println("dikdörtgenin alanı: "+alan);
                System.out.println("dikdörtgenin çevresi: "+çevre);
                break;
            case 2 :System.out.println("karenin bir kenarını giriniz");
            int kenark= klavye.nextInt();
            int çevrekare,alankare;
            çevrekare=2*(kenark+kenark);
            alankare=kenark*kenark;
            break;
            default:
                System.out.println("menude boyle bir seçenek yoktur");


        }

    }
}
