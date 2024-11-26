import java.util.ArrayList;
import java.util.Random;

public class MarkdownFormatText implements formatInterface{
    public void format(ArrayList<String>data){
        String[] options = {"**", "***", "<sub>", "~~", "_"};
        Random rand = new Random();
        System.out.println("#" + data.get(0));
        for (int i = 1; i < data.size(); i++) {
            int num = rand.nextInt(options.length);
            String option = options[num];
            System.out.println(option + data.get(i) + option);
        }
    }
}
