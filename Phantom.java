import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Phantom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phantom extends Actor
{
    private int OFFSET = 5;
    private int direction;
    private Random random;

    public Phantom(){
        setImage("images/blue-phantom-left.png");
        random = new Random();
    }    

    /**
     * Act - do whatever the Phantom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        movePhantom();
    }   

    void movePhantom(){
        int x = getX();
        int y = getY();
        
        if(isTouching(Wall.class)){
            OFFSET *= -1;
        }
        x += OFFSET;
        
        setLocation(x,y);
    }
}
