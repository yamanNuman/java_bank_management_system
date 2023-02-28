package banka_yonetim_sistemi;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;


public class ParaCekmeTablosu extends javax.swing.JFrame {


    public ParaCekmeTablosu() {
        initComponents();
        setResizable(false);
        getContentPane().setBackground(Color.BLACK);
    }


    private void initComponents() {

        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("T\u00FCm Hesaplar");

        b2.setBackground(new java.awt.Color(255, 0, 0));
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("Geri");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(255, 0, 0));
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("G\u00F6ster");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction_id", "customer_id", "customer_name", "account_number", "withdraw_balance", "transaction_mode","transaction_date","transaction_type"
            }
        ));
        jScrollPane1.setViewportView(table1);

        jPanel1.setBackground(Color.DARK_GRAY);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Transfer Tablosu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(280, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE)
        			.addGap(99))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(29, Short.MAX_VALUE)
        			.addComponent(jLabel1)
        			.addGap(27))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        try
        {
            String transaction_id="";
            String customer_id="";
            String customer_name="";
            String account_number="";
            String withdraw_balance="";
            String transaction_mode="";
            String transaction_date="";
            String transaction_type="";
            DBConnect db=new DBConnect();
            db.rs=db.stmt.executeQuery("select * from withdraw");
            DefaultTableModel model=(DefaultTableModel)table1.getModel();
            while(db.rs.next())
            {
            	transaction_id=db.rs.getString("transaction_id");
                customer_id=db.rs.getString("customer_id");
                customer_name=db.rs.getString("customer_name");
                account_number=db.rs.getString("account_number");
                withdraw_balance=db.rs.getString("withdraw_balance");
                transaction_mode=db.rs.getString("transaction_mode");
                transaction_date=db.rs.getString("transaction_date");
                transaction_type=db.rs.getString("transaction_type");
                Object [] row={transaction_id,customer_id,customer_name,account_number,withdraw_balance,transaction_mode,transaction_date,transaction_type};
                model.addRow(row);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
    DefaultTableModel model=(DefaultTableModel)table1.getModel();
    model.setRowCount(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    public static void main() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaCekmeTablosu().setVisible(true);
            }
        });
    }

 
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
