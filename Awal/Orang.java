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
            int langkah=10;
                   public void act()
                   {
                    cekKeyboard();
                    ((Label)getWorld().getObjects(Label.class).get(0)).setValue("Nilai "+getnilai()+" Sisa : "+getWorld().getObjects(BuahAcak.class).size());
                    if(cekBuah())
                    {
                     makanBuah();
                     if(getWorld().getObjects(Buah.class).isEmpty())((Dunia)getWorld()).tambah1Buah(Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
                    } 
                     cekUlar();
                     cekBinatang();
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
                        if (Greenfoot.isKeyDown("Down")&&cekbatu(0,+langkah)&&cekpenghalang(0,+langkah)) moveDown(langkah);
                        if (Greenfoot.isKeyDown("Up")&&cekbatu(0,-langkah)&&cekpenghalang(0,-langkah)) moveUp(langkah);
                        if (Greenfoot.isKeyDown("Left")&&cekbatu(-langkah,0)&&cekpenghalang(-langkah,0)) moveLeft(langkah);
                        if (Greenfoot.isKeyDown("Right")&&cekbatu(+langkah,0)&&cekpenghalang(+langkah,0)) moveRight(langkah);
                        if (Greenfoot.isKeyDown("Enter")) Greenfoot.stop();
                        if (Greenfoot.isKeyDown("w")) if(langkah<20)langkah++;
                        if (Greenfoot.isKeyDown("s")) if(langkah>1) langkah--;
                    }
               public void makanBuah()
                { Actor Buah = getOneObjectAtOffset(0,0,Buah.class);
                        getWorld().removeObject(Buah);
                        setnilai(getnilai()+10);
                        if(Greenfoot.isKeyDown("n"))JOptionPane.showMessageDialog(null,"Nilai: "+getnilai());
                }
                public boolean cekBuah()
                {
                 Actor buah = getOneObjectAtOffset(0,0,Buah.class );
                 return(buah!=null);
                }
               public void cekUlar()
               {
                    Actor ular = getOneObjectAtOffset(0,0,Ular.class);
                if (ular!=null){
                      Greenfoot.stop();
                  JOptionPane.showMessageDialog(null,"GAME OVER");
                }
               }
                public void cekBinatang()
               {
                    Actor binatang = getOneObjectAtOffset(0,0,Binatang.class);
                if (binatang!=null){
                      Greenfoot.stop();
                  JOptionPane.showMessageDialog(null,"GAME OVER");
                }
               }
                public boolean cekbatu(int X,int Y)
                {
                    Actor batu2 = getOneObjectAtOffset(X, Y, batu.class);
                    return(batu2==null);
                }
                public boolean cekpenghalang(int X,int Y)
                {
                    Actor penghalang1 = getOneObjectAtOffset(X, Y, Penghalang.class);
                    return(penghalang1==null);
                }
                public void showPosition()
                {
                    List<Buah> isi=getWorld().getObjects(Buah.class);
                    String hasil="ORANG----------------\n";
                    hasil+=String.format("%d %d\n",getX(),getY());
                    hasil+="BUAH----------------\n";
                    for(Buah tes:isi){
                        hasil+=String.format("%d %d\n",tes.getX(),tes.getY());
                    }
                    if(Greenfoot.isKeyDown("Escape"))JOptionPane.showMessageDialog(null,hasil);
                }
                int nilai=0;
                public void setnilai(int n){ nilai=n;} //contoh mutator
                public int getnilai(){return(nilai);} //contoh mutator

    }
    
    
    
