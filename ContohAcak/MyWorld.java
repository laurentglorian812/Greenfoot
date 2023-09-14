import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public String[]namafile={"bee.png","butterfly.png","cactus.png",
        "camel.png","dolphin.png","elephant.png","fish1.png",
        "flower.png","fly.png","frog.png","grass.png","hedgehog.png",
        "hippo.png","kangaroo.png","ladybug1.png","lemur.png",
        "lizard2.png","lobster.png","mouse.png","mushroom.png",
        "pelican.png","pig.png","polar-bear.png","seahorse.png",
        "seal.png","shamrock.png","sheep.png","snake.png",
        "spider.png","starfish.png","turtle.png","wombat.png"};
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new Tombol1(),300,500);
        addObject(new Tombol2(),500,500);
    }
    
    public void acak1()
    {
        for(int i=0;i<80;i++)
        {
            Makhluk m=new Makhluk();
            m.setImage(namafile[Greenfoot.getRandomNumber(namafile.length-1)]);
            int x,y;
            addObject(m,0,0);
            do
            {
                removeObject(m);
                x=Greenfoot.getRandomNumber(getBackground().getWidth());
                y=Greenfoot.getRandomNumber(getBackground().getHeight());
                addObject(m,x,y);
            }while(!m.cekitem());
        }
    }
    
    public void acak2()
    {
        for(int i=0;i<80;i++)
        {
            Makhluk m=new Makhluk();
            m.setImage(namafile[Greenfoot.getRandomNumber(namafile.length-1)]);
            int x;
            int y;
            addObject(m,0,0);
            do
            {
                removeObject(m);
                x=Greenfoot.getRandomNumber(getBackground().getWidth());
                y=Greenfoot.getRandomNumber(getBackground().getHeight());
                addObject(m,x,y);
            }while(!m.cekitem2());
        }
    }
}
