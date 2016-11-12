/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework;

/**
 *
 * @author azure
 */
public class Type1 extends Box{
    
    public Type1(int cardGrade, int colourPrint, int width, int height, int length, boolean bottomReinforce){
        super(cardGrade, colourPrint, width, height, length, bottomReinforce);
        bottomReinforce = false;
    }
}
