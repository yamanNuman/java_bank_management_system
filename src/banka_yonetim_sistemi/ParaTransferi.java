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


public class ParaTransferi extends javax.swing.JFrame {

    public ParaTransferi() {
        initComponents();
         t1.setEditable(false);
          setResizable(false);
        t2.setEditable(false);
        getContentPane().setBackground(Color.BLACK);
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
        t8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        b3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Para Transferi");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("G\u00F6nderen Hesap Numaras\u0131");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("G\u00F6nderen \u0130smi");

        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("\u0130\u015Flem Modu");

        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t3KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kalan Bakiye");

        t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t4KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Transfer Miktar\u0131");

        b2.setBackground(new java.awt.Color(0, 0, 255));
        b2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("Bo\u015Falt");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(255, 0, 0));
        b1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("Transfer Et");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hesap \u0130smi");

        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hesap Numaras\u0131");

        b3.setBackground(new java.awt.Color(255, 0, 0));
        b3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("Detay G\u00F6ster");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Al\u0131c\u0131 Hesap Numaras\u0131");

        t7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t7KeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Al\u0131c\u0131 Ad\u0131");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("\u0130\u015Flem Tarihi");

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nakit", "Kredi" }));

        jPanel2.setBackground(Color.DARK_GRAY);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Para Transferi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(360, 360, 360))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(134)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel5)
        				.addComponent(jLabel12)
        				.addComponent(jLabel8)
        				.addComponent(jLabel2)
        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel10)
        				.addComponent(jLabel13)
        				.addComponent(jLabel6)
        				.addComponent(jLabel4)
        				.addComponent(jLabel11))
        			.addGap(50)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(t2)
        				.addComponent(t1, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
        				.addComponent(t3)
        				.addComponent(t4)
        				.addComponent(t7)
        				.addComponent(t9)
        				.addComponent(t5)
        				.addComponent(t6)
        				.addComponent(t8)
        				.addComponent(c1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(b3, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        				.addComponent(b2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(b1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGap(33))
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        						.addComponent(t8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        						.addComponent(t9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(21)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        						.addComponent(t1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel2)
        						.addComponent(t2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(26)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel6)
        						.addComponent(t3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(32)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel4)
        						.addComponent(c1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(28)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel5)
        						.addComponent(t4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(30)
        					.addComponent(b3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
        			.addGap(51)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(t5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel12))
        			.addGap(16)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel13)
        				.addComponent(t6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(b2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8)
        				.addComponent(t7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(b1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        String sender_name=t1.getText();
        String sender_account=t2.getText();
        String date=t3.getText();
        String avail_balance=t4.getText();
        String receiver_account=t5.getText();
        String receiver_name=t6.getText();
        String receiver_balance="";
        String receiver_id="";
        String sender_id="";
        String mode=c1.getSelectedItem().toString();
        String transfer=t7.getText();
       
        try
        {
            DBConnect db=new DBConnect();
            int diff=Integer.parseInt(avail_balance.trim())-Integer.parseInt(transfer.trim());
            String fs=String.valueOf(diff);
            String id="";
            int i=db.stmt.executeUpdate("Update account set Balance='"+fs+"' where Account_Number='"+sender_account+"' and Name='"+sender_name+"'");
            db.rs=db.stmt.executeQuery("select * from account where Account_Number='"+receiver_account+"' and Name='"+receiver_name+"'");
           
            while(db.rs.next())
            {
                receiver_balance=db.rs.getString("Balance");
                receiver_id=String.valueOf(db.rs.getString("id"));
            }
            db.rs=db.stmt.executeQuery("select * from account where Account_Number='"+sender_account+"' and Name='"+sender_name+"'");
            while(db.rs.next())
            {
                sender_id=String.valueOf(db.rs.getInt("id"));
            }
            Random rand=new Random();
            String transaction_id=sender_id+receiver_id+(rand.nextInt(9000)+1000);
            String s="Transfer";
            int sum=Integer.parseInt(receiver_balance.trim())+Integer.parseInt(transfer.trim());
            String fs1=String.valueOf(sum);
           int i1=db.stmt.executeUpdate("Insert into transfer values('"+transaction_id+"','"+sender_id+"','"+receiver_id+"','"+transfer+"','"+mode+"','"+date+"','"+s+"')");
           int i2=db.stmt.executeUpdate("Update account set Balance='"+fs1+"' where Account_Number='"+receiver_account+"' and Name='"+receiver_name+"'");
          
            if(i!=0 && i1!=0 && i2!=0)
            {
                JOptionPane.showMessageDialog(null,"Transfer Basarili","Basarili",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Transfer Basarisiz","Hata",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
            JOptionPane.showMessageDialog(null,"Guncellenemedi","Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }

    private void t2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyTyped
        // TODO add your handling code here:
        
      
         
       
    }//GEN-LAST:event_t2KeyTyped

    private void t3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_t3KeyTyped

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        t6.setText("");
        t5.setText("");

       c1.setSelectedIndex(0);
        
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        String account_number=t8.getText();
        String name=t9.getText();
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

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t8ActionPerformed

    private void t4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if (!(Character.isDigit(c) ||
         
            (c == KeyEvent.VK_DELETE))) {
             evt.consume();
              JOptionPane.showMessageDialog(null, "Sadece sayi giriniz","WARNING!!",JOptionPane.WARNING_MESSAGE);
           }
    }//GEN-LAST:event_t4KeyTyped

    private void t7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t7KeyTyped
  char c = evt.getKeyChar();
        if (!(Character.isDigit(c) ||
         	
            (c == KeyEvent.VK_DELETE))) {
             evt.consume();
              JOptionPane.showMessageDialog(null, "Sadece sayi giriniz","WARNING!!",JOptionPane.WARNING_MESSAGE);
           }
        // TODO add your handling code here:
    }//GEN-LAST:event_t7KeyTyped

    public static void main() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParaTransferi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaTransferi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaTransferi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaTransferi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //
                new ParaTransferi().setVisible(true);
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
