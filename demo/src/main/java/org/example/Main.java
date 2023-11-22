package org.example;

import org.example.array.ArrayMatrix;
import org.example.function.Functional;
import org.example.operateur.Operator;
import org.example.poo.Product;
import org.example.readFromConsole.ReadFromConsole;
import org.example.string.ChaineCharactere;
import org.example.structure.Structure;
import org.example.variable.Variables;

public class Main {
    public static void main(String[] args) {

       // Variables.getVariable();
       // Operator.getExpression();
       // Operator.getOperatorComparaison();
        //Structure.getSwitch();
        //ReadFromConsole.getReadWrite();
        //ChaineCharactere.getMethodeString();
        //ChaineCharactere.getCompareString();
        //ChaineCharactere.formatString();
        //ArrayMatrix.getMatrix();
        //ArrayMatrix.getMatrix2();
        //Functional.getFunction();
        Product p = new Product();
        p.setId(10);
        p.setName("Iphone");
        System.out.println(p);
        Product p2 = new Product(11, "Samsung");
        System.out.println(p2.getId() +"\t"+ p2.getName());
        p2.setId(15);
        System.out.println(p2);
        p2.quiJeSuis();
        Product.getBonjour();

        }
    }
