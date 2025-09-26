package Exercicios;

public class AnimalConstrutor {
	
	public static void main(String[] args) {
        
        Animal animal1 = new Animal(1.5f);
        Animal animal2 = new Animal("Marrom");
        Animal animal3 = new Animal(2.3f, "Preto");

        System.out.println("Animal 1 - Tamanho: " + animal1.getTamanho());
        System.out.println("Animal 2 - Cor: " + animal2.getCor());
        System.out.println("Animal 3 - Tamanho: " + animal3.getTamanho() + " | Cor: " + animal3.getCor());
    }
}


