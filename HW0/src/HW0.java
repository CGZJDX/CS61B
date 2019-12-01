public class HW0 {
    public static void windowPosSum(int[] a, int n) {
        for(int i = 0; i < a.length - 1; i ++){
            if(a[i] < 0)
                continue;
            for(int j = i + 1; j <= i + n; j ++) {
                if(j > a.length - 1)
                    break;
                a[i] += a[j];
            }
        }
    }


    public static void main(String[] args) {
        //int[] a = {1, 2, -3, 4, 5, 4};    // Should print 4, 8, -3, 13, 9, 4
        int[] a = {1, -1, -1, 10, 5, -1}; // Should print -1, -1, -1, 14, 4, -1
        int n = 2;
        windowPosSum(a, n);
        //System.out.println(java.util.Arrays.toString(a));
        String[] ss = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
        for (String s : ss) {
            for (int j = 0; j < 3; j += 1) {
                System.out.println(s);
                if (s.contains("horse")) {
                    break;
                }
            }
        }
    }
}
