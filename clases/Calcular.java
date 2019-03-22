package Test.Planetas;
/**
 * 
 * @author Osmar Ain Flores
 *
 */
public class Calcular 
{
	//METODO QUE VALIDA SI ES NUMERICO.
	public static boolean isNumeric(String cadena)
	{
    	try 
    	{
    		Integer.parseInt(cadena);
    		return true;
    	} 
    	catch (NumberFormatException e)
    	{
    		System.out.println("No es un digito numerico! Reingrese número...");
    		return false;
    	}
    }
	
	//METODO QUE VALIDA SI ES POSITIVO.
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
	
	//METODO QUE CALCULA SI LOS ANGULOS SON IGUALES O SIMETRICOS.
	public static boolean evaluar(Integer anguloAlpha, Integer anguloBeta, Integer anguloGamma)
    {
    	if (anguloAlpha == 0 && anguloBeta == 0 && anguloGamma == 360) 
    	{
    		return true;
		}
    	anguloAlpha = esMayor(anguloAlpha);
    	anguloBeta = esMayor(anguloBeta);
    	anguloGamma = esMayor(anguloGamma);
    	
    	if (anguloAlpha == anguloBeta && anguloAlpha == anguloGamma && anguloBeta == anguloGamma) 
    	{
    		return true;
		}
    	
    	return false;
    }
	//METODO QUE UTILIZADO PARA LA SIMETRIA DE LOS ANGULOS.
	public static Integer esMayor(Integer angulo)
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
