/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_c_3082;

/**
 *
 * @author ASUS ZenBook
 * 21103082
 * NABILA WAFAA' Y
 * S1SI05C
 */
public class UTS_NO3_C_3082 {

    public static void main(String[] args) {
        AsistenPraktikum_3082 asprak1 = new AsistenPraktikum_3082("PBO", 5, "20100041", "Langit", "Sistem Informasi", 4.0);
        AsistenPraktikum_3082 asprak2 = new AsistenPraktikum_3082("Algoritme Pemrograman", 3, "20100000", "Harsa", "Teknik Informatika", 3.89);
        AsistenPraktikum_3082 asprak3 = new AsistenPraktikum_3082("Basis Data", 4, "20101000", "Jemari", "Sistem Informasi", 3.91);
        asprak1.totalPendapatan_3082();
        asprak1.tampilDataMhs_3082();
        asprak2.totalPendapatan_3082();
        asprak2.tampilDataMhs_3082();
        asprak3.totalPendapatan_3082();
        asprak3.tampilDataMhs_3082();
        
        System.out.println("");
        
        StudentStaff_3082 staff1 = new StudentStaff_3082(1, 5, "21100080", "Nona", "Sistem Informasi", 4.0);
        StudentStaff_3082 staff2 = new StudentStaff_3082(1, 3, "21100002", "Insan", "RPL", 4.0);
        StudentStaff_3082 staff3 = new StudentStaff_3082(1, 2, "21101000", "Hiranya", "Teknik Informatika", 3.78);
        staff1.totalPendapatan_3082();
        staff1.tampilDataMhs_3082();
        staff2.totalPendapatan_3082();
        staff2.tampilDataMhs_3082();
        staff3.totalPendapatan_3082();
        staff3.tampilDataMhs_3082();
        
        
    }
}
