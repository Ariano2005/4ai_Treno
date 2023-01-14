
/**
 * <b>classe treno</b>
 * <p>array di oggetti</p>
 * <UL>
 * <LI>nome
 * <LI>destinazione
 * <LI>vagoni massimi
 * <UL>
 * @author Ariano Venneri
 * versione 1
 */
public class Treno {
	/**
	 * nome = nome del treno
	 */
    private String nome, destinazione;
    private int numMaxVagoni;
    private Vagone[] vagoni;
	/**
	 * 
	 * @param nome
	 * @param destinazione
	 * @param numMaxVagoni
	 */
	public Treno(String nome, String destinazione, int numMaxVagoni) {
		super();
		this.nome = nome;
		this.destinazione = destinazione;
		this.numMaxVagoni = numMaxVagoni;
		vagoni=new Vagone[numMaxVagoni];
	}

public void setDestinazione(String destinazione) {
	this.destinazione = destinazione;
}
	public boolean addvagone(int pos, Vagone v) {
		
		vagoni[pos]=v;
		
		return true;
	}
	public boolean deleteVagone(int pos) {
	
		
		vagoni[pos]=null;
		
		return true;
	}
   /**
    * @return metodo che restituisce il treno completo
    */
	public String toString() {
		String s=" nome treno: "+nome+" \ndestinazione: "+destinazione+" \nnumMaxVagoni: "+numMaxVagoni;
		
		for(int i=0; i<vagoni.length; i++) {
			
			if(vagoni[i]!=null)
				s+=vagoni[i];
		}
		
		return s;
	}

	public static void main(String[] args) {
	   Treno t1=new Treno("freccia rossa", "Milano", 10);
	   
	   Vagone v1= new Vagone("prima", 20);
	   Vagone v2= new Vagone("seconda", 18);
	   
	   System.out.println(t1.addvagone(0, v1));
	   System.out.println(t1.addvagone(1, v2));
	   System.out.println(t1);
	   
   }
	
}