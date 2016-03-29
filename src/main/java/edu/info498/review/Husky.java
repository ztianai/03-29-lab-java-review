package edu.info498.review;

public class Husky extends Dog implements Huggable {

    public Husky(){
        //super(name, "Husky");
    }  

    public void pullSled(){


    }

    public void bark(){
        System.out.println(this+" says: barks like a Husky!");
    }

    public void hug(){
        System.out.println("A husky is squished in a great big hug.");

    }
}