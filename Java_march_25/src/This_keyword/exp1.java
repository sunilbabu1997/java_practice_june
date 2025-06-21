package This_keyword;

public class exp1 {
	String name;

    // Constructor
    public exp1(String name) {
        this.name = name; // "this.name" refers to the instance variable
    }

    public void showName() {
        System.out.println("My name is: " + this.name);
    }

}

//There’s a variable name outside and also in the constructor.

//this.name means: "the name that belongs to this object."

//Without this, Java would get confused.