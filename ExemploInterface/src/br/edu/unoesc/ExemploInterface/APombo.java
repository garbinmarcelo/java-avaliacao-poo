package br.edu.unoesc.ExemploInterface;

public class APombo {
	
	public void acoesAnimal(Animal animal) {
		System.out.println("Comendo... " + animal.comer());
		System.out.println("Dormindo... " + animal.dormir());
		System.out.println("Fazendo Barulho... " + animal.fazerBarulho());
	}

	public static void main(String[] args) {
		Animal pombo = new Animal();
		pombo.setSom("pruuuuu... pruuuu.. pruuu....");

		APombo acoespombo = new APombo();
		acoespombo.acoesAnimal(pombo);
	}
}
