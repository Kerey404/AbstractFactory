package adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JSAdapter {
    public static String getBrandFromJS() {
        String brand = null;
        try {
            //берет данные с nodejs
            ProcessBuilder pb = new ProcessBuilder("node", "brandGenerator.js");
            pb.redirectErrorStream(true);
            Process process = pb.start();
            //читает консоль
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream())
            );
            brand = reader.readLine();
            process.waitFor();

        } catch (Exception e) {
            e.printStackTrace();
        }
        //если не взял данные
        return Math.random() > 0.5 ? "adidas" : "nike";

    }
}
