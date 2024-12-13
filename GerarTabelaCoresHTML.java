import java.io.BufferedWriter;
import java.io.FileWriter;

public class GerarTabelaCoresHTML {

    public static void main(String[] args) throws Exception {
        String caminhoArquivo = "cores.html";
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            writer.write("<html>");
            writer.newLine();
            writer.write("<head><title>Tabela de Cores HTML</title></head>");
            writer.newLine();
            writer.write("<body>");
            writer.newLine();
            writer.write("<table border='1'>");
            writer.newLine();
            
            writer.write("<tr><th width='200' align='center'>Cor</th>");
            writer.newLine();
            writer.write("<th width='200' align='center'>Código Hexadecimal</th></tr>");
            writer.newLine();

            String[] hexa = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
            
            for (int r = 0; r <hexa.length; r++) { 
                for (int g = 0; g <hexa.length; g++) { 
                    for (int b = 0; b <hexa.length; b++) {
                        String corHex = "#"+hexa[r]+"0"+hexa[g]+"0"+hexa[b]+"0";
                        
                        writer.write("<tr>");
                        writer.newLine();
                        writer.write("<td bgcolor='" + corHex + "'>&nbsp;</td>");
                        writer.newLine();
                        writer.write("<td align='center'>" + corHex + "</td>"); 
                        writer.newLine();
                        writer.write("</tr>");
                        writer.newLine();
                    }
                }
            }
    
            writer.write("</table>");
            writer.newLine();
            writer.write("</body>");
            writer.newLine();
            writer.write("</html>");
            writer.newLine();

            System.out.println("Arquivo HTML gerado com sucesso em: " + caminhoArquivo);
        }
    }
}
