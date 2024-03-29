/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Professor.Dashboard.Profile;

import Business.Professor.Professor;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author xsyyy
 */
public class ProfessorProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorProfileJPanel
     */
    ImageIcon image;
    Professor professor;
    public ProfessorProfileJPanel(Professor professor) {
        initComponents();
        this.professor=professor;
        txtPID.setText(String.valueOf(professor.getProfessorID()));
        txtName.setText(professor.getName());
        txtAge.setText(String.valueOf(professor.getAge()));
        txtGender.setText(professor.getGender());
        txtRegion.setText(professor.getRegion());
        txtEmail.setText(professor.getEmail());
        txtLang.setText(professor.getLanguage());
        lblImage.setIcon(professor.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCourse1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblRegion = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblLang = new javax.swing.JLabel();
        lblPic = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtRegion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtLang = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        btnChangeImage = new javax.swing.JButton();
        lblName1 = new javax.swing.JLabel();
        txtPID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtTopic = new javax.swing.JTextField();
        lblTopic = new javax.swing.JLabel();

        setBackground(new java.awt.Color(251, 238, 172));

        lblCourse1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblCourse1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCourse1.setText("PROFILE");

        lblName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblName.setText("Professor ID:");

        lblGender.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblGender.setText("Gender:");

        lblRegion.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblRegion.setText("Region:");

        lblAge.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblAge.setText("Age:");

        lblEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblEmail.setText("Email:");

        lblLang.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblLang.setText("Language:");

        lblPic.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblPic.setText("Picture:");

        txtName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtName.setEnabled(false);

        txtAge.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtAge.setEnabled(false);

        txtRegion.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtRegion.setEnabled(false);

        txtEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtEmail.setEnabled(false);

        txtGender.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtGender.setEnabled(false);

        txtLang.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtLang.setEnabled(false);

        btnSave.setBackground(new java.awt.Color(117, 194, 246));
        btnSave.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnChangeImage.setBackground(new java.awt.Color(117, 194, 246));
        btnChangeImage.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnChangeImage.setText("CHANGE IMAGE");
        btnChangeImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeImageActionPerformed(evt);
            }
        });

        lblName1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblName1.setText("Name:");

        txtPID.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtPID.setEnabled(false);

        btnUpdate.setBackground(new java.awt.Color(117, 194, 246));
        btnUpdate.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtTopic.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtTopic.setEnabled(false);

        lblTopic.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblTopic.setText("Topic:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCourse1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnUpdate)
                        .addGap(57, 57, 57)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAge, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegion, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLang)
                                    .addComponent(lblEmail)
                                    .addComponent(lblTopic))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLang, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPID, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(lblPic)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnChangeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSave, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblCourse1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName1))
                                .addGap(21, 21, 21)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPic)
                        .addGap(179, 179, 179)
                        .addComponent(btnChangeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSave, btnUpdate});

    }// </editor-fold>//GEN-END:initComponents
/**
 * Event handler for the "Save" button action.
 * This method is called when the user clicks the "Save" button to update the professor's personal information.
 * It retrieves information from input fields and sets them in the professor's attributes, displaying a confirmation message.
 *
 * @param evt The action event that triggered this method.
 */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int pid = Integer.parseInt(txtPID.getText());
        String name = txtName.getText();
        String gender = txtGender.getText();
        int age = Integer.parseInt(txtAge.getText());
        String region = txtRegion.getText();
        String email = txtEmail.getText();
        String language = txtLang.getText();
        professor.setProfessorID(pid);
        professor.setName(name);
        professor.setGender(gender);
        professor.setAge(age);
        professor.setRegion(region);
        professor.setEmail(email);
        professor.setLanguage(language);
        professor.setTopic(txtTopic.getText());
        professor.setImage((ImageIcon) lblImage.getIcon());
        
        JOptionPane.showMessageDialog(this, "Your personal information has been updated.");
    }//GEN-LAST:event_btnSaveActionPerformed
/**
 * Event handler for the "Change Image" button action.
 * This method is called when the user clicks the "Change Image" button to select and set a new image for the professor.
 * It opens a file chooser dialog, allows the user to select an image, and displays it in the interface.
 *
 * @param evt The action event that triggered this method.
 */
    private void btnChangeImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeImageActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*.Image","jpg","png");
        file.addChoosableFileFilter(filter);
        int result=file.showSaveDialog(null);
        if (result==JFileChooser.APPROVE_OPTION){
            File selectedFile=file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            ImageIcon MyImage  =new ImageIcon(path);
            Image img = MyImage.getImage();
            Image newImg = img.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
            image = new ImageIcon(newImg);
            lblImage.setIcon(image);
        }
        else if (result==JFileChooser.CANCEL_OPTION){
            System.out.println("No picture");
        }
    }//GEN-LAST:event_btnChangeImageActionPerformed
/**
 * Event handler for the "Update" button action.
 * This method is called when the user clicks the "Update" button to enable editing of personal information fields.
 * It enables the text fields to allow the user to make changes to the professor's personal information.
 *
 * @param evt The action event that triggered this method.
 */
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
                txtPID.setEnabled(true);
                txtName.setEnabled(true);
                txtGender.setEnabled(true);
                txtAge.setEnabled(true);
                txtRegion.setEnabled(true);
                txtEmail.setEnabled(true);
                txtLang.setEnabled(true);
                txtTopic.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeImage;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCourse1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLang;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLang;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPID;
    private javax.swing.JTextField txtRegion;
    private javax.swing.JTextField txtTopic;
    // End of variables declaration//GEN-END:variables
}
