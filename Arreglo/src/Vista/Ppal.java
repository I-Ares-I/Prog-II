
package Vista;


import Modelo.Arreglo;
import javax.swing.JOptionPane;
class Ppal{
	public static void main(String args[]){
		Arreglo ob=new Arreglo();
		int opc;
		do{
		   opc=Integer.parseInt(JOptionPane.showInputDialog("            ***Menu Arreglo***\n1. Cargar\n2. Imprimir\n3. Invertir\n4. Ordenar\n5. Salir\nDigite opcion:"));
		   switch(opc){
			case 1:
				ob.cargar();
				break;
			case 2:
				ob.impri();
				break;
			case 3:
				ob.Invertir();
				JOptionPane.showMessageDialog(null,"Arreglo invertido");
				break;
			case 4:
				ob.Ordenar();
				break;	
			case 5:
				JOptionPane.showMessageDialog(null,"     Fin del programa\n      Hasta pronto!");	

		   }
		}while(opc!=5);
	}
}