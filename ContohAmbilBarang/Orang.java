import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 * Write a description of class Orang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orang extends Actor
{
    int ambil=0;
    int langkah=10;
    /**
     * Act - do whatever the Orang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int posisi=((MyWorld)getWorld()).isi[ambil];
        String nama=((MyWorld)getWorld()).namabrg[posisi];
        cekKeyboard();
        //cekBarang();
        //tampil("Barang : "+nama);
        if(ambil>=((MyWorld)getWorld()).namafile.length)
        {
            JOptionPane.showMessageDialog(null,"SELESAI");
            Greenfoot.stop();
        }
    } 
    
    //public void tampil()
    {
        //int c=Greenfoot.getRandomNumber(namabrg.length);
        //JOptionPane.showMessageDialog(null,"");
    }
    public void cekKeyboard()
    {
        if (Greenfoot.isKeyDown("Down")) moveDown(langkah);
        if (Greenfoot.isKeyDown("Up")) moveUp(langkah);
        if (Greenfoot.isKeyDown("Left")) moveLeft(langkah);
        if (Greenfoot.isKeyDown("Right")) moveRight(langkah);
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
}
