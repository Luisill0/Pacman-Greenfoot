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
    /**
     * Act - do whatever the Orange wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void act() 
    {
        handleCollisions();
    }   
    
    public int giveScore(){
        return scoreGiven;
    }
}
