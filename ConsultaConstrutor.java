package Exercicios;

import java.util.Date;

	public class ConsultaConstrutor {

	    public static void main(String[] args) {
	        
	        Date hoje = new Date(); 
	        
	        Consulta consulta1 = new Consulta(hoje);
	        Consulta consulta2 = new Consulta("Maria", "Dr. João");
	        Consulta consulta3 = new Consulta(hoje, "Carlos", "Dra. Ana");

	        System.out.println("Consulta 1 - Data: " + consulta1.getData());
	        System.out.println("Consulta 2 - Paciente: " + consulta2.getNomePcente() + " | Dentista: " + consulta2.getNomeDents());
	        System.out.println("Consulta 3 - Data: " + consulta3.getData() + " | Paciente: " + consulta3.getNomePcente() + " | Dentista: " + consulta3.getNomeDents());
	    }
	}




