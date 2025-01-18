package br.edu.ifce.ativ.sobrecarga;

public class Livro {
	private String genero;
	private String titulo;
	private int qntPaginas;
	
	
	Livro(String genero) {
		this.genero = genero;
		this.titulo = "Indefinido";
		this.qntPaginas = 0;
	}
		
	Livro(String genero, String titulo) {
		this.genero = genero;
		this.titulo = titulo;
		this.qntPaginas = 0;
	}
	
	Livro(String genero, String titulo, int qntPaginas) {
		this.genero = genero;
		this.titulo = titulo;
		this.qntPaginas = qntPaginas;
	}
	
	public void exibirInfo() {
        System.out.println("Genero: " + genero);
        System.out.println("Quantidade de páginas: " + qntPaginas);
        
    }
	
	public void exibirInfo(boolean usado) {
		System.out.println("titulo: " + titulo);
		if (usado) {
            System.out.println("O livro é usado ");
        } else {
            System.out.println("O livro é novo");
        }
    }
	
	public void exibirInfo(boolean usado, double preco) {
		System.out.println("Título: " + titulo);
		System.out.println("Preço: R$" + preco);
		if (usado) {
            System.out.println("O livro é usado ");
        } else {
            System.out.println("O livro é novo");
        }
    }
	
	public static void main(String[] args) {
        Livro livro1 = new Livro("Comédia");
        livro1.exibirInfo();
        
        System.out.println();

        
        Livro livro2 = new Livro("Literatura infantil", "O Pequeno Príncipe");
        livro2.exibirInfo();
        
        System.out.println();

      
        Livro livro3 = new Livro("Fantasia", "O Senhor dos Anéis: A Sociedade do Anel", 576);
        livro3.exibirInfo();
       
    }
	
	
    
	
	
}
