package CAP;
import java.util.ArrayList;

/**
 *
 * @author DKghost
 */

public class Learnmatrix {

int[][]matriz;
int p;



public void entrena( ArrayList<patron> patron ) {
    matriz = new int [patron.get(patron.size()-1).getClase()][patron.get(0).getVec().length];
for(patron p: patron){
    entrena(p);
}

for(int z=0;z<patron.get(patron.size()-1).getClase();z++){
    for(int r=0;r<patron.get(0).getVec().length;r++){
     System.out.print(matriz[z][r]+" ");   
    }
     System.out.println();
    }
}

public void entrena(  patron p ) {
    int n =p.getClase()-1;
    for(int i=0 ;i<p.getVec().length ;i++){
        if(p.getVec()[i]==1){
      matriz[n][i]+=1;
        }else 
              matriz[n][i]-=1;
    }
 
}

public void recupera(  patron p  ){  
    int aux[]=new int [matriz.length];
   
    for(int z=0;z<matriz.length;z++){
        for(int r=0;r<p.getVec().length;r++){
            if(p.getVec()[r]==1)
            aux[z]+=matriz[z][r];
        }  
    }
    
    int flag=0;
    for(int y=0 ; y<aux.length;y++){
        if(aux[y]>flag){
        flag=aux[y];
        }
    }
    
     for(int y=0 ; y<aux.length;y++){     
        if(flag==aux[y]){
        aux[y]=1;    
     }else 
        aux[y]=0;
     System.out.print(aux[y]);
     }
System.out.println();     
}

    public static void main(String[] args) {
        
    ArrayList<patron> patron = new ArrayList<>();
    patron.add(new patron(new int []{1,0,1,0,1},1));
    patron.add(new patron(new int []{1,1,0,0,1},2));
    patron.add(new patron(new int []{1,0,1,1,0},3));
    
    Learnmatrix s= new Learnmatrix(); 
     s.entrena(patron);
     
     s.recupera(new patron(new int []{1,1,1,1,1},1));
     s.recupera(new patron(new int []{1,1,0,0,1},2));
     s.recupera(new patron(new int []{1,0,1,1,0},3));
     
    }
    
}
