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
public class Box {
    private int cardGrade;
    private int colourPrint;
    private int width;
    private int height;
    private int length;
    private boolean bottomReinforce;
    
    public Box(){
        
    }
    
    public Box(int cardGrade, int colourPrint, int width, int height, int length, boolean bottomReinforce){
        this.cardGrade = cardGrade;
        this.colourPrint = colourPrint;
        this.width = width;
        this.height = height;
        this.length = length;
        this.bottomReinforce = bottomReinforce;
    }
    
    public int getGrade(){
        return cardGrade;
    }
    
    public void setGrade(int cardGrade){
        this.cardGrade = cardGrade;
    }
    
    public int getPrint(){
        return colourPrint;
    }
    
    public void setPrint(int colourPrint){
        this.colourPrint = colourPrint;
    }
    
    public int getWidth(){
        return width;
    }
    
    public void setWidth(int width){
        this.width = width;
    }
    
    public int getHeight(){
        return height;
    }
    
    public void setHeight(int height){
        this.height = height;
    }
    
    public int getLength(){
        return length;
    }
    
    public void setLength(int length){
        this.length = length;
    }
    
    public boolean getBottomReinforce(){
        return bottomReinforce;
    }
    
    public void setBottomReinforce(boolean bottomReinforce){
        this.bottomReinforce = bottomReinforce;
    }
}
