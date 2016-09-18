/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorpractice;

/**
 *
 * @author apple1
 */
public class ConstructorPractice {

    String name = "name1";
    int test = 1;
    {System.out.println("This is an instance initializer which is outside the method");}
    public ConstructorPractice(){
        name = "name2";
        System.out.println("setting constructor");
    }
    {System.out.println("this is another instrance initializer to see whether it's run before or behind constructor ");}
    public static void main(String[] args) {
     ConstructorPractice con = new ConstructorPractice();
     
     
    }
    
}
