package aula4.parte3;

public class NaiveDate implements Cloneable{
	private int dia, mes, ano;

	public NaiveDate(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return dia +"/"+mes+"/"+ano;
	}
	
	public static void main(String[] args) {
		NaiveDate date  = new NaiveDate(23, 07, 1990);
		System.out.println("Imprimindo data:");
		System.out.println(date);
		
		try {
			NaiveDate cloneDate = (NaiveDate) date.clone();
			System.out.println("Imprimindo data:");
			System.out.println(cloneDate);
		} catch (CloneNotSupportedException e) {
			System.out.println("Erro durante o processo de clonagem " + e.getMessage());
		}
	}
	
	

}
