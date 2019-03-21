package Test.Planetas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner lector = new Scanner(System.in);
        String continuar = "N";
        boolean flag = true;
        String numero = "";
        do 
        {
        	numero = "";
        	System.out.println("*** *** ***"); 
        	System.out.println("Bienvenido!");
        	System.out.println("Pramaba para ver la cantidad de veces que se alinean los planetas Alpha, Beta y Gamma");
        	System.out.println("Por favor ingresa la cantidad de dias:" );
        	
        	do
        	{
				numero = lector.next();
				if (isNumeric(numero) && isPositive(numero)) 
				{
					flag = false;
				}
				
				
			} while(flag==true);
        	System.out.println("Usted ingreso:"+ numero);
        	
        	Integer contadorAlineacion = 0;
        	Integer anguloAlpha = 0;
        	Integer anguloBeta = 0;
        	Integer anguloGamma = 360;
        	for (int i = 0; i < Integer.parseInt(numero); i++) 
        	{
				
					anguloAlpha = anguloAlpha + 1;
					anguloBeta = anguloBeta + 3;
					anguloGamma = anguloGamma - 5;
					
					if (anguloAlpha == 360) 
					{
						anguloAlpha = 0;
					}
					
					if (anguloBeta == 360) 
					{
						anguloBeta = 0;
					}
					
					if (anguloGamma == 0) 
					{
						anguloGamma = 360; 
					}
					
					if (sonIguales(anguloAlpha,anguloBeta,anguloGamma)) 
					{
						contadorAlineacion = contadorAlineacion + 1; 
					}

			}
        	
        	System.out.println( "Cantidad de veces que se alinearon los planetas: "+ contadorAlineacion );
        	System.out.println( "Desea reintentar? S/N" );
        	continuar = lector.next().toUpperCase();
        	System.out.println("");
        	System.out.println("");
		}
        while(continuar.equals("S"));
        System.out.println("Adios!");
        
    }
    
    public static boolean isNumeric(String cadena){
    	try {
    		Integer.parseInt(cadena);
    		return true;
    	} catch (NumberFormatException nfe){
    		System.out.println("No es un digito numerico! Reingrese número...");
    		return false;
    	}
    }
    public static boolean isPositive(String numero)
    {
    	if (Integer.parseInt(numero)<=0) 
    	{
			
			System.out.println("Numero negativo! Reingrese número...");
    		return false;
		}
    	else
    	{
    		return true;
    	}
    }
    public static boolean sonIguales(Integer anguloAlpha, Integer anguloBeta, Integer anguloGamma)
    {
    	if (anguloAlpha == 0 && anguloBeta == 0 && anguloGamma == 360) 
    	{
    		return true;
		}
    	anguloAlpha = calcular(anguloAlpha);
    	anguloBeta = calcular(anguloBeta);
    	anguloGamma = calcular(anguloGamma);
    	
    	if (anguloAlpha == anguloBeta && anguloAlpha == anguloGamma && anguloBeta == anguloGamma) 
    	{
    		return true;
		}
    	
    	return false;
    }
    public static Integer calcular(Integer angulo)
    {
    	if (angulo>=180) 
    	{
			return angulo - 180;
		}
    	else
    	{
    		return angulo;
    	}
    }
    
}
