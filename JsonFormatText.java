import java.util.ArrayList;

public class JsonFormatText implements formatInterface{
    public void format(ArrayList<String> data) {
        System.out.println("{");

        for(int i =0; i < data.size(); i++){
            System.out.println("[" + data.get(i)+ "]");
        }
        System.out.println("}");


    }
}
