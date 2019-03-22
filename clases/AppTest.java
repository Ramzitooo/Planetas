package Test.Planetas;

import java.util.Scanner;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
     // INICIALIZO VARIABLES.
        Scanner lector = new Scanner(System.in);
        String continuar = "N";
        boolean flag = true;
        Integer dias = 0;
        String numero = "";
    	Integer contadorAlineacion;
    	Alpha planetaAlpha;
    	Beta plnetaBeta;
    	Gamma planetaGamma;
        
        
        //COMIENZO DEL PROGRAMA.
        do 
        {
        	numero = "";

        	//PIDO EL INGRESO DEL DATO.
        	System.out.println("*** *** *** *** *** ***"); 
        	System.out.println("BIENVENIDO AL SISTEMA");
        	System.out.println("Este es un programa para ver la cantidad de veces que se alinean los planetas Alpha, Beta y Gamma dependiente los dias ingresados.");
        	System.out.println("Por favor ingresa la cantidad de dias:" );
        	contadorAlineacion = 0;
        	do
        	{
        		//TOMA EL DATO INGRESADO
				numero = lector.next();
				
				//VALIDO QUE SEA UN NÚMERO Y SEA POSITIVO.
				if (Calcular.isNumeric(numero) && Calcular.isPositive(numero)) 
				{
					flag = false;
				}				
				
			} while(flag==true);
        	
        	//LE MUESTRO LO QUE INGRESO
        	System.out.println("DÍAS INGRESADOS:"+ numero );
        	dias = Integer.valueOf(numero);
        	planetaAlpha = new Alpha(dias);
        	plnetaBeta = new Beta(dias);
        	planetaGamma = new Gamma(dias);

        	for (int i = 0; i < dias; i++) 
        	{
        			planetaAlpha.anguloPorDia();
        			plnetaBeta.anguloPorDia();
        			planetaGamma.anguloPorDia();
        			
					if (Calcular.evaluar(planetaAlpha.getAngulo(),plnetaBeta.getAngulo(),planetaGamma.getAngulo())) 
					{
						contadorAlineacion = contadorAlineacion + 1; 
					}
			}
        	
        	//MUESTRO LA CANTIDAD DE VECES QUE LOS PLANETAS SE ALINEARON.
        	System.out.println( "CANTIDAD DE VECES QUE SE ALINEARON LOS PLANETAS: "+ contadorAlineacion );
        	
        	//PREGUNTO SI DESEA SEGUIR EN EL PROGRAMA.
        	System.out.println("");
        	System.out.println( "Desea seguir operando? S/N" );
        	continuar = lector.next().toUpperCase();
        	System.out.println("");
        	System.out.println("");
		}
        while(continuar.equals("S"));
        System.out.println("CIERRE DEL PROGRAMA.");
    }
}
