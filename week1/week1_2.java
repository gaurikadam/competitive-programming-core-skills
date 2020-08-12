import java.util.ArrayList;
import java.util.Scanner;

// 
// Decompiled by Procyon v0.5.36
// 

class week1_2
{
    public static void main(final String[] array) {
        final Scanner scanner = new Scanner(System.in);
        final int nextInt = scanner.nextInt();
        final ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nextInt; ++i) {
            list.add(scanner.nextInt());
        }
        int x = list.get(0);
        int n = 0;
        int index = 0;
        for (int j = 0; j < nextInt - 1; ++j) {
            if (list.get(j + 1) >= x) {
                x = list.get(j + 1);
                index = j + 1;
            }
        }
        System.out.println(x);
        System.out.println(index);
        for (int k = 0; k < nextInt; ++k) {
            if (list.get(k) == x) {
                ++n;
            }
            if (n == 3) {
                index = k;
                break;
            }
        }
        System.out.println(index);
        list.remove(index);
        for (int l = 0; l < list.size(); ++l) {
            System.out.println(list.get(l));
        }
    }
}