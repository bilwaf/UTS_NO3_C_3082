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

public class Mahasiswa_3082 {
    protected String nim_3082, nama_3082, jurusan_3082;
    protected double ipk_3082;

    public Mahasiswa_3082() {
    }

    public Mahasiswa_3082(String nim_3082, String nama_3082, String jurusan_3082, double ipk_3082) {
        this.nim_3082 = nim_3082;
        this.nama_3082 = nama_3082;
        this.jurusan_3082 = jurusan_3082;
        this.ipk_3082 = ipk_3082;
    }
    
    public void tampilMahasiswa_3082()
    {
        System.out.println("NIM                 : " + nim_3082);
        System.out.println("Nama Mahasiswa      : " + nama_3082);
        System.out.println("Jurusan             : " + jurusan_3082);
        System.out.println("IPK                 : " + ipk_3082);
    }
}
