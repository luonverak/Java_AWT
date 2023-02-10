package GUI;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Test1 extends Frame implements ActionListener,MouseListener{
    
    Label label;
    JLabel lbimage;
    TextField txtID,txtName,txtYear,txtClass,txtjava,txtphp,txtdb,txtaddress,txtphone,txtimage;
    JRadioButton rbMale,rbFemale;
    JComboBox cbUniversity,cbDepartment;
    JCheckBox cbM,cbA,cbE;
    ButtonGroup bgtime=new ButtonGroup();
    ButtonGroup bgGender=new ButtonGroup();
    Button btnimage,btnsave,btnupdate,btndelete,btnsort,btnexit;
    JTable table;
    DefaultTableModel model;
    
    public void DesignTextField(TextField obj){
        obj.setFont(new Font("Times New Roman",Font.PLAIN,28));
        obj.setForeground(new Color(4, 102, 200));
    }
    public Test1(){
        
        label =new Label("Student DashBoard");
        label.setBounds(680, 50, 500, 50);
        label.setFont(new Font("Times New Roman",Font.BOLD,48));
        add(label);
        
        label= new Label("StuID");
        label.setBounds(50, 150, 100, 40);
        label.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(label);
        
        txtID = new TextField();
        txtID.setBounds(220, 150, 300, 50);
        DesignTextField(txtID);
        add(txtID);
        
        
        label= new Label("Name");
        label.setBounds(50, 220, 100, 40);
        label.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(label);
        
        txtName = new TextField();
        txtName.setBounds(220, 220, 300, 50);
        DesignTextField(txtName);
        add(txtName);
        
        label= new Label("Gender");
        label.setBounds(50, 290, 100, 40);
        label.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(label);
        
        rbMale= new JRadioButton("Male");
        rbMale.setBounds(220, 290, 100, 40);
        rbMale.setFont(new Font("Times New Roman",Font.PLAIN,28));
        rbMale.setForeground(new Color(52, 58, 64));
        add(rbMale);
        bgGender.add(rbMale);
        
        rbFemale= new JRadioButton("Female");
        rbFemale.setBounds(370, 290, 150, 40);
        rbFemale.setFont(new Font("Times New Roman",Font.PLAIN,28));
        rbFemale.setForeground(new Color(52, 58, 64));
        add(rbFemale);   
        bgGender.add(rbFemale);
        
        label= new Label("University");
        label.setBounds(50, 360, 150, 40);
        label.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(label);
        
        String university[]={"RUPP","SETEC","NORTON","KIT","CADT"};
        cbUniversity = new JComboBox(university);
        cbUniversity.setBounds(220, 357, 300, 56);
        cbUniversity.setFont(new Font("Times New Roman",Font.PLAIN,26));
        cbUniversity.setEditable(true);
        cbUniversity.setFocusable(false);
        add(cbUniversity);
        
        label= new Label("Department");
        label.setBounds(50, 430, 160, 40);
        label.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(label);
        
        String department[]={"ITE","IT","Math","Khmer","MIS","History"};
        cbDepartment = new JComboBox(department);
        cbDepartment.setBounds(220, 430, 300, 56);
        cbDepartment.setFont(new Font("Times New Roman",Font.PLAIN,26));
        cbDepartment.setEditable(true);
        cbDepartment.setFocusable(false);
        add(cbDepartment);
        
        label= new Label("Year");
        label.setBounds(995, 220, 100, 40);
        label.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(label);
        
        txtYear = new TextField();
        txtYear.setBounds(1110, 220, 300, 50);
        DesignTextField(txtYear);
        add(txtYear);
        
        label= new Label("Class");
        label.setBounds(995, 290, 100, 40);
        label.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(label);
        
        txtClass = new TextField();
        txtClass.setBounds(1110, 290, 300, 50);
        DesignTextField(txtClass);
        add(txtClass);
        
        label= new Label("Time");
        label.setBounds(995, 360, 100, 40);
        label.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(label);
       
        cbM=new JCheckBox("Morning");
        cbM.setBounds(1100, 360, 150, 40);
        cbM.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(cbM);
        bgtime.add(cbM);
        
        cbA=new JCheckBox("Afternoon");
        cbA.setBounds(1100, 398, 150, 40);
        cbA.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(cbA);
        bgtime.add(cbA);
        cbE=new JCheckBox("Evening");
        cbE.setBounds(1100, 430, 150, 40);
        cbE.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(cbE);
        bgtime.add(cbE);
        label= new Label("Java");
        label.setBounds(560, 150, 100, 50);
        label.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(label);
        txtjava = new TextField();
        txtjava.setBounds(680, 150, 300, 50);
        DesignTextField(txtjava);
        add(txtjava);
        label= new Label("PHP");
        label.setBounds(560, 220, 100, 40);
        label.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(label);
        txtphp = new TextField();
        txtphp.setBounds(680, 220, 300, 50);
        DesignTextField(txtphp);
        add(txtphp);
        label= new Label("Databases");
        label.setBounds(560, 290, 120, 40);
        label.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(label);
        txtdb = new TextField();
        txtdb.setBounds(680, 290, 300, 50);
        DesignTextField(txtdb);
        add(txtdb);
        
        label= new Label("Address");
        label.setBounds(995, 150, 100, 40);
        label.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(label);
        txtaddress = new TextField();
        txtaddress.setBounds(1110, 150, 300, 50);
        DesignTextField(txtaddress);
        add(txtaddress);
        
        label= new Label("Phone");
        label.setBounds(560, 360, 100, 40);
        label.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(label);
        txtphone = new TextField();
        txtphone.setBounds(680, 360, 300, 50);
        DesignTextField(txtphone);
        add(txtphone);
        
        lbimage= new JLabel("Image");
        lbimage.setBounds(560, 430, 100, 40);
        lbimage.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(lbimage);
        txtimage = new TextField();
        txtimage.setBounds(680, 430, 300, 50);
        DesignTextField(txtimage);
        add(txtimage);
        
        btnimage=new Button("Image");
        btnimage.setBounds(1500, 400, 235, 50);
        btnimage.setFont(new Font("Times New Roman",Font.PLAIN,28));
        add(btnimage);
        
        lbimage=new JLabel();
        lbimage.setBounds(1500, 156, 220, 220);
        lbimage.setBorder(BorderFactory.createLineBorder(Color.decode("#090A0C")));
        add(lbimage);
        
        String head[]={"StuID","Name","Gender",
                        "University","Department",
                        "Year","Class","Time",
                        "Java","PHP","Database","Total","Average","Address","Phone","Image"};
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(head);
        table.setRowHeight(35);
        table.setFont(new Font("Times New Roman",Font.PLAIN,19));
        table.setModel(model);
        JScrollPane js=new JScrollPane(table);
        js.setBounds(40, 520, 1700, 350);
        add(js);
        
        btnsave =new Button("Save");
        btnsave.setBounds(50, 900, 170, 55);
        btnsave.setFont(new Font("Times New Roman",Font.BOLD,30));
        btnsave.setForeground(Color.BLUE);
        add(btnsave);
        
        btnupdate =new Button("Update");
        btnupdate.setBounds(450, 900, 170, 55);
        btnupdate.setFont(new Font("Times New Roman",Font.BOLD,30));
        btnupdate.setForeground(Color.GREEN);
        add(btnupdate);
        
        btndelete =new Button("Delete");
        btndelete.setBounds(800, 900, 170, 55);
        btndelete.setFont(new Font("Times New Roman",Font.BOLD,30));
        btndelete.setForeground(Color.RED);
        add(btndelete);
        
        btnsort =new Button("Sort");
        btnsort.setBounds(1200, 900, 170, 55);
        btnsort.setFont(new Font("Times New Roman",Font.BOLD,30));
        btnsort.setForeground(Color.YELLOW);
        add(btnsort);
        
        btnexit =new Button("Exit");
        btnexit.setBounds(1570, 900, 170, 55);
        btnexit.setFont(new Font("Times New Roman",Font.BOLD,30));
        btnexit.setForeground(Color.RED);
        add(btnexit);
        
        btnsave.addActionListener(this);
        btnupdate.addActionListener(this);
        btndelete.addActionListener(this);
        btnimage.addActionListener(this);
        btnsort.addActionListener(this);
        btnexit.addActionListener(this);
        table.addMouseListener(this);
        
        setLayout(null);
        setSize(1770, 1000);       
        setLocationRelativeTo(this);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Test1();
    }
    public void Getdata(){
        for(int i=0;i<Student_List.list.size();i++)
            {
                Object row[]={
                    Student_List.list.get(i).getId(),
                    Student_List.list.get(i).getName(),
                    Student_List.list.get(i).getGender(),
                    Student_List.list.get(i).getUniversity(),
                    Student_List.list.get(i).getDepartment(),
                    Student_List.list.get(i).getYear(),
                    Student_List.list.get(i).getClasses(),
                    Student_List.list.get(i).getTime(),
                    Student_List.list.get(i).getJava(),
                    Student_List.list.get(i).getPhp(),
                    Student_List.list.get(i).getDb(),
                    Student_List.list.get(i).getTotal(),
                    Student_List.list.get(i).getAvg(),
                    Student_List.list.get(i).getAddress(),
                    Student_List.list.get(i).getPhone(),
                    Student_List.list.get(i).getImage()
                };
                model.addRow(row);
            }
    }
    public void Clear(){
        txtID.setText("");
        bgGender.clearSelection();
        bgtime.clearSelection();
        cbUniversity.setSelectedIndex(0);
        lbimage.setIcon(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnsave){
            int id=Integer.parseInt(txtID.getText());
            String name=txtName.getText();
            String gender;
            if(rbMale.isSelected()==true){
                gender="Male";
            }else{
                gender="Female";
            }
            String university=cbUniversity.getSelectedItem().toString();
            String department=cbDepartment.getSelectedItem().toString();
            float java=Float.parseFloat(txtjava.getText());
            float php=Float.parseFloat(txtphp.getText());
            float db=Float.parseFloat(txtdb.getText());
            String phone=txtphone.getText();
            String image=txtimage.getText();
            String address=txtaddress.getText();
            int year=Integer.parseInt(txtYear.getText());
            String classes=txtClass.getText();
            String time;
            if(cbM.isSelected()==true){
                time="Morning";
            }else if(cbA.isSelected()==true){
                time="Afternoon";
            }else{
                time="Evening";
            }
            
            float total=java+php+db;
            float avg=total/3;
            Student_List.list.add(new Student_List(id, name, gender, university, 
                    department, java, php, db,total,avg, phone, image, address, year, classes, time));
            model.setRowCount(0);
            Getdata();
            Clear();
        }else if(e.getSource()==btnupdate){
            
            int id=Integer.parseInt(txtID.getText());
            String name=txtName.getText();
            String gender;
            if(rbMale.isSelected()==true){
                gender="Male";
            }else{
                gender="Female";
            }
            String university=cbUniversity.getSelectedItem().toString();
            String department=cbDepartment.getSelectedItem().toString();
            float java=Float.parseFloat(txtjava.getText());
            float php=Float.parseFloat(txtphp.getText());
            float db=Float.parseFloat(txtdb.getText());
            String phone=txtphone.getText();
            String image=txtimage.getText();
            String address=txtaddress.getText();
            int year=Integer.parseInt(txtYear.getText());
            String classes=txtClass.getText();
            String time;
            if(cbM.isSelected()==true){
                time="Morning";
            }else if(cbA.isSelected()==true){
                time="Afternoon";
            }else{
                time="Evening";
            }
            
            float total=java+php+db;
            float avg=total/3;
            int row = table.getSelectedRow();
            Student_List.list.set(row, new Student_List(id, name, gender, university, department, java, php, db, total, avg, phone, image, address, year, classes, time));
            model.setRowCount(0);
            Getdata();
            
        }else if(e.getSource()==btndelete){
            int row=table.getSelectedRow();
            Student_List.list.remove(row);
            model.setRowCount(0);
            Getdata();
        }else if(e.getSource()==btnsort){
            Collections.sort(Student_List.list,Comparator.comparing(Student_List::getAvg));
            model.setRowCount(0);
            Getdata();
        }else if(e.getSource()==btnimage){
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            txtimage.setText(filename);
            Image getAbsolutePath=null;
            ImageIcon icon = new ImageIcon(filename);
            Image image = icon.getImage().getScaledInstance(lbimage.getWidth(), lbimage.getHeight(), Image.SCALE_SMOOTH);
            lbimage.setIcon(icon);
        }else if(e.getSource()==btnexit){
            System.exit(0);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        DefaultTableModel mod=(DefaultTableModel) table.getModel();
        int row=table.getSelectedRow();
        txtID.setText(mod.getValueAt(row, 0).toString());
        txtName.setText(mod.getValueAt(row, 1).toString());
        String gender=mod.getValueAt(row, 2).toString();
        if(gender.equals("Male")){
            rbMale.setSelected(true);
        }else{
            rbFemale.setSelected(true);
        }
        cbUniversity.setSelectedItem(mod.getValueAt(row, 3));
        cbDepartment.setSelectedItem(mod.getValueAt(row, 4));
        txtYear.setText(mod.getValueAt(row, 5).toString());
        txtClass.setText(mod.getValueAt(row, 6).toString());
        String time=mod.getValueAt(row, 7).toString();
        if(time.equals("Morning")){
            cbM.setSelected(true);
        }else if(time.equals("Afternoon")){
            cbA.setSelected(true);
        }else{
            cbE.setSelected(true);
        }
        txtjava.setText(mod.getValueAt(row, 8).toString());
        txtphp.setText(mod.getValueAt(row, 9).toString());
        txtdb.setText(mod.getValueAt(row, 10).toString());  
        txtaddress.setText(mod.getValueAt(row, 13).toString());
        txtphone.setText(mod.getValueAt(row, 14).toString());
        txtimage.setText(model.getValueAt(row, 15).toString());
        lbimage.setIcon(new javax.swing.ImageIcon(model.getValueAt(row, 15).toString()));
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
