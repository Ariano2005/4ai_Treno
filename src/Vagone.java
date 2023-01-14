/**
 * 
 * @author LENOVO
 *
 */
public class Vagone {
private String classe;
private int postiDisponibili, postiOccupati;

public Vagone(String classe, int postiDisponibili) {
	this.classe = classe;
	this.postiDisponibili = postiDisponibili;
}



	
public int getPostiDisponibili() {
	return postiDisponibili;
}




public void setPostiDisponibili(int postiDisponibili) {
	this.postiDisponibili = postiDisponibili;
}




public int getPostiOccupati() {
	return postiOccupati;
}




public void setPostiOccupati(int postiOccupati) {
	this.postiOccupati = postiOccupati;
}




public String toString() {
	return " \nclasse "+classe+" \npostiDisponibili "+postiDisponibili+" \npostiOccupati "+postiOccupati ;
}


    /**
     * metodo test di classe
     * @param args
     */
	public static void main(String[] args) {
	Vagone v1= new Vagone("prima", 20);
	Vagone v2= new Vagone("seconda", 18);
	System.out.println(v1);
	System.out.println(v2);
	}

}
