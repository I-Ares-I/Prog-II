
package matriz;

import Modelo.Arreglo;
import javax.swing.JOptionPane;

public class Vista {

    public static void main(String[] args) {
        Arreglo  ob1=null, ob2=null, ob3=null ;
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("      ***Menu Principal****\n 1. Carga\n 2. Imprimir\n 3. Salir"));
            switch(op){
                case 1:
                    do{
                        op = Integer.parseInt(JOptionPane.showInputDialog("       **Menu Cargar**\n 1. Aleatorio\n 2. Teclado\n 3.Multiplicar\n 4.Volver"));
                        switch(op){
                            case 1:
                                ob1 = new Arreglo();
                                break;
                            case 2:
                                ob2 = new Arreglo(1);
                                break;
                            case 3:
                                ob3 = new Arreglo(ob1,ob2);
                                break;
                            
                            
                        }
                
                
                    }while (op != 4);
                    break;
                case 2: 
                    do{
                        op = Integer.parseInt(JOptionPane.showInputDialog("        **Menu Imprimir**\n 1. Matiz Aleatorio\n 2. Matriz Teclado\n 3. Matriz Multiplicada\n 4. Volver"));
                        switch(op){
                            case 1:
                                ob1.imprimir();
                                break;
                            case 2:
                                ob2.imprimir();
                                break;
                            case 3:
                                ob3.imprimir();
                                break;
                                
                        }
                
                
                    }while (op != 4);
                    break;
                   
            }
        } while (op != 3);
        JOptionPane.showMessageDialog(null,"Fin del programa \n Hasta pronto!");

    }

}
