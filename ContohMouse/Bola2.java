import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bola2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bola2 extends Actor
{
   private int nilai=0;
   
   public void setnilai(int n) {nilai=n;}
   public int getnilai() {return(nilai);}
   
    /**
     * Act - do whatever the Bola2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int langkah=50;
    public void act() 
    {
        // Add your action code here.
        String keterangan = "Tidak ada";
        
        if(Greenfoot.mouseClicked(this)){
            setnilai(getnilai()+10);
            move(langkah);
        }
        
        if(Greenfoot.getMouseInfo()!=null){
            switch(Greenfoot.getMouseInfo().getButton()){
                case 1 : keterangan=" Kiri ";break;
                case 2 : keterangan=" Tengah ";break;
                case 3 : keterangan=" Kanan ";break;
            }
            
            ((Label)getWorld().getObjects(Label.class).get(0)).setValue("Score : "+getnilai()+" X : "+Greenfoot.getMouseInfo().getX()+", Y : "+Greenfoot.getMouseInfo().getY()+" Tombol : "+keterangan);
            
        }else
   
        ((Label)getWorld().getObjects(Label.class).get(0)).setValue(" Score : "+getnilai());
}}
