package program;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.List;

// KODE YANG BENAR (Langsung ke nama package foldernya)
import service.MysqlMahasiswaService;
import model.Mahasiswa;
/**
 * @author Lintunggkk
 */
public class JFrameUtama extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrameUtama.class.getName());

    // Menggunakan dependensi internal service database
    private final MysqlMahasiswaService mhsService;
    private final DefaultListModel<String> modelId;
    private final DefaultListModel<String> modelNama;

    /**
     * Creates new form JFrameUtama
     */
    public JFrameUtama() {
        initComponents();
        
        // Inisialisasi service dan model komponen
        mhsService = new MysqlMahasiswaService();
        modelId = new DefaultListModel<>();
        modelNama = new DefaultListModel<>();
        
        // Hubungkan model internal ke komponen JList bentukan NetBeans
        listId.setModel(modelId);
        listNama.setModel(modelNama);
        
        // Ambil data otomatis di awal program menyala
        ambilSemuaData();
    }
    
    /**
     * Method helper mengambil record mahasiswa langsung dari DB
     */
    private void ambilSemuaData() {
        modelId.clear();
        modelNama.clear();
        try {
            List<Mahasiswa> daftarMahasiswa = mhsService.getAll();
            for (Mahasiswa mhs : daftarMahasiswa) {
                modelId.addElement(String.valueOf(mhs.getId()));
                modelNama.addElement(mhs.getNama());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAmbilSemua = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnTambahkan = new javax.swing.JButton();
        txtEditId = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        txtEditNama = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        btnResetIndeks = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listId = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listNama = new javax.swing.JList<>();
        txtHapusId = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAmbilSemua.setText("Ambil Semua Data");
        btnAmbilSemua.addActionListener(this::btnAmbilSemuaActionPerformed);

        jTextField1.setText("jTextField1");

        btnTambahkan.setText("Tambahkan");
        btnTambahkan.addActionListener(this::btnTambahkanActionPerformed);

        btnResetIndeks.setText("Reset indeks");

        jLabel3.setText("nama");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnResetIndeks)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAmbilSemua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEditId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEditNama, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambahkan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAmbilSemua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTambahkan)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnResetIndeks)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        listId.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listId);

        listNama.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listNama);

        txtHapusId.setText("Edit");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(this::btnHapusActionPerformed);

        jLabel1.setText("ID");

        jLabel2.setText("NAMA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHapusId)
                            .addComponent(btnHapus))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtHapusId)
                .addGap(18, 18, 18)
                .addComponent(btnHapus)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAmbilSemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmbilSemuaActionPerformed
        // TODO add your handling code here:
        ambilSemuaData(); // Memanggil fungsi pembaruan list [cite: 50]
    }//GEN-LAST:event_btnAmbilSemuaActionPerformed

    private void btnTambahkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahkanActionPerformed
        // TODO add your handling code here:
       String nama = jTextField1.getText().trim();
        if (!nama.isEmpty()) {
            Mahasiswa mhs = new Mahasiswa(); // Membuat objek mahasiswa [cite: 38]
            mhs.setNama(nama);
            
            mhsService.add(mhs);       // Eksekusi penambahan data ke DB [cite: 40]
            jTextField1.setText("");   // Bersihkan kolom input nama
            ambilSemuaData();          // Refresh list pada GUI secara otomatis [cite: 50]
        } else {
            JOptionPane.showMessageDialog(this, "Input nama tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnTambahkanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            // Mengambil input ID dari jTextField3 sesuai penempatan di panel layoutmu
            int id = Integer.parseInt(jTextField3.getText().trim());
            
            mhsService.delete(id);     // Eksekusi hapus record di DB [cite: 43]
            jTextField3.setText("");   // Kosongkan field ID hapus
            ambilSemuaData();          // Refresh tampilan list komponen GUI
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID Hapus harus berupa angka murni!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnHapusActionPerformed
                                   

    // Tambahkan method Edit ini di bawah method Hapus
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {                                        
        try {
            int id = Integer.parseInt(txtEditId.getText().trim());
            String namaBaru = txtEditNama.getText().trim();
            
            if (!namaBaru.isEmpty()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(id);
                mhs.setNama(namaBaru);
                
                mhsService.update(mhs);    // Eksekusi update data ke DB [cite: 41]
                txtEditId.setText("");     // Kosongkan field input
                txtEditNama.setText("");
                ambilSemuaData();          // Refresh list komponen GUI
            } else {
                JOptionPane.showMessageDialog(this, "Nama pengubah tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID Edit harus diisi angka murni!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                       

    // Tambahkan method Reset Indeks ini di bawah method Edit
    private void btnResetIndeksActionPerformed(java.awt.event.ActionEvent evt) {                                               
        mhsService.indexReset();       // Mengubah auto-increment kembali ke awal [cite: 46]
        ambilSemuaData();              // Refresh tampilan data
    }
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JFrameUtama().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmbilSemua;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnResetIndeks;
    private javax.swing.JButton btnTambahkan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JList<String> listId;
    private javax.swing.JList<String> listNama;
    private javax.swing.JTextField txtEditId;
    private javax.swing.JTextField txtEditNama;
    private javax.swing.JButton txtHapusId;
    // End of variables declaration//GEN-END:variables
}
