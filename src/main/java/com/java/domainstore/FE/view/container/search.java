package com.java.domainstore.FE.view.container;

public class search extends javax.swing.JPanel {

    public search() {
        initComponents();
        this.setOpaque(false);
        pnResult.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfSearch = new com.java.domainstore.FE.view.component.MyTextField();
        btSearch = new com.java.domainstore.FE.view.component.MyButton();
        cmbTLD = new javax.swing.JComboBox<>();
        lbBanner = new com.java.domainstore.FE.view.component.MyTitle();
        pnResult = new com.java.domainstore.FE.view.container.MyPanel();
        btAdd = new com.java.domainstore.FE.view.component.MyButton();
        myContent1 = new com.java.domainstore.FE.view.component.MyContent();
        myContent2 = new com.java.domainstore.FE.view.component.MyContent();
        myContent3 = new com.java.domainstore.FE.view.component.MyContent();
        myContent4 = new com.java.domainstore.FE.view.component.MyContent();
        myContent5 = new com.java.domainstore.FE.view.component.MyContent();
        myContent6 = new com.java.domainstore.FE.view.component.MyContent();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(255, 255, 255));

        tfSearch.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        btSearch.setForeground(new java.awt.Color(0, 0, 0));
        btSearch.setText("search");
        btSearch.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        cmbTLD.setBackground(new java.awt.Color(255, 255, 255));
        cmbTLD.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbTLD.setForeground(new java.awt.Color(0, 0, 0));
        cmbTLD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".com", ".vn", ".site" }));

        lbBanner.setText("Tìm kiếm tên miền cho riêng bạn");
        lbBanner.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        pnResult.setBackground(new java.awt.Color(255, 255, 255));
        pnResult.setForeground(new java.awt.Color(255, 255, 255));

        btAdd.setText("Add to cart");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        myContent1.setText("Tên miền:");
        myContent1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        myContent2.setText("Trạng thái:");
        myContent2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        myContent3.setText("Giá thành:");
        myContent3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        myContent4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        myContent5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        myContent6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        javax.swing.GroupLayout pnResultLayout = new javax.swing.GroupLayout(pnResult);
        pnResult.setLayout(pnResultLayout);
        pnResultLayout.setHorizontalGroup(
            pnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnResultLayout.createSequentialGroup()
                .addContainerGap(708, Short.MAX_VALUE)
                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnResultLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(pnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(myContent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myContent2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(myContent3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myContent4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myContent5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myContent6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnResultLayout.setVerticalGroup(
            pnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnResultLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myContent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myContent4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myContent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myContent5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myContent3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myContent6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTLD, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTLD)
                    .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSearchActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAddActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.java.domainstore.FE.view.component.MyButton btAdd;
    private com.java.domainstore.FE.view.component.MyButton btSearch;
    private javax.swing.JComboBox<String> cmbTLD;
    private com.java.domainstore.FE.view.component.MyTitle lbBanner;
    private com.java.domainstore.FE.view.component.MyContent myContent1;
    private com.java.domainstore.FE.view.component.MyContent myContent2;
    private com.java.domainstore.FE.view.component.MyContent myContent3;
    private com.java.domainstore.FE.view.component.MyContent myContent4;
    private com.java.domainstore.FE.view.component.MyContent myContent5;
    private com.java.domainstore.FE.view.component.MyContent myContent6;
    private com.java.domainstore.FE.view.container.MyPanel pnResult;
    private com.java.domainstore.FE.view.component.MyTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
