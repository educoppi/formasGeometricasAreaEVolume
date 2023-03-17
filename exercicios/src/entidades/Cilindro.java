package entidades;

public class Cilindro {
	private float raio=0;
	private float altura=0;
	
	public float getRaio() {
		return raio;
	}
	
	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public double getCalcArea(float raio, float altura) {
		this.altura = altura;
		this.raio = raio;
		return ((2*(Math.PI)*raio*altura) + (2*(Math.PI)*Math.pow(raio, 2)));
	}
	
	public double getCalcVol(float raio, float altura) {
		this.raio = raio;
		this.altura = altura;
		return ((Math.PI)*Math.pow(raio, 2)*altura);
	}
}
