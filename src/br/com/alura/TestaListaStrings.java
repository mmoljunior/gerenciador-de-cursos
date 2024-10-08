package br.com.alura;

import java.util.ArrayList;

public class TestaListaStrings {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Curso e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		for (String aula: aulas) {
			System.out.println("Aula: " + aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println(primeiraAula);
		
		aulas.forEach(aula -> {System.out.println("Aula: " + aula);});
	}
}
