
package br.com.sistematabica.view.cadastrar.conta.gerente;

import br.com.sistematabica.model.DadoPessoal;
import br.com.sistematabica.view.Style;
import br.com.sistematabica.view.CadastrarPerfilIconGUI;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**Tela que cadastra gerente.
 * 
 * @author Joel Henrique
 * @author Evelyn Mayara
 * @author Lucas Gabriel
 * 
 * @version 1.00
 * 
 */
public class CadastrarGerenteGUI extends javax.swing.JFrame {

    private Style style = new Style();
    private String urlIcon = "perfil";
    
    /**
     * Creates new form CadastrarGerenteGUI
     */
    public CadastrarGerenteGUI() {
        initComponents();
        style.jLabelEditImage(lblAddIcon, "");
    }

    /**Contrutor que vai receber por parametro um dadoPessoal.
     * 
     * @author Joel Henrique
     * @author Evelyn Mayara
     * @author Lucas Gabriel
     * 
     * @param novoDadoPessoal - aaa
     * 
     */
    public CadastrarGerenteGUI(DadoPessoal novoDadoPessoal) {
        this();
        
        this.txtBairro.setText(novoDadoPessoal.getBairro());
        this.txtCEP.setText(novoDadoPessoal.getCEP());
        this.txtCPF.setText(novoDadoPessoal.getCPF());
        this.txtCidade.setText(novoDadoPessoal.getCidade());
        this.txtComplemento.setText(novoDadoPessoal.getComplemento());
        this.txtDataNascimento.setText(novoDadoPessoal.getDataNascimento());
        this.txtNomeCompleto.setText(novoDadoPessoal.getNomeCompleto());
        this.txtOutroTelefone.setText(novoDadoPessoal.getNumeroCelular());
        this.txtTelefonePrincipal.setText(novoDadoPessoal.getPrimeiroTelefone());
        this.boxSexo.setSelectedItem(novoDadoPessoal.getSexo());
        this.boxUF.setSelectedItem(novoDadoPessoal.getUF());
        this.urlIcon = novoDadoPessoal.getURLFoto();
        style.jLabelEditImage(this.lblIcon, "/br/com/sistematabica/imagens/usuario/contas/"+novoDadoPessoal.getURLFoto()+"g.png");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlIcon = new javax.swing.JPanel();
        lblAddIcon = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        pnlIformacoesGerais = new javax.swing.JPanel();
        lblComplemento = new javax.swing.JLabel();
        txtOutroTelefone = new javax.swing.JFormattedTextField();
        lblNomeCompleto = new javax.swing.JLabel();
        lblOutroTelefone = new javax.swing.JLabel();
        lblUF = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblDataNascimento = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        lblBairro = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        lblCidade = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        boxSexo = new javax.swing.JComboBox<>();
        lblCEP = new javax.swing.JLabel();
        lblTelefonePrincipal = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        txtTelefonePrincipal = new javax.swing.JFormattedTextField();
        txtNomeCompleto = new javax.swing.JTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        boxUF = new javax.swing.JComboBox<>();
        lblButtonSalvar = new javax.swing.JLabel();
        lblButtonVoltar = new javax.swing.JLabel();
        lblSalvar = new javax.swing.JLabel();
        lblVoltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("cadastrar gerente");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(54, 52, 66));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistematabica/imagens/sistema/icones/adicionarIcon.png"))); // NOI18N
        lblAddIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddIconMouseExited(evt);
            }
        });
        pnlIcon.add(lblAddIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 114, 143));

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistematabica/imagens/usuario/contas/perfilg.png"))); // NOI18N
        pnlIcon.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlPrincipal.add(pnlIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 114, -1));

        pnlIformacoesGerais.setBackground(new java.awt.Color(54, 52, 66));
        pnlIformacoesGerais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblComplemento.setForeground(new java.awt.Color(255, 255, 255));
        lblComplemento.setText("complemento:");
        pnlIformacoesGerais.add(lblComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 245, -1, -1));

        try {
            txtOutroTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnlIformacoesGerais.add(txtOutroTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 117, 110, -1));

        lblNomeCompleto.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeCompleto.setText("Nome Completo:");
        pnlIformacoesGerais.add(lblNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblOutroTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblOutroTelefone.setText("Outro telefone:");
        pnlIformacoesGerais.add(lblOutroTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 97, -1, -1));

        lblUF.setForeground(new java.awt.Color(255, 255, 255));
        lblUF.setText("UF:");
        pnlIformacoesGerais.add(lblUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 245, 30, -1));

        lblCPF.setForeground(new java.awt.Color(255, 255, 255));
        lblCPF.setText("CPF:");
        pnlIformacoesGerais.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 148, -1, -1));
        pnlIformacoesGerais.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 316, 210, -1));

        lblDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        lblDataNascimento.setText("Data de nascimento:");
        pnlIformacoesGerais.add(lblDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, -1, -1));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnlIformacoesGerais.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 168, 90, -1));

        lblBairro.setForeground(new java.awt.Color(255, 255, 255));
        lblBairro.setText("Bairro:");
        pnlIformacoesGerais.add(lblBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 296, -1, -1));

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnlIformacoesGerais.add(txtDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 71, 99, -1));

        lblCidade.setForeground(new java.awt.Color(255, 255, 255));
        lblCidade.setText("Cidade:");
        pnlIformacoesGerais.add(lblCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 199, -1, -1));

        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo:");
        pnlIformacoesGerais.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 51, -1, -1));
        pnlIformacoesGerais.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 219, 210, -1));

        boxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        pnlIformacoesGerais.add(boxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 71, 103, -1));

        lblCEP.setForeground(new java.awt.Color(255, 255, 255));
        lblCEP.setText("CEP:");
        pnlIformacoesGerais.add(lblCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 148, -1, -1));

        lblTelefonePrincipal.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefonePrincipal.setText("Telefone principal:");
        pnlIformacoesGerais.add(lblTelefonePrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 97, -1, -1));
        pnlIformacoesGerais.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 265, 129, -1));

        try {
            txtTelefonePrincipal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnlIformacoesGerais.add(txtTelefonePrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 117, 90, -1));
        pnlIformacoesGerais.add(txtNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 210, -1));

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnlIformacoesGerais.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 168, 110, -1));

        boxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " " }));
        pnlIformacoesGerais.add(boxUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 264, 70, -1));

        pnlPrincipal.add(pnlIformacoesGerais, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 222, -1));

        lblButtonSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        lblButtonSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonSalvar.setText("Salvar");
        lblButtonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonSalvarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonSalvarMouseExited(evt);
            }
        });
        pnlPrincipal.add(lblButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 96, 35));

        lblButtonVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblButtonVoltar.setForeground(new java.awt.Color(255, 255, 255));
        lblButtonVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonVoltar.setText("Voltar");
        lblButtonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonVoltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonVoltarMouseExited(evt);
            }
        });
        pnlPrincipal.add(lblButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 97, 35));

        lblSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistematabica/imagens/sistema/icones/backgroundVerdeClaro.png"))); // NOI18N
        lblSalvar.setText("jLabel2");
        lblSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalvarMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 97, 36));

        lblVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistematabica/imagens/sistema/icones/backgroundVermelhoClaro.png"))); // NOI18N
        lblVoltar.setText("jLabel2");
        pnlPrincipal.add(lblVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 97, 36));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblButtonSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonSalvarMouseClicked

        DadoPessoal dadosGerais = new DadoPessoal();
        
        SimpleDateFormat dataCadastro = new SimpleDateFormat("dd/MM/yyyy");
        dataCadastro.format(new Date(System.currentTimeMillis()));

        dadosGerais.setTipo("Gerente");
        dadosGerais.setBairro(this.txtBairro.getText());
        dadosGerais.setCEP(this.txtCEP.getText());
        dadosGerais.setCPF(this.txtCPF.getText());
        dadosGerais.setCidade(this.txtCidade.getText());
        dadosGerais.setComplemento(this.txtComplemento.getText());
        dadosGerais.setDataCadastro("11/11/1111");
        dadosGerais.setDataNascimento(this.txtDataNascimento.getText());
        dadosGerais.setNomeCompleto(this.txtNomeCompleto.getText());
        dadosGerais.setNumeroCelular(this.txtOutroTelefone.getText());
//        dadosGerais.setNumeroRegistro(new GerenteDAOOracle().idMax_GERENTE() + 1);
        dadosGerais.setPrimeiroTelefone(this.txtTelefonePrincipal.getText());
        dadosGerais.setSexo(this.boxSexo.getItemAt(this.boxSexo.getSelectedIndex()));
        dadosGerais.setUF(this.boxUF.getItemAt(this.boxUF.getSelectedIndex()));
        dadosGerais.setURLFoto(urlIcon);

        CadastrarLoginGerenteGUI cadastrarLoginGUI = new CadastrarLoginGerenteGUI(dadosGerais);
        this.setVisible(false);
        cadastrarLoginGUI.setVisible(true);
    }//GEN-LAST:event_lblButtonSalvarMouseClicked

    private void lblButtonSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonSalvarMouseEntered
        style.jLabelEditImage(lblSalvar, "/br/com/sistematabica/imagens/sistema/icones/backgroundVerdeEscuro.png");
    }//GEN-LAST:event_lblButtonSalvarMouseEntered

    private void lblButtonSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonSalvarMouseExited
        style.jLabelEditImage(lblSalvar, "/br/com/sistematabica/imagens/sistema/icones/backgroundVerdeClaro.png");
    }//GEN-LAST:event_lblButtonSalvarMouseExited

    private void lblButtonVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonVoltarMouseClicked

    }//GEN-LAST:event_lblButtonVoltarMouseClicked

    private void lblButtonVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonVoltarMouseEntered
        style.jLabelEditImage(lblVoltar, "/br/com/sistematabica/imagens/sistema/icones/backgroundVermelhoEscuro.png");
    }//GEN-LAST:event_lblButtonVoltarMouseEntered

    private void lblButtonVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonVoltarMouseExited
        style.jLabelEditImage(lblVoltar, "/br/com/sistematabica/imagens/sistema/icones/backgroundVermelhoClaro.png");
    }//GEN-LAST:event_lblButtonVoltarMouseExited

    private void lblSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalvarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSalvarMouseClicked

    private void lblAddIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddIconMouseEntered
        style.jLabelEditImage(lblAddIcon, "/br/com/sistematabica/imagens/sistema/icones/adicionarIcon.png");
    }//GEN-LAST:event_lblAddIconMouseEntered

    private void lblAddIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddIconMouseExited
        style.jLabelEditImage(lblAddIcon, "");
    }//GEN-LAST:event_lblAddIconMouseExited

    private void lblAddIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddIconMouseClicked
       
        DadoPessoal dadosGerais = new DadoPessoal();
        
        SimpleDateFormat dataCadastro = new SimpleDateFormat("dd/MM/yyyy");
        dataCadastro.format(new Date(System.currentTimeMillis()));

        dadosGerais.setTipo("Gerente");
        dadosGerais.setBairro(this.txtBairro.getText());
        dadosGerais.setCEP(this.txtCEP.getText());
        dadosGerais.setCPF(this.txtCPF.getText());
        dadosGerais.setCidade(this.txtCidade.getText());
        dadosGerais.setComplemento(this.txtComplemento.getText());
        dadosGerais.setDataCadastro("11/11/1111");
        dadosGerais.setDataNascimento(this.txtDataNascimento.getText());
        dadosGerais.setNomeCompleto(this.txtNomeCompleto.getText());
        dadosGerais.setNumeroCelular(this.txtOutroTelefone.getText());
//        dadosGerais.setNumeroRegistro(new GerenteDAOOracle().idMax_GERENTE() + 1);
        dadosGerais.setPrimeiroTelefone(this.txtTelefonePrincipal.getText());
        dadosGerais.setSexo(this.boxSexo.getItemAt(this.boxSexo.getSelectedIndex()));
        dadosGerais.setUF(this.boxUF.getItemAt(this.boxUF.getSelectedIndex()));
        dadosGerais.setURLFoto(urlIcon);
       
       this.dispose();
       CadastrarPerfilIconGUI perfilIcon = new CadastrarPerfilIconGUI(dadosGerais);
       perfilIcon.setVisible(true);
        
    }//GEN-LAST:event_lblAddIconMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarGerenteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarGerenteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarGerenteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarGerenteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarGerenteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxSexo;
    private javax.swing.JComboBox<String> boxUF;
    private javax.swing.JLabel lblAddIcon;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblButtonSalvar;
    private javax.swing.JLabel lblButtonVoltar;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblOutroTelefone;
    private javax.swing.JLabel lblSalvar;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefonePrincipal;
    private javax.swing.JLabel lblUF;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JPanel pnlIcon;
    private javax.swing.JPanel pnlIformacoesGerais;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JFormattedTextField txtOutroTelefone;
    private javax.swing.JFormattedTextField txtTelefonePrincipal;
    // End of variables declaration//GEN-END:variables
}