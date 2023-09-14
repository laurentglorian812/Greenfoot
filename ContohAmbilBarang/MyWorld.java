import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public String namabrg[]={"jangkar","apel","bola","bunga","boneka","SELESAI"};
    public String namafile[]={"anchor.png","apple1.png","ball.png","flower2.png","teddybear.png"};
    public int isi[]=new int[namafile.length];
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Label(" ",20),300,370);
        addObject(new Orang(),Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(350));
        for(int i=0;i<namafile.length;i++)isi[i]=i;
        for(int i=0;i<namafile.length;i++)
        {
            int a=Greenfoot.getRandomNumber(namafile.length);
            if(a!=i){int tmp=isi[a];isi[a]=isi[i];isi[i]=tmp;}
        }
        for(int i=0;i<namafile.length;i++)
        {
            int x; int y;
            do
            {
                x=Greenfoot.getRandomNumber(600);y=Greenfoot.getRandomNumber(350);
            }while(!getObjectsAt(x,y,Actor.class).isEmpty());
            addObject(new Barang(),x,y);
            ((Barang)getObjects(Barang.class).get(i)).setImage(namafile[isi[i]]);
        }
    }
}
