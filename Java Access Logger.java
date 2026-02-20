import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistradorAcesso {

    public static void main(String[] args) {
        registrarAcesso("C:/MinhaPasta");
    }

    public static void registrarAcesso(String pasta) {
        String usuario = System.getProperty("user.name");
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String registro = "Usuário: " + usuario +
                          " | Pasta: " + pasta +
                          " | Data/Hora: " + agora.format(formato) + "\n";

        try (FileWriter writer = new FileWriter("acessos.log", true)) {
            writer.write(registro);
            System.out.println("Acesso registrado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao registrar acesso.");
            e.printStackTrace();
        }
    }
}