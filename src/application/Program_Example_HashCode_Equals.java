package application;

import entities.Client_HashCode_Equals;

public class Program_Example_HashCode_Equals {

	public static void main(String[] args) {
		
		Client_HashCode_Equals client1 = new Client_HashCode_Equals("Maria", "mariaalice@gmail.com");
		Client_HashCode_Equals client2 = new Client_HashCode_Equals("Maria123", "mariaalice@gmail.com");
		
		String s1 = "Rodrigo";
		String s2 = "Rodrigo";
		
		String s3 = new String("test");
		String s4 = new String("test");
		
		System.out.println(client1.hashCode());
		System.out.println(client2.hashCode());
		System.out.println(client1.equals(client2));
		System.out.println(client1 == client2); // referencia na memoria
		System.out.println(s1 == s2); // expressao literal resultado e true (tratamento especial)
		System.out.println(s3 == s4); // instanciando objerto nao tem tratamento especial
	
	}

}
