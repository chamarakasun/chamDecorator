/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import classes.IceCreamVarieties;
import classes.icecream.Strawberry;
import classes.toppings.HardChocolateCoating;
import classes.toppings.MeltedMarshmallow;
import classes.toppings.Oreos;
import classes.toppings.Sprinkles;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chamara
 */
public class FruitandNut extends javax.swing.JFrame {

    public FruitandNut() {
        initComponents();
    }
    
     public void addTable(String Name, Double Price){
 
 
        String Qty = JOptionPane.showInputDialog("Enter Qty");
        Double tqty = Double.valueOf(Qty);
        Double Tot_Price = Price * tqty ;
        
     DecimalFormat df = new DecimalFormat("00.00");
     String d11 = df.format(Tot_Price);
       
        
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        
        Vector v = new Vector();
        v.add(Name);
        v.add(Qty);
        v.add(d11);
        dt.addRow(v);
        
      cart_cal();
 }  
     
     public void cart_cal(){
 
  int numofrow = jTable1.getRowCount();
  double total = 0 ;
     for (int i = 0; i < numofrow; i++) {
         double value = Double.valueOf(jTable1.getValueAt(i, 2).toString());
         total+= value;
         
     }
  
     DecimalFormat df = new DecimalFormat("00.00");
     String d1 = df.format(total);
     Too.setText(d1);
     
  
 }
     
     public void bill_print(){
 
        try {
            bill.setText("                                   Show Den Ice-Cream \n"
                    
            );
            bill.setText(bill.getText() + "    589/ King Road, \n");
            bill.setText(bill.getText() + "    Colombo, Srilanka, \n");
            bill.setText(bill.getText() + "    +9411 123456789, \n");
            bill.setText(bill.getText() + "--------------------------------------------\n");
            bill.setText(bill.getText() + " Iteam      \tQty \tPrice \n");
            bill.setText(bill.getText() + "--------------------------------------------\n");
            
            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                
                String name = df.getValueAt(i, 0).toString();
                String qt = df.getValueAt(i, 1).toString();
                String prc = df.getValueAt(i, 2).toString();
                
                bill.setText(bill.getText() + "- - - - - - - Fruit & Nut Ice - - - - - - -\n");
                
                bill.setText(bill.getText() + name+"\t"+qt+"\t"+prc+" \n");
                
            }
            bill.setText(bill.getText() + "--------------------------------------------\n");
            bill.setText(bill.getText() + "SubTotal :\t"+Too.getText()+"\n");
            bill.setText(bill.getText() + "Cash :\t"+Cash.getText()+"\n");
            bill.setText(bill.getText() + "Ballance :\t"+Bal.getText()+"\n");
            bill.setText(bill.getText() + "====================================\n");
            bill.setText(bill.getText() +"         Thanks For Your Business...!"+"\n");
           // bill.setText(bill.getText() + "---------------------------------------------n");
            bill.setText(bill.getText() +"         Software by Chamara Kasun"+"\n");
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();
            
            bill.setText(bill.getText() + "           " + dtf.format(now) +  "\n");
            
            
            bill.print();
            
        } catch (PrinterException ex) {
            
            Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
        }
 
 }

    public String description;

    public String getDescription() {
        return description;
    }

    public double cost() {

        return 0;

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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        sprinkelsjCheckBox = new javax.swing.JCheckBox();
        marshmellowsjCheckBox = new javax.swing.JCheckBox();
        orejCheckBox = new javax.swing.JCheckBox();
        chocolatejCheckBox = new javax.swing.JCheckBox();
        description_Label = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Too = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Bal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Cash = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(42, 39, 41));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngwing.com (4).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 470, 530));

        jPanel2.setBackground(new java.awt.Color(42, 39, 41));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("This divine mixture of creamy dairy ice cream, sweet nuts, ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 410, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 153, 0));
        jLabel15.setText(" With an extra layer of texture added to the creamy ice cream");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 0));
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 153, 0));
        jLabel17.setText("base, Elephant House Fruit & Nut ice cream is a perfect choice");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 410, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 153, 0));
        jLabel18.setText("and candied fruits is the perfect answer to your sweet craving.");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 410, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 153, 0));
        jLabel19.setText("in fresh strawberries or strawberry flavoring with the eggs,");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 410, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 650));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fruit & Nut Ice Cream");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 450, 60));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Melted Marshmallows");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 180, 50));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Oreos");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 180, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Hard Chocolate Coating");
        jButton2.setToolTipText("");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 180, 50));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Sprinkles");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 180, 50));

        sprinkelsjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        sprinkelsjCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        sprinkelsjCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sprinkelsjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sprinkelsjCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(sprinkelsjCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 30, 50));

        marshmellowsjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        marshmellowsjCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        marshmellowsjCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        marshmellowsjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marshmellowsjCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(marshmellowsjCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, 30));

        orejCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        orejCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        orejCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orejCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orejCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(orejCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 30, 50));

        chocolatejCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        chocolatejCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        chocolatejCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chocolatejCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocolatejCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(chocolatejCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 30, 50));

        description_Label.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        description_Label.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(description_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 650, 520, 40));

        jLabel21.setBackground(new java.awt.Color(192, 27, 54));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel21.setOpaque(true);
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 110, 120));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/left_2_30px.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 30, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closing.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 30, 30));

        jLabel8.setBackground(new java.awt.Color(42, 39, 41));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pexels-celso-mejía-12342219.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 50, 50));

        jLabel9.setBackground(new java.awt.Color(42, 39, 41));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pexels-solodsha-8105105.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 50, 50));

        jLabel10.setBackground(new java.awt.Color(42, 39, 41));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pexels-alexander-grey-1174114.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 50, 50));

        jLabel11.setBackground(new java.awt.Color(42, 39, 41));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pexels-monstera-7144901.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 50, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Rs. 300");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 60, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Rs. 200");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 60, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Rs. 200");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 60, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Rs. 200");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 60, 30));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "iteam", "Qty", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 340, 230));

        bill.setBackground(new java.awt.Color(255, 255, 255));
        bill.setColumns(20);
        bill.setForeground(new java.awt.Color(0, 0, 0));
        bill.setRows(5);
        bill.setBorder(null);
        jScrollPane2.setViewportView(bill);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 340, 320));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Total :");

        Too.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Too.setForeground(new java.awt.Color(0, 0, 0));
        Too.setText("0");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Balance :");

        Bal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Bal.setForeground(new java.awt.Color(255, 0, 51));
        Bal.setText("0");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Cash :");

        Cash.setBackground(new java.awt.Color(255, 255, 255));
        Cash.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Cash.setForeground(new java.awt.Color(255, 153, 0));
        Cash.setText("0");
        Cash.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Too, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Too))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Bal))
                .addGap(140, 140, 140))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 280, 150));

        jButton14.setBackground(new java.awt.Color(42, 39, 41));
        jButton14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Print");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 104, 34));

        jButton13.setBackground(new java.awt.Color(192, 27, 54));
        jButton13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("PAY");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 104, 32));

        jLabel20.setBackground(new java.awt.Color(192, 27, 54));
        jLabel20.setOpaque(true);
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 740, 10));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 51, 51));
        jLabel24.setText("Additionally Added Item");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1137, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
       new Frame().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void marshmellowsjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marshmellowsjCheckBoxActionPerformed
        addTable("Melted Marshmallows",200.00 );
    }//GEN-LAST:event_marshmellowsjCheckBoxActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Double tot = Double.valueOf(Too.getText());
        Double chs = Double.valueOf(Cash.getText());
        Double bal = chs - tot ;

        DecimalFormat df = new DecimalFormat("00.00");
        Bal.setText(String.valueOf(df.format(bal)));

        IceCreamVarieties fruitandnut = new classes.icecream.FruitandNut();
        
        boolean oreo = orejCheckBox.isSelected();
        boolean choco = chocolatejCheckBox.isSelected();
        boolean marshmellow = marshmellowsjCheckBox.isSelected();
        boolean sprinkels = sprinkelsjCheckBox.isSelected();
        
        if (oreo) {
            fruitandnut = new Oreos(fruitandnut);
        }
        if (choco) {
            fruitandnut = new HardChocolateCoating(fruitandnut);
        }
        if (marshmellow) {
            fruitandnut = new MeltedMarshmallow(fruitandnut);
        }
        if (sprinkels) {
            fruitandnut = new Sprinkles(fruitandnut);
        }
        
        String description = fruitandnut.getDescription();
        System.out.println(description);
        String cost = "" + fruitandnut.iceCreamPrice();
        description_Label.setText(description);
        Too.setText(cost);
        System.out.println(cost);
        
        JOptionPane.showConfirmDialog(rootPane, "Your are purchased "+description+ " - " +cost, "Success", -1, 1);
        
        bill_print();

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        bill_print();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void orejCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orejCheckBoxActionPerformed
        // TODO add your handling code here:
        addTable("Oreos",300.00 );
    }//GEN-LAST:event_orejCheckBoxActionPerformed

    private void chocolatejCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocolatejCheckBoxActionPerformed
        // TODO add your handling code here:
                addTable("Hard Chocolate Coating",200.00 );

    }//GEN-LAST:event_chocolatejCheckBoxActionPerformed

    private void sprinkelsjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sprinkelsjCheckBoxActionPerformed
        // TODO add your handling code here:
                        addTable("Sprinkles",200.00 );

    }//GEN-LAST:event_sprinkelsjCheckBoxActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FruitandNut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FruitandNut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FruitandNut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FruitandNut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FruitandNut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bal;
    private javax.swing.JTextField Cash;
    private javax.swing.JLabel Too;
    private javax.swing.JTextArea bill;
    private javax.swing.JCheckBox chocolatejCheckBox;
    private javax.swing.JLabel description_Label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox marshmellowsjCheckBox;
    private javax.swing.JCheckBox orejCheckBox;
    private javax.swing.JCheckBox sprinkelsjCheckBox;
    // End of variables declaration//GEN-END:variables
}
