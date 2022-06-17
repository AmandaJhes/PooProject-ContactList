package ContactList;

import java.util.ArrayList;

public class Contact {
	
	private String name;
	private String number;
	private String familiaridade;
	
	public Contact (String name, String number, String familiaridade) {
		this.name = name;
		this.number = number;
		this.familiaridade = familiaridade;
	}
	
	@Override
	public String toString(){
		return "\nNome = " + this.name +
				"\nNumero = " + this.number +
				"\nParentesco = " + this.familiaridade;
	}
	
	public String getName() {
		return this.name;
	}

}
