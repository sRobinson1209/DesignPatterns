import java.util.ArrayList;

public class PlainTextFormat implements formatInterface{

    public void format (ArrayList<String>data) {
        for (int i = 0; i < data.size(); i++) {
            System.out.println("<text=" + data.get(i)+ ">");
        }
    }
}
