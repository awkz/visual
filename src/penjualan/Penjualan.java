/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penjualan;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import penjualan.view.FormBarang;
import penjualan.view.FormPemasok;
import penjualan.view.FormPelanggan;
import penjualan.view.ListBarang;
import penjualan.view.ListPelanggan;
import penjualan.view.ListPemasok;

/**
 *
 * @author STMIK-I-17
 */
public class Penjualan {

    /**
     * @param args the command line arguments
     */
    
    public static SessionFactory SESSION_FACTORY;
    public static FormPelanggan FORM_PELANGGAN;
    public static ListPelanggan LIST_PELANGGAN;
    public static FormPemasok FORM_PEMASOK;
    public static ListPemasok LIST_PEMASOK;
    private static FormBarang FORM_BARANG;
    private static ListBarang LIST_BARANG;
    static {
        try{
            SESSION_FACTORY = new AnnotationConfiguration().configure().buildSessionFactory();
            FORM_PELANGGAN  = new FormPelanggan(null, true);
            LIST_PELANGGAN  = new ListPelanggan(null, true);
            FORM_PEMASOK    = new FormPemasok(null, true);
            LIST_PEMASOK    = new ListPemasok(null, true);
            FORM_BARANG     = new FormBarang(null, true);
            LIST_BARANG     = new ListBarang(null, true);
            
            
        }catch(Throwable throwable){
            throwable.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
