import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Text for txt file. This is a test for txt file format.");
        data.add("More testing for txt file.");
        Format file = new Format(data);
        //file.htmlText();
        //file.plainText();
        file.markdownText();

        int option = 0;
        switch (option){
            case 0:
            default:
                file.setFormat(new PlainTextFormat());
            case 1:
                file.setFormat(new MarkdownFormatText());
                break;
            case 2:
                file.setFormat(new HTMLTextFormat());
                break;
            case 3:
                file.setFormat(new JsonFormatText());
                break;
            case 4:
                file.setFormat(new XmlFormatText());
                break;
        }
        file.formatted();

    }
}