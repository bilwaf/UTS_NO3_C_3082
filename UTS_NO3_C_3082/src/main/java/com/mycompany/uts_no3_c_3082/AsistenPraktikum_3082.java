/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_c_3082;

/**
 *
 * @author ASUS ZenBook
 * 21103082
 * NABILA WAFAA' Y
 * S1SI05C
 */

public class AsistenPraktikum_3082 extends Mahasiswa_3082 {
    private String mkAsistensi_3082;
    private int jmlPertemuan_3082;

    public AsistenPraktikum_3082(String mkAsistensi_3082, int jmlPertemuan_3082, String nim_3082, String nama_3082, String jurusan_3082, double ipk_3082) {
        super(nim_3082, nama_3082, jurusan_3082, ipk_3082);
        this.mkAsistensi_3082 = mkAsistensi_3082;
        this.jmlPertemuan_3082 = jmlPertemuan_3082;
    }
    
    public double totalPendapatan_3082()
    {
        return jmlPertemuan_3082 * 50000;
    }
    
    public void tampilDataMhs_3082()
    {
        System.out.println("=== Data Asisten Praktikum ===");
        super.tampilMahasiswa_3082();
        System.out.println("MK Asistensi        : " + mkAsistensi_3082);
        System.out.println("Jumlah Pertemuan    : " + jmlPertemuan_3082);
        System.out.println("Total Pendapatan    : " + totalPendapatan_3082());
    }
}
