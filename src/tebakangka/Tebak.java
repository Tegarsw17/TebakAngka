/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;
import java.util.Scanner;
/**
 *
 * @author TEGAR SATRIYA WIGUNA
 */
public class Tebak {
           
    //Atribut
    int angkaTebakan;        
    int tebakan;
    
    //Method
    void input() {

            angkaTebakan = (int) (Math.random() * 101);           

            Scanner input = new Scanner(System.in);
            
            System.out.print("Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!\n");

            do {

                  System.out.print("Tebakan Anda: ");

                  tebakan = input.nextInt();

                  if (tebakan == angkaTebakan)

                        System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");

                  else if (tebakan < angkaTebakan)

                        System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");

                  else if (tebakan > angkaTebakan)

                        System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");

            } while (tebakan != angkaTebakan);

      }
}
