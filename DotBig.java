import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DotBig extends EatableObject
{
    public DotBig(){
        this.setImage("images/dot_big.png");
        this.scoreGiven = 50;
    }
    /**
     * Act - do whatever the Dot wants to do. This method is called whenever
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
