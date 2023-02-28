package banka_yonetim_sistemi;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;


public class MusteriGuncelleme extends javax.swing.JFrame {

    String ac="";
    String filepath="";
    
    public MusteriGuncelleme() {
        initComponents();
        setResizable(false);
        getContentPane().setBackground(Color.BLACK);
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t7 = new javax.swing.JTextPane();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        b4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hesap G\u00FCncelle");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ad");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numara");

        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t3KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Meslek");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cinsiyet:");

        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setText("Erkek");

        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setText("Kad\u0131n");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Varis Ad\u0131");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Adres");

        jScrollPane1.setViewportView(t7);

        b3.setBackground(new java.awt.Color(0, 0, 255));
        b3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("Bo\u015Falt");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(255, 0, 0));
        b2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("Bilgileri G\u00FCncelle");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hesap Ad\u0131");

        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hesap Numaras\u0131");

        b4.setBackground(new java.awt.Color(255, 0, 0));
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setText("Bilgi Al");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(Color.DARK_GRAY);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hesap G\u00FCncelleme");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(320, 320, 320))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        
        txt_sifre = new JTextField();
        
        JLabel lblifre = new JLabel();
        lblifre.setText("\u015Eifre");
        lblifre.setForeground(Color.WHITE);
        lblifre.setFont(new Font("Tahoma", Font.BOLD, 18));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(8)
        					.addComponent(jLabel9)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
        					.addGap(34)
        					.addComponent(b2)
        					.addGap(49)
        					.addComponent(b3))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
        					.addGap(28)
        					.addComponent(t1, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(316, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(53)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel11)
        					.addGap(64)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(t8)
        						.addComponent(t9, GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)))
        				.addComponent(jLabel10))
        			.addPreferredGap(ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
        			.addComponent(b4, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
        			.addGap(187))
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel6)
        			.addGap(28)
        			.addComponent(r1)
        			.addGap(41)
        			.addComponent(r2)
        			.addContainerGap(688, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel4)
        			.addGap(18)
        			.addComponent(t3, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(611, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(2)
        			.addComponent(jLabel7)
        			.addGap(18)
        			.addComponent(t5, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(684, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblifre, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(txt_sifre, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
        				.addComponent(t4, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(568, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(t8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        						.addComponent(t9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(26))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(25)
        					.addComponent(b4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(t1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        			.addGap(33)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(t3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblifre, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txt_sifre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(t4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(21)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel6)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(r1)
        					.addComponent(r2)))
        			.addGap(28)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7)
        				.addComponent(t5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel9)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(b2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        					.addComponent(b3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        String name=t1.getText();
        
        String phone=t3.getText();
        String account1=t8.getText();
        String name1=t9.getText();
        String occupation=t4.getText();
        String select="";
        String password = txt_sifre.getText();
        if(r1.isSelected())
        {
            select="Male";
        }
        else if(r2.isSelected())
        {
            select="Female";
        }
        else
        {
            select="";
        }
        String Nominee=t5.getText();
        
        String Address=t7.getText();
        try
        {
            DBConnect db=new DBConnect();

        int i=db.stmt.executeUpdate("Update account set Name='"+name+"',Phone_Number='"+phone+"',Occupation='"+occupation+"',Nominee='"+Nominee+"',Sex='"+select+"',password='"+password+"',Address='"+Address+"' where Account_Number='"+account1+"' and Name='"+name1+"'");

          if(i!=0)
            {
                JOptionPane.showMessageDialog(null,"Guncellendi","Basarili",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Guncelleme Basarisiz","Hata",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
            JOptionPane.showMessageDialog(null,"Guncelleme Basarisiz","Hata",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void t3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) ||
         	(c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE))) {
             evt.consume();
              JOptionPane.showMessageDialog(null, "Sayi giriniz","WARNING!!",JOptionPane.WARNING_MESSAGE);
           }
    }//GEN-LAST:event_t3KeyTyped

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        t1.setText("");
      
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
      
        r1.setSelected(false);
        r2.setSelected(false);
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed

        String account_number=t8.getText();
        ac=t8.getText();
        String name=t9.getText();
        try
        {
            DBConnect db=new DBConnect();
            db.rs=db.stmt.executeQuery("select * from account where Name='"+name+"'and Account_Number='"+account_number+"'");
            while(db.rs.next())
            {
                t1.setText(db.rs.getString("Name"));
                txt_sifre.setText(db.rs.getString("password"));
                t3.setText(db.rs.getString("Phone_Number"));
                t4.setText(db.rs.getString("Occupation"));
                String select=db.rs.getString("Sex");
                if(select.equals("Male"))
                {
                    r1.setSelected(true);
                }
                else if(select.equals("Female"))
                {
                    r2.setSelected((true));
                }
                t5.setText(db.rs.getString("Nominee"));
           
                t7.setText(db.rs.getString("Address"));
                    
            }
         
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
       
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
            java.util.logging.Logger.getLogger(MusteriGuncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriGuncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriGuncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriGuncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //
                new MusteriGuncelleme().setVisible(true);
            }
        });
    }

    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextPane t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    private JTextField txt_sifre;
}
