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
public class person {
    String name;
    int age;
    
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName () {
        return name;
    }
    public int getAge() {
        return age;
    } 
    public void setAge() {
        this.age = age;
    }
}
