/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myonlineshopusinginterface;

/**
 *
 * @author Options
 */
public class MyOnlineShopUsingInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product[] array = new Product[4];
        array[0] = new Cartoon();
        array[1] = new book();
        array[2] = new ChildernBook();
        array[3] = new Cartoon();
        double sum = 0;
        array[0].setPrice(90);
        array[1].setPrice(50);
        array[2].setPrice(40);
        array[3].setPrice(70);
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getPrice();
        }
        System.out.println("Sum = " + sum);
    }
    
}
