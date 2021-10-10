package com.turntabl.project.generics;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {

	private List<T> bag = new ArrayList<>();

	public Bag() {
	}
	
	public void add(T element) {
		bag.add(element);
	}
	
	public T remove(T element) {
		boolean elementWasFound = false;
		for (int i = 0; i < bag.size(); i++) {
			if (bag.get(i).equals(element)) {
				bag.remove(i);
				elementWasFound = true;
			}			
		}
		
		return elementWasFound ? element : null;
	}
	
	public void clear() {
		if (bag.isEmpty()) {
			System.out.println("No elements in bag to empty!");
			return;
		}
		
		bag.removeAll(bag);
		System.out.println("Successfully emptied bags!");
	}
	
	public List<T> getBag() {
		return bag;
	}

	public void setBag(List<T> bag) {
		this.bag = bag;
	}

}
