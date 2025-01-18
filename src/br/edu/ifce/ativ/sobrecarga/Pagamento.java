package br.edu.ifce.ativ.sobrecarga;

	public class Pagamento {
		 double valorTotal;
		
		
	    public double calcularTotal(int numeroParcelas) {
	        double juros = 0.03; 
	        double totalComJuros = valorTotal * (1 + juros * numeroParcelas);
	        return Math.round(totalComJuros * 100.0) / 100.0;
	    }

	  
	    public double calcularTotal(double desconto) {
	        double totalComDesconto = valorTotal * (1 - desconto / 100);
	        return Math.round(totalComDesconto * 100.0) / 100.0;
	    }

	   
	    public double calcularTotal() {
	        return valorTotal;
	    }

	   
    }

