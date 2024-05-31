import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileFormatter {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileFormatter <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            int indentLevel = 0;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(",", ", ")
                        .replaceAll("\\(", " ( ")
                        .replaceAll("\\)", " ) ")
                        .replaceAll("\\[", "[ ")
                        .replaceAll("\\]", " ]")
                        .replaceAll("(?<=[^ ])(?=[=<>+*/&|])|(?<=[=<>+*/&|])(?=[^ ])", " ")
                        .replaceAll("\\{", " {\n")
                        .replaceAll("\\}", "\n} ")
                        .replaceAll(";", ";\n");

                line = line.replaceAll(" +", " ").replaceAll("^ ", "");

                if (line.contains("{")) {
                    line = line.replaceAll("\\{", "\n{\n");
                    indentLevel++;
                }
                if (line.contains("}")) {
                    indentLevel--;
                    line = line.replaceAll("\\}", "\n}\n");
                }

                StringBuilder indentedLine = new StringBuilder();
                for (int i = 0; i < indentLevel; i++) {
                    indentedLine.append("    ");
                }
                indentedLine.append(line.trim());

                writer.write(indentedLine.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
