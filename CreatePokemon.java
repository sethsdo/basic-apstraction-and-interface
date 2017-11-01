package com.codingdojo.pokemon;

public interface CreatePokemon {
	
	void createPokemon(String name, int health, String type);
	void attackPokemon(Pokemon pokemon);
	void pokemonInfo(Pokemon pokemon);
}
