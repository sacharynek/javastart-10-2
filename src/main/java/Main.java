
public class Main {

    public static void main(String[] args) {
        int[] tab = createTab(10);

        printTab(tab);

        int a = 4;

        reversePartially(tab, a);

        printTab(tab);

    }

    private static int[] createTab(int length) {
        int[] tab = new int[length];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i + 1;
        }
        return tab;
    }

    private static void printTab(int[] tab) {
        for (int liczba : tab) {
            System.out.print(liczba + " ");

        }
        System.out.println();
    }

    private static void reversePartially(int[] tab, int a) {
        for (int i = 0; i < a / 2; i++) {
            a--;
            int temp = tab[a];
            tab[a] = tab[i];
            tab[i] = temp;
        }
    }
}
