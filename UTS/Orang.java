import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Orang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orang extends Actor
{
    /**
     * Act - do whatever the Orang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int live=3;
    int langkah=5;
    int bonus=0;
    public void act() 
    {
        // Add your action code here.
        setImage("mario1.png");
        getWorld().showText(""+live,1100,50);
        getWorld().showText(""+bonus,950,50);
        cekKeyboard();
        if(isTouching(Rintangan1.class))
        {
            removeTouching(Rintangan1.class);
            live=live-1;
            getWorld().showText(""+live,1100,50);
        }
        if(isTouching(Rintangan2.class))
        {
            removeTouching(Rintangan2.class);
            live=live-1;
            getWorld().showText(""+live,1100,50);
        }
        if(isTouching(Rintangan5.class))
        {
            removeTouching(Rintangan5.class);
            live=live-1;
            getWorld().showText(""+live,1100,50);
        }
        if(isTouching(Rintangan6.class))
        {
            removeTouching(Rintangan6.class);
            live=live-1;
            getWorld().showText(""+live,1100,50);
        }
        if(isTouching(Jamur.class))
        {
            removeTouching(Jamur.class);
            if(live==3)
            {
                live=live+0;
            }
            if(live<3)
            {
               live=live+1; 
            }
            getWorld().showText(""+live,1100,50);
        }
        //if(isTouching(Buah.class))
        {
            //removeTouching(Buah.class);
            //bonus=bonus+5;
            //getWorld().showText(""+bonus,950,50);
        }
        if(live==0)
        {
            Greenfoot.setWorld(new GameOver());
            Greenfoot.stop();
        }
        if(isTouching(Putri.class))
        {
            Greenfoot.setWorld(new Win());
            Greenfoot.stop();
        }
    }
    public void moveDown (int L)
    {
        setLocation(getX(), getY()+L);
    }
    public void moveUp (int L)
    {
        setLocation(getX(), getY()-L);
    }
    public void moveLeft (int L)
    {
        setLocation(getX()-L, getY());
    }
    public void moveRight (int L)
    {
        setLocation(getX()+L, getY());
    }
    public void cekKeyboard()
    {
        if (Greenfoot.isKeyDown("Down"))
        {
            if(isTouching(Tangga2.class))
            {
                moveDown(langkah);
                setImage("mario3-2.png");
            }
        }
        if (Greenfoot.isKeyDown("Up"))
        {
            if(isTouching(Tangga2.class))
            {
                moveUp(langkah);
                setImage("mario3.png");
            }
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            moveLeft(langkah);
            setImage("mario2-2.png");
        }
        if (Greenfoot.isKeyDown("Right"))
        {
            moveRight(langkah);
            setImage("mario2.png");
        }
        if(Greenfoot.isKeyDown("Space"))
        {
            moveUp(80);
            Greenfoot.delay(2);
            moveDown(80);
            setImage("mario3.png");
        }
    }  
    public boolean cekJalan1(int X,int Y)
    {
        Actor Jalan1 = getOneIntersectingObject(Jalan1.class);
        return(Jalan1==null);
    }
    public boolean cekRintangan()
    {
        Actor Rintangan = getOneObjectAtOffset(0,0,Rintangan.class);
        return(Rintangan!=null);
    }
}
