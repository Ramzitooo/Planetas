package Test.Planetas;

/*
 * Flores Osmar Ain
 */
public class Alpha 
{

	public static int velocidad = 500;
	public static int dias;
	
	public Alpha()
	{
		
	}
	
	public static int anguloPorDias()
	{	
		Integer anguloTotal= dias * 1;
		while (anguloTotal>=360){
			anguloTotal = anguloTotal - 360;
		}
		System.out.println("Angulo del Planeta Alpha: "+anguloTotal);
		return anguloTotal;
		
	}
	
}
