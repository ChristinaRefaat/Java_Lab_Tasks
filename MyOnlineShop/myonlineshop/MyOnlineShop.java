/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myonlineshop;

/**
 *
 * @author Options
 */
public class MyOnlineShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product[] array = new Product[4];
        array[0] = new book();
        array[1] = new book();
        array[2] = new ChildrenBook();
        array[3] = new ChildrenBook();
        double sum = 0;
        array[0].setPrice(30);
        array[1].setPrice(60);
        array[2].setPrice(100);
        array[3].setPrice(50);
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getPrice();
        }
        System.out.println("Sum = " + sum);

    }
}
