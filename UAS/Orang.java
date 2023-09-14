import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.util.List;
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
    int score=0;
    int waktu=60000;
    int nama;
    public void act() 
    {
        // Add your action code here.
        setImage("mario1.png");
        getWorld().showText(""+live,1130,25);
        getWorld().showText(""+score,960,25);
        cekKeyboard();
        showPosition();
        waktu--;
        getWorld().showText(""+waktu,200,25);
        if(isTouching(Rintangan2.class))
        {
            removeTouching(Rintangan2.class);
            live=live-1;
            getWorld().showText(""+live,1130,25);
        }
        if(isTouching(Rintangan5.class))
        {
            removeTouching(Rintangan5.class);
            live=live-1;
            getWorld().showText(""+live,1130,25);
        }
        if(isTouching(Rintangan6.class))
        {
            removeTouching(Rintangan6.class);
            live=live-1;
            getWorld().showText(""+live,1130,25);
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
            getWorld().showText(""+live,1130,25);
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
        if(isTouching(Musuh.class))
        {
            Greenfoot.setWorld(new GameOver());
            Greenfoot.stop();
        }
        if(isTouching(Koin.class))
        {
            removeTouching(Koin.class);
            score=score+Greenfoot.getRandomNumber (50);
            getWorld().showText(""+score,960,25);
        }
        if(isTouching(Anggur.class))
        {
            removeTouching(Anggur.class);
            score=score+100;
            getWorld().showText(""+score,960,25);
        }
        if(isTouching(Pisang.class))
        {
            removeTouching(Pisang.class);
            score=score+75;
            getWorld().showText(""+score,960,25);
        }
        if(isTouching(Apel.class))
        {
            removeTouching(Apel.class);
            score=score+50;
            getWorld().showText(""+score,960,25);
        }
        if(isTouching(Putri.class))
        {
            JOptionPane.showMessageDialog(null,"SELAMAT ANDA MENANG!");
            UserInfo my=UserInfo.getMyInfo();
            String nm="";
            int p=-1;
            for(int i=0;i<5&&nm.equalsIgnoreCase("");i++)
            {
                if(waktu>my.getInt(i))
                {
                    nm=JOptionPane.showInputDialog(null,"Selamat! Anda masuk waktu tercepat!\nKetikkan nama anda : ");
                    p=i;
                }
            }
            if(p>-1)
            {
                for(int i=4;i>p;i--)
                {
                    int dt1=my.getInt(i-1);
                    String nm1=my.getString(i-1);
                    my.setInt(i,dt1);
                    my.setString(i,nm1);
                }
                my.setInt(p,waktu);
                my.setString(p,nm);
                my.store();
            }
            String hsl="No.  Nama                   Waktu\n----------------------------------\n";
            for(int i=0;i<5;i++)
            {
                hsl+=String.format("%3d %20s %4d\n", i+1,my.getString(i),my.getInt(i));
            }
            JOptionPane.showMessageDialog(null, hsl);
            Greenfoot.stop();
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
    public void showPosition()
    {
        List<Jamur> isi=getWorld().getObjects(Jamur.class);
        String hasil="JAMUR----------------\n";
        for(Jamur tes:isi)
        {
            hasil+=String.format("%d %d\n",tes.getX(),tes.getY());
        }
        if(Greenfoot.isKeyDown("X"))JOptionPane.showMessageDialog(null,hasil);
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
            if(isTouching(Tangga.class))
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
            if(isTouching(Tangga.class))
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
            Greenfoot.delay(1);
            moveDown(80);
            setImage("mario3.png");
        }
    } 
}

