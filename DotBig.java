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

    public void act() 
    {
        handleCollisions();
    }
}
