import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Palin {

    public static void main(String args[])
    {
        List<String> li=new ArrayList<String>();
        li.add("madam");
        li.add("palindrome");
        li.add("putin");
        li.add("computer");
        li.add("razar");
        li=pal(li);
        for(String i:li)
            System.out.println(i);
    }
    static List<String> pal(List<String> l1)
    {
        List<String> list2=new ArrayList<String>();
        for(String i:l1)
        {String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                list2.add(i);}
        return list2;
    }
    
}