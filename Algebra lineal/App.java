import java.util.Scanner;
import java.util.InputMismatchException;




public class App{
    public static int  calcularDeterminante(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        if (filas == 3 && columnas == 3) {
            int a = matriz[0][0], b = matriz[0][1], c = matriz[0][2];
            int d = matriz[1][0], e = matriz[1][1], f = matriz[1][2];
            int g = matriz[2][0], h = matriz[2][1], i = matriz[2][2];
    
            int determinante = (a * e * i) + (b * f * g) + (c * d * h) - (c * e * g) - (b * d * i) - (a * f * h);
            return determinante;
            
        }else if (filas == 1 && columnas == 1) {
            int determinante = matriz[0][0];
            return determinante;
            
        }else if (filas == 2 && columnas == 2) {
            int a = matriz[0][0];
            int b = matriz[0][1];
            int c = matriz[1][0];
            int d = matriz[1][1];
            int determinante = (a *d)-(b*c);
            return determinante;
            
        }
        System.out.println("La matriz esta feura de rango");
        return 0;


    }
    public static int[][] aplicarTraspuesta (int[][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][]traspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];         
            }
            
        }
        return traspuesta;

    }

    public static int[][] multiplicarPorEscalar(int[][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el escalar que va a querer multiplciar por la matriz");
        int escalar = scanner.nextInt();
        scanner.close();
        int [][]matrizMultiplicada = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizMultiplicada[i][j] = (matriz[i][j]*escalar);
                
            }
            
        }
        return matrizMultiplicada;


    }

    public static int[][] multiplicacionDeMatriz(int[][] matriz, int[][] matriz2){
        int filas1 = matriz.length;
        int columnas1 = matriz[0].length;
        int filas2 = matriz2.length;

        if (columnas1 != filas2) {
            throw new IllegalArgumentException("El numero de columnas de la primera matriz debe coincidir con el numero de filas de la segunda matriz.");
            
        }
        int [][]resultado = new int[filas1][columnas1];

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado.length; j++) {
                for (int k = 0; k < resultado.length; k++) {

                    resultado[i][j] += matriz[i][k]*matriz2[k][j];
                    
                }
                
            }
            
        }
        return resultado;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(1)Matrices, (2)Vectores");
        int matvec = scanner.nextInt();
        while (true) {
            try {
                if (matvec ==1 && matvec < 3) {
                    System.out.println("Que operaciones con matrices quiere realizar?, (1)Determinante, (2), Traspuesta, (3)Multiplicacion de matrices y (4)Mutiplicacion por un escalar.");
                }else if (matvec == 2 && matvec < 3) {
                    System.out.println("Operaciones con vectores: (1)Producto cruz,(2)Producto escalar, (3)Direccion en R3,(4)Direccion en r4");
                    
                }
    
                throw new IllegalAccessError("No hay otro tipo de operaciones que no sean matrices y vectores!!");
                
            } catch (IllegalAccessError e) {
                System.out.println("Error: " +e.getMessage());
                break;
            }
            
        }
        int operacion = scanner.nextInt();
        int fila2 = 0;
        int columnas2 = 0;
        int fila = 0;
        int columnas = 0;
        if (operacion == 3) {
           
        }


      if (operacion != 3) {
        
        
      }

        switch (operacion) {
            case 1:
            while (true) {
                try {
                    System.out.println("ingrese las filas 1-3!");
                    fila = scanner.nextInt();
                    if (fila > 3 || fila < 1) {
                        throw new IllegalArgumentException("El numero de filas debe ser menor que 3 y mayor a 0!!");
                        
                    }
                break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: debe ignresar un numero entero!!");
                    
                } catch (IllegalArgumentException e){
                    System.out.println("Error: " +e.getMessage());
                }
                
            }
    
    
            while (true) {
                try {
                    System.out.println("Ingrese las columnas 1-3!");
                    columnas = scanner.nextInt();
                    if ( columnas > 3 || columnas <1) {
                        throw new IllegalArgumentException("El numero de columnas debe ser menor que 3 y mayor que 0!!");
                        
                    }
                    break;
                    
                } catch (InputMismatchException e) {
                    System.out.println("Error: debe ingresar un numero entero");
                } catch(IllegalArgumentException e){
                    System.out.println("Error: " +e.getMessage());
                }
                
            }
    
            int [][]Matriz = new int[fila][columnas];
            System.out.println("Ingrese los valores de la matriz.");
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columnas; j++) {
                    while (true) {
                        try {
                            System.out.print("Elemento [" + i + "][" + j + "]: ");
                            Matriz[i][j] = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Debe ingresar un número entero!!");
                            scanner.nextLine();
                        }
                    }
                }
            }
    
            System.out.println("La matriz ingresada es: ");
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(Matriz[i][j] +" ");
                    
                }
                System.out.println();
                
            }
            
            int determinante = calcularDeterminante(Matriz);
            System.out.println("El determinante es: " +determinante);
            break;
            
            case 2:
            while (true) {
                try {
                    System.out.println("ingrese las filas 1-3!");
                    fila = scanner.nextInt();
                    if (fila > 3 || fila < 1) {
                        throw new IllegalArgumentException("El numero de filas debe ser menor que 3 y mayor a 0!!");
                        
                    }
                break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: debe ignresar un numero entero!!");
                    
                } catch (IllegalArgumentException e){
                    System.out.println("Error: " +e.getMessage());
                }
                
            }
    
    
            while (true) {
                try {
                    System.out.println("Ingrese las columnas 1-3!");
                    columnas = scanner.nextInt();
                    if ( columnas > 3 || columnas <1) {
                        throw new IllegalArgumentException("El numero de columnas debe ser menor que 3 y mayor que 0!!");
                        
                    }
                    break;
                    
                } catch (InputMismatchException e) {
                    System.out.println("Error: debe ingresar un numero entero");
                } catch(IllegalArgumentException e){
                    System.out.println("Error: " +e.getMessage());
                }
                
            }
    
            int [][]MatrizT = new int[fila][columnas];
            System.out.println("Ingrese los valores de la matriz.");
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columnas; j++) {
                    while (true) {
                        try {
                            System.out.print("Elemento [" + i + "][" + j + "]: ");
                            MatrizT[i][j] = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Debe ingresar un número entero!!");
                            scanner.nextLine();
                        }
                    }
                }
            }
    
            System.out.println("La matriz ingresada es: ");
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(MatrizT[i][j] +" ");
                    
                }
                System.out.println();
                
            }
            
            int[][]traspuesta = aplicarTraspuesta(MatrizT);
            System.out.println("La traspuesta es: ");
            for (int i = 0; i < columnas; i++) {
                for (int j = 0; j < fila; j++) {
                    System.out.print(traspuesta[i][j] +" ");
                    
                }
                System.out.println();
                
            }

            break;
            case 3:
            while (true) {
                try {
                    System.out.println("Ingrese las filas de la matriz 1 (1-3):");
                    fila = scanner.nextInt();
                    if (fila < 1 || fila > 3) {
                        throw new IllegalArgumentException("El número de filas debe estar entre 1 y 3.");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debe ingresar un número entero.");
                    scanner.nextLine(); // Limpiar el buffer
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        
            while (true) {
                try {
                    System.out.println("Ingrese las columnas de la matriz 1 (1-3):");
                    columnas = scanner.nextInt();
                    if (columnas < 1 || columnas > 3) {
                        throw new IllegalArgumentException("El número de columnas debe estar entre 1 y 3.");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debe ingresar un número entero.");
                    scanner.nextLine();
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        
            int[][] matriz1 = new int[fila][columnas];
            System.out.println("Ingrese los valores de la matriz 1:");
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columnas; j++) {
                    while (true) {
                        try {
                            System.out.print("Elemento [" + i + "][" + j + "]: ");
                            matriz1[i][j] = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Debe ingresar un número entero.");
                            scanner.nextLine();
                        }
                    }
                }
            }
        
            // Matriz 2
            while (true) {
                try {
                    System.out.println("Ingrese las filas de la matriz 2 (1-3):");
                    fila2 = scanner.nextInt();
                    if (fila2 < 1 || fila2 > 3) {
                        throw new IllegalArgumentException("El número de filas debe estar entre 1 y 3.");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debe ingresar un número entero.");
                    scanner.nextLine();
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        
            while (true) {
                try {
                    System.out.println("Ingrese las columnas de la matriz 2 (1-3):");
                    columnas2 = scanner.nextInt();
                    if (columnas2 < 1 || columnas2 > 3) {
                        throw new IllegalArgumentException("El número de columnas debe estar entre 1 y 3.");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debe ingresar un número entero.");
                    scanner.nextLine();
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        
            int[][] matriz2 = new int[fila2][columnas2];
            System.out.println("Ingrese los valores de la matriz 2:");
            for (int i = 0; i < fila2; i++) {
                for (int j = 0; j < columnas2; j++) {
                    while (true) {
                        try {
                            System.out.print("Elemento [" + i + "][" + j + "]: ");
                            matriz2[i][j] = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Debe ingresar un número entero.");
                            scanner.nextLine();
                        }
                    }
                }
            }

            int [][]resultadoMM = multiplicacionDeMatriz(matriz1, matriz2);
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(resultadoMM[i][j] +" ");
                    
                }
                System.err.println();
            }

            
            break;
            case 4:
            while (true) {
                try {
                    System.out.println("ingrese las filas 1-3!");
                    fila = scanner.nextInt();
                    if (fila > 3 || fila < 1) {
                        throw new IllegalArgumentException("El numero de filas debe ser menor que 3 y mayor a 0!!");
                        
                    }
                break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: debe ignresar un numero entero!!");
                    
                } catch (IllegalArgumentException e){
                    System.out.println("Error: " +e.getMessage());
                }
                
            }
    
    
            while (true) {
                try {
                    System.out.println("Ingrese las columnas 1-3!");
                    columnas = scanner.nextInt();
                    if ( columnas > 3 || columnas <1) {
                        throw new IllegalArgumentException("El numero de columnas debe ser menor que 3 y mayor que 0!!");
                        
                    }
                    break;
                    
                } catch (InputMismatchException e) {
                    System.out.println("Error: debe ingresar un numero entero");
                } catch(IllegalArgumentException e){
                    System.out.println("Error: " +e.getMessage());
                }
                
            }
    
            int [][]MatrizM = new int[fila][columnas];
            System.out.println("Ingrese los valores de la matriz.");
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columnas; j++) {
                    while (true) {
                        try {
                            System.out.print("Elemento [" + i + "][" + j + "]: ");
                            MatrizM[i][j] = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Debe ingresar un número entero!!");
                            scanner.nextLine();
                        }
                    }
                }
            }
    
            System.out.println("La matriz ingresada es: ");
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(MatrizM[i][j] +" ");
                    
                }
                System.out.println();
                
            }
            
                int[][]resultado = multiplicarPorEscalar(MatrizM);
                System.out.println("El resultado de la matriz multiplicada por un escalar es: ");
                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(resultado[i][j] +" ");
                        
                    }
                    System.out.println();
                    
                }
            break;
            default:
            System.out.println("Operacion no soportada.");
                break;
        }
        scanner.close();

    }

}