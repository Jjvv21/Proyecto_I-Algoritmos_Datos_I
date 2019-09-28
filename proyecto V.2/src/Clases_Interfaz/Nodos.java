package Clases_Interfaz;

public class Nodos {
	public int dato; 
	Nodos siguiente,anterior; 
	
	// CONSTRUCTOR PARA CUANDO YA HAY NODOS
	
	public Nodos(int el, Nodos s, Nodos a) {
		dato=el;
		siguiente = s;
		anterior = a; 
		
		
	}
	// CUANDO AUN NO HAY NODOS 
	public Nodos(int el) {
		this(el,null,null);
		
	}

}



