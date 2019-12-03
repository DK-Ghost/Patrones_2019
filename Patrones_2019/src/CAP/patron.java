package CAP;

/**
 *
 * @author DKghost
 */

public class patron {
    private int[] vector;
    private int clase;
  
    public patron(int[] vec, int clase) {
        this.vector = vec;
        this.clase = clase;
    }

    public void setVec(int[] vec) {
        this.vector = vec;
    }
    
    public int[] getVec() {
        return vector;
    }

        public int getClase() {
        return clase;
    }
        
    public void setN(int n) {
        this.clase = n;
    }   
    
}
