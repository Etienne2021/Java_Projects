package igu;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author etien
 */
public class Principal extends javax.swing.JFrame {

    Random numrandom;
    int minimo;
    int maximo;
    int cantsorteos = 1;
    String mes;

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtcantganadores = new javax.swing.JTextField();
        btnsortear = new javax.swing.JButton();
        btncerrarsorteo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblganadores = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Datos del Sorteo");

        jLabel4.setText("Mes del sorteo");

        cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel5.setText("Cantidad Ganadores:");

        txtcantganadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantganadoresActionPerformed(evt);
            }
        });

        btnsortear.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnsortear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loteria.png"))); // NOI18N
        btnsortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortearActionPerformed(evt);
            }
        });

        btncerrarsorteo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btncerrarsorteo.setText("Cerrar Sorteo");
        btncerrarsorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarsorteoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcantganadores, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(56, 56, 56)
                                .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnsortear)
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btncerrarsorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsortear)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtcantganadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addComponent(btncerrarsorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Ganadores");

        tblganadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posicion", "Numero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblganadores);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("Sorteador Supermercado");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/shopping-cart_3394009.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortearActionPerformed

        if (!txtcantganadores.getText().equals("")) {
            int cantganadores = Integer.parseInt(txtcantganadores.getText());

            if (cantsorteos <= cantganadores) {
                mes = (String) cmb.getSelectedItem();
                String min = "01";
                String max;

                if (mes.equals("02")) {
                    max = "28";
                } else {
                    if (mes.equals("11") || mes.equals("06") || mes.equals("04") || mes.equals("09")) {
                        max = "30";
                    } else {
                        max = "31";
                    }
                }

                numrandom = new Random();
                minimo = Integer.parseInt(min);
                maximo = Integer.parseInt(max);

                String numerosorteado = sortear();

                //Controlar que no haya salido
                boolean esta = buscarrepetido(numerosorteado);

                if (esta == false) {

                    agregarValoratabla(cantsorteos, numerosorteado);

                    cantsorteos++;
                } else {
                    while (esta == true) {
                        numerosorteado = sortear();
                        esta = buscarrepetido(numerosorteado);
                    }
                    if(esta==false)
                    {
                agregarValoratabla(cantsorteos, numerosorteado);
                cantsorteos++;

                    }

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ya se alcanzo la cantidad de ganadores");

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Es necesario completar la cantidad de ganadores");
        }


    }//GEN-LAST:event_btnsortearActionPerformed

    private void txtcantganadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantganadoresActionPerformed


    }//GEN-LAST:event_txtcantganadoresActionPerformed

    private void btncerrarsorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarsorteoActionPerformed

        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente finaLizar el sorteo?", "Finalizacion sorteo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            txtcantganadores.setText("");
            cmb.setSelectedIndex(0);
            //Opcion1 NO EFICIENTE
            /* DefaultTableModel modelo = (DefaultTableModel) tblganadores.getModel();
      
      for(int i = modelo.getRowCount()-1;i>-1;i--);
      {
          modelo.removeRow(i);
      }*/

            //opcion2
            DefaultTableModel modelo = (DefaultTableModel) tblganadores.getModel();
            modelo.setRowCount(0);

            cantsorteos = 1;
        }
    }//GEN-LAST:event_btncerrarsorteoActionPerformed

    public String agregarCeros(int randomdia, String mes, int randomticket) {

        // Formatear el día para que tenga siempre dos dígitos
        int largostring = Integer.toString(randomdia).length();
        String numerosorteado = "";

        while (largostring < 2) {
            numerosorteado += "0";
            largostring++;
        }
        numerosorteado += randomdia + mes;

// Formatear el ticket para que tenga siempre cuatro dígitos
        largostring = Integer.toString(randomticket).length();
        while (largostring < 4) {
            numerosorteado += "0";
            largostring++;
        }
        numerosorteado += randomticket;

        return numerosorteado;

    }

    private boolean buscarrepetido(String numerosorteado) {

        boolean esta = false;
        DefaultTableModel modelo = (DefaultTableModel) tblganadores.getModel();

        for (int f = 0; f < modelo.getRowCount(); f++) {
            for (int c = 0; c < modelo.getColumnCount(); c++) {
                if (modelo.getValueAt(f, c).equals(numerosorteado)) {
                    esta = true;
                    break;
                }
            }
        }
        return esta;
    }

    public String sortear() {
        //sorteo
        int randomdia = numrandom.nextInt(maximo - minimo + 1) + minimo;
        int randomticket = numrandom.nextInt(9999 - 0001 + 1) + 0001;
        String numerosorteado = agregarCeros(randomdia, mes, randomticket);

        return numerosorteado;
    }

    public void agregarValoratabla(int cotsorteo, String numerosorteado) {
        //agregar ganador a la tabla
        DefaultTableModel modelo = (DefaultTableModel) tblganadores.getModel();
        Object[] objeto = {cantsorteos, numerosorteado};
        modelo.addRow(objeto);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrarsorteo;
    private javax.swing.JButton btnsortear;
    private javax.swing.JComboBox<String> cmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblganadores;
    private javax.swing.JTextField txtcantganadores;
    // End of variables declaration//GEN-END:variables

}
