package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] studenten = new Student[3];
        for (int i = 0; i < studenten.length; i++) {
            Student s = new Student();
            System.out.printf("Geef naam student %d: ", i+1);
            String naam = scanner.nextLine();
            System.out.printf("Geef punten student %d: ", i+1);
            int punten = Integer.parseInt(scanner.nextLine());
            s.setNaam(naam);
            s.setPunten(punten);
            studenten[i] = s;
        }
        int som = 0;
        for(Student s: studenten){
            som+= s.getPunten();
        }
        double gemiddelde = (double)som/studenten.length;
        System.out.printf("het gemiddelde is %.2f%n", gemiddelde);
	// write your code here
    }
}
