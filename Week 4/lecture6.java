public class lecture6 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        multiples(1, 12);
    }

    public static void multiples(int x, int y) {
        int count3 = 0;
        int count5 = 0;
        while (y >= x) {
            if (y % 3 != 0) {
                count3++;
            }
            if (y % 5 == 0) {
                count5++;
            }
            y--;
        }
        System.out.println(count3 + " " + count5);
    }
}