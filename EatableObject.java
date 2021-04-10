import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fruit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EatableObject extends Actor
{   
    protected int scoreGiven;
    
    public void act(){}

    void handleCollisions(){
        if(isTouching(Pacman.class)){
            PacmanGame.score += scoreGiven;
            getWorld().removeObject(this);
        }
    }
}
