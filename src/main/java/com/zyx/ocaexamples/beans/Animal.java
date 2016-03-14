package com.zyx.ocaexamples.beans;

import java.io.Serializable;
import java.util.Set;

public class Animal implements Serializable {
	
	static final long serialVersionUID = 3518483424950471686L;
	AnimalColor animalColor;
	Set<? extends Animal> children;
	
	public enum AnimalColor{
		BLACK, WHITE, BROWN, YELLOW
	}
	
	public AnimalColor getAnimalColor() {
		return animalColor;
	}
	public void setAnimalColor(AnimalColor animalColor) {
		this.animalColor = animalColor;
	}
	public Set<? extends Animal> getChildren() {
		return children;
	}
	public void setChildren(Set<? extends Animal> children) {
		this.children = children;
	}
	
}