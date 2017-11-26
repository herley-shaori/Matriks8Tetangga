/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herley.periksa.pkg8.tetangga.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author herley
 */
public class DelapanTetangga {
    /**
     * Memeriksa tetangga pada matriks 2 Dimensi. Indeks dimulai dari 0.
     * @param i
     * @param j
     * @param jumlahBaris
     * @param jumlahKolom
     * @param data
     * @return 
     */
    public List periksaTetangga(int i, int j, int jumlahBaris, int jumlahKolom, int[][] data){
        if ((i < jumlahBaris) && (j < jumlahKolom)) {
            ArrayList<Integer> neighbors = new ArrayList<>();
            if (dalamJangkauan(i, j, jumlahBaris, jumlahKolom)) {

                if (dalamJangkauan(i + 1, j, jumlahBaris, jumlahKolom)) {
                    neighbors.add(data[i + 1][j]);
                }
                if (dalamJangkauan(i - 1, j, jumlahBaris, jumlahKolom)) {
                    neighbors.add(data[i - 1][j]);
                }
                if (dalamJangkauan(i, j + 1, jumlahBaris, jumlahKolom)) {
                    neighbors.add(data[i][j + 1]);
                }
                if (dalamJangkauan(i, j - 1, jumlahBaris, jumlahKolom)) {
                    neighbors.add(data[i][j - 1]);
                }
                if (dalamJangkauan(i - 1, j + 1, jumlahBaris, jumlahKolom)) {
                    neighbors.add(data[i - 1][j + 1]);
                }
                if (dalamJangkauan(i + 1, j - 1, jumlahBaris, jumlahKolom)) {
                    neighbors.add(data[i + 1][j - 1]);
                }
                if (dalamJangkauan(i + 1, j + 1, jumlahBaris, jumlahKolom)) {
                    neighbors.add(data[i + 1][j + 1]);
                }
                if (dalamJangkauan(i - 1, j - 1, jumlahBaris, jumlahKolom)) {
                    neighbors.add(data[i - 1][j - 1]);
                }
            }
            return neighbors;
        } else {
            System.err.println("i: " + i + " , jumlahBaris: " + jumlahBaris + "\n" + "j: " + j + ", jumlahKolom: " + jumlahKolom);
            return null;
        }
    }
    
    /**
     * Memastikan bahwa nilai (i,j) berada didalam jangkauan (x,y). Dimana (i,j)
     * adalah posisi sel matrix yang ingin dicari tetangganya, dan (x,y) adalah
     * ukuran matrix.
     *
     * @param i
     * @param j
     * @param x
     * @param y
     * @return
     */
    private boolean dalamJangkauan(int i, int j, int x, int y) {
        return (i >= 0 && i < x && j >= 0 && j < y);
    }
}
