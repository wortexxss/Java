
import static java.time.InstantSource.system;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author NITRO
 */
public class TersUcken {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kac satir olsun \t");
        int number = sc.nextInt();

        for (int i = number; i >= 1; i--) { 
            for (int j = 0; j < number - i; j++) { 
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) { 
                System.out.print("*");
            }
            System.out.println(); 
        }
        sc.close();

    }
}
