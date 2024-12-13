import java.io.BufferedReader;
import java.io.FileReader;

public class ExLeituraArquivo{

    public static void main(String[] args) throws Exception{

        String nomeArquivo = "ArquivoEntrada.csv";
        BufferedReader arqLeitura = new BufferedReader(new FileReader(nomeArquivo));
        String linha;

        while((linha = arqLeitura.readLine()) != null){
            System.out.println(linha+"\n");
        }
        arqLeitura.close();

    }
}
