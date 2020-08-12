import java.util.*;
class week1_3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int len = str.length();
        int nine = 0;

        for(int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == '9')
            {
                nine++;
            }
            
        }
        if(nine != len )
        {
          System.out.println(len);
        }
        else
        {
            System.out.println(len + 1);
        }
    }
}