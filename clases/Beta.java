package Test.Planetas;
/*
 * Flores Osmar Ain
 */
public class Beta 
{
	private Integer velocidad = 2000;
	private Integer dias;
	private Integer angulo;

	public Beta(Integer dias)
	{
		this.dias = dias;
		this.velocidad = 2000;
		this.angulo = 0;
	}
	
	public void anguloPorDia()
	{
		this.angulo = this.angulo + 3;
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
