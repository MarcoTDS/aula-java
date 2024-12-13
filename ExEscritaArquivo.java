import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExEscritaArquivo {
    public static void main(String[] args) throws Exception{
        String nomeArqSaida = "arqSaida.csv";

        BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(nomeArqSaida));

        String linha = "Produto;Preço;Estoque";

        arqGravacao.write(linha);
        arqGravacao.newLine();

        String nomeProduto = "Mouse";
        String preco = "10,00";
        String estoque = "60";
        linha = nomeProduto+";"+preco+";"+estoque;
        arqGravacao.write(linha);
        arqGravacao.newLine();

        nomeProduto = "PC gamer";
        preco = "8.998,00";
        estoque = "5";
        linha = nomeProduto+";"+preco+";"+estoque;
        arqGravacao.write(linha);
        arqGravacao.close();
    }
}
