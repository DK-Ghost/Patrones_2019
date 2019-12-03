package CAP;

import java.util.ArrayList;

/**
 *
 * @author DKghost
 */

public class CAP {
    int matriz[][];
    int p;
    int pat_prom[];
    
    
public void entrena( ArrayList<patron> patron ) {
    
    matriz = new int [patron.get(patron.size()-1).getClase()][patron.get(0).getVec().length]; //Crea Matriz
    
for(patron p: patron){
    entrena(p);
}

for(int z=0;z<patron.get(patron.size()-1).getClase();z++){    //Entrenamiento
    for(int r=0;r<patron.get(0).getVec().length;r++){
     System.out.print(matriz[z][r]+" ");    
    }
     System.out.println();
    }
}


public void entrena(  patron p ) {
    int n = p.getClase()-1;
    
    for(int i=0 ;i<p.getVec().length ;i++){
        if(p.getVec()[i]==1){
      matriz[n][i]+=1;
        }else 
              matriz[n][i]-=1;
    } 
}

}
