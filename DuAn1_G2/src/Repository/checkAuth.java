/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.nhanVien;

/**
 *
 * @author Admin
 */
public class checkAuth {
     public  static nhanVien user = null;
    public static void clear(){
        checkAuth.user = null;
    }
    public static boolean isLogin(){
        return checkAuth.user != null;
    }
    public static boolean isManager(){
       return checkAuth.isLogin()&& user.isVaiTro();
    }
}
