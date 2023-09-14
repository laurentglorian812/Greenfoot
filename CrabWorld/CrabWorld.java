import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        int x,y,X,Y;
        Lobster lobster=new Lobster();
        X=Greenfoot.getRandomNumber(getWidth());
        Y=Greenfoot.getRandomNumber(getHeight());
        addObject(lobster,X,Y);
        Crab crab=new Crab();
        do
        {
            x=Greenfoot.getRandomNumber(getWidth());
        }while (Math.abs(X-x)<=100);
        do
        {
            y=Greenfoot.getRandomNumber(getHeight());
        }while (Math.abs(Y-y)<=100);
        addObject(crab,x,y);
        addObject(new Worm(),Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        addObject(new Ikan(),Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        addObject(new Jamur(),Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        for(int i=0;i<Greenfoot.getRandomNumber(5)+2;i++)
        addObject(new Penghalang(), Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        addObject(new Label("Score : ",20),540, 30);
        ((Label)getObjects(Label.class).get(0)).setFillColor(Color.BLACK);
        acakPenghalang();
        //acakMakanan();
        //addObject(new Batu(),Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        //addObject(new Crab(),Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        //addObject(new Lobster(),Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        //for(int i=0;i<Greenfoot.getRandomNumber(5)+3;i++)
        //addObject(new Worm(), Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
    }
    public void acakMakanan()
    {
        int x,y;
        do
        {
           x=Greenfoot.getRandomNumber(getWidth());
           y=Greenfoot.getRandomNumber(getHeight());
        }while(!cekItem(x,y));
        addObject(new Makanan(),x,y);
    }
    public void acakPenghalang()
    {
        int x,y;
        do
        {
            x=Greenfoot.getRandomNumber(getWidth());
            y=Greenfoot.getRandomNumber(getHeight());
        }while(!cekItem(x,y));
        addObject(new Penghalang(),x,y);
    }
    public boolean cekItem(int x,int y)
    {
        return(getObjectsAt(x,y,Actor.class).isEmpty());
    }
    //public void tambahBatu(int x, int y)
    {
     //for(int i=0;i<Greenfoot.getRandomNumber(4)+2;i++)
      //addObject(new Batu(), Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
    }
    //public void tambahWorm(int x, int y)
    {
     //for(int i=0;i<Greenfoot.getRandomNumber(5)+3;i++)
      //addObject(new Worm(), Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
    }
}
