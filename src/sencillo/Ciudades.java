/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sencillo;

import java.util.Scanner;

/**
 *
 * @author ivan alcalde peña <your.name at your.org>
 */
public class Ciudades {

    public static void main(String[] args) {
        String[][]ciudadespaises=new String[4][4];
        Scanner entrada=new Scanner(System.in);
        for (int i = 0; i <ciudadespaises.length; i++) {
            for (int j = 0; j < 1; j++) {              
            System.out.println("introduce el nombre del pais "+(i+1));
            ciudadespaises[i][j]=entrada.nextLine(); 
            }
        }
        for (int i = 0; i < ciudadespaises.length; i++) {
            for (int j = 1; j <2;j++) {
                System.out.println("introduce el nombre de el pais "+j+"de la ciudad "+(i+1));
                ciudadespaises[i][j]=entrada.nextLine();
            }
        }
        
        for (int i = 0; i < ciudadespaises.length; i++) {
            for (int j=2; j<3;j++){
                System.out.println("introduce el nombre del pueblo"+j+"de la ciudad "+(i+1));
                ciudadespaises[i][j]=entrada.nextLine();
            }
          
            
        }
        
        for (int i = 0; i < ciudadespaises.length; i++) {
            for (int j = 3; j < ciudadespaises.length; j++) {
                System.out.println("intrduce el color"+(i+1));
                ciudadespaises[i][j]=entrada.nextLine();
            }
            
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                System.out.print(ciudadespaises[i][j] + " ");
            }
        }
    }
}
