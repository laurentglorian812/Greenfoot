import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bola extends Actor
{
    private int nilai=0;
   
   public void setnilai(int n) {nilai=n;}
   public int getnilai() {return(nilai);}
   
    /**
     * Act - do whatever the Bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            setnilai(getnilai()+10);
        }
        ((Label)getWorld().getObjects(Label.class).get(0)).setValue("Score : "+getnilai());
    }    
}
