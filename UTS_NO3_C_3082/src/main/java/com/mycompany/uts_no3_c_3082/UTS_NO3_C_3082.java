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
        AsistenPraktikum_3082 asprak = new AsistenPraktikum_3082("PBO", 5, "20103041", "Langit", "Sistem Informasi", 4.0);
        asprak.totalPendapatan_3082();
        asprak.tampilDataMhs_3082();
        
        StudentStaff_3082 staff = new StudentStaff_3082(1, 5, "21103200", "Neraca", "Sistem Informasi", 4.0);
        staff.totalPendapatan_3082();
        staff.tampilDataMhs_3082();
        
}}
