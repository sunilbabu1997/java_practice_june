package Strings;

public class string_bufferclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Anshul";
        name.concat("chauhan"); // This won't modify 'name' as Strings are immutable
        System.out.println("Using concat() method: " + name); // Still prints "Anshul"

        // Using StringBuffer for mutability
        StringBuffer name1 = new StringBuffer("Anshul");
        name1.append("chauhan");
        System.out.println("Using StringBuffer append() method: " + name1);

        // Demonstrating other StringBuffer methods
        name1.insert(6, " "); // Insert space after "Anshul"
        System.out.println("After insert(): " + name1);

        name1.replace(0, 6, "Mr."); // Replace "Anshul" with "Mr."
        System.out.println("After replace(): " + name1);

        name1.delete(0, 4); // Delete "Mr. "
        System.out.println("After delete(): " + name1);

        name1.reverse(); // Reverse the string
        System.out.println("After reverse(): " + name1);

	}

}
