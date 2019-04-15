/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penjualan.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 *
 * @author STMIK-I-17
 */
@Entity
@Table(name = "pemasok")
public class Pemasok implements Serializable{
    @Id
    @Column(name = "id", length = 10)
    private String id;
    @Column(name = "nama", length = 30)
    private String nama;
    @Column(name = "alamat", length = 400)
    private String alamat;
    @Column(name = "nomortelepon", length = 20)
    private String nomorTelepon;
    @Column(name = "npwp", length = 20)
    private String npwp;
    @Column(name = "kontaknama", length = 30)
    private String kontakNama;
    @Column(name = "kontaknomortelepon", length = 20)
    private String kontakNomortelepon;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the nomorTelepon
     */
    public String getNomorTelepon() {
        return nomorTelepon;
    }

    /**
     * @param nomorTelepon the nomorTelepon to set
     */
    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    /**
     * @return the npwp
     */
    public String getNpwp() {
        return npwp;
    }

    /**
     * @param npwp the npwp to set
     */
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    /**
     * @return the kontakNama
     */
    public String getKontakNama() {
        return kontakNama;
    }

    /**
     * @param kontakNama the kontakNama to set
     */
    public void setKontakNama(String kontakNama) {
        this.kontakNama = kontakNama;
    }

    /**
     * @return the kontakNomortelepon
     */
    public String getKontakNomortelepon() {
        return kontakNomortelepon;
    }

    /**
     * @param kontakNomortelepon the kontakNomortelepon to set
     */
    public void setKontakNomortelepon(String kontakNomortelepon) {
        this.kontakNomortelepon = kontakNomortelepon;
    }
    
    
}
