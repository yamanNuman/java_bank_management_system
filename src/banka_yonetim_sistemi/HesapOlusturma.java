package banka_yonetim_sistemi;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;


public class HesapOlusturma extends javax.swing.JFrame {
String FilePath = null;
int val=0;
        
    public HesapOlusturma() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        setResizable(false);
       
    }


    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t7 = new javax.swing.JTextPane();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("M\u00FC\u015Fteri Kayd\u0131");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hesap Numaras\u0131");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("\u0130sim");

        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefon Numaras\u0131");

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
        jLabel6.setText("Cinsiyet");

        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setText("Erkek");

        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setText("Kad\u0131n");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hesap Varisi");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mevcut Bakiye");

        t6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t6KeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Adres");

        jScrollPane1.setViewportView(t7);

        b1.setBackground(new java.awt.Color(255, 0, 0));
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("Hesap Numaras\u0131 Olu\u015Ftur");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

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
        b2.setText("Bilgileri Kaydet");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(Color.DARK_GRAY);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("M\u00FC\u015Fteri Olu\u015Fturma");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        			.addGap(275)
        			.addComponent(jLabel1)
        			.addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(26)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);
        
        JLabel lblifre = new JLabel();
        lblifre.setText("\u015Eifre");
        lblifre.setForeground(Color.WHITE);
        lblifre.setFont(new Font("Tahoma", Font.BOLD, 18));
        
        txt_sifre = new JTextField();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(285)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel5)
        					.addGap(91)
        					.addComponent(t4, 346, 346, 346)
        					.addGap(283))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel6)
        					.addGap(65)
        					.addComponent(r1)
        					.addGap(42)
        					.addComponent(r2)
        					.addGap(444))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
        							.addComponent(t1, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel2)
        							.addPreferredGap(ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
        							.addComponent(t2, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel9)
        							.addGap(18)
        							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        							.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        								.addComponent(lblifre, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
        								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(txt_sifre, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
        							.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        								.addComponent(jLabel4)
        								.addGap(18)
        								.addComponent(t3, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(b1, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(b2)
        							.addGap(41)
        							.addComponent(b3)))
        					.addGap(18))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel8)
        						.addComponent(jLabel7))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(t5, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
        						.addComponent(t6, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
        					.addGap(351))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        				.addComponent(t1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        			.addGap(24)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(t2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(b1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addGap(24)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(t3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4))
        			.addGap(43)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblifre, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txt_sifre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(44)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel5)
        				.addComponent(t4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel6)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(r1)
        					.addComponent(r2)))
        			.addGap(32)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7)
        				.addComponent(t5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(12)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel8)
        				.addComponent(t6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(b2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        					.addComponent(b3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addComponent(jLabel9)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
        			.addGap(29))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        Random rand=new Random();
        int y=rand.nextInt(999999999)+100000000;
        t2.setText(String.valueOf(y));
        
    }

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {
      
        String name=t1.getText();
        String ac=t2.getText();
        String phone=t3.getText();
        String Nominee=t5.getText();
        String balance=t6.getText();
        String occupation=t4.getText();
        String address=t7.getText();
        String sex="";
        String password = txt_sifre.getText();
        
        if(r1.isSelected())
        {
            sex="Male";
        }
        else if(r2.isSelected())
        {
            sex="Female";
        }
        else
        {
            sex="NULL";
        }
      
        DBConnect db1=new DBConnect();
        System.out.println("aaa");
        try
        {
       int i= db1.stmt.executeUpdate("INSERT INTO Account(Name,Account_Number,Phone_Number,Occupation,Sex,Nominee,Balance,Address,password,type) Values('"+name+"','"+ac+"','"+phone+"','"+occupation+"','"+sex+"','"+Nominee+"','"+balance+"','"+address+"','"+password+"',2)");
         
       if(i!=0 && val>=0)
         {
             JOptionPane.showMessageDialog(null,"Basari ile Ekendi","Eklendi",JOptionPane.PLAIN_MESSAGE);
         }
         else
         {
             JOptionPane.showMessageDialog(null,"Eklenemedi","Eklenemedi",JOptionPane.ERROR_MESSAGE);
         }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }

    private void t2KeyTyped(java.awt.event.KeyEvent evt) {
            
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) ||
         	(c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE))) {
             evt.consume();
              JOptionPane.showMessageDialog(null, "Sadece sayi giriniz","WARNING!!",JOptionPane.WARNING_MESSAGE);
           }
         
       
    }

    private void t3KeyTyped(java.awt.event.KeyEvent evt) {
       
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) ||
         	(c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE))) {
             evt.consume();
              JOptionPane.showMessageDialog(null, "Sadece sayi giriniz","WARNING!!",JOptionPane.WARNING_MESSAGE);
           }
    }

    private void t6KeyTyped(java.awt.event.KeyEvent evt) {
       
        char c=evt.getKeyChar();
        if(!Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Sadece sayi giriniz","Warning Message!!",JOptionPane.WARNING_MESSAGE);
        }
    }

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {
      
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
       
        r1.setSelected(false);
        r2.setSelected(false);
    }//GEN-LAST:event_b3ActionPerformed


    public static void main() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HesapOlusturma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapOlusturma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapOlusturma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapOlusturma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //
                new HesapOlusturma().setVisible(true);
               
               
            }
        });
    }

    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextPane t7;
    private JTextField txt_sifre;
}
