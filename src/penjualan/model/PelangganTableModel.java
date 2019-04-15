/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penjualan.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author STMIK-I-17
 */
public class PelangganTableModel extends AbstractTableModel{
    private List <Pelanggan> pelanggans;
    
    public PelangganTableModel (List<Pelanggan> pelanggans){
        this.pelanggans= pelanggans;
    }
    @Override
    public int getRowCount() {
        return pelanggans.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pelanggan pelanggan = pelanggans.get(rowIndex);
        switch(columnIndex){
            case 0: 
                return pelanggan.getId();
            case 1: 
                return pelanggan.getNama();
            case 2: 
                return pelanggan.getNomorTelepon();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName (int column){
        switch(column){
            case 0: 
                return "ID";
            case 1:
                return "Nama Pelanggan";
            case 2:
                return "Telepon";
            default:
                return null;
        }
    }
}
