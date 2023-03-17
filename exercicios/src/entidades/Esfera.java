package entidades;

public class Esfera {

	private float raio=0;

	public float getRaio() {
		return raio;
	}
	
	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	public double getCalcArea(float raio) {
		this.raio = raio;
		return 4*(Math.PI)*Math.pow(raio, 2);
	}
	
	public double getCalcVol(float raio) {
		this.raio = raio;
		return 4/3*Math.PI*Math.pow(raio, 3);
	}
}
