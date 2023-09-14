import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class Tes extends World
{

    /**
     * Constructor for objects of class Tes.
     * 
     */
    public Tes()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        int a;
        String b,tmp;
        float c;
        char d;
        
        tmp=JOptionPane.showInputDialog(null,"a(integer) ; "); a=Integer.parseInt(tmp);
        b=JOptionPane.showInputDialog(null,"b(string) ; ");
        tmp=JOptionPane.showInputDialog(null,"c(float) : "); c=Float.parseFloat(tmp);
        tmp=JOptionPane.showInputDialog(null,"d(char : ");d=tmp.charAt(0);
        // System.out.printf("%d %s %6.2f %c\n", a,b,c,d);
        // JOptionPane.showMassageDialog(null, a+" "+b+" "+c+" "+d);
        JOptionPane.showMessageDialog(null, String.format ("%d\n%s\n%.2f\n%c\n",a,b,c,d));
        Greenfoot.stop();
    }
}
