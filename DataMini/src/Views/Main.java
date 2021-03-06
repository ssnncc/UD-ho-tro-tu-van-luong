/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Services.JobDecisionTree;
import Services.ProcessWeka;
import java.awt.Dimension;
import java.io.File;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import weka.classifiers.trees.J48;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;

/**
 *
 * @author UnmatchedTaiNguyen
 */
public class Main extends javax.swing.JFrame {

    public static Map<String, ContainerMap> Attributes = new Hashtable<>();

    private class ContainerMap {

        public ContainerMap(JComboBox<String> cmb, String[] s) {
            Comb = cmb;
            Value = s;
        }
        public JComboBox<String> Comb;
        public String[] Value;
    }

    /**
     * Creates new form NewJFrame
     */
    public Main() {
        initComponents();
        Main.Attributes.put("KyNangMem", new ContainerMap(jComboBox1, new String[]{"GT", "QLTG", "TT", "LVN", ""}));
        Main.Attributes.put("NNLT", new ContainerMap(jComboBox2, new String[]{"PB", "TB", "KPB"}));
        Main.Attributes.put("QuyMoCongTy", new ContainerMap(jComboBox3, new String[]{"LON", "NHO", "TB"}));
        Main.Attributes.put("LinhVuc", new ContainerMap(jComboBox4, new String[]{"FrontEnd", "Back-end", "Mobile", "BackEnd,FrontEnd", "FrontEnd,Mobile", "Tester", "Developer Option"}));
        Main.Attributes.put("KhuVuc", new ContainerMap(jComboBox8, new String[]{"KV1", "KV2", "KV3"}));
        Main.Attributes.put("NgoaiNgu", new ContainerMap(jComboBox7, new String[]{"TT", "DV", "CB", "KC"}));
        Main.Attributes.put("KinhNghiem", new ContainerMap(jComboBox6, new String[]{"Internship", "Fresher", "Junior", "Senior"}));
    }
    private JobDecisionTree _Tree;
    private JFrame _Parent;

    private Instance GetTestInstance() {
        Instance ii = new DenseInstance(_Tree.trainingData.size());
        ii.setDataset(_Tree.trainingData);
        int index = 0;

        for (int i = 0; i < _Tree.trainingData.numAttributes(); i++) {
            Attribute attr = _Tree.trainingData.attribute(index);
            String name = attr.name();
            ContainerMap conMap = Main.Attributes.get(name);
            if (conMap == null || conMap.Comb.getSelectedIndex() == 0) {
//                System.out.println(_Tree.performTraining().);
                ii.setMissing(index++);
                System.out.println(ii.value(index - 1));
            } else {
                Integer idx = conMap.Comb.getSelectedIndex();

                System.out.println(conMap.Value[idx - 1]);
                ii.setValue(index++, conMap.Value[idx - 1]);
            }
        }
        return ii;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel4.setLayout(new java.awt.BorderLayout());

        jTabbedPane2.setBackground(new java.awt.Color(102, 255, 51));
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("0");
        jLabel1.setPreferredSize(new java.awt.Dimension(34, 300));
        jPanel5.add(jLabel1);

        jTabbedPane2.addTab("Mức Lương Đề Xuất", jPanel5);

        jPanel4.add(jTabbedPane2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1098, 400));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NNLT");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 130, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Ngoại Ngữ");
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None>", "Phổ biến", "Trung Bình", "Không phổ biến" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 218, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Kinh Nghiệm");
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(100, 50));
        jTextField1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField1InputMethodTextChanged(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 218, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Quy Mô Công Ty");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 130, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Lương");
        jLabel10.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None>", "Lớn", "Nhỏ", "Trung Bình" }));
        jComboBox3.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 218, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Lĩnh Vực");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 130, -1));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None>", "Front End", "Back End", "Mobie", "Back End - Front End", "Tester", "Developer Option" }));
        jComboBox4.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 218, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Khu Vực");
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Run");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 229, 42));

        jComboBox6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None>", "Intership", "Fresher", "Junior", "Senior" }));
        jComboBox6.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 218, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Kỹ Năng Mềm");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 130, -1));

        jComboBox7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None>", "Thành Thạo", "Đọc Viết", "Cơ bản", "Không Có" }));
        jComboBox7.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 218, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None>", "Giao Tiếp", "Quản lý thời gian", "thuyết trình", "Làm việc nhóm" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 218, -1));

        jComboBox8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None>", "Khu Vực 1", "Khu Vực 2", "Khu Vực 3" }));
        jComboBox8.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 218, -1));

        jButton4.setText("Choose...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 40));

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 440, 40));

        jPanel1.add(jPanel2);

        jPanel6.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel3.add(jTabbedPane1, java.awt.BorderLayout.CENTER);
        jTabbedPane1.getAccessibleContext().setAccessibleName("JpResult");

        jPanel6.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel6, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private int GetIndexCombobox(String[] a, String Value) {
        for (int i = 0; i < a.length; i++) {
            String v = a[i];
            if (v.trim().equalsIgnoreCase(Value)) {
                return i;
            }
        }
        return -1;
    }

    private void generateField(Instance instance) {
        Enumeration<Attribute> hh = instance.enumerateAttributes();
        Attribute luong = _Tree.trainingData.attribute("Luong");
        instance.setMissing(luong);

        while (hh.hasMoreElements()) {
            Attribute nextElement = hh.nextElement();
            if (instance.isMissing(nextElement) && !luong.equals(nextElement)) {
                _Tree.trainingData.setClass(nextElement);
                int result = _Tree.TestData(instance);
                System.out.println("result:" + result);
                String Value = nextElement.value(result);
                System.out.println(Value);

                ContainerMap comm = Attributes.get(nextElement.name());
                int IndexCMB = GetIndexCombobox(comm.Value, Value);
                comm.Comb.setSelectedIndex(IndexCMB + 1);
                instance.setValue(nextElement, Value);
            }
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui long nhap luong!");
            return;
        }
        Instance instance = GetTestInstance();
        generateField(instance);
        Attribute luong = _Tree.trainingData.attribute("Luong");
        _Tree.trainingData.setClass(luong);
        jLabel1.setText(_Tree.trainingData.attribute(7).value(_Tree.TestData(instance)));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosing

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser openfile = new JFileChooser("D:\\ProjectOrder\\ScanDATA\\DataJobs");
        openfile.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV", "csv");
        openfile.setFileFilter(filter);
        openfile.setPreferredSize(new Dimension(800, 600));
        int result = openfile.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = openfile.getSelectedFile();
            jTextField3.setText(file.getAbsolutePath());
            System.out.println(file.getAbsoluteFile());
            _Tree = new JobDecisionTree((file.getAbsolutePath()));
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() < '0' || evt.getKeyChar() < '9') {
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1InputMethodTextChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
