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
                "./index.html");

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
                "        <li>Kit</li>\n" +
                "        <li>talky</li>\n" +
                "        <li>Menottes</li>\n" +
                "    </ul>\n" +
                "</body>\n" +
                "</html>";

        String htmlCberthier = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Détails agent</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>" + "Corine Berthier" + "</h1>\n" +
                "    <img src=\"https://raw.githubusercontent.com/Hashrod/TPRE500/main/cberthier.jpg?token=GHSAT0AAAAAABTWMSI2Z7NOEVY3B5DZRZSKYS7EAOQ\">\n" +
                "    <ul>\n" +
                "        <li>Kit</li>\n" +
                "        <li>Lampe</li>\n" +
                "        <li>Lacrymo</li>\n" +
                "    </ul>\n" +
                "</body>\n" +
                "</html>";

        String htmlJmacclane = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Détails agent</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>" + "John McClane" + "</h1>\n" +
                "    <img src=\"https://raw.githubusercontent.com/Hashrod/TPRE500/main/jmacclane.jpg?token=GHSAT0AAAAAABTWMSI35B745G46YEAZILSGYS7EBDQ\">\n" +
                "    <ul>\n" +
                "        <li>Lacrymo</li>\n" +
                "        <li>Taser</li>\n" +
                "        <li>Gants</li>\n" +
                "    </ul>\n" +
                "</body>\n" +
                "</html>";

        String htmlJrouletabille = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Détails agent</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>" + "Joseph Rouletabille" + "</h1>\n" +
                "    <img src=\"https://raw.githubusercontent.com/Hashrod/TPRE500/main/jrouletabille.jpg?token=GHSAT0AAAAAABTWMSI2Y2H74533QRJSPZPIYS7ECUQ\">\n" +
                "    <ul>\n" +
                "        <li>Mousqueton</li>\n" +
                "        <li>Brassard</li>\n" +
                "        <li>Kit</li>\n" +
                "    </ul>\n" +
                "</body>\n" +
                "</html>";

        String htmlJwest = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Détails agent</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>" + "Jordan West" + "</h1>\n" +
                "    <img src=\"https://raw.githubusercontent.com/Hashrod/TPRE500/main/jwest.jpg?token=GHSAT0AAAAAABTWMSI24TWV4P4YCCAGQU2YYS7EC6Q\">\n" +
                "    <ul>\n" +
                "        <li>Kit</li>\n" +
                "        <li>Taser</li>\n" +
                "        <li>Gants</li>\n" +
                "    </ul>\n" +
                "</body>\n" +
                "</html>";

        String htmlMriggs = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Détails agent</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>" + "Martin Riggs" + "</h1>\n" +
                "    <img src=\"https://raw.githubusercontent.com/Hashrod/TPRE500/main/mriggs.jpg?token=GHSAT0AAAAAABTWMSI2YSH62B6EL23YEZK6YS7EDXA\">\n" +
                "    <ul>\n" +
                "        <li>Lacrymo</li>\n" +
                "        <li>Cyno</li>\n" +
                "        <li>Gants</li>\n" +
                "    </ul>\n" +
                "</body>\n" +
                "</html>";

        String htmlSconner = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Détails agent</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>" + "Sarah Connor" + "</h1>\n" +
                "    <img src=\"https://raw.githubusercontent.com/Hashrod/TPRE500/main/sconnor.jpg?token=GHSAT0AAAAAABTWMSI2NPE5UTOQIUGCYMG6YS7EEAQ\">\n" +
                "    <ul>\n" +
                "        <li>Gants</li>\n" +
                "        <li>Talky</li>\n" +
                "        <li>Lampe</li>\n" +
                "    </ul>\n" +
                "</body>\n" +
                "</html>";

        String htmlSholmes = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Détails agent</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>" + "Sherlock Holmes" + "</h1>\n" +
                "    <img src=\"https://raw.githubusercontent.com/Hashrod/TPRE500/main/sholmes.jpg?token=GHSAT0AAAAAABTWMSI2RKD5VSPYA5FEXA3KYS7EEKQ\">\n" +
                "    <ul>\n" +
                "        <li>Lacrymo</li>\n" +
                "        <li>Taser</li>\n" +
                "        <li>Menottes</li>\n" +
                "    </ul>\n" +
                "</body>\n" +
                "</html>";

        // Defining the file name of the file
        Path fileNameAfoley = Path.of("agentDetailsAfoley.html");
        Path fileNameCberthier = Path.of("agentDetailsCberthier.html");
        Path fileNameJmacclane = Path.of("agentDetailsJmacclane.html");
        Path fileNameJrouletabille = Path.of("agentDetailsJrouletabille.html");
        Path fileNameJwest = Path.of("agentDetailsJwest.html");
        Path fileNameMriggs = Path.of("agentDetailsMriggs.html");
        Path fileNameSconnor = Path.of("agentDetailsSconnor.html");
        Path fileNameSholmes = Path.of("agentDetailsSholmes.html");

        // Writing into the file
        Files.writeString(fileNameAfoley, htmlAfoley);
        Files.writeString(fileNameCberthier, htmlCberthier);
        Files.writeString(fileNameJmacclane, htmlJmacclane);
        Files.writeString(fileNameJrouletabille, htmlJrouletabille);
        Files.writeString(fileNameJwest, htmlJwest);
        Files.writeString(fileNameMriggs, htmlMriggs);
        Files.writeString(fileNameSconnor, htmlSconner);
        Files.writeString(fileNameSholmes, htmlSholmes);


        // Reading the content of the file
        //String file_content = Files.readString(fileNameAfoley);

        // Printing the content inside the file
        //System.out.println(file_content);

    }
}
