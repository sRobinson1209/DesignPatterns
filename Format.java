import java.util.ArrayList;
import java.util.Random;

public class Format {


    private ArrayList<String> fileContent;
    private formatInterface format;

    public void setFormat(formatInterface format){
        this.format = format;
    }

    public Format() {
        fileContent = new ArrayList<>();
    }

    public void formatted(){
        format.format(fileContent);
    }
    public Format(ArrayList<String> data) {
        fileContent = data;
    }

    //1 make it plain text
    public void plainText() {
        for (int i = 0; i < fileContent.size(); i++) {
            System.out.println("<text=" + fileContent.get(i)+ ">");
        }
    }
    //3 format as markdown user story 3
    public void markdownText() {
        String[] options = {"**", "***", "<sub>", "~~", "_"};
        Random rand = new Random();
        System.out.println("#" + fileContent.get(0));
        for (int i = 1; i < fileContent.size(); i++) {
            int num = rand.nextInt(options.length);
            String option = options[num];
            System.out.println(option + fileContent.get(i) + option);
        }
    }

    //2 Html user story 2
    public void htmlText(){
        System.out.println("<html dir=\"ltr\" lang=\"en\">");
        System.out.println("<head>");

    }
}

