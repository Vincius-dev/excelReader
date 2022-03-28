package uteis;

import java.io.IOException;

import uteis.LeitorExcel;

public class App {

	public static void main(String[] args) throws IOException {

		String excelPath = "./dados/ARQUIVO PARA LER.xlsx";
		String sheetName = "FupContasReceber-27";

		LeitorExcel excel = new LeitorExcel(excelPath, sheetName);
		
		int contagem = 0;
		int numeroColunas = excel.getRowCount();
		System.out.println(numeroColunas);

		Client[] clients = new Client[numeroColunas];
		
		while (contagem < numeroColunas) {
			
			String nf = excel.getCellData(contagem, 1);
			String dataE = excel.getCellData(contagem, 2);
			String dataP = excel.getCellData(contagem, 4);
			String uF = excel.getCellData(contagem, 6);
			String cnpj = excel.getCellData(contagem, 7);
			String valorPago = excel.getCellData(contagem, 13);
				
			clients[contagem] = new Client(nf, dataE, dataP, uF, cnpj, valorPago);
			System.out.println(contagem);
			System.out.println(clients[contagem].getCnpj());
			
			contagem++;
		}
		
		
	}

}
