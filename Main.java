import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Ingrese numero de incognitas: ");
    int n=sc.nextInt();
    
    double[][] array=new double [n][n+1];
    double resultado;
 
    int fila=0,columna=n+1;
    
    for ( fila = 0; fila < array.length; fila++) {
     System.out.println("Ingrese los valores de fila "+(fila+1));
      
      for ( columna = 0; columna < array[fila].length-1; columna++) {//ingresando
         System.out.println("ingrese el valor de X"+(columna+1));
   
             array[fila][columna]=sc.nextInt();
          // if (array[fila][columna]== array.length+1) {
             //  System.out.println("Ingrese valor de la respuesta de la Ecuacion: ");
             // array[fila][columna]=sc.nextInt(); break;
       // }
        } 
      System.out.println("Ingrese valor de la respuesta de la Ecuacion: ");
      array[fila][columna]=sc.nextInt();
      
      
      
      /* he puesto un break para que cierre el proceso del if en cuanto llegue a este punto, ya que si no lo hacia me volvi a pedir un numero para la ultima culumna y esto estaba mal ya que no era una incognita si no ya la rspuesta despues del = de la ecuacion.
              */
            //valio burgen el break
       

     
   
    
  }
 System.out.println();
       
    
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");

      }

            System.out.println();
       
}
  

  }
  }
    
