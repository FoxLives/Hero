package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String text = null;
        try {
            text = reader.readLine();
        } catch (IOException e) {
            System.out.println("Can't write message: I/O Exception. Try later!");
        }
        return text;
    }

    public static int readInt() {
        String text = readString();
        return Integer.parseInt(text.trim());
    }
}
