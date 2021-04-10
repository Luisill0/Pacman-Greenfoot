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

    public void act() 
    {
        handleCollisions();
    }   
}
