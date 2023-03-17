package principal;

import java.util.Scanner;

import entidades.*;

public class Principal {

	public static void main(String[] args) {
		int menu = 0;
		float calcAreaQuadr = 0, calcPeriQuadr = 0, calcAreaEsfera=0, calcVolEsfera=0, calcAreaCilind=0, calcVolCilind=0, calcAreaCone=0, calcVolCone=0, calcAreaPiram=0, calcVolPiram=0;;

		Scanner lerDado = new Scanner(System.in);

		while (true) {
			System.out.println("1 - area e perímetro do quadrado.");
			System.out.println("2 - area e volume da esfera.");
			System.out.println("3 - area e volume do cilindro.");
			System.out.println("4 - area e volume do cone.");
			System.out.println("5 - area e volume do piramide(quadrangular).");
			System.out.println("6 - sair");
			System.out.println("Escolha uma das opcoes: ");
			menu = lerDado.nextInt();

			switch (menu) {
			case 1:
				Quadrado quadrado = new Quadrado();

				System.out.println("Digite um lado do quadrado: ");
				quadrado.setLado(lerDado.nextFloat());

				calcAreaQuadr = quadrado.getCalcArea(quadrado.getLado());
				calcPeriQuadr = quadrado.getCalcPerimetro(quadrado.getLado());

				System.out.printf("area: %.2f\n" , calcAreaQuadr);
				System.out.printf("perimetro: %.2f\n" , calcPeriQuadr);
				break;

			case 2:
				Esfera esfera = new Esfera();
				
				System.out.println("Digite o raio da esfera: ");
				esfera.setRaio(lerDado.nextFloat());
				
				calcAreaEsfera = (float) esfera.getCalcArea(esfera.getRaio());
				calcVolEsfera = (float) esfera.getCalcVol(esfera.getRaio());
				
				System.out.printf("area: %.2f\n" , calcAreaEsfera);
				System.out.printf("volume: %.2f\n",calcVolEsfera);
				break;
				
			case 3:
				Cilindro cilindro = new Cilindro();
				
				System.out.println("Digite o raio do cilindro: ");
				cilindro.setRaio(lerDado.nextFloat());
				
				System.out.println("Digite a altura do cilindro: ");
				cilindro.setAltura(lerDado.nextFloat());
				
				calcAreaCilind = (float) cilindro.getCalcArea(cilindro.getRaio(), cilindro.getAltura());
				calcVolCilind = (float) cilindro.getCalcVol(cilindro.getRaio(), cilindro.getAltura());
				
				System.out.printf("area: %.2f\n",calcAreaCilind);
				System.out.printf("volume: %.2f\n", calcVolCilind);
				break;
				
			case 4:
				Cone cone = new Cone();
				
				System.out.println("Digite o raio do Cone: ");
				cone.setRaio(lerDado.nextFloat());
				
				System.out.println("Digite a altura do Cone: ");
				cone.setAltura(lerDado.nextFloat());
				
				calcAreaCone = (float) cone.getCalcArea(cone.getRaio(), cone.getAltura());
				calcVolCone = (float) cone.getCalcVol(cone.getRaio(),cone.getAltura());
				
				System.out.printf("area: %.2f\n", calcAreaCone);
				System.out.printf("volume: %.2f\n", calcVolCone);
				break;
				
			case 5:
				Piramide piramide = new Piramide();
				
				System.out.println("Digite um lado da base da piramide: ");
				piramide.setLadoDaBase(lerDado.nextFloat());
				
				System.out.println("Digite a altura da piramide: ");
				piramide.setAltura(lerDado.nextFloat());
				
				calcAreaPiram = (float) piramide.getCalcArea(piramide.getLadoDaBase(), piramide.getAltura());
				calcVolPiram = (float) piramide.getCalcVol(piramide.getLadoDaBase(), piramide.getAltura());
				
				System.out.printf("Area: %.2f\n", calcAreaPiram);
				System.out.printf("Volume: %.2f\n", calcVolPiram);
				break;
				
			case 6:
				System.out.println("Fim");
			}
			if (menu == 6) {
				break;
			}
		}
	lerDado.close();

	}

}
