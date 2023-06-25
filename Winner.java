import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Winner {
    public static void writeToy(Toy winnerToy) {
        String result_string =
                winnerToy.getId() + System.lineSeparator() +
                        winnerToy.getName() + System.lineSeparator() +
                        winnerToy.getQuantity() + System.lineSeparator() +
                        winnerToy.getWeight() + System.lineSeparator();


        try {
            File myTxt = new File(Vars.myFileName);
            FileWriter fr = new FileWriter(myTxt);
            BufferedWriter br = new BufferedWriter(fr);

            br.write(result_string);
            br.close();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
