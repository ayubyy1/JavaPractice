package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// LinkedHashSet - in order that they were entered
		// HashSet - complete random order
		// TreeSet - rearranges to natural order
		// 1. Define the Collection
		Set<String> animals = new TreeSet<String>();
		
		// 2. Adding Elements
		animals.add("dog");
		animals.add("tiger");
		animals.add("horse");
		animals.add("cow");
		animals.add("snake");
		
		//Notice random order when printing out
		//System.out.println(animals.size() + " " + animals);

		animals.add("tiger");
		animals.add("goose");
		animals.add("dog");
		
		System.out.println(animals.size() + " " + animals);
		
		// Create a new set that we can use for comparison
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("chicken");
		farmAnimals.add("cow");
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		farmAnimals.add("sheep");
		System.out.println(farmAnimals.size() + " " + farmAnimals);

		// What is the INTERSECTION between animals and farmAnimals
		// 1. Copy existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		System.out.println(intersectionSet);
		// 2. Retain only the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intersection is: " + intersectionSet);
		
		//What is the UNION(Both animals and farmAnimals)
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union is: " + unionSet);
		
		//What is the DIFFERENCE(animals but not farm animals)
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The difference is: " + differenceSet);
	}

}
