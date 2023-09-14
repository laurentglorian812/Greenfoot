import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Dunia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dunia extends World
{

    /**
     * Constructor for objects of class Dunia.
     * 
     */
    public Dunia()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        inisialisasi();
    }
    
       public void inisialisasi()
       {
        Orang person1=new Orang();
        addObject(person1,100,100);
        //tambahBuah(Greenfoot.getRandomNumber(6)+5);
        addObject(new Bunga(),200,200);
        addObject(new Ular(),Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        addObject(new batu(),Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        addObject(new Label("Nilai : ",20),50,350);
        ((Label)getObjects(Label.class).get(0)).setFillColor(Color.RED);
        for(int i=0;i<Greenfoot.getRandomNumber(6)+5;i++)
        addObject(new Buah(), Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        addObject(new Binatang(), Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        addObject(new Penghalang(), Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        
       }
                public void tambah1Buah(int x, int y)
                {
                    for(int i=0;i<Greenfoot.getRandomNumber(6)+5;i++)
                    addObject(new Buah(), Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
                }
                //public void tambahBuah(int j)
                {
                    //for(int i=0;i<j;i++)
                    //tambah1Buah(Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        
                }
                
                    
}


