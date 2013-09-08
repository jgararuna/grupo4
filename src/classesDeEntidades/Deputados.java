package classesDeEntidades;

public class Deputados {
	
	//atributs to our class
	private int idDoParlamentar;
	private String nomeCivilDoParlamentar;
	private String nomeDeTratamentoDoParlamentar;
	private String sexo;
	private String uf;
	private String partido;
	private String numeroDoGabinete;
	private String anexo;
	private String telefone;
	private String email;
	private int posicaoNoVetor;

	//constructor to our class
	public Deputados(int id, String nomeCivil, String nomeTratamento,
			String sexo, String uf, String partido, String numeroDoGabineto,
			String anexo, String telefone, String email, int posicao) {
		
		this.idDoParlamentar = id;
		this.nomeCivilDoParlamentar = nomeCivil;
		this.nomeDeTratamentoDoParlamentar = nomeTratamento;
		this.sexo = sexo;
		this.uf = uf;
		this.partido = partido;
		this.numeroDoGabinete = numeroDoGabinete;
		this.anexo = anexo;
		this.telefone = telefone;
		this.email = email;
		this.posicaoNoVetor = posicao;
	}

	//geters and setters
	public int getIdDoParlamentar() {
		return idDoParlamentar;
	}

	public void setIdDoParlamentar(int idDoParlamentar) {
		this.idDoParlamentar = idDoParlamentar;
	}

	public String getNomeCivilDoParlamentar() {
		return nomeCivilDoParlamentar;
	}

	public void setNomeCivilDoParlamentar(String nomeCivilDoParlamentar) {
		this.nomeCivilDoParlamentar = nomeCivilDoParlamentar;
	}

	public String getNomeDeTratamentoDoParlamentar() {
		return nomeDeTratamentoDoParlamentar;
	}

	public void setNomeDeTratamentoDoParlamentar(
			String nomeDeTratamentoDoParlamentar) {
		this.nomeDeTratamentoDoParlamentar = nomeDeTratamentoDoParlamentar;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getNumeroDoGabinete() {
		return numeroDoGabinete;
	}

	public void setNumeroDoGabinete(String numeroDoGabinete) {
		this.numeroDoGabinete = numeroDoGabinete;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	//and of the getters and setters
	
	

}
