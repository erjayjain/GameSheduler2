package com.cg.beans;

import java.util.Set;

public class Day {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Game> getGame() {
		return game;
	}
	public void setGame(Set<Game> game) {
		this.game = game;
	}
	private Set<Game> game;
}
