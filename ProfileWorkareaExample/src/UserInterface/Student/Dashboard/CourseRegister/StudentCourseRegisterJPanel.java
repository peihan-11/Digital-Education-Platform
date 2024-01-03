/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Student.Dashboard.CourseRegister;
import Business.Admin;
import Business.Course.Course;
import Business.Professor.Professor;
import Business.Student.Student;
import UserInterface.Student.Dashboard.Course.StudentCourseJPanel;
import UserInterface.Student.Dashboard.CourseView.StudentViewClassJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JSplitPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import jdk.internal.org.jline.terminal.TerminalBuilder;


/**
 *
 * @author JANFAN
 */

public class StudentCourseRegisterJPanel extends javax.swing.JPanel {
    JSplitPane SplitPane;
    Admin admin;
    Student student;
    Professor professor;
    Course course;
    /**
     * Creates new form StudentCourseRegisterJPanel
     */

    public StudentCourseRegisterJPanel(Admin admin,Student student,JSplitPane SplitPane) {
        initComponents();
        this.SplitPane=SplitPane;
        this.admin=admin;
        this.student=student;
        this.professor=professor;
        this.course=course;
        populateCurrentCourseTable();
        populateAllProfessorTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblCurrentCourse = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllCourse = new javax.swing.JTable();
        lblCourseHistory = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAllProfessor = new javax.swing.JTable();
        btnJoinClass = new javax.swing.JButton();
        btnViewDetail = new javax.swing.JButton();
        txtccode = new javax.swing.JTextField();
        lblCatelog = new javax.swing.JLabel();
        btnSearchCourse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtProfName = new javax.swing.JTextField();
        txtPRegion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPLanguage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPTopic = new javax.swing.JTextField();
        btnSearchProfessor = new javax.swing.JButton();

        setBackground(new java.awt.Color(251, 238, 172));

        lblTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("COURSE REGISTRATION");

        lblCurrentCourse.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblCurrentCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCurrentCourse.setText("COURSE LIST");

        tblAllCourse.setBackground(new java.awt.Color(204, 255, 204));
        tblAllCourse.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tblAllCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Course Code", "Semester", "Professor", "Weekday", "Hour", "Capacity", "Current student"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAllCourse.setSelectionBackground(new java.awt.Color(0, 51, 51));
        jScrollPane1.setViewportView(tblAllCourse);
        if (tblAllCourse.getColumnModel().getColumnCount() > 0) {
            tblAllCourse.getColumnModel().getColumn(0).setResizable(false);
            tblAllCourse.getColumnModel().getColumn(1).setResizable(false);
            tblAllCourse.getColumnModel().getColumn(2).setResizable(false);
            tblAllCourse.getColumnModel().getColumn(3).setResizable(false);
            tblAllCourse.getColumnModel().getColumn(4).setResizable(false);
            tblAllCourse.getColumnModel().getColumn(5).setResizable(false);
            tblAllCourse.getColumnModel().getColumn(6).setResizable(false);
        }

        lblCourseHistory.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblCourseHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCourseHistory.setText("PROFESSOR LIST");

        tblAllProfessor.setBackground(new java.awt.Color(204, 255, 204));
        tblAllProfessor.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tblAllProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Professor", "Course", "Region", "Language", "Topic", "Ranking"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAllProfessor.setSelectionBackground(new java.awt.Color(0, 51, 51));
        jScrollPane2.setViewportView(tblAllProfessor);
        if (tblAllProfessor.getColumnModel().getColumnCount() > 0) {
            tblAllProfessor.getColumnModel().getColumn(0).setResizable(false);
            tblAllProfessor.getColumnModel().getColumn(1).setResizable(false);
            tblAllProfessor.getColumnModel().getColumn(2).setResizable(false);
            tblAllProfessor.getColumnModel().getColumn(3).setResizable(false);
            tblAllProfessor.getColumnModel().getColumn(4).setResizable(false);
            tblAllProfessor.getColumnModel().getColumn(5).setResizable(false);
        }

        btnJoinClass.setBackground(new java.awt.Color(117, 194, 246));
        btnJoinClass.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnJoinClass.setText("JOIN CLASS");
        btnJoinClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinClassActionPerformed(evt);
            }
        });

        btnViewDetail.setBackground(new java.awt.Color(117, 194, 246));
        btnViewDetail.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnViewDetail.setText("VIEW DETAIL");
        btnViewDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailActionPerformed(evt);
            }
        });

        txtccode.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtccode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtccodeActionPerformed(evt);
            }
        });

        lblCatelog.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblCatelog.setText("Search Course Code:");

        btnSearchCourse.setBackground(new java.awt.Color(117, 194, 246));
        btnSearchCourse.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnSearchCourse.setText("SEARCH");
        btnSearchCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCourseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Professor Name:");

        txtProfName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtProfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfNameActionPerformed(evt);
            }
        });

        txtPRegion.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtPRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPRegionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Region:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Language:");

        txtPLanguage.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtPLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPLanguageActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Topic:");

        txtPTopic.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtPTopic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPTopicActionPerformed(evt);
            }
        });

        btnSearchProfessor.setBackground(new java.awt.Color(117, 194, 246));
        btnSearchProfessor.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnSearchProfessor.setText("SEARCH");
        btnSearchProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCurrentCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(txtProfName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(txtPRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(txtPLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 20, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCatelog)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtccode, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearchCourse)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnJoinClass, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnViewDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))
                            .addComponent(lblCourseHistory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearchProfessor)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnJoinClass, btnSearchCourse, btnSearchProfessor, btnViewDetail});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCurrentCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtccode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCatelog)
                        .addComponent(btnSearchCourse))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnJoinClass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewDetail)))
                .addGap(8, 8, 8)
                .addComponent(lblCourseHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProfName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchProfessor)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtccodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtccodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtccodeActionPerformed

    private void txtProfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfNameActionPerformed

    private void txtPRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPRegionActionPerformed

    private void txtPLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPLanguageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPLanguageActionPerformed

    private void txtPTopicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPTopicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPTopicActionPerformed
/**
 * Event handler for the "Join Class" button action.
 * This method is called when the student clicks the "Join Class" button to enroll in a course.
 * It checks if the student has met the graduation requirements and if not, allows them to enroll in a course. 
 * It checks for time conflicts, class capacity, and maximum class limits, and updates the student's and course's lists accordingly.
 *
 * @param evt The action event that triggered this method.
 */
    private void btnJoinClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinClassActionPerformed
        // TODO add your handling code here:
        if(student.CheckGraduateStatus()){
            JOptionPane.showMessageDialog(this,"You can choose class since you have finish all requrement for graduate.");
                return;
        }
   
        int selectedRowIndex=tblAllCourse.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to join");
            return;
        }
        DefaultTableModel model=(DefaultTableModel)tblAllCourse.getModel();
        Course selectedcourse=(Course)model.getValueAt(selectedRowIndex,0);
        //the class needs to add into student currentlist can student will be add into course's student list
        //check if student have this class
        
        for(Course course:student.getCurrentCourses()){
            if(course.getcCode().equals(selectedcourse.getcCode())){
                JOptionPane.showMessageDialog(this,"You have chosed same class");
                return;
            }
            if(course.getTime().equals(selectedcourse.getTime())){
                JOptionPane.showMessageDialog(this,"Time conflict");
                return;
            }
        }
        if(student.getCurrentCourses().size()>=2){
            JOptionPane.showMessageDialog(this,"You have reached max class");
                return;
        }
        //
        if(selectedcourse.getStudentList().size()<10){
            selectedcourse.getStudentList().add(student);
            student.getCurrentCourses().add(selectedcourse);
        }else{
            selectedcourse.getWaitList().add(student);
        }
        StudentCourseJPanel panel=new StudentCourseJPanel(SplitPane,admin,student);
        SplitPane.setRightComponent(panel);
        
    }//GEN-LAST:event_btnJoinClassActionPerformed
/**
 * Event handler for the "Search Course" button action.
 * This method is called when the student clicks the "Search Course" button to search for courses with a specific course code.
 * It searches for courses with the specified course code and populates the table with matching results.
 *
 * @param evt The action event that triggered this method.
 */
    private void btnSearchCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCourseActionPerformed
        // TODO add your handling code here:
        List<Course>clist=new ArrayList<>();
        String code=txtccode.getText();
        //search for all courses which have same code
        for(Course c:admin.getAllCourse()){
            if(c.getcCode().equals(code))
                clist.add(c);
        }
        //        Account result=accountDirectory.searchAccount(txtAccountNumber.getText());
         if(clist.size()==0){
            JOptionPane.showMessageDialog(null, "Account number you entered does not exist", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
       else{
             populateSearchCourseTable(clist);
         }

    }//GEN-LAST:event_btnSearchCourseActionPerformed
/**
 * Event handler for the "View Details" button action.
 * This method is called when the student clicks the "View Details" button to view the details of a selected course.
 * It retrieves the selected course and navigates to the student view class panel to display course details.
 *
 * @param evt The action event that triggered this method.
 */
    private void btnViewDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex= tblAllCourse.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to view.");
            return;
        }
        DefaultTableModel model=(DefaultTableModel)tblAllCourse.getModel();
        Course selectedcourse=(Course)model.getValueAt(selectedRowIndex,0);
        StudentViewClassJPanel panel=new StudentViewClassJPanel(selectedcourse,admin,student,SplitPane);
        SplitPane.setRightComponent(panel);
    }//GEN-LAST:event_btnViewDetailActionPerformed

    private void btnSearchProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProfessorActionPerformed
        // TODO add your handling code here:
        populateSearchProfessorTable(txtProfName.getText(),txtPRegion.getText(),txtPLanguage.getText(),txtPTopic.getText());
    }//GEN-LAST:event_btnSearchProfessorActionPerformed

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJoinClass;
    private javax.swing.JButton btnSearchCourse;
    private javax.swing.JButton btnSearchProfessor;
    private javax.swing.JButton btnViewDetail;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCatelog;
    private javax.swing.JLabel lblCourseHistory;
    private javax.swing.JLabel lblCurrentCourse;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblAllCourse;
    private javax.swing.JTable tblAllProfessor;
    private javax.swing.JTextField txtPLanguage;
    private javax.swing.JTextField txtPRegion;
    private javax.swing.JTextField txtPTopic;
    private javax.swing.JTextField txtProfName;
    private javax.swing.JTextField txtccode;
    // End of variables declaration//GEN-END:variables

    private void populateCurrentCourseTable() {
        DefaultTableModel model=(DefaultTableModel)tblAllCourse.getModel();
        model.setRowCount(0);
        
        for(Course course : admin.getAllCourse()){
            Object[]row =new Object[7];
            row[0]=course;
            row[1]=course.getSemester();
            row[2]=course.getProfessorName();
            row[3]=course.getWeekdays();
            row[4]=course.getHours();
            row[5]=10;
            row[6]=course.getStudentList().size();
            model.addRow(row);
        }
    }
    private void populateAllProfessorTable() {
        DefaultTableModel model=(DefaultTableModel)tblAllProfessor.getModel();
        model.setRowCount(0);
        
        for(Professor p : admin.getAllProfessor()){
            Object[]row =new Object[6];
            row[0]=p;
            row[1]=p.getCourseList().toString();
            row[2]=p.getRegion();
            row[3]=p.getLanguage();
            row[4]=p.getTopic();
            row[5]=p.getRank();
            model.addRow(row);
        }
    }
    private void populateSearchProfessorTable(String name,String region,String language,String topic) {
        DefaultTableModel model=(DefaultTableModel)tblAllProfessor.getModel();
        model.setRowCount(0);
        
        //search if there is any professor reach the condition above
        List<Professor>tempList=new ArrayList<>();
        tempList=pWithName(tempList,name);
        //System.out.println(tempList.toString());
        tempList=pWithRegion(tempList,region);
        //System.out.println(tempList.toString());
        tempList=pWithLanguage(tempList,language);
        //System.out.println(tempList.toString());
        tempList=pWithTopic(tempList,topic);
        //System.out.println(tempList.toString());
       
        for(Professor p : tempList){
            Object[]row =new Object[6];
            row[0]=p;
            row[1]=p.getCourseList().toString();
            row[2]=p.getRegion();
            row[3]=p.getLanguage();
            row[4]=p.getTopic();
            row[5]=p.getRank();
            model.addRow(row);
        }
    }
    //if Name is null return allprofessor
    //else return professors with same name;
    private List<Professor> pWithName(List<Professor>plist,String name){
        if(name==null||name.equals("")){
            plist.addAll(admin.getAllProfessor());
            //System.out.println("name pass");
            return plist;
        }
        for(Professor p : admin.getAllProfessor()){
            if(p.getName().equals(name)){
                plist.add(p);
            }
        }
        return plist;
    }
    //if region is null return the list
    //else remove the professor with different region
    private List<Professor> pWithRegion(List<Professor>plist,String region){
        if(region==null||region.equals("")){
            System.out.println("Region pass");
            return plist;
        }
        for(int i=0;i<plist.size();i++){
            
            if(!plist.get(i).getRegion().equals(region)){
                plist.remove(plist.get(i));
                i-=1;
            }
        }
        return plist;
    }
    //if language is null return the list
    //else remove the professor with different language
    private List<Professor> pWithLanguage(List<Professor>plist,String language){
        if(language==null||language.equals("")){
            //System.out.println("Language pass");
            return plist;
        }
        for(int i=0;i<plist.size();i++){
            if(!plist.get(i).getLanguage().equals(language)){
                plist.remove(plist.get(i));
                i-=1;
            }
        }
        return plist;
    }
    
    //if topic is null return the list
    //else remove the professor with different topic
    private List<Professor> pWithTopic(List<Professor>plist,String topic){
        if(topic==null||topic.equals("")){
            //System.out.println("topic pass");
            return plist;
        }
        for(int i=0;i<plist.size();i++){
            if(!plist.get(i).getTopic().equals(topic)){
                
                plist.remove(plist.get(i));
                i-=1;
            }
        }
        return plist;
    }

    private void populateSearchCourseTable(List<Course>clist) {
        DefaultTableModel model=(DefaultTableModel)tblAllCourse.getModel();
        model.setRowCount(0);
        
        for(Course course : clist){
            Object[]row =new Object[7];
            row[0]=course;
            row[1]=course.getSemester();
            row[2]=course.getProfessorName();
            row[3]=course.getWeekdays();
            row[4]=course.getHours();
            row[5]=10;
            row[6]=course.getStudentList().size();
            model.addRow(row);
        }
    }

}

