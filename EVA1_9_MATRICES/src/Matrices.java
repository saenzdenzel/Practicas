public class Matrices {
    public static void main(String[] args) throws Exception {
        int [][] matriz = new int [5][3];
        System.out.println("matriz"+ matriz);
        System.out.println("matriz.lenght"+ matriz.length);
        System.out.println("matriz[0].length" + matriz[0].length);
        System.out.println("matriz[1]" + matriz[1]);
        System.out.println("matriz[1].lenght"+ matriz[1].length);

        for (int i = 0; i < matriz.length; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas
                matriz[i][j] = (int)(Math.random()*100);
            }
            
        }
          for (int i = 0; i < matriz.length; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas
                System.out.print("["+ matriz[i][j] + "|");
            }
           System.out.println(""); 
        }
    }
}
