import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Papan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Papan extends World
{

    /**
     * Constructor for objects of class Papan.
     * 
     */
    public static final int maxx=10;
    public static final int maxy=10;
    public int x=Greenfoot.getRandomNumber(maxx);
    public int y=Greenfoot.getRandomNumber(maxy);
    public int xo=1000;
    public int yo=1000;
    Isi dt[][]=new Isi[maxx][maxy];
    public Papan()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(16*maxx, 16*maxy, 1);
        int px=0,py=0;
        for(int i=0;i<maxy;i++){
            for(int j=0;j<maxx;j++){
                dt[j][i]=new Isi();
                dt[j][i].setnilai(0);
                dt[j][i].setImage("default.png");
                addObject(dt[j][i],j*16+8,i*16+8);
    }
}
dt[x][y].setnilai(1);
}public int hitungjarak(int x1,int y1,int x2,int y2){
    return(Math.abs(x2-x1)+Math.abs(y2-y1));
}
}
