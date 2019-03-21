package Test.Planetas;

public class Gamma 
{

	public static int velocidad = 1000;
	public static int dias;
	
	public Gamma()
	{
		
	}
	
	public static int anguloPorDias()
	{	
		Integer total = 5 * dias;
		Integer anguloTotal= 360;

		for (int i = 0; i < dias ; i++) 
		{
			anguloTotal = anguloTotal - 5;
			if (anguloTotal == 0) 
			{
				anguloTotal = 360;
			}
		}
		if (anguloTotal == 360) 
		{
			anguloTotal = 0;
		}
		System.out.println("Angulo del Planeta Gama: "+anguloTotal);
		return anguloTotal;
		
	}
	
}
