package aula4.parte7;

public class CD {
	
	private String nome;
	private String album;
	private String gravadora;
	private Integer ano;
	
	public CD() {
		
	}

	public CD(String nome, String album, String gravadora, Integer ano) {
		super();
		this.nome = nome;
		this.album = album;
		this.gravadora = gravadora;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	

}
