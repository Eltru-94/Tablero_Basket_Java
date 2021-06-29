package tablero_basket_java;

import com.panamahitek.PanamaHitek_Arduino;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;

public class Tablero_Ejecutar extends javax.swing.JFrame {

    PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();//Llamamos a la libreria PanamaHitek_Arduinocc
    SerialPortEventListener evento = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {

                
                if (Arduino.isMessageAvailable()) {//Verificamos si nos han enviado un dato
                    dato = Arduino.printMessage();//Leemos el dato enviado
                    imprimirImagenes();//Metodo para Imprimir imagenes en un label
                    System.out.println(dato);
                    
                }

            } catch (Exception e) {
            }

        }
    };

    public Tablero_Ejecutar() {
        initComponents();
        Puertos();//Metodo para visualizar los puertos
        Desconectar();//Metodo para habilitar y desabilitar botones
        this.setLocationRelativeTo(null);//Centramos el Jframe 
    }

    String dato = "0000";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Btn_Punto1Local = new javax.swing.JButton();
        Btn_Punto2Local = new javax.swing.JButton();
        Btn_Punto3Local = new javax.swing.JButton();
        Btn_Faltas_local = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Cbx_puertos = new javax.swing.JComboBox<>();
        Btn_Desconectar = new javax.swing.JButton();
        Btn_Conectar = new javax.swing.JButton();
        Btn_Inicio = new javax.swing.JButton();
        Btn_Pause = new javax.swing.JButton();
        Btn_Periodo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Btn_Punto1Visitante = new javax.swing.JButton();
        Btn_Punto2Visitante = new javax.swing.JButton();
        Btn_Punto3Visitante = new javax.swing.JButton();
        Btn_Faltas_visitante = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lbl_mil_tiempo = new javax.swing.JLabel();
        lbl_centenas_tiempo = new javax.swing.JLabel();
        lbl_unidades_tiempo = new javax.swing.JLabel();
        lbl_decenas_tiempo = new javax.swing.JLabel();
        Lbl_unidades_puntos_local = new javax.swing.JLabel();
        lbl_decenas_faltas_local = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lbl_centenas_puntos_local = new javax.swing.JLabel();
        Lbl_decenas_puntos_local = new javax.swing.JLabel();
        lbl_unidades_faltas_local = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Lbl_decenas_puntos_visitante = new javax.swing.JLabel();
        Lbl_centenas_puntos_visitante = new javax.swing.JLabel();
        Lbl_unidades_puntos_visitante = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_unidades_faltas_visitante = new javax.swing.JLabel();
        lbl_decenas_faltas_visitante = new javax.swing.JLabel();
        Lbl_periodo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4), "PUCE-SI"));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Btn_Punto1Local.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Btn_Punto1Local.setText("PUNTO LOCAL 1");
        Btn_Punto1Local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Punto1LocalActionPerformed(evt);
            }
        });

        Btn_Punto2Local.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Btn_Punto2Local.setText("PUNTO LOCAL 2");
        Btn_Punto2Local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Punto2LocalActionPerformed(evt);
            }
        });

        Btn_Punto3Local.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Btn_Punto3Local.setText("PUNTO LOCAL 3");
        Btn_Punto3Local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Punto3LocalActionPerformed(evt);
            }
        });

        Btn_Faltas_local.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Btn_Faltas_local.setText("FALTAS LOCAL");
        Btn_Faltas_local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Faltas_localActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_Faltas_local, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Punto3Local, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Punto2Local, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Punto1Local, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Punto1Local)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Punto2Local)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Punto3Local)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Faltas_local)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Cbx_puertos.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        Cbx_puertos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puertos" }));
        Cbx_puertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cbx_puertosActionPerformed(evt);
            }
        });

        Btn_Desconectar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        Btn_Desconectar.setText("desconectar");
        Btn_Desconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DesconectarActionPerformed(evt);
            }
        });

        Btn_Conectar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        Btn_Conectar.setText("Conectar");
        Btn_Conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConectarActionPerformed(evt);
            }
        });

        Btn_Inicio.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Btn_Inicio.setText("INICIO");
        Btn_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InicioActionPerformed(evt);
            }
        });

        Btn_Pause.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Btn_Pause.setText("PAUSE");
        Btn_Pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PauseActionPerformed(evt);
            }
        });

        Btn_Periodo.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Btn_Periodo.setText("Periodo");
        Btn_Periodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PeriodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Btn_Conectar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Desconectar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Btn_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_Pause, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(Cbx_puertos, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(Btn_Periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cbx_puertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Conectar)
                    .addComponent(Btn_Desconectar))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Pause, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Periodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.orange, null, null));

        Btn_Punto1Visitante.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Btn_Punto1Visitante.setText("PUNTO VISITANTE 1");
        Btn_Punto1Visitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Punto1VisitanteActionPerformed(evt);
            }
        });

        Btn_Punto2Visitante.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Btn_Punto2Visitante.setText("PUNTO VISITANTE 2");
        Btn_Punto2Visitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Punto2VisitanteActionPerformed(evt);
            }
        });

        Btn_Punto3Visitante.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Btn_Punto3Visitante.setText("PUNTO VISITANTE 3");
        Btn_Punto3Visitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Punto3VisitanteActionPerformed(evt);
            }
        });

        Btn_Faltas_visitante.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Btn_Faltas_visitante.setText("FALTAS VISITANTE");
        Btn_Faltas_visitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Faltas_visitanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Punto1Visitante)
                    .addComponent(Btn_Punto2Visitante)
                    .addComponent(Btn_Punto3Visitante))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Faltas_visitante)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Punto1Visitante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Punto2Visitante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Punto3Visitante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Faltas_visitante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        lbl_mil_tiempo.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\cero.JPG")); // NOI18N

        lbl_centenas_tiempo.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\cero.JPG")); // NOI18N

        lbl_unidades_tiempo.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\cero.JPG")); // NOI18N

        lbl_decenas_tiempo.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\cero.JPG")); // NOI18N

        Lbl_unidades_puntos_local.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\cero.JPG")); // NOI18N

        lbl_decenas_faltas_local.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\cero.JPG")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("LOCAL");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("FALTAS");

        Lbl_centenas_puntos_local.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\cero.JPG")); // NOI18N

        Lbl_decenas_puntos_local.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\cero.JPG")); // NOI18N

        lbl_unidades_faltas_local.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\cero.JPG")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("VISITANTE");

        Lbl_decenas_puntos_visitante.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\cero.JPG")); // NOI18N

        Lbl_centenas_puntos_visitante.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\cero.JPG")); // NOI18N

        Lbl_unidades_puntos_visitante.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\cero.JPG")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("FALTAS");

        lbl_unidades_faltas_visitante.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\cero.JPG")); // NOI18N

        lbl_decenas_faltas_visitante.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\cero.JPG")); // NOI18N

        Lbl_periodo.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\cero.JPG")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("TIEMPO");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAITO\\Documents\\NetBeansProjects\\Tablero_Basket_Java\\src\\Imagenes\\punto.png")); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_centenas_puntos_local)
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(Lbl_decenas_puntos_local)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Lbl_unidades_puntos_local)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(lbl_mil_tiempo)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_centenas_tiempo)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_decenas_tiempo)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Lbl_periodo)
                                    .addComponent(jLabel5))
                                .addGap(80, 80, 80)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_unidades_tiempo)
                            .addComponent(Lbl_centenas_puntos_visitante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Lbl_decenas_puntos_visitante))))
                .addGap(18, 18, 18)
                .addComponent(Lbl_unidades_puntos_visitante)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbl_decenas_faltas_local)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_unidades_faltas_local)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_decenas_faltas_visitante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_unidades_faltas_visitante)
                .addGap(36, 36, 36))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_mil_tiempo)
                    .addComponent(lbl_centenas_tiempo)
                    .addComponent(lbl_unidades_tiempo)
                    .addComponent(lbl_decenas_tiempo)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_centenas_puntos_local)
                            .addComponent(Lbl_decenas_puntos_local)
                            .addComponent(Lbl_unidades_puntos_local)
                            .addComponent(Lbl_decenas_puntos_visitante)
                            .addComponent(Lbl_centenas_puntos_visitante)
                            .addComponent(Lbl_unidades_puntos_visitante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_decenas_faltas_local)
                            .addComponent(lbl_unidades_faltas_local)
                            .addComponent(lbl_unidades_faltas_visitante)
                            .addComponent(lbl_decenas_faltas_visitante)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Lbl_periodo)))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_DesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DesconectarActionPerformed
        try {
           
            Desconectar();
            Arduino.killArduinoConnection();//desconectamos el puerto

        } catch (Exception e) {
        }
    }//GEN-LAST:event_Btn_DesconectarActionPerformed

    private void Btn_ConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ConectarActionPerformed
        String puerto = Cbx_puertos.getSelectedItem().toString();//Cojemos el puerto al conectar
        try {
            if (!puerto.equals("Puertos")) {
                Arduino.arduinoRXTX(puerto, 9600, evento);//Inicializamos el puerto
                Conectar();//Llamamos al metodo conectar
                JOptionPane.showMessageDialog(this, "Puerto conectado");

            } else {
                JOptionPane.showMessageDialog(this, "Puerto no  conectado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Puerto no  conectado");
        }
    }//GEN-LAST:event_Btn_ConectarActionPerformed

    private void Cbx_puertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cbx_puertosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cbx_puertosActionPerformed

    private void Btn_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InicioActionPerformed
        try {
            Arduino.sendData("0");//Enviamos un dato
            imprimirImagenes();//Llamamos al metodo imprimi imagenes
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Btn_InicioActionPerformed

    private void Btn_PauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PauseActionPerformed
        try {
            Arduino.sendData("1");//Enviamos un dato
            imprimirImagenes();//Llamamos al metodo imprimi imagenes
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Btn_PauseActionPerformed

    private void Btn_Punto1LocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Punto1LocalActionPerformed
        try {
            Arduino.sendData("2");//Enviamos un dato
            imprimirImagenes();//Llamamos al metodo imprimi imagenes
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Btn_Punto1LocalActionPerformed

    private void Btn_Punto2LocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Punto2LocalActionPerformed
        try {
            Arduino.sendData("3");//Enviamos un dato
            imprimirImagenes();//Llamamos al metodo imprimi imagenes
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Btn_Punto2LocalActionPerformed

    private void Btn_Punto3LocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Punto3LocalActionPerformed
        try {
            Arduino.sendData("4");//Enviamos un dato
            imprimirImagenes();//Llamamos al metodo imprimi imagenes
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Btn_Punto3LocalActionPerformed

    private void Btn_Punto1VisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Punto1VisitanteActionPerformed
        try {
            Arduino.sendData("5");//Enviamos un dato
            imprimirImagenes();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Btn_Punto1VisitanteActionPerformed

    private void Btn_Punto2VisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Punto2VisitanteActionPerformed
        try {
            Arduino.sendData("6");//Enviamos un dato
            imprimirImagenes();//Llamamos al metodo imprimi imagenes
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Btn_Punto2VisitanteActionPerformed

    private void Btn_Punto3VisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Punto3VisitanteActionPerformed
        try {
            Arduino.sendData("7");//Enviamos un dato
            imprimirImagenes();//Llamamos al metodo imprimi imagenes
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Btn_Punto3VisitanteActionPerformed

    private void Btn_Faltas_localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Faltas_localActionPerformed
        try {
            Arduino.sendData("8");//Enviamos un dato
            imprimirImagenes();//Llamamos al metodo imprimi imagenes
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Btn_Faltas_localActionPerformed

    private void Btn_Faltas_visitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Faltas_visitanteActionPerformed
        try {
            Arduino.sendData("9");//Enviamos un dato
            imprimirImagenes();//Llamamos al metodo imprimi imagenes
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Btn_Faltas_visitanteActionPerformed

    private void Btn_PeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PeriodoActionPerformed
        try {
            Arduino.sendData("A");//Enviamos un dato
            imprimirImagenes();//Llamamos al metodo imprimi imagenes
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Btn_PeriodoActionPerformed
    public void Puertos() {
        List<String> lista_puetos = Arduino.getSerialPorts();//Sacamos los puertos que existen
        for (int i = 0; i < lista_puetos.size(); i++) {
            Cbx_puertos.addItem(lista_puetos.get(i));//Imprimimos los nombres de los puertos en el combobox
        }
    }

    public void imprimirImagenes() //metodo de impresion de imagenes
    {

        char[] chars = dato.toCharArray();
        lbl_mil_tiempo.setIcon(Imagen(String.valueOf(chars[0])));//Visualizamos los milis en el label
        lbl_centenas_tiempo.setIcon(Imagen(String.valueOf(chars[1])));//Visualizamos las decenas en el label
        lbl_decenas_tiempo.setIcon(Imagen(String.valueOf(chars[2])));//Visualizamos las centenas en el label
        lbl_unidades_tiempo.setIcon(Imagen(String.valueOf(chars[3])));//Visualizamos las unidadess en el label
        Lbl_centenas_puntos_local.setIcon(Imagen(String.valueOf(chars[4])));//Visualizamos las unidadess en el label
        Lbl_decenas_puntos_local.setIcon(Imagen(String.valueOf(chars[5])));//Visualizamos las unidadess en el label
        Lbl_unidades_puntos_local.setIcon(Imagen(String.valueOf(chars[6])));//Visualizamos las unidadess en el label
        Lbl_centenas_puntos_visitante.setIcon(Imagen(String.valueOf(chars[7])));//Visualizamos las unidadess en el label
        Lbl_decenas_puntos_visitante.setIcon(Imagen(String.valueOf(chars[8])));//Visualizamos las unidadess en el label
        Lbl_unidades_puntos_visitante.setIcon(Imagen(String.valueOf(chars[9])));//Visualizamos las unidadess en el label
        lbl_decenas_faltas_local.setIcon(Imagen(String.valueOf(chars[10])));//Visualizamos las unidadess en el label
        lbl_unidades_faltas_local.setIcon(Imagen(String.valueOf(chars[11])));//Visualizamos las unidadess en el label
        lbl_decenas_faltas_visitante.setIcon(Imagen(String.valueOf(chars[12])));//Visualizamos las unidadess en el label
        lbl_unidades_faltas_visitante.setIcon(Imagen(String.valueOf(chars[13])));//Visualizamos las unidadess en el label
        Lbl_periodo.setIcon(Imagen(String.valueOf(chars[14])));//Visualizamos las unidadess en el label

    }

    public void Desconectar() {
        Cbx_puertos.setEditable(true);//Habilitamos el combobox
        Btn_Conectar.setEnabled(true);//Habilitamos el boton conectar
        Btn_Desconectar.setEnabled(false);//Desabilitamos el boton desconectar
        Btn_Inicio.setEnabled(false);//Desabilitamos el boton inicio
        Btn_Pause.setEnabled(false);//Desabilitamos el boton pause
        Btn_Punto1Local.setEnabled(false);//Desabilitamos  el boton punto1local
        Btn_Punto2Local.setEnabled(false);//Desabilitamos el boton punto2local
        Btn_Punto3Local.setEnabled(false);//Desabilitamos el boton punto3local
        Btn_Punto1Visitante.setEnabled(false);//Desabilitamos el boton punto1visitante
        Btn_Punto2Visitante.setEnabled(false);//Desabilitamos el boton punto2visitante
        Btn_Punto3Visitante.setEnabled(false);//Desabilitamos el boton punto3visitante
        Btn_Faltas_local.setEnabled(false);//Desabilitamos el boton faltas local
        Btn_Faltas_visitante.setEnabled(false);//Desabilitamos el boton faltas visitante
        Btn_Periodo.setEnabled(false);//Desabilitamos el boton periodo

    }

    public void Conectar() {
        Cbx_puertos.setEditable(false);//Desabilitamos el combobox
        Btn_Conectar.setEnabled(false);//Desabilitamos el boton conectar
        Btn_Desconectar.setEnabled(true);//Habilitamos el boton desconectar
        Btn_Inicio.setEnabled(true);//Habilitamos  el boton inicio
        Btn_Pause.setEnabled(true);//Habilitamos  el boton pause
        Btn_Punto1Local.setEnabled(true);//Habilitamos  el boton punto1local
        Btn_Punto2Local.setEnabled(true);//Habilitamos  el boton punto2local
        Btn_Punto3Local.setEnabled(true);//Habilitamos  el boton punto3local
        Btn_Punto1Visitante.setEnabled(true);//Habilitamos  el boton punto1visitante
        Btn_Punto2Visitante.setEnabled(true);//Habilitamos  el boton punto2visitante
        Btn_Punto3Visitante.setEnabled(true);//Habilitamos  el boton punto3visitante
        Btn_Faltas_local.setEnabled(true);//Habilitamos  el boton faltas local
        Btn_Faltas_visitante.setEnabled(true);//Habilitamos  el boton faltas visitante
        Btn_Periodo.setEnabled(true);//Habilitamos  el boton periodo

    }

    public ImageIcon Imagen(String num) //metodo que retorna la direccion de la imagen para su visualizacion
    {

        String a = num;
        String retorno = "";
        URL url;
        ImageIcon icon = null;
        switch (a) //dependiendo del numero ingresado retorna la direccion de esa imagen
        {
            case "0":
                retorno = "/Imagenes/cero.JPG";//Direccion donde se encuentra la imagen 0
                url = this.getClass().getResource(retorno);
                icon = new ImageIcon(url);
                break;
            case "1":
                retorno = "/Imagenes/uno.JPG";//Direccion donde se encuentra la imagen 1
                url = this.getClass().getResource(retorno);
                icon = new ImageIcon(url);
                break;
            case "2":
                retorno = "/Imagenes/dos.JPG";//Direccion donde se encuentra la imagen 2
                url = this.getClass().getResource(retorno);
                icon = new ImageIcon(url);
                break;
            case "3":
                retorno = "/Imagenes/tres.JPG";//Direccion donde se encuentra la imagen 3
                url = this.getClass().getResource(retorno);
                icon = new ImageIcon(url);
                break;
            case "4":
                retorno = "/Imagenes/cuatro.JPG";//Direccion donde se encuentra la imagen 4
                url = this.getClass().getResource(retorno);
                icon = new ImageIcon(url);
                break;
            case "5":
                retorno = "/Imagenes/cinco.JPG";//Direccion donde se encuentra la imagen 5
                url = this.getClass().getResource(retorno);
                icon = new ImageIcon(url);
                break;
            case "6":
                retorno = "/Imagenes/seis.JPG";//Direccion donde se encuentra la imagen 6
                url = this.getClass().getResource(retorno);
                icon = new ImageIcon(url);
                break;
            case "7":
                retorno = "/Imagenes/siete.JPG";//Direccion donde se encuentra la imagen 7
                url = this.getClass().getResource(retorno);
                icon = new ImageIcon(url);
                break;
            case "8":
                retorno = "/Imagenes/ocho.JPG";//Direccion donde se encuentra la imagen 8
                url = this.getClass().getResource(retorno);
                icon = new ImageIcon(url);
                break;
            case "9":
                retorno = "/Imagenes/nueve.JPG";//Direccion donde se encuentra la imagen 9
                url = this.getClass().getResource(retorno);
                icon = new ImageIcon(url);
                break;

        }
        return icon;
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero_Ejecutar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero_Ejecutar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero_Ejecutar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero_Ejecutar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero_Ejecutar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Conectar;
    private javax.swing.JButton Btn_Desconectar;
    private javax.swing.JButton Btn_Faltas_local;
    private javax.swing.JButton Btn_Faltas_visitante;
    private javax.swing.JButton Btn_Inicio;
    private javax.swing.JButton Btn_Pause;
    private javax.swing.JButton Btn_Periodo;
    private javax.swing.JButton Btn_Punto1Local;
    private javax.swing.JButton Btn_Punto1Visitante;
    private javax.swing.JButton Btn_Punto2Local;
    private javax.swing.JButton Btn_Punto2Visitante;
    private javax.swing.JButton Btn_Punto3Local;
    private javax.swing.JButton Btn_Punto3Visitante;
    private javax.swing.JComboBox<String> Cbx_puertos;
    private javax.swing.JLabel Lbl_centenas_puntos_local;
    private javax.swing.JLabel Lbl_centenas_puntos_visitante;
    private javax.swing.JLabel Lbl_decenas_puntos_local;
    private javax.swing.JLabel Lbl_decenas_puntos_visitante;
    private javax.swing.JLabel Lbl_periodo;
    private javax.swing.JLabel Lbl_unidades_puntos_local;
    private javax.swing.JLabel Lbl_unidades_puntos_visitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbl_centenas_tiempo;
    private javax.swing.JLabel lbl_decenas_faltas_local;
    private javax.swing.JLabel lbl_decenas_faltas_visitante;
    private javax.swing.JLabel lbl_decenas_tiempo;
    private javax.swing.JLabel lbl_mil_tiempo;
    private javax.swing.JLabel lbl_unidades_faltas_local;
    private javax.swing.JLabel lbl_unidades_faltas_visitante;
    private javax.swing.JLabel lbl_unidades_tiempo;
    // End of variables declaration//GEN-END:variables
}
