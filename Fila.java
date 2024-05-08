package Singleton;

public class Fila {

	private int Quantidade;
	private String Documento;
	
	//Variável que guarda a instância
	private static Fila Instancia;
	
	//Construtor privado
	private Fila(){
	}
	
	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.Quantidade = Quantidade;
	}

	public String getPapel() {
		return Papel;
	}

	public void setPapel(String papel) {
		this.Papel = Papel;
	}
	
	//Retorna a classe se a mesma já não existe
	public static Fila getInstance() {
		if (Instancia == null) {
			Instancia = new Fila();
		return Instancia;
	}
}
