package banka_yonetim_sistemi;

import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login extends javax.swing.JFrame {


    public Login() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\sureNy\\Desktop\\JAVA\\Java Code\\Banka-Y\u00F6netim-Sistemi\\icon\\bank-icon.png"));
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        l2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        l3 = new javax.swing.JLabel();
        t2 = new javax.swing.JPasswordField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giri\u015F");

        jPanel1.setBackground(Color.DARK_GRAY);

        l1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("YAMAN BANK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(279, Short.MAX_VALUE)
        			.addComponent(l1, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
        			.addGap(201))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(25)
        			.addComponent(l1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBackground(Color.BLACK);

        l2.setFont(new Font("Tahoma", Font.BOLD, 15)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("Kullan\u0131c\u0131 Ad\u0131 ");

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        l3.setFont(new Font("Tahoma", Font.BOLD, 15)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("Sifre");

        b1.setBackground(new java.awt.Color(255, 0, 0));
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("Giri\u015F");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(255, 0, 0));
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("Bo\u015Falt");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(255, 0, 0));
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("\u0130ptal");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        
        JLabel lblKullancTipi = new JLabel();
        lblKullancTipi.setText("Kullan\u0131c\u0131 Tipi");
        lblKullancTipi.setForeground(Color.WHITE);
        lblKullancTipi.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        JLabel lblAdminTemsilci = new JLabel();
        lblAdminTemsilci.setText("Admin(0) - Temsilci (1) - M\u00FCsteri (2)");
        lblAdminTemsilci.setForeground(Color.WHITE);
        lblAdminTemsilci.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        txt_tip = new JTextField();
        
        JButton btnNewButton = new JButton("D\u0130AGRAM");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Diagram diagram = new Diagram();
        		diagram.setVisible(true);
        	}
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        
        btnNewButton_1 = new JButton("Account Table");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Tablolar tablo = new Tablolar();
        		tablo.setVisible(true);
        	}
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        
        btnNewButton_2 = new JButton("Transfer Table");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		TransferTable table = new TransferTable();
        		table.setVisible(true);
        	}
        });
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
        
        btnNewButton_3 = new JButton("Deposit Table");
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ParaYatirmaTablosu table = new ParaYatirmaTablosu();
        		table.setVisible(true);
        	}
        });
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
        
        btnNewButton_4 = new JButton("Withdraw Table");
        btnNewButton_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ParaCekmeTablosu table = new ParaCekmeTablosu();
        		table.setVisible(true);
        	}
        });
        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(97)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(lblKullancTipi, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED))
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(jPanel2Layout.createSequentialGroup()
        						.addComponent(l2)
        						.addGap(66))
        					.addGroup(jPanel2Layout.createSequentialGroup()
        						.addComponent(l3, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        						.addPreferredGap(ComponentPlacement.RELATED))))
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(t2, 313, 361, Short.MAX_VALUE)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblAdminTemsilci, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addComponent(b1)
        									.addGap(39)
        									.addComponent(b2)
        									.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
        									.addComponent(b3)
        									.addGap(36)))
        							.addGap(22))
        						.addComponent(t1, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
        					.addGap(117))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(txt_tip, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(461, Short.MAX_VALUE)
        			.addComponent(btnNewButton)
        			.addGap(251))
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(25)
        			.addComponent(btnNewButton_1)
        			.addGap(18)
        			.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
        			.addGap(14)
        			.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
        				.addComponent(t1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addComponent(t2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblKullancTipi, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txt_tip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(5)
        			.addComponent(lblAdminTemsilci, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(b1)
        				.addComponent(b2)
        				.addComponent(b3))
        			.addGap(31)
        			.addComponent(btnNewButton)
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnNewButton_1)
        				.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

        String name1="",Password1="",type1="";
        String name=t1.getText();
        String Password=t2.getText();
        String type = txt_tip.getText();
         
        DBConnect db=new DBConnect();
        try
        {
        db.rs=db.stmt.executeQuery("select * from account where name='"+name+"' and password='"+Password+"' and type='"+type+"'");
        
            while(db.rs.next())
            {
                 name1=db.rs.getString("name");
                 Password1=db.rs.getString("password");
                 type1=db.rs.getString("type");
                 
            }
           
            if(name1.equals(name)==true && Password1.equals(Password)==true)
            {
            	System.out.println(type1);
            	int yeni1 = Integer.parseInt(type1);
            	if(yeni1 == 0) {
                JOptionPane.showMessageDialog(this,"Baþariyla Giriþ Yaptiniz.");
                Panel panel = new Panel();
                panel.main();
            	}
            	else if(yeni1 == 1) {
                    JOptionPane.showMessageDialog(this,"Baþariyla Giriþ Yaptiniz.");
                    MusteriTemsilcisi panel2 = new MusteriTemsilcisi();
                    panel2.main();
            	}
            	else if(yeni1 == 2) {
            		JOptionPane.showMessageDialog(this,"Basariyla Giris Yaptiniz.");
            		Musteriler panel3 = new Musteriler();
            		panel3.main();
            	}
            }
            else
            {
              JOptionPane.showMessageDialog(this,"Hatali Bilgi Girdiniz.","Yanlis Bilgi",JOptionPane.ERROR_MESSAGE);
               t1.setText("");
               t2.setText("");
            }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
        
        
       
    }//GEN-LAST:event_b1ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
         t1.setText("");
        t2.setText("");
        
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
       System.exit(0);
        
    }//GEN-LAST:event_b3ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    private JTextField txt_tip;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    private JButton btnNewButton_3;
    private JButton btnNewButton_4;
}
