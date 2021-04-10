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
    /**
     * Act - do whatever the Fruit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){}

    void handleCollisions(){
        if(isTouching(Pacman.class)){
            PacmanGame.score += scoreGiven;
            getWorld().removeObject(this);
        }
    }
}
