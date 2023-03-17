package entidades;

public class Piramide {
	private float ladoDaBase=0;
	private float altura=0;
	
	public float getLadoDaBase() {
		return ladoDaBase;
	}
	
	public void setLadoDaBase(float ladoDaBase) {
		this.ladoDaBase = ladoDaBase;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public double getCalcArea(float ladoDaBase, float altura) {
		double areaDaBase=0,areaDoTriangulo=0, areaLateral=0;
		
		this.ladoDaBase = ladoDaBase;
		this.altura = altura;
		
		areaDaBase =  Math.pow(ladoDaBase, 2);
		areaDoTriangulo =  Math.pow(altura, 2) + Math.pow(((ladoDaBase)/2), 2);
		areaLateral =  4*(ladoDaBase*(Math.sqrt(areaDoTriangulo))/2);
		
		return areaDaBase + areaLateral;
	}
	
	public double getCalcVol(float ladoDaBase, float altura) {
		double areaDaBase=0;
		
		this.ladoDaBase = ladoDaBase;
		this.altura = altura;
		
		areaDaBase =  Math.pow(ladoDaBase, 2);
		
		return (areaDaBase*altura)/3;
		
	}

}
