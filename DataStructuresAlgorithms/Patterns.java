package DataStructuresAlgorithms;

public class Patterns {
    public static void main(String[] args) {
/*
        marioRectangle(5);
        trianglePattern(5);
        inverseTrianglePattern(5);
        floydTrianglePattern(10);
*/
        hollowDiamondPattern(5);
    }


    public static void hollowDiamondPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
//            for (int j = 0; j < n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
        }
    }

    public static void floydTrianglePattern(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void marioRectangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void trianglePattern(int n) {
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void inverseTrianglePattern(int n) {
        for (int i = 0; i < n+1; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" # ");
            }
            System.out.println();
        }
    }

}
