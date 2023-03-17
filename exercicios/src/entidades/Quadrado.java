package entidades;

public class Quadrado {
	private float lado = 0;
	
	public float getLado() {
		return lado;
	}
	
	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getCalcArea(float lado) {
		return this.lado*this.lado;
	}
	
	public float getCalcPerimetro(float lado) {
		return this.lado*4;
	}

}

