/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml_task;

/**
 *
 * @author Options
 */
public class UML_Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c =new Circle(5,"Red");
        System.out.println(c);
        System.out.println(c.getArea());
        c.SetRadious(10);
        System.out.println(c.GetRadious());
        c.SetColor("Blue");
        System.out.println(c.GetColor());
        System.out.println(c);
        System.out.println(c.getArea());
        System.out.println("......................................");
        Cylinder cy =new Cylinder(6,5,"Green");
        System.out.println(cy);
        System.out.println("Cylinder Area = "+cy.getArea());
        cy.SetColor("Yellow");
        cy.SetRadious(5);
        cy.setHeight(4);
        System.out.println(cy);
        System.out.println("Cylinder Volume = "+cy.getVolume());
        System.out.println("Cylinder Area = "+cy.getArea());
    }
    
}
