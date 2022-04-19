import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class main {
    // Main driver method
    public static void main(String[] args)
    throws IOException
    {
        agentDetail();
        // Assigning the content of the file
        String text
                = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Acceuil</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Liste des agents</h1>\n" +
                "    <p>Classé par ordre alphabétique</p>\n" +
                "    <ul>\n" +
                "        <li><a href=\"agentDetailsAfoley.html\">Anthony Foley</a></li>" +
                "        <li><a href=\"agentDetailsCberthier.html\">Corine Berthier</a></li>\n" +
                "        <li><a href=\"agentDetailsJmcclane.html\">John Mcclane</a></li>\n" +
                "        <li><a href=\"agentDetailsJrouletabille.html\">Joseph Rouletabille</a></li>\n" +
                "        <li><a href=\"agentDetailsJwest.html\">Jordan West</a></li>\n" +
                "        <li><a href=\"agentDetailsMwestriggs.html\">Martin Westriggs</a></li>\n" +
                "        <li><a href=\"agentDetailsSconnor.html\">Sarah Connor</a></li>\n" +
                "        <li><a href=\"agentDetailsSholmes.html\">Sherlock Holmes</a></li>\n" +
                "    </ul>\n" +
                "</body>\n" +
                "</html>";

        // Defining the file name of the file
        Path fileName = Path.of(
                "./test.html");

        // Writing into the file
        Files.writeString(fileName, text);

        // Reading the content of the file
        String file_content = Files.readString(fileName);

        // Printing the content inside the file
        System.out.println(file_content);
    }

    public static void agentDetail() throws IOException {
        String htmlAfoley = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Détails agent</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>" + "Anthony Foley" + "</h1>\n" +
                "    <img src=\"https://raw.githubusercontent.com/Hashrod/TPRE500/main/afoley.jpg?token=GHSAT0AAAAAABTWMSI2HKCAZYNMQRWXYJMKYS673XA\">\n" +
                "    <ul>\n" +
                "        <li>Mousqueton</li>\n" +
                "        <li>Gant d'intervention</li>\n" +
                "        <li>Ceinture de sécurité tactique</li>\n" +
                "        <li>Détecteur de métaux</li>\n" +
                "        <li>Brassard de sécurité</li>\n" +
                "        <li>Lampe torche</li>\n" +
                "        <li>Gilet par balle</li>\n" +
                "    </ul>\n" +
                "</body>\n" +
                "</html>";

        // Defining the file name of the file
        Path fileName = Path.of("agentDetailsAfoley.html");

        // Writing into the file
        Files.writeString(fileName, htmlAfoley);

        // Reading the content of the file
        String file_content = Files.readString(fileName);

        // Printing the content inside the file
        System.out.println(file_content);

    }
}
