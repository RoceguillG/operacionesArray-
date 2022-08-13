import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
    Scanner sc = new Scanner (System.in);
    double respuesta=0;
    
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
       
    System.out.println("MATRIZ AUMENTADA");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length-1; j++) {
        System.out.print(array[i][j] + "   ");

      }
      
            System.out.print("|"+array[i][columna]);
            System.out.println();
       
}


    System.out.println("inicio de operaciones: ");


    double vectorAyuda[]=new double[n];
for (int fil = 0; fil < array.length; fil++) {
  for (int col = 0; col < array[fil].length; col++) {

    if(fil==col){//entrando a las diagonal de la matriz identidad.
      respuesta = array[fil][col];
      
      System.out.println("Esta es la diagonal datos: "+respuesta);
      
      for (int i = 0; i < array[fil].length; i++) {
        //EN ESTA PARTE SE DIVIDEN LAS DIAGONALES POR SU MISMO VALOR
        //EN TODA LA LINEA DE ECUACIONES  

        if(respuesta!=0){
          //por lo tanto se deberia sumar con otra fila o reglon
          
            array[fil][i]=array[fil][i]/respuesta;
        }
        
      //necesito que se mueva si encuentra un 0 en la matriz identidad
       
    else{
      
    }

        
//         //PARA COMVERTIRLO EN 0 EN LOS EXTREMOS DELA DIAGONAL
//         //SE USARA OTRO FOR
//         for (i = 0; i < array.length; i++) {
//           respuesta=array[i][col];
//           //otro for para obviar la diagonal ya establecida

//             for (int j = 0; j < array[i].length; j++) {
//             if (i==fil) 
//               break;
//             else{
//                   array[i][j]=array[i][j]-(respuesta*array[fil][j]);
// }
//             }
          
//         }//termina lo que no me sale bien



        
        
      }


      
    }
  
}
}

 System.out.println();

    System.out.println("MATRIZ IDENTIDAD? quedara resuelta?");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length-1; j++) {
        System.out.print(array[i][j] + "   ");

      }
      
            System.out.print("|"+array[i][columna]);
            System.out.println();
       
}









    

  


  
}
  
  }
    
