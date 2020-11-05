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
public class TebakBerNilai { 
    
    //Atribut
    int point;
    int bnyTebakan;
    int bonus;
    int hasil;
    int tebakan;
    
        //Method
        void input(){
            int angkaTebakan;

            angkaTebakan = (int) (Math.random() * 6);           

            Scanner input = new Scanner(System.in);
            
            System.out.print("Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!\n");
            point =100;
            bnyTebakan=0;
             while (tebakan != angkaTebakan) {
                if (point != 0){
                    point-=2;
                    bnyTebakan++;
                }
                else{
                break;
                }
                    System.out.print("Tebakan Anda: ");

                    tebakan = input.nextInt();
                      
                        
                    if (tebakan == angkaTebakan)

                        System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
                        
                    else if (tebakan < angkaTebakan)

                        System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");

                    else if (tebakan > angkaTebakan)

                        System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
                else
                      break;

            }
             
        }
        
        void output(){
            bonus=0;
            hasil=0;
            
            if (bnyTebakan <= 5)
                bonus += 50;
            hasil = (bonus+point);

            
            System.out.println("\nScore Anda :" + point);
            System.out.println("Bonus :" + bonus);
            System.out.print("Total Score :" + hasil + "\n");
            
            

      }
}
