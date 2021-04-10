import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DotSmall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DotSmall extends EatableObject
{
    public DotSmall(){
        this.setImage("images/dot_small.png");
        this.scoreGiven = 10;
    }
    /**
     * Act - do whatever the DotSmall wants to do. This method is called whenever
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
