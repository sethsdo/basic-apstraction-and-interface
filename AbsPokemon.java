package com.codingdojo.pokemon;

public abstract class AbsPokemon implements CreatePokemon {
	
	private String name;
	public int health;
	private String type;
	public static int count = 0;

	
	public void createPokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		this.count++;
	}
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth() - 10);
		System.out.print("Ouch that just took 10 health points!");
		
	}
}
