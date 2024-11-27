package javacalculator;



public class JavaCalculator extends javax.swing.JFrame {


    public JavaCalculator() {
        initComponents();
        field.setText("0");
    }

    private String a, val, opr;
    
    void cetak(){
        if (!"0".equals(field.getText()) && !field.getText().isEmpty()) {
            field.setText(field.getText()+val);
        } else {
            field.setText(val);
        }
    }
    
    void oprasi(){
        a = field.getText();
  
        if(!field.getText().isEmpty() && !"0".equals(field.getText())) {
            mainVal.setText(mainVal.getText()+a);
        }
        field.setText("0");
        
        indikator.setText(opr);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nol = new javax.swing.JButton();
        titik = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        tambahMin = new javax.swing.JButton();
        tamba = new javax.swing.JButton();
        ga = new javax.swing.JButton();
        wa = new javax.swing.JButton();
        tu = new javax.swing.JButton();
        lapan = new javax.swing.JButton();
        tujuh = new javax.swing.JButton();
        ma = new javax.swing.JButton();
        nam = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        pat = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        sembilan = new javax.swing.JButton();
        field = new javax.swing.JTextPane();
        hapus = new javax.swing.JButton();
        clr = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainVal = new javax.swing.JTextPane();
        kali = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        indikator = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nol.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        nol.setText("0");
        nol.setToolTipText("");
        nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolActionPerformed(evt);
            }
        });

        titik.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        titik.setText(".");
        titik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titikActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(102, 255, 204));
        equal.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        equal.setForeground(new java.awt.Color(0, 0, 0));
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        tambahMin.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        tambahMin.setText("+/-");
        tambahMin.setToolTipText("");
        tambahMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahMinActionPerformed(evt);
            }
        });

        tamba.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        tamba.setText("+");
        tamba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambaActionPerformed(evt);
            }
        });

        ga.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        ga.setText("3");
        ga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaActionPerformed(evt);
            }
        });

        wa.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        wa.setText("2");
        wa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waActionPerformed(evt);
            }
        });

        tu.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        tu.setText("1");
        tu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuActionPerformed(evt);
            }
        });

        lapan.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        lapan.setText("8");
        lapan.setToolTipText("");
        lapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapanActionPerformed(evt);
            }
        });

        tujuh.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        tujuh.setText("7");
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });

        ma.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        ma.setText("5");
        ma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maActionPerformed(evt);
            }
        });

        nam.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        nam.setText("6");
        nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namActionPerformed(evt);
            }
        });

        kurang.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });

        pat.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        pat.setText("4");
        pat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patActionPerformed(evt);
            }
        });

        bagi.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bagi.setText("/");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });

        sembilan.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        sembilan.setText("9");
        sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanActionPerformed(evt);
            }
        });

        field.setEditable(false);
        field.setBackground(new java.awt.Color(0, 0, 0));
        field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100), 2));
        field.setFont(new java.awt.Font("OCR-A BT", 0, 100)); // NOI18N
        field.setText("0");

        hapus.setBackground(new java.awt.Color(204, 0, 0));
        hapus.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        clr.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        clr.setText("CLEAR");
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("v1.0 ~ by fadhil hakim");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("JAVA CALCULATOR");

        mainVal.setBackground(new java.awt.Color(0, 0, 0));
        mainVal.setFont(new java.awt.Font("OCR-A BT", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(mainVal);

        kali.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        kali.setText("X");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Opr :");

        indikator.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        indikator.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tambahMin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nol, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(titik, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(clr, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pat, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ma, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nam, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lapan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tu, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(wa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ga, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tamba, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(indikator, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(403, 403, 403))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clr, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lapan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bagi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pat, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ma, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nam, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tu, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ga, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tamba, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nol, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(titik, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tambahMin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(indikator, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        String num = field.getText();
        if(num.isEmpty() || field.getText().length() <= 1){
            field.setText("0");
        } else{
            field.setText(num.substring(0, num.length() - 1));
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void tuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuActionPerformed
        val = "1"; cetak();
    }//GEN-LAST:event_tuActionPerformed

    private void nolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolActionPerformed
        val = "0"; cetak();
    }//GEN-LAST:event_nolActionPerformed

    private void waActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waActionPerformed
        val = "2"; cetak();
    }//GEN-LAST:event_waActionPerformed

    private void gaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaActionPerformed
        val = "3"; cetak();
    }//GEN-LAST:event_gaActionPerformed

    private void patActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patActionPerformed
        val = "4"; cetak();
    }//GEN-LAST:event_patActionPerformed

    private void maActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maActionPerformed
        val = "5"; cetak();
    }//GEN-LAST:event_maActionPerformed

    private void namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namActionPerformed
        val = "6"; cetak();
    }//GEN-LAST:event_namActionPerformed

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhActionPerformed
        val = "7"; cetak();
    }//GEN-LAST:event_tujuhActionPerformed

    private void lapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapanActionPerformed
        val = "8"; cetak();
    }//GEN-LAST:event_lapanActionPerformed

    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanActionPerformed
        val = "9"; cetak();
    }//GEN-LAST:event_sembilanActionPerformed

    private void titikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titikActionPerformed
        field.setText(field.getText()+".");
    }//GEN-LAST:event_titikActionPerformed

    private void tambaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambaActionPerformed
        opr = "+"; oprasi();        
    }//GEN-LAST:event_tambaActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
        field.setText("0");
        mainVal.setText("");
        opr = "";
        indikator.setText("");
    }//GEN-LAST:event_clrActionPerformed

    String menghitung(String xy) {
        
        String[] numbers = xy.split("(?<=[+\\-*/])|(?=[+\\-*/])");

        double result = 0;
        double currentNumber;
        String operator = "+"; // Default operator untuk angka pertama

        for (String part : numbers) {
            part = part.trim(); // Hilangkan spasi tambahan

            // Jika bagian adalah operator, perbarui operator
            if (part.equals("+") || part.equals("-") || part.equals("*") || part.equals("/")) {
                operator = part;
            } else {
                // Jika bagian adalah angka, parsing dan lakukan operasi
                try {
                    currentNumber = Double.parseDouble(part);

                    switch (operator) {
                        case "+":
                            result += currentNumber;
                            break;
                        case "-":
                            result -= currentNumber;
                            break;
                        case "*":
                            result *= currentNumber;
                            break;
                        case "/":
                            if (currentNumber == 0) {
                                return "Error"; // Penanganan pembagian dengan nol
                            }
                            result /= currentNumber;
                            break;
                    }
                } catch (NumberFormatException e) {
                    return "Error"; // Jika input tidak valid
                }
            }
        }

        // Format hasil: hapus ".0" jika bilangan bulat
        if (result == Math.floor(result)) {
            return String.valueOf((int) result);
        } else {
            return String.valueOf(result);
        }
    }

    
    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
       mainVal.setText(mainVal.getText() + opr + field.getText());
            try {
                String xy = mainVal.getText();
                String result = menghitung(xy);
                field.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                field.setText("Error");
            }
            opr = "";
            mainVal.setText("");
            indikator.setText("");
    }//GEN-LAST:event_equalActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        opr = "-"; oprasi();   
    }//GEN-LAST:event_kurangActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        opr = "/";
        
        a = field.getText();
        oprasi();
    }//GEN-LAST:event_bagiActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        opr = "*"; oprasi();   
    }//GEN-LAST:event_kaliActionPerformed

    private void tambahMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahMinActionPerformed
       field.setText("-"+field.getText());
    }//GEN-LAST:event_tambahMinActionPerformed

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
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagi;
    private javax.swing.JButton clr;
    private javax.swing.JButton equal;
    private javax.swing.JTextPane field;
    private javax.swing.JButton ga;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel indikator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kali;
    private javax.swing.JButton kurang;
    private javax.swing.JButton lapan;
    private javax.swing.JButton ma;
    private javax.swing.JTextPane mainVal;
    private javax.swing.JButton nam;
    private javax.swing.JButton nol;
    private javax.swing.JButton pat;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton tamba;
    private javax.swing.JButton tambahMin;
    private javax.swing.JButton titik;
    private javax.swing.JButton tu;
    private javax.swing.JButton tujuh;
    private javax.swing.JButton wa;
    // End of variables declaration//GEN-END:variables
}
