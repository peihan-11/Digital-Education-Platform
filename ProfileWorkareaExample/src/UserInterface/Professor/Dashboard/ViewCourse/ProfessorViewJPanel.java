/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Professor.Dashboard.ViewCourse;

import Business.Course.Course;
import Business.Student.Student;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author xupeihan
 */
public class ProfessorViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorViewJPanel
     */
    Course course;
    JSplitPane splitPane;

    public ProfessorViewJPanel(JSplitPane splitPane,Course course) {
        initComponents();
        this.course=course;
        this.splitPane=splitPane;
        populate();
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
        lblCourseName = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        lblCourseCode = new javax.swing.JLabel();
        txtCourseCode = new javax.swing.JTextField();
        lblCourseCata = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblSemester = new javax.swing.JLabel();
        txtSemester = new javax.swing.JTextField();
        lblWeekday = new javax.swing.JLabel();
        txtWeekDay = new javax.swing.JTextField();
        lblHour = new javax.swing.JLabel();
        txtHour = new javax.swing.JTextField();
        lblDescr = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDecp = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudentTable = new javax.swing.JTable();
        btnSaveGrade = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblStuWaitlist = new javax.swing.JTable();
        boxGrade = new javax.swing.JComboBox<>();
        lblSemester1 = new javax.swing.JLabel();
        txtCourseTopic = new javax.swing.JTextField();
        txtcCatalog = new javax.swing.JTextField();

        setBackground(new java.awt.Color(251, 238, 172));

        lblCourse1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        lblCourse1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCourse1.setText("COURSE DETAIL");

        lblCourseName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblCourseName.setText("Course Name:");

        txtCourseName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtCourseName.setEnabled(false);

        lblCourseCode.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblCourseCode.setText("Course Code:");

        txtCourseCode.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtCourseCode.setEnabled(false);

        lblCourseCata.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblCourseCata.setText("Course Catalog:");

        lblYear.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblYear.setText("Year:");

        txtYear.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtYear.setEnabled(false);

        lblSemester.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblSemester.setText("Semester:");

        txtSemester.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtSemester.setEnabled(false);

        lblWeekday.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblWeekday.setText("WeekDay:");

        txtWeekDay.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtWeekDay.setEnabled(false);

        lblHour.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblHour.setText("Hour:");

        txtHour.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtHour.setEnabled(false);

        lblDescr.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblDescr.setText("Description:");

        txtDecp.setColumns(20);
        txtDecp.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtDecp.setRows(5);
        txtDecp.setEnabled(false);
        jScrollPane1.setViewportView(txtDecp);

        tblStudentTable.setBackground(new java.awt.Color(204, 255, 204));
        tblStudentTable.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tblStudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student Name", "Student ID", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudentTable.setSelectionBackground(new java.awt.Color(0, 51, 51));
        jScrollPane2.setViewportView(tblStudentTable);
        if (tblStudentTable.getColumnModel().getColumnCount() > 0) {
            tblStudentTable.getColumnModel().getColumn(0).setResizable(false);
            tblStudentTable.getColumnModel().getColumn(1).setResizable(false);
            tblStudentTable.getColumnModel().getColumn(2).setResizable(false);
        }

        btnSaveGrade.setBackground(new java.awt.Color(117, 194, 246));
        btnSaveGrade.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnSaveGrade.setText("SAVE GRADE");
        btnSaveGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveGradeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("Waitlist: ");

        tblStuWaitlist.setBackground(new java.awt.Color(204, 255, 204));
        tblStuWaitlist.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tblStuWaitlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Student Name", "Student ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStuWaitlist.setSelectionBackground(new java.awt.Color(0, 51, 51));
        jScrollPane3.setViewportView(tblStuWaitlist);
        if (tblStuWaitlist.getColumnModel().getColumnCount() > 0) {
            tblStuWaitlist.getColumnModel().getColumn(0).setResizable(false);
            tblStuWaitlist.getColumnModel().getColumn(1).setResizable(false);
        }

        boxGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "F" }));
        boxGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxGradeActionPerformed(evt);
            }
        });

        lblSemester1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblSemester1.setText("Topic:");

        txtCourseTopic.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtCourseTopic.setEnabled(false);

        txtcCatalog.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtcCatalog.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCourse1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSemester1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCourseTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblCourseName)
                                        .addComponent(lblCourseCata))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtcCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblYear)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCourseCode)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblWeekday)
                                            .addComponent(lblHour))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtWeekDay, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHour, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(139, 139, 139)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(btnSaveGrade))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblDescr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCourseName, txtCourseTopic, txtYear});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCourseCode, txtWeekDay, txtcCatalog});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourseName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourseTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSemester1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYear)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCourseCata)
                            .addComponent(txtcCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCourseCode)
                            .addComponent(txtCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSemester))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHour)
                            .addComponent(txtHour, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWeekday)
                            .addComponent(txtWeekDay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCourseName, txtCourseTopic, txtHour, txtYear});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCourseCode, txtSemester, txtWeekDay, txtcCatalog});

    }// </editor-fold>//GEN-END:initComponents
/**
 * Event handler for the "Save Grade" button action.
 * This method is called when the user clicks the "Save Grade" button to update a student's grade in the course.
 * It retrieves the selected student and grade from the table, updates the grade in the course recording,
 * and displays a success message.
 *
 * @param evt The action event that triggered this method.
 */
    private void btnSaveGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveGradeActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex=tblStudentTable.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to get grade");
            return;
        }
        DefaultTableModel model=(DefaultTableModel)tblStudentTable.getModel();
        Student student=(Student)model.getValueAt(selectedRowIndex,0);
        char grade=boxGrade.getSelectedItem().toString().charAt(0);
        //put grade to the course recording
        course.getGrade().put(student,grade);
        double g=0.0;
        switch(grade){
            case 'A':
                g=4.0;
                break;
            case 'B':
                g=3.3;
                break;
            case 'C':
                g=2.5;
                break;
            case 'D':
                g=1.7;
                break;
            case 'F':
                g=0.0;
                break;
            default :g=0.0;
        }
        System.out.println(g);
        student.setGPA((student.getGPA()*student.getCourseHistory().size()+g)/(student.getCourseHistory().size()+1));
        System.out.println(student.getGPA());
        populate();
        JOptionPane.showMessageDialog(this,"Successlly save grade!");
    }//GEN-LAST:event_btnSaveGradeActionPerformed

    private void boxGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxGradeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxGrade;
    private javax.swing.JButton btnSaveGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCourse1;
    private javax.swing.JLabel lblCourseCata;
    private javax.swing.JLabel lblCourseCode;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblDescr;
    private javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JLabel lblSemester1;
    private javax.swing.JLabel lblWeekday;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTable tblStuWaitlist;
    private javax.swing.JTable tblStudentTable;
    private javax.swing.JTextField txtCourseCode;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtCourseTopic;
    private javax.swing.JTextArea txtDecp;
    private javax.swing.JTextField txtHour;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtWeekDay;
    private javax.swing.JTextField txtYear;
    private javax.swing.JTextField txtcCatalog;
    // End of variables declaration//GEN-END:variables

    private void populate() {
        txtCourseName.setText(course.getcName());
        txtCourseCode.setText(course.getcCode());
        txtcCatalog.setText(course.getcCatalog());
        txtCourseTopic.setText(course.getcTopic());
        txtDecp.setText(course.getcDescription());
        txtSemester.setText(course.getSemesters());
        txtWeekDay.setText(course.getWeekdays());
        txtHour.setText(course.getHours());
        txtYear.setText(course.getYears());

        DefaultTableModel model1=(DefaultTableModel)tblStudentTable.getModel();
        model1.setRowCount(0);
        
        for(Student s : course.getStudentList()){
            Object[]row =new Object[3];
            row[0]=s;
            row[1]=s.getStudentID();        
            row[2]=course.getGrade().get(s);
            
            model1.addRow(row);
        }      
                       
         DefaultTableModel model2 = (DefaultTableModel) tblStuWaitlist.getModel();
         model2.setRowCount(0);
         for(Student s: course.getWaitList()){
              Object [] row = new Object[2];
              row[0] = s;
              row[1] = s.getStudentID();
               
              model2.addRow(row);
               }
        
    }
}
