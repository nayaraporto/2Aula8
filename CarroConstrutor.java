package Exercicios;

public class CarroConstrutor {
	
	    public static void main(String[] args) {
	        
	        Carro carro1 = new Carro("Ferrari");
	        Carro carro2 = new Carro(987654);
	        Carro carro3 = new Carro("Porsche", 123456);

	        System.out.println("Carro 1 - Placa: " + carro1.getPlaca());
	        System.out.println("Carro 2 - Chassi: " + carro2.getNumChassi());
	        System.out.println("Carro 3 - Placa: " + carro3.getPlaca() + " | Chassi: " + carro3.getNumChassi());
	    }
	}

	
	
	


