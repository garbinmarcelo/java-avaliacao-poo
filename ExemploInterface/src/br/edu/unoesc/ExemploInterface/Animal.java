package br.edu.unoesc.ExemploInterface;

public class Animal implements IAnimal {
		
	private String som;

	public void setSom(String som) {
		this.som  = som;
	}

	@Override
	public String fazerBarulho() {
		return som;
	}

	@Override
	public String comer() {
		return "Nhack... nhack..";		
	}

	@Override
	public String dormir() {
		return	"ZZzzzz...";
	}
}
