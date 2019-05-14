package datastructure;

public class TwoDimensionalArrayDemo {

    /**
     * @author Jahidul Islam
     * Construct Two Dimensional array reference variable and
     * store all the data of testData.xlsx from data directory
     * You do not have to read xlsx file only the similar data need to be
     * stored in 2D Array reference variable
     * Later get those value by index and also by using any iteration process
     */
    public static void main(String[] args) {
        String[][] names = {{"Alma", "Salma", "Abdel"}, {"Jabin", "Sultana", "El"}};
            for (int x = 0; x == 0; x++) {
                for (int y = 0; y < names[x].length; y++) {
                    String name = names[x][y] + " " + names[x + 1][y];
                    System.out.println(name);
                }
            }


        }

}
