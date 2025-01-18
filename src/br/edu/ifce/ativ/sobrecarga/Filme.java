package br.edu.ifce.ativ.sobrecarga;

public class Filme {
	private String genero;
	private String titulo;
	private int minDuracao;
	
	Filme() {
		genero = "Indefinido";
		titulo = "Indefinido";
		minDuracao = 0;			
	}
	
	Filme(String genero, String titulo) {
		this.genero = genero ;
		this.titulo = titulo;
		minDuracao = 0;			
	}
	
	Filme(String genero, String titulo, int minDuracao) {
		this.genero = genero ;
		this.titulo = titulo;
		this.minDuracao = minDuracao;			
	}
	public void exibirInfo() {
		System.out.println("Gênero: " + genero + ", Título: " + titulo + ", Minutos de duração: " + minDuracao);
	}
	
	public void exibirInfo(int idade) {
		int faixaEtaria = 16;
		System.out.println("Gênero: " + genero + ", Título: " + titulo + ", Minutos de duração: " + minDuracao);
		if (idade >= faixaEtaria){
			System.out.println("Você tem idade para assitir o filme");
			}
		else {
				System.out.println("Você não tem idade para assitir o filme");
			}
		}
		
	public void exibirInfo(int idade, int anoLancamento) {
		int idadeFilme = 2025 -  anoLancamento;
		int faixaEtaria = 16;
		
		System.out.println("Gênero: " + genero + ", Título: " + titulo + ", Minutos de duração: " + minDuracao);
		System.out.println("O filme foi lançado há " + idadeFilme + " anos.");
		
		if (idade >= faixaEtaria){
			System.out.println("Você tem idade para assitir o filme");	
			}	
		else {
			System.out.println("Você não tem idade para assitir o filme");
		}
	}
	
	
	 public static void main(String[] args) {
	        Filme f1 = new Filme();
	        Filme f2 = new Filme("Horror", "Invocação do mal");
	        Filme f3 = new Filme("Ficção Científica", "Perdido em Marte", 151);
	        
	
	
	
	 }
	
}


