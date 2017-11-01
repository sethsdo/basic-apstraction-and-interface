package com.codingdojo.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pokemon pokemon1 = new Pokemon("Walt", 10, "Something");
		Pokemon pokemon2 = new Pokemon("Jack", 9, "A who");
		pokemon1.attackPokemon(pokemon2);
		pokemon1.pokemonInfo(pokemon1);
		pokemon2.pokemonInfo(pokemon2);
		System.out.println(pokemon1.count);
		
		Pokedex newPokedex = new Pokedex();
		newPokedex.pokemonInfo(pokemon1);
		

	}

}
