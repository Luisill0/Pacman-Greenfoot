import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orange extends EatableObject
{
    public Orange(){
        this.setImage("images/orange.png");
        this.scoreGiven = 30;
    }
    
    public void act() 
    {
        handleCollisions();
    }   
}
