package com.codingdojo.pokemon;

class Pokemon implements CreatePokemon {
	private String name;
	private int health;
	private String type;
	public static int count = 0;
	
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		this.count++;
	}
	
	public void createPokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
	}
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.health -= 10;
		System.out.print("Ouch that just took 10 health points!");
		
	}
	
	public void pokemonInfo(Pokemon pokemon) {
		System.out.println(pokemon.name);
		System.out.println(pokemon.health);
		System.out.println(pokemon.type);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
