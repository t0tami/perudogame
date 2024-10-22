package game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PerudoGameMenu {
    private static final String RULES_FILE = "C:\\Users\\Edemskaya.as\\Downloads\\Cubes-master\\Cubes-master\\src\\main\\java\\game\\rule.txt";

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("1. Начать игру");
                System.out.println("2. Правила игры");
                System.out.println("3. Выйти");
                System.out.print("Выберите действие: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        GameInterface gameInterface = new GameInterface();
                        gameInterface.startGame();
                        break;
                    case 2:
                        showRules();
                        break;
                    case 3:
                        System.out.println("До свидания!");
                        System.exit(0);
                    default:
                        System.out.println("Некорректный выбор.");
                }
            }
        }
    private static void showRules() {
        try (BufferedReader reader = new BufferedReader(new FileReader(RULES_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла правил: " + e.getMessage());
        }


    }
}
