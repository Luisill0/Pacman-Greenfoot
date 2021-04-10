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

    public void act() 
    {
        handleCollisions();
    }   
}
