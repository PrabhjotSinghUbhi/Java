package DataStructuresAlgorithms;

public class factorial {
    public static void main(String[] args) {
        int n = 3;
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        System.out.println(fac);
    }
}