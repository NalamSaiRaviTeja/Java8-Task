import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Str3 {


    public static void main(String args[]) {
        List<String> str = new ArrayList<String>();
        str.add("ramu");
        str.add("rama");
        str.add("abc");
        str.add("ana");
        str.add("all");
         str.add("allu");
        str=search(str);
        for(String i:str)
            System.out.println(i);
    }
    static List<String> search(List<String> l1)
    {
        return l1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
    }

}