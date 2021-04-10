import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanGame extends World
{
    public static int score;
    
    public PacmanGame()
    {    
        super(1000, 900, 1); 
        score = 0;
        addWalls();
        addHUD();
        addActors();
        setActOrder(DotBig.class);
    }
    
    public void act(){
        showText("Score: " + score,900,50);
    }
    
    void addWalls(){
        for(int x = 32; x < 1000; x += 64){
            this.addObject(new Wall(),x,132);
            this.addObject(new Wall(),x,868);
        }
        for(int y = 164; y < 900; y+=64){
            if(y == 484 || y == 548){
                continue;
            }
            this.addObject(new Wall(),32,y);
            this.addObject(new Wall(),968,y);
        }
        for(int x = 340; x < 724; x+= 64){ 
            this.addObject(new Wall(),x,596);
            if(x == 468 || x == 532){
                continue;
            }
            this.addObject(new Wall(),x,404);
        }
        for(int y = 468; y < 596; y += 64){
            this.addObject(new Wall(),340,y);
            this.addObject(new Wall(),660,y);
        }
    }
    
    void addSmallDots(){
        for(int x = 106; x < 930; x += 80){
            this.addObject(new DotSmall(),x,206);
            this.addObject(new DotSmall(),x,798);
        }
    }
    
    void addBigDots(){
        this.addObject(new DotBig(),120,510);
        this.addObject(new DotBig(),880,510);
    }
    
    void addFruits(){
        this.addObject(new Orange(),500,300);
        this.addObject(new Strawberry(),500,700);
    }
    
    void addHUD(){
        this.addObject(new HUD(),500,50);
    }
    
    void addActors(){
        this.addObject(new Pacman(),500,500);
        //this.addObject(new Phantom(),100,600);  
        addFruits();
        addSmallDots();
        addBigDots();
    }
}
