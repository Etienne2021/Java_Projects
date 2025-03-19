
package navidadjuego.logica;

import java.util.Random;


public class Controladora {
   
    
    public int determinarcantidademoji(String emoji, int cantidad,String matriz[][])
    {
        
        int cantidadencontrada=0;
        for(int i=0; i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(matriz[i][j].equals(emoji))
                {
                    cantidadencontrada=cantidadencontrada+1;
                }
            }
        }
        return  cantidadencontrada;
    }
    
    
    public String[][] GenerarMatriz()
    {
        Random random = new Random();
        String []emojis= {"🎅","🎁","🎄","⭐"};
        String [][]matriz= new String[4][4];
        
         for(int i=0; i<4;i++)
        {
            for(int j=0;j<4;j++){
                matriz[i][j]= emojis[random.nextInt(emojis.length)];
            }
        }
        return matriz;
    }
    
    
}
