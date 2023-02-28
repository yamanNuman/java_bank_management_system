package banka_yonetim_sistemi;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;


public class ParaCekme extends javax.swing.JFrame {


    public ParaCekme() {
        initComponents();
        t1.setEditable(false);
        t2.setEditable(false);
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
        jLabel8 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        b3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        t5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setForeground(Color.BLACK);
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Para \u00C7ekme");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hesap Numaras\u0131");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hesap Ad\u0131");

        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tarih");

        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t3KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("\u00D6nceki Bakiye");

        t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t4KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Para \u00C7ekme Tutar\u0131");

        b2.setBackground(new java.awt.Color(0, 0, 255));
        b2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("Bo\u015Falt");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(255, 0, 0));
        b1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("\u0130\u015Flemi Kaydet");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hesap Ad\u0131");

        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hesap Numaras\u0131");

        b3.setBackground(new java.awt.Color(255, 0, 0));
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("Detay G\u00F6ster");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("\u0130\u015Flem Modu");

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nakit", "Kredi" }));

        t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t5KeyTyped(evt);
            }
        });

        jPanel1.setBackground(Color.DARK_GRAY);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Para \u00C7ekme");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(362, Short.MAX_VALUE)
        			.addComponent(jLabel1)
        			.addGap(361))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(53)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel11)
        					.addGap(64)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(t6)
        						.addComponent(t7, GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel10)
        					.addPreferredGap(ComponentPlacement.RELATED, 593, Short.MAX_VALUE)
        					.addComponent(b3, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
        					.addGap(33))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(84)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addGroup(layout.createSequentialGroup()
        									.addGap(63)
        									.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        									.addComponent(jLabel2)
        									.addComponent(jLabel4)
        									.addComponent(jLabel5)
        									.addComponent(jLabel8)
        									.addComponent(jLabel12)))
        							.addGap(46)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(t1, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        								.addComponent(t2, 552, 552, 552)
        								.addComponent(t3, 552, 552, 552)
        								.addComponent(t4, 552, 552, 552)
        								.addComponent(c1, 0, 552, Short.MAX_VALUE)
        								.addComponent(t5, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
        							.addContainerGap())
        						.addGroup(layout.createSequentialGroup()
        							.addGap(55)
        							.addComponent(b1)
        							.addGap(150)
        							.addComponent(b2))))))
        		.addComponent(jPanel1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(t6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        						.addComponent(t7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(12)
        					.addComponent(b3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        					.addGap(0, 1, Short.MAX_VALUE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(t1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(t2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(t3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(t4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel12)
        				.addComponent(c1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8)
        				.addComponent(t5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(56)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(b1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        				.addComponent(b2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        String name=t1.getText();
        String account=t2.getText();
        String date=t3.getText();
        String previous_balance=t4.getText();
        String value=c1.getSelectedItem().toString();
        String withdraw=t5.getText();
       
        try
        {
            DBConnect db=new DBConnect();
            int diff=Integer.parseInt(previous_balance.trim())-Integer.parseInt(withdraw.trim());
            String fs=String.valueOf(diff);
            String id="";
            int i=db.stmt.executeUpdate("Update account set Balance='"+fs+"' where Account_Number='"+account+"' and Name='"+name+"'");
            db.rs=db.stmt.executeQuery("select * from account where Account_Number='"+account+"' and Name='"+name+"'");
           
            while(db.rs.next())
            {
                id=String.valueOf(db.rs.getInt("id"));
            }
            Random rand=new Random();
            String transaction_id=id+(rand.nextInt(9000)+1000);
            String s="Withdraw";
            int i1=db.stmt.executeUpdate("Insert into withdraw values('"+transaction_id+"','"+id+"','"+name+"','"+account+"','"+withdraw+"','"+value+"','"+date+"','"+s+"')");
            if(i!=0 && i1!=0)
            {
                JOptionPane.showMessageDialog(null,"Basarili bir sekilde Cekildi","Cekildi",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Para cekilemedi","Error Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
            JOptionPane.showMessageDialog(null,"Para cekilemedi","Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void t2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyTyped
  
         
       
    }

    private void t3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_t3KeyTyped

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        
        c1.setSelectedIndex(0);
        
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        String account_number=t6.getText();
        String name=t7.getText();
        try
        {
            DBConnect db=new DBConnect();
            db.rs=db.stmt.executeQuery("select * from account where Name='"+name+"'and Account_Number='"+account_number+"'");
            while(db.rs.next())
            {
                t1.setText(db.rs.getString("Name"));
                t2.setText(db.rs.getString("Account_Number"));
              
       
                t4.setText(db.rs.getString("Balance"));
               
                    
            }
            long millis=System.currentTimeMillis();
            Date date1=new Date(millis);
            t3.setText(date1.toString());

        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
       
    }//GEN-LAST:event_t6ActionPerformed

    private void t4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if (!(Character.isDigit(c) ||
         	(c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE))) {
             evt.consume();
              JOptionPane.showMessageDialog(null, "Sayi giriniz.","WARNING!!",JOptionPane.WARNING_MESSAGE);
           }
    }//GEN-LAST:event_t4KeyTyped

    private void t5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyTyped
  char c = evt.getKeyChar();
        if (!(Character.isDigit(c) ||
         	(c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE))) {
             evt.consume();
              JOptionPane.showMessageDialog(null, "Sayi giriniz.","WARNING!!",JOptionPane.WARNING_MESSAGE);
           }
        // TODO add your handling code here:
    }//GEN-LAST:event_t5KeyTyped


    public static void main() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParaCekme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaCekme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaCekme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaCekme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //
                new ParaCekme().setVisible(true);
            }
        });
    }


    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;

}
