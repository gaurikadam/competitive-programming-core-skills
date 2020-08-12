import java.util.Scanner;

class week1_4{
    public static void main(String[] args){
        Scanner pp = new Scanner(System.in);
        boolean ace = false;
        int total =0;
        int[] hand = new int[15];
        char suit = '0';
        for(int i=0;i<5;i++){
            String card = pp.next();
            if(i==0)
                suit = card.charAt(1);
            else if(suit != card.charAt(1)){
                System.out.println("NO");
                System.exit(0);
            }

            if(card.charAt(0) == 'A')
                ace = true;
            else if(card.charAt(0) == 'T')
                hand[10]++;
            else if(card.charAt(0) == 'J')
                hand[11]++;
            else if(card.charAt(0) == 'Q')
                hand[12]++;
            else if(card.charAt(0) == 'K')
                hand[13]++;
            else
                hand[card.charAt(0)-48]++;
        }
        int start =0;
        while(start<15){
            if(hand[start]==1)
                break;
            start++;
        }
        if(start>9){
            System.out.println("NO");
            System.exit(0);
        }
        else{
            if(start==10 && ace == true)
                hand[14] = 1;
            else if(start ==2 && ace ==true)
                hand[1] = 1;
            else if (ace ==true){
                System.out.println("NO");
                System.exit(0);
            }
            for(int i=start;i<start+5;i++)
                total = total + hand[start];
        }
        if(total == 5)
            System.out.println("YES");
        else
            System.out.println("NO");
        pp.close();
    }
}


// import java.util.*;
// class week1_4
// {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//          String arr[] = new String[5];
//         char ch[] = new char[5];
//         char suit[] = new char[5];
//         int num[] = new int[5];
//         for(int i=0;i<5;i++)
//         {   arr[i] = sc.next();
//             ch[i] = arr[i].charAt(0);
//             suit[i] = arr[i].charAt(1);
//             if(ch[i] == 'A')  {num[i] = 1; }
//             else if(ch[i] == 'T'){num[i] = 10;}
//             else if(ch[i] == 'J'){num[i] = 11;}
//             else if(ch[i] == 'Q'){num[i] = 12;}
//             else if(ch[i] == 'K'){num[i] = 13;}
//             else{num[i] = ch[i] - '0';}
//     //  
//         }
//         Arrays.sort(num);
//         int j ;

//         for ( j = 0; j < 5 - 1; ++j) {
//             char f = suit[j], s = suit[j + 1];
//             if (f != s) {
//                 System.out.println("1No");
//                 break;
//             }
//         }

//         int flag = 0;
//         if(j == 4)
//         {
//             if(num[0] == 1 && num[1] == 10 && num[2] == 11 && num[3] == 12 && num[4]== 13)
//             {
//                 System.out.println("2Yes");
//                 flag = 1;
//             }
//             else
//             {
//                for(int i =0;i<5;i++)
//                {
//                    if(num[i] != num[i-1] + 1)
//                    {
//                     System.out.println("3No");
//                     flag = 1;
//                     break;
//                    }
//                }
//             }

//         }
//         if(flag == 0)
//         {
//             System.out.println("4Yes");   
//         }

// }
// }

