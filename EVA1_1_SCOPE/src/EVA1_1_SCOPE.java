public class EVA1_1_SCOPE {
    public static void main(String[] args){
     int x=100;//Existe dentro del bloque main
        for (int i = 0; i < 10; i++){
            System.out.println("i = "+i);
            x++; //Visible dentro del for
        }
        System.out.println("VALOR FINAL DE LA i = " + i);//Ya no existe 
        System.out.println("VALOR FINAL DE LA X = " + x);//Aun existe
        
    }
    public static void OtraFuncion(){
       System.out.println("VALOR FINAL DE LA x = " + x); //No existe 
    }
}
