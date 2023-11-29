/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import View.HoaDon_Panel;
import View.NhanVien_Panel;
import View.TrangChu_Panel;
import View.Voucher_Panel;
import View.SanPham_Panel;
import View.ThongKe_JDialog;



/**
 *
 * @author asus
 */
public class ChuyenManHinh {
    private JPanel root;
    private String kindSelect = "";
    private List<DanhMucBeans> listItem = null;
    
    public ChuyenManHinh(JPanel jpnroot){
        this.root = jpnroot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelect = "TrangChu";
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChu_Panel());
//        root.validate();
//        root.repaint();
    }
    
    public void setEvent(List<DanhMucBeans> listItem){
        this.listItem = listItem;
        
        for (DanhMucBeans item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    class LabelEvent implements MouseListener{
        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        

        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "SanPham":
                    node = new SanPham_Panel();
                    break;
                case "NhanVien":
                    node = new NhanVien_Panel();
                    break;
                case "Voucher":
                    node = new Voucher_Panel();
                    break; 
                case "HoaDon":
                    node = new HoaDon_Panel();
                    break;
                default:
                    node = new TrangChu_Panel();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
//            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {//khi click vào menu thì sẽ có hiệu ứng nháy màu chọn
            kindSelect = kind;
            jpnItem.setBackground(new Color(7, 153, 146));
            jlbItem.setBackground(new Color(7, 153, 146));
            jlbItem.setForeground(Color.yellow);
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {// khi rê vào menu thì sẽ đổi màu
            jpnItem.setBackground(Color.white);
        }

        @Override
        public void mouseExited(MouseEvent e) { //khi thoát rê chuột ở menu
            if (!kindSelect.equalsIgnoreCase(kind)) {
                jpnItem.setBackground( new Color(246,185,59));
                jlbItem.setBackground(Color.black);
            }
        }
        
        private void setChangeBackground(String kind){
            for (DanhMucBeans item : listItem) {
                if (item.getKind().equalsIgnoreCase(kind)) {
                    item.getJlb().setBackground(Color.white);
                    item.getJpn().setBackground(Color.white); // khi click vào menu thì sẽ đổi màu panel
                    jlbItem.setForeground(Color.black);
                }else{
                    item.getJlb().setBackground(new Color(246,185,59)); //kh click vào menu thì sẽ giữ nguyên màu lúc ban đầu
                    item.getJpn().setBackground(new Color(246,185,59));
                }
            }
        }
    
    }
}
