/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herley.periksa.pkg8.tetangga.matrix;

/**
 *
 * @author herley
 */
public class Periksa8TetanggaMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Inisialisasi Array.
         */
        final int[][] array = new int[3][3];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;

        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;

        final DelapanTetangga delapanTetangga = new DelapanTetangga();

        // loop untuk baris matrix.
        for (int i = 0; i < array.length; i++) {
            int[] is = array[i];
            //loop untuk kolom matrix.
            for (int j = 0; j < is.length; j++) {
                int k = is[j];
                System.out.println("Angka : " + k);
                System.out.println("Jumlah Tetangga : " + delapanTetangga.periksaTetangga(i, j, 3, 3, array).size());
                System.out.println("Tetangga : " + delapanTetangga.periksaTetangga(i, j, 3, 3, array));
                System.out.println();
            }
        }
    }
}
