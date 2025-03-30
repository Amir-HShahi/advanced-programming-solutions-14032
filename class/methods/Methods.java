public class Methods {

    public static void main(String[] args) {
        Methods methods = new Methods();
        // first
        methods.printMultiTable();

        // second
        int[] array = { 1, 2, 3 };
        System.out.println(methods.contains(array, 0));
        System.out.println(methods.contains(array, 3));

        // third
        System.out.println(methods.factorial(5));
    }

    public void printMultiTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int multi = i * j;
                System.out.printf("%3d ", multi);
            }
            System.out.println();
        }
    }

    public int contains(int[] array, int num) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
