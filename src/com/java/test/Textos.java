package com.java.test;

public class Textos {
	
	public static void main(String[] args) {
		
		String nome;
		nome = new String();
		nome = "Maçã";
		System.out.println(nome);
		
		String nome2 = new String("Maçã");
		System.out.println(nome2);
		
		String nome3 = "Maçã";
		System.out.println(nome3);
		
		// scape 
		
		String descricao = "Tipo gala \nA maça mais doce do mercado";
		System.out.println(descricao);
		
		descricao = "Tipo gala \tA maça mais doce do mercado";
		System.out.println(descricao);
		
		descricao = "Tipo gala: \"A maça mais doce do mercado\"";
		System.out.println(descricao);
		
		
		//concatenação de string
		
		String propaganda = nome + " " + descricao;
		System.out.println(propaganda);
		
		propaganda = nome.concat(" ").concat(descricao);
		System.out.println(propaganda);
		
		propaganda += "!";
		System.out.println(propaganda);
		
	}
	

}
