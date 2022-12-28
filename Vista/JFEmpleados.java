
package Vista;

import Negocio.EmpleadoAsalariado;
import Negocio.EmpleadoBaseMasComision;
import Negocio.EmpleadoPorComision;
import Negocio.EmpleadosPorHoras;
import Negocio.Fecha;
import Negocio.ListaEmpleados;
import javax.swing.JOptionPane;

/**
 *
 * @author johanna.huaraca
 */
public class JFEmpleados extends javax.swing.JFrame {
public ListaEmpleados lista;
private String salida;
    
    public JFEmpleados() {
        initComponents();
        lista=new ListaEmpleados();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFNombresAsa = new javax.swing.JTextField();
        jTFNacimientoAsa = new javax.swing.JTextField();
        jTFFechaIngresoAsa = new javax.swing.JTextField();
        jTFSalarioBasicoAsa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAEmpleadoAsa = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTFNombreH = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTFNacH = new javax.swing.JTextField();
        jTFInH = new javax.swing.JTextField();
        jTNumH = new javax.swing.JTextField();
        jTValorHo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTEmpleadoHora = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTNomComi = new javax.swing.JTextField();
        jTInComi = new javax.swing.JTextField();
        jTNacComi = new javax.swing.JTextField();
        jTVentaTotalComi = new javax.swing.JTextField();
        jTPorcentajeRecibiComi = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTAEmpleadoComi = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTNombresbase = new javax.swing.JTextField();
        jTNacBase = new javax.swing.JTextField();
        jTIngBase = new javax.swing.JTextField();
        jTTotalvendidoBase = new javax.swing.JTextField();
        jTPorcentajeaPagar = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTSalarioBASE = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTEmpleadoBase = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTLista = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleados");
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(237, 237, 237));

        jTabbedPane5.setBackground(java.awt.SystemColor.activeCaption);
        jTabbedPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jTabbedPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado"));

        jLabel1.setText("Nombres");

        jLabel2.setText("F. Nacimiento");

        jLabel3.setText("F. Ingreso");

        jLabel4.setText("Salario Básico");

        jTFNombresAsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombresAsaActionPerformed(evt);
            }
        });
        jTFNombresAsa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNombresAsaKeyTyped(evt);
            }
        });

        jTFNacimientoAsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNacimientoAsaActionPerformed(evt);
            }
        });
        jTFNacimientoAsa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNacimientoAsaKeyTyped(evt);
            }
        });

        jTFFechaIngresoAsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFechaIngresoAsaActionPerformed(evt);
            }
        });

        jLabel5.setText("(dd/mm/aa)");

        jLabel6.setText("(dd/mm/aa)");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNombresAsa))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNacimientoAsa))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFSalarioBasicoAsa, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jTFFechaIngresoAsa)))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNombresAsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFNacimientoAsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFFechaIngresoAsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFSalarioBasicoAsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTAEmpleadoAsa.setEditable(false);
        jTAEmpleadoAsa.setColumns(20);
        jTAEmpleadoAsa.setRows(5);
        jTAEmpleadoAsa.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado Asalariado"));
        jScrollPane1.setViewportView(jTAEmpleadoAsa);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Asalariado", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado"));

        jLabel7.setText("Nombres");

        jLabel8.setText("F. Nacimiento");

        jLabel9.setText("F. Ingreso");

        jLabel10.setText("Num. Horas");

        jLabel11.setText("Valor Hora");

        jTFNombreH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNombreHKeyTyped(evt);
            }
        });

        jLabel12.setText("(dd/mm/aa)");

        jLabel13.setText("(dd/mm/aa)");

        jTFNacH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNacHActionPerformed(evt);
            }
        });

        jTFInH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFInHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jTFNombreH, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTValorHo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28)
                        .addComponent(jTFNacH))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNumH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFInH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFNombreH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFNacH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFInH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTNumH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTValorHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTEmpleadoHora.setEditable(false);
        jTEmpleadoHora.setColumns(20);
        jTEmpleadoHora.setRows(5);
        jTEmpleadoHora.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado por horas"));
        jScrollPane3.setViewportView(jTEmpleadoHora);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Por Horas", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado"));

        jLabel14.setText("Nombre");

        jLabel15.setText("F. Ingreso");

        jLabel16.setText("F. Nacimiento");

        jLabel17.setText("Venta total");

        jLabel18.setText("% a recibir");

        jTNomComi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNomComiKeyTyped(evt);
            }
        });

        jTInComi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTInComiActionPerformed(evt);
            }
        });

        jTNacComi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNacComiActionPerformed(evt);
            }
        });

        jLabel19.setText("(dd/mm/aa)");

        jLabel20.setText("(dd/mm/aa)");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jTNomComi))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNacComi, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jTInComi)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTPorcentajeRecibiComi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(jTVentaTotalComi, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTNomComi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTInComi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(16, 16, 16)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNacComi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTVentaTotalComi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPorcentajeRecibiComi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTAEmpleadoComi.setEditable(false);
        jTAEmpleadoComi.setColumns(20);
        jTAEmpleadoComi.setRows(5);
        jTAEmpleadoComi.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado por comisión"));
        jScrollPane5.setViewportView(jTAEmpleadoComi);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Por Comisión", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado "));

        jLabel21.setText("Nombres");

        jLabel22.setText("F. Nacimiento");

        jLabel23.setText("F. Ingreso");

        jLabel24.setText("Total Vendido");

        jLabel25.setText("% pagar");

        jTNombresbase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombresbaseActionPerformed(evt);
            }
        });
        jTNombresbase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNombresbaseKeyTyped(evt);
            }
        });

        jTNacBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNacBaseActionPerformed(evt);
            }
        });
        jTNacBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNacBaseKeyTyped(evt);
            }
        });

        jTIngBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIngBaseActionPerformed(evt);
            }
        });

        jTTotalvendidoBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTotalvendidoBaseActionPerformed(evt);
            }
        });
        jTTotalvendidoBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTotalvendidoBaseKeyTyped(evt);
            }
        });

        jTPorcentajeaPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPorcentajeaPagarActionPerformed(evt);
            }
        });

        jLabel26.setText("(dd/mm/aa)");

        jLabel27.setText("(dd/mm/aa)");

        jLabel28.setText("Salario base");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTNombresbase))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jTIngBase))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTNacBase))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTTotalvendidoBase, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(33, 33, 33)
                        .addComponent(jTPorcentajeaPagar))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(17, 17, 17)
                        .addComponent(jTSalarioBASE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTNombresbase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTNacBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTIngBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTotalvendidoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPorcentajeaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTSalarioBASE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTEmpleadoBase.setEditable(false);
        jTEmpleadoBase.setColumns(20);
        jTEmpleadoBase.setRows(5);
        jTEmpleadoBase.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado Base mas comisión "));
        jScrollPane7.setViewportView(jTEmpleadoBase);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Base mas Comisión", jPanel6);

        jTLista.setEditable(false);
        jTLista.setColumns(20);
        jTLista.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTLista.setRows(5);
        jTLista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jScrollPane2.setViewportView(jTLista);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton1KeyTyped(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Nuevo Empleado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("  Salir  ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(135, 135, 135)
                        .addComponent(jButton3)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(116, 116, 116))
        );

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Salir");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch(jTabbedPane5.getSelectedIndex()){
            case 0:{
                 Fecha fechaNacimiento= new Fecha(this.jTFNacimientoAsa.getText());
                 Fecha fechaIngreso= new Fecha(this.jTFFechaIngresoAsa.getText());
                 double salario =Double.parseDouble(this.jTFSalarioBasicoAsa.getText());
                 String nombres= this.jTFNombresAsa.getText();
                  EmpleadoAsalariado emAsa= new EmpleadoAsalariado(salario, fechaIngreso, nombres, fechaNacimiento);
                  this.jTAEmpleadoAsa.setText(emAsa.toString());
                  lista.addEmpleado(emAsa);
                  this.jTLista.setText(lista.toString());
                  break;
            }
            
            case 1:{
                  Fecha fechaNacimiento= new Fecha(this.jTFNacH.getText());
                  Fecha fechaIngreso= new Fecha(this.jTFInH.getText());
                  float numHoras =Float.parseFloat(this.jTNumH.getText());
                  float costoHoras =Float.parseFloat(this.jTValorHo.getText());
                  String nombres= this.jTFNombreH.getText();
                  EmpleadosPorHoras emHo= new EmpleadosPorHoras ( numHoras, costoHoras, fechaIngreso, nombres, fechaNacimiento);
                  this.jTEmpleadoHora.setText(emHo.toString());
                  lista.addEmpleado(emHo);
                  this.jTLista.setText(lista.toString()); 
                  break;
            }
            
            case 2:{//por comision 
                Fecha fechaNacimiento= new Fecha(this.jTNacComi.getText());
                  Fecha fechaIngreso= new Fecha(this.jTInComi.getText());
                  double totalVentas =Double.parseDouble(this.jTVentaTotalComi.getText());
                  double porcentajeComision =Double.parseDouble(this.jTPorcentajeRecibiComi.getText());
                  String nombres= this.jTNomComi.getText();
                  EmpleadoPorComision emCo= new EmpleadoPorComision ( totalVentas,  porcentajeComision, fechaIngreso, nombres, fechaNacimiento);
                  this.jTAEmpleadoComi.setText(emCo.toString());
                  lista.addEmpleado(emCo);
                  this.jTLista.setText(lista.toString()); 
                  break;
            }
            
            case 3:{//base mas comision 
              Fecha fechaNacimiento= new Fecha(this.jTNacBase.getText());
                  Fecha fechaIngreso= new Fecha(this.jTIngBase.getText());
                  double salarioBase =Double.parseDouble(this.jTSalarioBASE.getText());
                  double totalVenta =Double.parseDouble(this.jTTotalvendidoBase.getText());
                  double porcentajeComision =Double.parseDouble(this.jTPorcentajeaPagar.getText());
                  String nombres= this.jTNombresbase.getText();
                  EmpleadoBaseMasComision emCo= new EmpleadoBaseMasComision ( salarioBase,  totalVenta,  porcentajeComision,  fechaIngreso,nombres,  fechaNacimiento);
                  this.jTEmpleadoBase.setText(emCo.toString());
                  lista.addEmpleado(emCo);
                  this.jTLista.setText(lista.toString()); 
                  break;
            }
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTFNacimientoAsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNacimientoAsaActionPerformed
       Fecha fechaNacimiento= new Fecha(this.jTFNacimientoAsa.getText());
       if(fechaNacimiento.validarFecha( fechaNacimiento ) == true){
          JOptionPane.showMessageDialog(null, "La fecha es Incorrecta");
          this.jTFNacimientoAsa.setText("");
          this.jTFFechaIngresoAsa.requestFocus();
       }
       else{
           JOptionPane.showMessageDialog(null, "La fecha es Correcta");
       }
    }//GEN-LAST:event_jTFNacimientoAsaActionPerformed

    private void jTFNacimientoAsaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNacimientoAsaKeyTyped
    
    }//GEN-LAST:event_jTFNacimientoAsaKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       switch(jTabbedPane5.getSelectedIndex()){
            case 0:{
                 this.jTFNacimientoAsa.setText("");
                 this.jTFFechaIngresoAsa.setText("");
                 this.jTAEmpleadoAsa.setText("");
                 this.jTFSalarioBasicoAsa.setText("");
                 this.jTFNombresAsa.setText(""); }
            
            case 1:{
                 this.jTFNacH.setText("");
                 this.jTFInH.setText("");
                 this.jTNumH.setText("");
                 this.jTValorHo.setText("");
                 this.jTFNombreH.setText("");
                 this.jTEmpleadoHora.setText("");}
            
            case 2:{
                 this.jTNacComi.setText("");
                 this.jTInComi.setText("");
                 this.jTVentaTotalComi.setText("");
                 this.jTPorcentajeRecibiComi.setText("");
                 this.jTAEmpleadoComi.setText("");
                 this.jTNomComi.setText("");}
            
            case 3:{
                 this.jTNacBase.setText("");
                 this.jTIngBase.setText("");
                 this.jTSalarioBASE.setText("");
                 this.jTTotalvendidoBase.setText("");
                 this.jTPorcentajeaPagar.setText("");
                 this.jTEmpleadoBase.setText("");
                 this.jTNombresbase.setText("");}
       
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTFNombresAsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombresAsaActionPerformed
    this.jTFNacimientoAsa.requestFocus();
    }//GEN-LAST:event_jTFNombresAsaActionPerformed

    private void jTFNombresAsaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombresAsaKeyTyped
       char variablenom = evt.getKeyChar();
      if (Character.isDigit(variablenom)){
      getToolkit().beep();
      evt.consume();
      JOptionPane.showMessageDialog(null, "Ingrese solo letras");
   }
    }//GEN-LAST:event_jTFNombresAsaKeyTyped

    private void jTFNombreHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreHKeyTyped
        char variablenom = evt.getKeyChar();
   if (Character.isDigit(variablenom)){
      getToolkit().beep();
      evt.consume();
      JOptionPane.showMessageDialog(null, "Ingrese solo letras");
   }
    }//GEN-LAST:event_jTFNombreHKeyTyped

    private void jTNomComiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomComiKeyTyped
        char variablenom = evt.getKeyChar();
   if (Character.isDigit(variablenom)){
      getToolkit().beep();
      evt.consume();
      JOptionPane.showMessageDialog(null, "Ingrese solo letras");
   }
    }//GEN-LAST:event_jTNomComiKeyTyped

    private void jTNombresbaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombresbaseKeyTyped
        char variablenom = evt.getKeyChar();
   if (Character.isDigit(variablenom)){
      getToolkit().beep();
      evt.consume();
      JOptionPane.showMessageDialog(null, "Ingrese solo letras");
   }
   
    }//GEN-LAST:event_jTNombresbaseKeyTyped

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTFFechaIngresoAsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFechaIngresoAsaActionPerformed
        Fecha fechaIngreso= new Fecha(this.jTFFechaIngresoAsa.getText());
       
       if(fechaIngreso.validarFecha( fechaIngreso ) == true){
          JOptionPane.showMessageDialog(null, "La fecha es Incorrecta");
          this.jTFFechaIngresoAsa.setText("");
          this.jTFSalarioBasicoAsa.requestFocus();
       }
       else{
           JOptionPane.showMessageDialog(null, "La fecha es Correcta");
       }
    }//GEN-LAST:event_jTFFechaIngresoAsaActionPerformed

    private void jTFNacHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNacHActionPerformed
       Fecha fecha= new Fecha(this.jTFNacH.getText());
       
       if(fecha.validarFecha( fecha ) == true){
          JOptionPane.showMessageDialog(null, "La fecha es Incorrecta");
          this.jTFNacH.setText("");
          this.jTFInH.requestFocus();
       }
       else{
           JOptionPane.showMessageDialog(null, "La fecha es Correcta");
       }
    }//GEN-LAST:event_jTFNacHActionPerformed

    private void jTFInHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFInHActionPerformed
        Fecha fecha= new Fecha(this.jTFInH.getText());
       
       if(fecha.validarFecha( fecha ) == true){
          JOptionPane.showMessageDialog(null, "La fecha es Incorrecta");
          this.jTFInH.setText("");
          this.jTNumH.requestFocus();
       }
       else{
           JOptionPane.showMessageDialog(null, "La fecha es Correcta");
       }
    }//GEN-LAST:event_jTFInHActionPerformed

    private void jTInComiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTInComiActionPerformed
         Fecha fecha= new Fecha(this.jTInComi.getText());
       
       if(fecha.validarFecha( fecha ) == true){
          JOptionPane.showMessageDialog(null, "La fecha es Incorrecta");
          this.jTInComi.setText("");
          this.jTNacComi.requestFocus();
       }
       else{
           JOptionPane.showMessageDialog(null, "La fecha es Correcta");
       }
    }//GEN-LAST:event_jTInComiActionPerformed

    private void jTNacComiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNacComiActionPerformed
         Fecha fecha= new Fecha(this.jTNacComi.getText());
       
       if(fecha.validarFecha( fecha ) == true){
          JOptionPane.showMessageDialog(null, "La fecha es Incorrecta");
          this.jTNacComi.setText("");
          this.jTVentaTotalComi.requestFocus();
       }
       else{
           JOptionPane.showMessageDialog(null, "La fecha es Correcta");
       }
    }//GEN-LAST:event_jTNacComiActionPerformed

    private void jTNacBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNacBaseActionPerformed
         Fecha fecha= new Fecha(this.jTNacBase.getText());
       
       if(fecha.validarFecha( fecha ) == true){
          JOptionPane.showMessageDialog(null, "La fecha es Incorrecta");
          this.jTNacBase.setText("");
          this.jTIngBase.requestFocus();
       }
       else{
           JOptionPane.showMessageDialog(null, "La fecha es Correcta");
       }
    }//GEN-LAST:event_jTNacBaseActionPerformed

    private void jTIngBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIngBaseActionPerformed
        Fecha fecha= new Fecha(this.jTIngBase.getText());
       
       if(fecha.validarFecha( fecha ) == true){
          JOptionPane.showMessageDialog(null, "La fecha es Incorrecta");
          this.jTIngBase.setText("");
          this.jTTotalvendidoBase.requestFocus();
       }
       else{
           JOptionPane.showMessageDialog(null, "La fecha es Correcta");
       }
    }//GEN-LAST:event_jTIngBaseActionPerformed

    private void jTNacBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNacBaseKeyTyped
       
    }//GEN-LAST:event_jTNacBaseKeyTyped

    private void jTNombresbaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombresbaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombresbaseActionPerformed

    private void jTTotalvendidoBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTotalvendidoBaseKeyTyped
         
    }//GEN-LAST:event_jTTotalvendidoBaseKeyTyped

    private void jTTotalvendidoBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTotalvendidoBaseActionPerformed
        
    }//GEN-LAST:event_jTTotalvendidoBaseActionPerformed

    private void jTPorcentajeaPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPorcentajeaPagarActionPerformed
        
    }//GEN-LAST:event_jTPorcentajeaPagarActionPerformed

    private void jButton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyTyped
       
        switch(jTabbedPane5.getSelectedIndex()){
            case 0:{
                 
                 this.jTFNacimientoAsa.requestFocus();
                 this.jTFFechaIngresoAsa.requestFocus();
                 this.jTAEmpleadoAsa.requestFocus();
                 this.jTFSalarioBasicoAsa.requestFocus();
                 this.jTFNombresAsa.requestFocus();
            }
            
            case 1:{
                 this.jTFNacH.requestFocus();
                 this.jTFInH.requestFocus();
                 this.jTNumH.requestFocus();
                 this.jTValorHo.requestFocus();
                 this.jTFNombreH.requestFocus();
                 this.jTEmpleadoHora.requestFocus();
                
                  
            }
            
            case 2:{
                 this.jTNacComi.requestFocus();
                 this.jTInComi.requestFocus();
                 this.jTVentaTotalComi.requestFocus();
                 this.jTPorcentajeRecibiComi.requestFocus();
                 this.jTAEmpleadoComi.requestFocus();
                 this.jTNomComi.requestFocus();
                  
                
            } 
            case 3:{
                 this.jTNacBase.requestFocus();
                 this.jTIngBase.requestFocus();
                 this.jTSalarioBASE.requestFocus();
                 this.jTTotalvendidoBase.requestFocus();
                 this.jTPorcentajeaPagar.requestFocus();
                 this.jTEmpleadoBase.requestFocus();
                 this.jTNombresbase.requestFocus();
                 
        }
       
       }
    }//GEN-LAST:event_jButton1KeyTyped

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
            java.util.logging.Logger.getLogger(JFEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTAEmpleadoAsa;
    private javax.swing.JTextArea jTAEmpleadoComi;
    private javax.swing.JTextArea jTEmpleadoBase;
    private javax.swing.JTextArea jTEmpleadoHora;
    private javax.swing.JTextField jTFFechaIngresoAsa;
    private javax.swing.JTextField jTFInH;
    private javax.swing.JTextField jTFNacH;
    private javax.swing.JTextField jTFNacimientoAsa;
    private javax.swing.JTextField jTFNombreH;
    private javax.swing.JTextField jTFNombresAsa;
    private javax.swing.JTextField jTFSalarioBasicoAsa;
    private javax.swing.JTextField jTInComi;
    private javax.swing.JTextField jTIngBase;
    private javax.swing.JTextArea jTLista;
    private javax.swing.JTextField jTNacBase;
    private javax.swing.JTextField jTNacComi;
    private javax.swing.JTextField jTNomComi;
    private javax.swing.JTextField jTNombresbase;
    private javax.swing.JTextField jTNumH;
    private javax.swing.JTextField jTPorcentajeRecibiComi;
    private javax.swing.JTextField jTPorcentajeaPagar;
    private javax.swing.JTextField jTSalarioBASE;
    private javax.swing.JTextField jTTotalvendidoBase;
    private javax.swing.JTextField jTValorHo;
    private javax.swing.JTextField jTVentaTotalComi;
    private javax.swing.JTabbedPane jTabbedPane5;
    // End of variables declaration//GEN-END:variables
}
