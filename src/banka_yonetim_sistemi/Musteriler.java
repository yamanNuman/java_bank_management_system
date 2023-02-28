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

 class Musteriler extends javax.swing.JFrame {


    public Musteriler() {
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
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jMenu1.setText("M\u00FC\u015Fteri Men\u00FCs\u00FC");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Banking System Management\\images\\update-account.png")); // NOI18N
        jMenuItem2.setText("M\u00FC\u015Fteri Bilgi G\u00FCncelleme");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Para \u0130\u015Flemleri");

        jMenuItem5.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Banking System Management\\images\\Deposit.png")); // NOI18N
        jMenuItem5.setText("Para Yat\u0131rma");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Banking System Management\\images\\withdraw.png")); // NOI18N
        jMenuItem6.setText("Para \u00C7ekme");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Banking System Management\\images\\transfer.png")); // NOI18N
        jMenuItem7.setText("Havale");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Bilgi G\u00F6r\u00FCnt\u00FCleme");

        jMenuItem8.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Banking System Management\\images\\transaction_history.png")); // NOI18N
        jMenuItem8.setText("\u0130\u015Flem Ge\u00E7mi\u015Fi");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 376, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 489, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
          ParaYatirma deposit=new ParaYatirma();
          deposit.main();
        // TODO add your handling code here:
        
    }

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
             // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        MusteriGuncelleme update=new MusteriGuncelleme();
        update.main();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
     ParaCekme withdraw=new ParaCekme();
     withdraw.main();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
      ParaTransferi transfer=new ParaTransferi();
      transfer.main();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    	IslemGecmisi history=new IslemGecmisi();
        history.main();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    public static void main() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Musteriler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Musteriler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Musteriler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Musteriler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Musteriler().setVisible(true);
            }
        });
    }
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;

}
