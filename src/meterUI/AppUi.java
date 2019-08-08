/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meterUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Hirusha
 */
public class AppUi extends javax.swing.JFrame {

    /**
     * Creates new form AppUi
     */
    public AppUi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Calculate Total Comlexity");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("C++");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("JAVA");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Complexity Meter");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(700, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Choose File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 62, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)
                        .addGap(84, 84, 84))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //----------------------------------------- check java c++
        //if(jRadioButton1.)
        String code = jTextArea1.getText();
        System.out.println(countLines(code));
        chechCsKeyWordsJava(code);
        //-----------------------------------------run
        //-----------------------------------------
        //-----------------------------------------
        //-----------------------------------------
        //-----------------------------------------
        //-----------------------------------------

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
JFileChooser chooser = new JFileChooser();
//        System.out.println("here iiii" +chooser);
        chooser.showOpenDialog(null);
//        System.out.println("here uuuu");
        File f = chooser.getSelectedFile();
        
//        System.out.print("here 000");
        String filename = f.getAbsolutePath();
//        System.out.print("here 111");
        
        try{
//              System.out.print("here 2222");
//              System.out.print("here 33333");
                FileReader reader = new FileReader(filename);
                BufferedReader br = new BufferedReader(reader);
                jTextArea1.read(br, null);
                br.close();
                jTextArea1.requestFocus();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    
//check how many lines in the code use to create the result array
    public int countLines(String code){
        Matcher m = Pattern.compile("\r\n|\r|\n").matcher(code);
        int lines = 1;
        while (m.find())
        {
            lines ++;
        }
    return lines;
    }
    
    public void chechCsKeyWordsJava(String code){        
        //ArrayList<String> code_array = new ArrayList<>();
        Scanner scanner = new Scanner(code);
                
        String text = code;        
        
        int arraySize = countLines(code);  
        
        String CsKeys[] = new String[arraySize];
        int Cs[] = new int[arraySize];

        for(int i = 0; i<arraySize; i++){
                    Cs[i] = 0;
                    CsKeys[i] = " ";
        }
                

        String[] lines = text.split("\\r?\\n");        
        int i=0;
        for(String line : lines){
            
            if(line.contains("&")){
                CsKeys[i] = CsKeys[i] + "& ";
                Cs[i] = Cs[i] + 2;
            }
            if(line.contains("public")){
                CsKeys[i] = CsKeys[i] + "public ";
                Cs[i] = Cs[i] + 2;
            }
            if(line.contains("new")){
                CsKeys[i] = CsKeys[i] + "new ";
                Cs[i] = Cs[i] + 2;
            }
            if(line.contains("delete")){
                CsKeys[i] = CsKeys[i] + "delete ";
                Cs[i] = Cs[i] + 2;
            }
            if(line.contains("throw")){
                CsKeys[i] = CsKeys[i] + "throw ";
                Cs[i] = Cs[i] + 2;
            }
            if(line.contains("throws")){
                CsKeys[i] = CsKeys[i] + "throws ";
                Cs[i] = Cs[i] + 2;
            }
            if(line.contains("void")){
                CsKeys[i] = CsKeys[i] + "void ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("double")){
                CsKeys[i] = CsKeys[i] + "double ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("int")){
                CsKeys[i] = CsKeys[i] + "int ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("float")){
                CsKeys[i] = CsKeys[i] + "float ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("string")){
                CsKeys[i] = CsKeys[i] + "string ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("printf")){
                CsKeys[i] = CsKeys[i] + "printf ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("println")){
                CsKeys[i] = CsKeys[i] + "println ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("print")){
                CsKeys[i] = CsKeys[i] + "print ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("cout")){
                CsKeys[i] = CsKeys[i] + "cout ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("cin")){
                CsKeys[i] = CsKeys[i] + "cin ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("if’")){
                CsKeys[i] = CsKeys[i] + "if ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("for")){
                CsKeys[i] = CsKeys[i] + "for ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("while")){
                CsKeys[i] = CsKeys[i] + "while ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("do")){
                CsKeys[i] = CsKeys[i] + "do ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("switch")){
                CsKeys[i] = CsKeys[i] + "switch ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("case")){
                CsKeys[i] = CsKeys[i] + "case ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("endl’")){
                CsKeys[i] = CsKeys[i] + "endl ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("'")){
                CsKeys[i] = CsKeys[i] + "' ";
                Cs[i] = Cs[i] + 1;
            }
            if(line.contains("+")){
                if(line.contains("++")){
                CsKeys[i] = CsKeys[i] + "++ ";
                Cs[i] = Cs[i] + 1;
                }
                else if(line.contains("+=")){
                CsKeys[i] = CsKeys[i] + "+= ";
                Cs[i] = Cs[i] + 1;
                }
                else{
                CsKeys[i] = CsKeys[i] + "+ ";
                Cs[i] = Cs[i] + 1;
                }
            }
            if(line.contains("-")){
                if(line.contains("--")){
                CsKeys[i] = CsKeys[i] + "-- ";
                Cs[i] = Cs[i] + 1;
                }
                else if(line.contains("->")){
                CsKeys[i] = CsKeys[i] + "-> ";
                Cs[i] = Cs[i] + 1;
                }
                else if(line.contains("-=")){
                CsKeys[i] = CsKeys[i] + "-= ";
                Cs[i] = Cs[i] + 1;
                }
                else{
                CsKeys[i] = CsKeys[i] + "- ";
                Cs[i] = Cs[i] + 1;
                }
            }
            if(line.contains("=")){
                if(line.contains("==")){
                CsKeys[i] = CsKeys[i] + "== ";
                Cs[i] = Cs[i] + 1;
                }
                else{
                CsKeys[i] = CsKeys[i] + "= ";
                Cs[i] = Cs[i] + 1;
                }
            }
            if(line.contains("!")){
                if(line.contains("!=")){
                CsKeys[i] = CsKeys[i] + "!= ";
                Cs[i] = Cs[i] + 1;
                }
                else{
                CsKeys[i] = CsKeys[i] + "! ";
                Cs[i] = Cs[i] + 1;
                }
            }
            if(line.contains(">")){
                if(line.contains(">=")){
                CsKeys[i] = CsKeys[i] + ">= ";
                Cs[i] = Cs[i] + 1;
                }
                else if(line.contains(">>=")){
                CsKeys[i] = CsKeys[i] + ">>= ";
                Cs[i] = Cs[i] + 1;
                }
                else if(line.contains(">>>=")){
                CsKeys[i] = CsKeys[i] + ">>>= ";
                Cs[i] = Cs[i] + 1;
                }
                else if(line.contains(">>>")){
                CsKeys[i] = CsKeys[i] + ">>> ";
                Cs[i] = Cs[i] + 1;
                }
                else if(line.contains(">>")){
                CsKeys[i] = CsKeys[i] + ">> ";
                Cs[i] = Cs[i] + 1;
                }
                else{
                CsKeys[i] = CsKeys[i] + "> ";
                Cs[i] = Cs[i] + 1;
                }
            }
            if(line.contains("<")){
                if(line.contains("<=")){
                CsKeys[i] = CsKeys[i] + "<= ";
                Cs[i] = Cs[i] + 1;
                }
                else if(line.contains("<<=")){
                CsKeys[i] = CsKeys[i] + "<<= ";
                Cs[i] = Cs[i] + 1;
                }
                else if(line.contains("<<<=")){
                CsKeys[i] = CsKeys[i] + "<<<= ";
                Cs[i] = Cs[i] + 1;
                }
                else if(line.contains("<<<")){
                CsKeys[i] = CsKeys[i] + "<<< ";
                Cs[i] = Cs[i] + 1;
                }
                else if(line.contains("<<")){
                CsKeys[i] = CsKeys[i] + "<< ";
                Cs[i] = Cs[i] + 1;
                }
                else{
                CsKeys[i] = CsKeys[i] + "< ";
                Cs[i] = Cs[i] + 1;
                }
            }
            if(line.contains("*")){
                if(line.contains("*=")){
                CsKeys[i] = CsKeys[i] + "*= ";
                Cs[i] = Cs[i] + 1;
                }
                //code for poiner
                //else if(line.contains("**")){
                //CsKeys[i] = CsKeys[i] + "** ";
                //Cs[i] = Cs[i] + 1;
                //}
                else{
                CsKeys[i] = CsKeys[i] + "* ";
                Cs[i] = Cs[i] + 1;
                }
            }
            if(line.contains("/")){
                if(line.contains("/=")){
                CsKeys[i] = CsKeys[i] + "/= ";
                Cs[i] = Cs[i] + 1;
                }
                else{
                CsKeys[i] = CsKeys[i] + "/ ";
                Cs[i] = Cs[i] + 1;
                }
            }
            if(line.contains("|")){
                if(line.contains("|=")){
                CsKeys[i] = CsKeys[i] + "|= ";
                Cs[i] = Cs[i] + 1;
                }
                else{
                CsKeys[i] = CsKeys[i] + "| ";
                Cs[i] = Cs[i] + 1;
                }
            }
            if(line.contains("%")){
                if(line.contains("%=")){
                CsKeys[i] = CsKeys[i] + "%= ";
                Cs[i] = Cs[i] + 1;
                }
                else{
                CsKeys[i] = CsKeys[i] + "% ";
                Cs[i] = Cs[i] + 1;
                }
            }
            if(line.contains(":")){
                if(line.contains("::")){
                CsKeys[i] = CsKeys[i] + ":: ";
                Cs[i] = Cs[i] + 1;
                }
                else{
                CsKeys[i] = CsKeys[i] + ": ";
                Cs[i] = Cs[i] + 1;
                }
            }
            if(line.contains("^")){
                if(line.contains("^=")){
                CsKeys[i] = CsKeys[i] + "^= ";
                Cs[i] = Cs[i] + 1;
                }
                else{
                CsKeys[i] = CsKeys[i] + "^ ";
                Cs[i] = Cs[i] + 1;
                }
            }
            
            
            
            System.out.print(CsKeys[i] + "      ");
            System.out.println(Cs[i]);

            i = i + 1;
        }   

       
    }


    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

        jRadioButton1.setSelected(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton2.setSelected(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AppUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
