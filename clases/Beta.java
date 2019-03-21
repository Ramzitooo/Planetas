package Test.Planetas;
/*
 * Flores Osmar Ain
 */
public class Beta 
{
	public int velocidad = 2000;
	public static int dias;

	public Beta()
	{}
	
	public static int anguloPorDias()
	{	
		Integer anguloTotal= dias * 3;
		while (anguloTotal>=360){
			anguloTotal = anguloTotal - 360;
		}
		System.out.println("Angulo del Planeta Beta: "+anguloTotal);
		return anguloTotal;
		
	}
	
}
