package entidades;

public class Cone {
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
		float geratriz=0;
		
		this.raio = raio;
		this.altura = altura;
		
		geratriz = (float) (Math.pow(altura, 2)*Math.pow(raio, 2));
		
		return (Math.PI)*raio*(raio*Math.sqrt(geratriz));
	}
	
	public double getCalcVol(float raio, float altura) {
		this.raio = raio;
		this.altura = altura;
		return (((Math.PI)*Math.pow(raio, 2)*altura)/3);
	}

}
