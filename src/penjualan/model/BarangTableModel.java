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
 * @author STMIK-VI-01
 */
public class BarangTableModel extends AbstractTableModel{
    private List<Barang> barangs;
    
    public BarangTableModel(List<Barang> barangs){
        this.barangs = barangs;
    }
    @Override
    public int getRowCount(){
        return barangs.size();
    }
    @Override
    public int getColumnCount(){
        return 3;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Barang barang = barangs.get(rowIndex);
        switch(columnIndex){
            case 0:
                return barang.getId();
            case 1:
                return barang.getNama();
            case 2:
                return barang.getHargaJual();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName (int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama Barang";
            case 2:
                return "Harga Jual";
            default:
                return null;
        }
    }
}
