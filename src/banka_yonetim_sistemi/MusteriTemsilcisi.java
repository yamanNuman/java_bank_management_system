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


public class MusteriTemsilcisi extends javax.swing.JFrame {


    public MusteriTemsilcisi() {
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
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
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

        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Banking System Management\\images\\update-account.png")); // NOI18N
        jMenuItem2.setText("M\u00FC\u015Fteri Bilgi G\u00FCncelleme");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Banking System Management\\images\\remove-account.png")); // NOI18N
        jMenuItem3.setText("M\u00FC\u015Fteri Silme");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Banking System Management\\images\\search-account.png")); // NOI18N
        jMenuItem4.setText("M\u00FC\u015Fteri Arama");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

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

        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Banking System Management\\images\\ParaCekme.png")); // NOI18N
        jMenuItem6.setText("Para \u00C7ekme");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Banking System Management\\images\\ParaTransferi.png")); // NOI18N
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
       
        
    }

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
             // TODO add your handling code here:
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       HesapOlusturma create=new HesapOlusturma();
       create.main(); 
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        HesapGuncelleme update=new HesapGuncelleme();
        update.main();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        String ac=JOptionPane.showInputDialog(null,"Silmek Istediginiz Hesap Numarasi");
        try
        {
           DBConnect db=new DBConnect();
           int response=JOptionPane.showConfirmDialog(null,"Bilgileri Silmek Istediginize Emin Misiniz ?","Onay",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
           if(response==JOptionPane.YES_OPTION)
           {   
           int i=db.stmt.executeUpdate("DELETE FROM account WHERE Account_Number ='"+ac+"'");
           if(i!=0)
           {
               JOptionPane.showMessageDialog(null,"Hesap Basari ile Silindi","Hesap Silindi",JOptionPane.INFORMATION_MESSAGE);
           }
           else
           {
                JOptionPane.showMessageDialog(null,"Hesap Silinemedi","Silme Hatasi",JOptionPane.ERROR_MESSAGE);
           }
           }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
     ParaCekme ParaCekme=new ParaCekme();
     ParaCekme.main();
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
      ParaTransferi ParaTransferi=new ParaTransferi();
      ParaTransferi.main();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        IslemGecmisi history=new IslemGecmisi();
        history.main();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
   MusteriListesi l1=new MusteriListesi();
   l1.main();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    public static void main() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusteriTemsilcisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriTemsilcisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriTemsilcisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriTemsilcisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriTemsilcisi().setVisible(true);
            }
        });
    }
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;

}
