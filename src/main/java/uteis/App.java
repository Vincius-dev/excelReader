package uteis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
			String valorPago = (excel.getCellData(contagem, 13)).replace(",", ".");
				
			clients[contagem] = new Client(nf, dataE, dataP, uF, cnpj, valorPago);
			contagem++;
		}
				
		File file1 = new File("out.txt");
		FileWriter fw = new FileWriter(file1);
		PrintWriter pw = new PrintWriter(fw);
		
		int i = 1;
		while (i < numeroColunas) {
			pw.println("CNPJ: " + clients[i].getCnpj() + " | Nota Fiscal: " + clients[i].getNf() + " | Data Emissao: " + clients[i].getDataE() + " | Data Pagamento: " + clients[i].getDataP() + " | UF: " + clients[i].getuF());
			pw.println("IR: " + clients[i].iR(clients[i].getValorPago()) + " | INSS: " + clients[i].inss(clients[i].getValorPago()) + " | PISS: " + clients[i].piss(clients[i].getValorPago()) + " | COFINS: " + clients[i].cofins(clients[i].getValorPago()));
			pw.println(" ");
			
			i++;
		}
		
		pw.close();
	}

}
