import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Strawberry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strawberry extends EatableObject
{
    public Strawberry(){
        this.setImage("images/strawberry.png");
        this.scoreGiven = 40;
    }
    /**
     * Act - do whatever the Strawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleCollisions();
    }   
    
    
    public int giveScore(){
        return scoreGiven;
    }
}
