package Test.Planetas;

/*
 * Flores Osmar Ain
 */
public class Alpha 
{

	private Integer velocidad = 500;
	private Integer dias;
	private Integer angulo;
	
	public Alpha(Integer dias)
	{
		this.dias = dias;
		this.velocidad = 500;
		this.angulo = 0;
	}
	
	public void anguloPorDia()
	{
		this.angulo = this.angulo + 1;
		if (this.angulo == 360) 
		{
			this.angulo = 0;
		}
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public Integer getAngulo() {
		return angulo;
	}

	public void setAngulo(Integer angulo) {
		this.angulo = angulo;
	}
	
}
