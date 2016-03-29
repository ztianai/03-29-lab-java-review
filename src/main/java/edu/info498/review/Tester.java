package edu.info498.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();
        Dog[] pups = Dog.createPuppies(3);
        System.out.println(Arrays.toString(pups));
        Husky husky = new Husky();
        husky.bark();

        Dog v1 = new Husky();
        //Husky v2 = new Dog();
        Huggable v2 = new Husky();
        Huggable v3 = new TeddyBear();
        //Husky v4 = new TeddyBear();
        v1.bark();
        System.out.println();

        ArrayList<Huggable> hugList = new ArrayList<Huggable>();
        hugList.add(new Husky());
        hugList.add(new TeddyBear());

        for(Huggable thing : hugList) { //enhanced for loop ("foreach" loop)
            thing.hug();
        }
	}
}