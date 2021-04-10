import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pacman extends Actor
{   
    //private int direction; 
    private static final int OFFSET = 5;
    private boolean inBounds;
    private int currentImage;
    private int counter;

    public Pacman(){
        this.setImage("images/pacman-open.png");
    }

    /**
     * Act - do whatever the Pacman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveMouth();
        handleDirection();
        handleWarp();
    }    

    void handleWarp(){
        int x = getX();
        int y = getY();

        if(isAtEdge()){
            if(x < 5){
                x = 990;
            }else if(x > 990){
                x = 5;
            }
            setLocation(x,y);
        }
    }

    void handleDirection(){
        int x = getX();
        int y = getY();

        boolean inBounds = !isTouching(Wall.class);
        
        if(!inBounds){
            move(-OFFSET);
        }
        
        if(Greenfoot.isKeyDown("Up") && inBounds){
            setLocation(x, y -= OFFSET);
            setRotation(270);
        }else if(Greenfoot.isKeyDown("Down") && inBounds){
            setRotation(90);
            setLocation(x, y += OFFSET);
        }else if(Greenfoot.isKeyDown("Left") && inBounds){
            setRotation(180);
            setLocation(x -= OFFSET, y);
        }else if(Greenfoot.isKeyDown("Right") && inBounds){
            setRotation(0);
            setLocation(x += OFFSET, y);
        }

    }

    void moveMouth(){
        if(counter == 0){
            if(currentImage == 0){
                setImage("images/pacman-open.png"); 
            }else if(currentImage == 1){
                setImage("images/pacman-close.png");
            }
            currentImage = (currentImage + 1) % 2;
        } 
        counter = (counter + 1) % 10;
    }
}
