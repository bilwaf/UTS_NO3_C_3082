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

public class StudentStaff_3082 extends Mahasiswa_3082 {
   private int unitKerja_3082;
   private int jamKerja_3082;

    public StudentStaff_3082(int unitKerja_3082, int jamKerja_3082, String nim_3082, String nama_3082, String jurusan_3082, double ipk_3082) {
        super(nim_3082, nama_3082, jurusan_3082, ipk_3082);
        this.unitKerja_3082 = unitKerja_3082;
        this.jamKerja_3082 = jamKerja_3082;
    }
    
    public double totalPendapatan_3082()
    {
        return jamKerja_3082 * 30000;
    }
    
    public void tampilDataMhs_3082()
    {
        System.out.println("=== Data Student Staff ===");
        super.tampilMahasiswa_3082();
        System.out.println("Unit Kerja          : " + unitKerja_3082);
        System.out.println("Jam Kerja           : " + jamKerja_3082);
        System.out.println("Total Pendapatan    : " + totalPendapatan_3082());
    }
}
