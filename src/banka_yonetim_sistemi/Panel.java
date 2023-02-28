package banka_yonetim_sistemi;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import java.awt.Toolkit;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Panel extends javax.swing.JFrame {

    public Panel() {
    	setTitle("Panel");
    	getContentPane().setBackground(Color.DARK_GRAY);
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\sureNy\\Desktop\\JAVA\\Java Code\\Banka-Y\u00F6netim-Sistemi\\icon\\bank-icon.png"));
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jMenu1.setText("M\u00FC\u015Fteri Men\u00FCs\u00FC");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Banking System Management\\images\\create-an-account.png")); // NOI18N
        jMenuItem1.setText("Yeni M\u00FC\u015Fteri Kayd\u0131");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Banking System Management\\images\\search-account.png")); // NOI18N
        jMenuItem4.setText("M\u00FC\u015Fteri Arama");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Bilgi G\u00F6r\u00FCnt\u00FCleme");

        jMenuItem8.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Banking System Management\\images\\transaction_history.png")); // NOI18N
        jMenuItem8.setText("\u0130\u015Flem Ge\u00E7mi\u015Fi");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Banking System Management\\images\\list_customer.png")); // NOI18N
        jMenuItem9.setText("M\u00FC\u015Fteri Listesi");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 871, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 527, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
             
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       HesapOlusturma create=new HesapOlusturma();
       create.main(); 
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        String search_ac=JOptionPane.showInputDialog(null,"Aradiginiz Hesap Numarasini Giriniz.","Kullaniciyi Ara");
        try
        {   int i=0,j=0;
            String name="",account="",phone="",occupation="",sex="",nominee="",balance="",address="";
            DBConnect db=new DBConnect();
            db.rs=db.stmt.executeQuery("select * from account where Account_Number='"+search_ac+"'");
            JFrame jframe=new JFrame();
            jframe.setTitle("Search Account");
            Object column_names[]={"Ýsim","Hesap Numarasi","Telefon No","Meslek","Cinsiyet","Varis","Mevcut Bakiye","Adres"};
            while(db.rs.next())
            {
                name=db.rs.getString("Name");
                account=db.rs.getString("Account_Number");
                phone=db.rs.getString("Phone_Number");
                occupation=db.rs.getString("Occupation");
                sex=db.rs.getString("Sex");
                nominee=db.rs.getString("Nominee");
                balance=db.rs.getString("Balance");
                address=db.rs.getString("Address");
            }
            Object row_names[][]={{name,account,phone,occupation,sex,nominee,balance,address}};
            JTable table=new JTable(row_names,column_names);
            table.setRowHeight(30);
            TableColumnModel model=table.getColumnModel();
            model.getColumn(0).setPreferredWidth(300);
            model.getColumn(1).setPreferredWidth(300);
            model.getColumn(2).setPreferredWidth(300);
            model.getColumn(3).setPreferredWidth(300);
            model.getColumn(4).setPreferredWidth(70);
            model.getColumn(5).setPreferredWidth(300);
            model.getColumn(6).setPreferredWidth(300);
            model.getColumn(7).setPreferredWidth(350);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
            JScrollPane scroll=new JScrollPane(table);
            jframe.getContentPane().add(scroll);
            jframe.setSize(1200,200);
            jframe.setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        IslemGecmisi history=new IslemGecmisi();
        history.main();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
   MusteriListesi l1=new MusteriListesi();
   l1.main();
        // TODO add your handling code here:
    }


    public static void main() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
}
