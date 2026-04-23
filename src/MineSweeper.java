import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private String[][] mineMap;
    private String[][] playerMap;
    private int rows;
    private int cols;
    private int mineCount;
    private int openedCount;
    private Scanner input;

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.mineCount = (rows * cols) / 4;
        this.openedCount = 0;
        this.mineMap = new String[rows][cols];
        this.playerMap = new String[rows][cols];
        this.input = new Scanner(System.in);
        initMaps();
        placeMines();
    }

    private void initMaps() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                mineMap[i][j] = "-";
                playerMap[i][j] = "-";
            }
    }

    private void placeMines() {
        Random rand = new Random();
        int placed = 0;
        while (placed < mineCount) {
            int r = rand.nextInt(rows);
            int c = rand.nextInt(cols);
            if (mineMap[r][c].equals("-")) {
                mineMap[r][c] = "*";
                placed++;
            }
        }
    }

    private void printMap(String[][] map) {
        for (String[] row : map)
            System.out.println(String.join(" ", row));
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (dr == 0 && dc == 0) continue;
                int nr = row + dr;
                int nc = col + dc;
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && mineMap[nr][nc].equals("*"))
                    count++;
            }
        }
        return count;
    }

    private int[] getValidCoordinates() {
        while (true) {
            System.out.print("Satır Giriniz : ");
            int row = input.nextInt();
            System.out.print("Sütun Giriniz : ");
            int col = input.nextInt();

            if (row < 0 || row >= rows || col < 0 || col >= cols) {
                System.out.println("Geçersiz koordinat! Lütfen tekrar giriniz.");
                continue;
            }

            if (!playerMap[row][col].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }

            return new int[]{row, col};
        }
    }

    public void play() {
        System.out.println("Mayınların Konumu");
        printMap(mineMap);
        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        printMap(playerMap);

        while (true) {
            int[] coords = getValidCoordinates();
            int row = coords[0];
            int col = coords[1];

            if (mineMap[row][col].equals("*")) {
                System.out.println("Game Over!!");
                System.out.println("===========================");
                break;
            }

            playerMap[row][col] = String.valueOf(countAdjacentMines(row, col));
            openedCount++;

            if (openedCount == (rows * cols) - mineCount) {
                System.out.println("Oyunu Kazandınız !");
                printMap(playerMap);
                System.out.println("===========================");
                break;
            }

            System.out.println("===========================");
            printMap(playerMap);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, cols;

        while (true) {
            System.out.print("Satır sayısını giriniz: ");
            rows = scanner.nextInt();
            System.out.print("Sütun sayısını giriniz: ");
            cols = scanner.nextInt();
            if (rows >= 2 && cols >= 2)
                break;
            System.out.println("Matris boyutu en az 2x2 olmalıdır. Tekrar giriniz.");
        }

        MineSweeper game = new MineSweeper(rows, cols);
        game.play();
    }
}
