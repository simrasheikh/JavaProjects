/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fighting.game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class FightingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Attack points of the monster:");
        int monsterattack = input.nextInt();
        System.out.println("Defense points of monster:");
        int monsterdefense = input.nextInt();
        System.out.println("Damage of the monster");
        int monsterdamage = input.nextInt();
        System.out.println("Life points of the monster:");
        int monsterlife = input.nextInt();
        
        System.out.println("Your Attack points:");
        int yourattack = input.nextInt();
        System.out.println("Your Defense points:");
        int yourdefense = input.nextInt();
        System.out.println("Your Damage points");
        int yourdamage = input.nextInt();
        System.out.println("Your Life points:");
        int yourlife = input.nextInt();
        
        Random generator = new Random();
        boolean attacker = generator.nextBoolean();
        if (attacker) {
            System.out.println("You attack");
            int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
            int attackvalue = yourattack + dice;
            System.out.println("Rolled values: " + dice);
            System.out.println("Your attack value: " + attackvalue);
            if (attackvalue > monsterdefense) {
                System.out.println("Your attack was successful yayyy");
                monsterlife = monsterlife - yourdamage;
                System.out.println("Monster's remaining life points are: " + monsterlife);
                
            } else {
                System.out.println("Your attack was unsuccessful oops sorry");
            }
        } else {
            System.out.println("Monster attacks");
            int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
            int attackvalue = monsterattack + dice;
            System.out.println("Rolled values: " + dice);
            System.out.println("Monsters attack value: " + attackvalue);
            if (attackvalue > yourdefense) {
                System.out.println("Monster attack was successful nooooo");
                yourlife = yourlife - monsterdamage;
                System.out.println("Your remaining life points are: " + yourlife);
                
            } else {
                System.out.println("Monsters attack was unsuccessful yayyyyyy");
                
        }
    }
    
}
}
