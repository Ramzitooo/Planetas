package Test.Planetas;
/**
 * 
 * @author Osmar Ain Flores
 *
 */
public class Gamma 
{

	private Integer velocidad;
	private Integer dias;
	private Integer angulo;
	
	public Gamma(Integer dias)
	{
		this.dias = dias;
		this.velocidad = 1000;
		this.angulo = 360;
	}
	
	public void anguloPorDia()
	{
		this.angulo = this.angulo - 5;
		if (this.angulo == 0) 
		{
			this.angulo = 360;
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
