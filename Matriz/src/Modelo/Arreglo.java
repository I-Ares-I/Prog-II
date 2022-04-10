package Modelo;

import javax.swing.JOptionPane;

public class Arreglo{
    public int v[][] = new int[3][3];

    
    
    public Arreglo(){
        for(int x=0; x < v.length; x++) {
            for (int y=0; y < v[x].length; y++) {
                v[x][y] = (int) (Math.random()*99+1);
            }
        }
        JOptionPane.showMessageDialog(null,"Matriz cargada aleatoriamente!");  
    }
    
    
    public Arreglo(int a) {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                v[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Posicion [" + i + "" + j + "]:"));
            }
        }
        JOptionPane.showMessageDialog(null,"Matriz cargada por teclado!");
    }

    public Arreglo(Arreglo a,Arreglo b){
        
        int x[][]  = a.v;
        int y[][] = b.v;
        for(int k = 0; k < y[0].length; k++) {           
            for (int i = 0; i < x.length; i++) {
                int suma = 0;               
                for (int j = 0; j < x[0].length; j++) {                  
                    suma += x[i][j] * y[j][k];
                }               
                v[i][k] = suma;
            }
        }
        JOptionPane.showMessageDialog(null,"Matriz Multiplicada correctamente!"); 
    }
    
    public void imprimir() {
        String salida = "los datos del arreglo son:\n";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                salida += " | " + v[i][j] + " | " + " ";
            } 
            salida += "\n";
        }
        JOptionPane.showMessageDialog(null, salida);
    }
}
