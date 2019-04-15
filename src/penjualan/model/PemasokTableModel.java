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
public class PemasokTableModel extends AbstractTableModel{
    private List <Pemasok> pemasoks;
    
    public PemasokTableModel(List <Pemasok> pemasoks){
        this.pemasoks = pemasoks;
    }
    
    @Override
    public int getRowCount(){
        return pemasoks.size();
    }
    
    @Override
    public int getColumnCount(){
        return 3;
    }
    
    @Override
    public Object getValueAt (int rowIndex, int columnIndex){
        Pemasok pemasok = pemasoks.get(rowIndex);
        switch(columnIndex){
            case 0  : return pemasok.getId();
            case 1  : return pemasok.getNama();
            case 2  : return pemasok.getKontakNomortelepon();
            default : return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama Pemasok";
            case 2: 
                return "Telepon";
            default:
                return null;
        }
        
    }
}
