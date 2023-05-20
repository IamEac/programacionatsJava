package Cycle;

/*
 * Exercise 18 : Make some modifications to the previous exercise assuming that the price per liter is not entered
 * There are only three products with prices:
 * 1 - 0.6$/liter
 * 2 - 3$/liter
 * 3 - €1.25/liter
 */

import javax.swing.JOptionPane; 

public class Exercise18 {
	
	public static void main(String[]args) {

		  int codigo, litros, litrosArt01 = 0;
	        
	        float precioLitro, importeFactura = 0, facturacionTotal=0, conteoMay600=0;
	        for(int i=1; i<=5; i++){
	            codigo=Integer.parseInt(JOptionPane.showInputDialog("Articulo N° "+i+ "\nDigite el codigo: "));
	            litros=Integer.parseInt(JOptionPane.showInputDialog("Articulo N° "+i+"\nDigite la cantidad de litros"));
	            if(codigo==1){
	                importeFactura=(float) (litros*0.6);  //Importe de cada factura 5 veces
	                litrosArt01=litrosArt01+litros;
	            }
	            if(codigo==2){
	                importeFactura=(float) (litros*3);  //Importe de cada factura 5 veces
	            }
	            if(codigo==3){
	                importeFactura=(float) (litros*1.25);  //Importe de cada factura 5 veces
	            }
	            facturacionTotal=facturacionTotal+importeFactura;
	            if(importeFactura>600){
	                conteoMay600++;
	            }
	            }
	        System.out.println("Resumen de ventas: ");
	        System.out.println("La facturacion total: "+facturacionTotal);
	        System.out.println("La cantidad de litros vendidos del articulo N1: "+litrosArt01);
	        System.out.println("Cantidad de facturas mayores a $600 "+conteoMay600);
	}
}
