import java.util.HashMap;
import java.util.Scanner;public class Frequency
{
    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
        String S=Sc.nextLine();
        HashMap<Character,Integer> A=new HashMap<>();
        char []Str_arr=S.toLowerCase().toCharArray();
        for(char c:Str_arr)
        {
            if(A.containsKey(c))
            {
                A.put(c,A.get(c)+1);
            }
            else {
                A.put(c,1);
            }
        }
        A.entrySet().stream().forEach(System.out::println);
    }
}
