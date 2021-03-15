/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class managing_people {
    public static void main(String[] args) {
        
        person p1 = new person("arial", 37);
        person p2 = new person("joseph", 15);
        
        if(p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        }else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
    }
    }
}

