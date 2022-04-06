package uteis;

public class Client {
	
	private String nf;
	private String dataE;
	private String dataP;
	private String uF;
	private String cnpj;
	private String valorPago;
	
	public Client(String nf, String dataE, String dataP, String uF, String cnpj, String valorPago){
		this.nf = nf;
		this.dataE = dataE;
		this.dataP = dataP;
		this.uF = uF;
		this.cnpj = cnpj;
		this.valorPago = valorPago;
	}
	
	public static Double iR(String valorPago) {
		Double taxa = 1.0;
		Double valorPago1 = Double.parseDouble(valorPago);
		Double resultado = (valorPago1/100)*taxa;
		return resultado;
	}
	
	public static Double inss(String valorPago) {
		Double taxa = 3.5;
		Double valorPago1 = Double.parseDouble(valorPago);
		Double resultado = (valorPago1/100)*taxa;
		return resultado;
	}
	
	public static Double piss(String valorPago) {
		Double taxa = 0.65;
		Double valorPago1 = Double.parseDouble(valorPago);
		Double resultado = (valorPago1/100)*taxa;
		return resultado;
	}
	
	public static Double cofins(String valorPago) {
		Double taxa = 3.0;
		Double valorPago1 = Double.parseDouble(valorPago);
		Double resultado = (valorPago1/100)*taxa;
		return resultado;
	}

	public String getNf() {
		return nf;
	}

	public void setNf(String nf) {
		this.nf = nf;
	}

	public String getDataE() {
		return dataE;
	}

	public void setDataE(String dataE) {
		this.dataE = dataE;
	}

	public String getDataP() {
		return dataP;
	}

	public void setDataP(String dataP) {
		this.dataP = dataP;
	}

	public String getuF() {
		return uF;
	}

	public void setuF(String uF) {
		this.uF = uF;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getValorPago() {
		return valorPago;
	}

	public void setValorPago(String valorPago) {
		this.valorPago = valorPago;
	}
}