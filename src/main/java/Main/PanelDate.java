
package Main;
import java.awt.Color;
import java.awt.Component;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;

public class PanelDate extends javax.swing.JLayeredPane {

    public int month;
    public int year;
    String[] monthName = new String[] {"January","February","March","April","May","June","July",
            "August","September","October","November","December"};
    
    public JFrame target;
    public PanelDate(int year, int month) {
        this.month = month;
        this.year = year;
        initComponents();
        init();
    }
    
    public void setFrame(JFrame frame){
        this.target = frame;
    }
    
    
    private void init() {
        Mon.asTitle();
        Tue.asTitle();
        Wed.asTitle();
        Thu.asTitle();
        Fri.asTitle();
        Sat.asTitle();
        Sun.asTitle();
        CurMonth.asTitle();
        CurMonth.setText( monthName[month-1]);
        setDate();
    }

    private void setDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);  //  month jan as 0 so start from 0
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;  //  get day of week -1 to index
        calendar.add(Calendar.DATE, -startDay);
        ToDay toDay = getToDay();
        for (Component com : jPanel2.getComponents()) {
            Cell cell = (Cell) com;
            if (!cell.isTitle()) {
                cell.setText(calendar.get(Calendar.DATE) + "");
                cell.setDate(calendar.getTime());
                cell.currentMonth(calendar.get(Calendar.MONTH) == month - 1);
                if (toDay.isToDay(new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR)))) {
                    cell.setAsToDay();
                }
                calendar.add(Calendar.DATE, 1); //  up 1 day
            }
        }
    }

    private ToDay getToDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
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
        CurMonth = new Main.Cell();
        jPanel2 = new javax.swing.JPanel();
        Sun = new Main.Cell();
        Mon = new Main.Cell();
        Tue = new Main.Cell();
        Wed = new Main.Cell();
        Thu = new Main.Cell();
        Fri = new Main.Cell();
        Sat = new Main.Cell();
        cell8 = new Main.Cell();
        cell9 = new Main.Cell();
        cell10 = new Main.Cell();
        cell11 = new Main.Cell();
        cell12 = new Main.Cell();
        cell13 = new Main.Cell();
        cell14 = new Main.Cell();
        cell15 = new Main.Cell();
        cell16 = new Main.Cell();
        cell17 = new Main.Cell();
        cell18 = new Main.Cell();
        cell19 = new Main.Cell();
        cell20 = new Main.Cell();
        cell21 = new Main.Cell();
        cell22 = new Main.Cell();
        cell23 = new Main.Cell();
        cell24 = new Main.Cell();
        cell25 = new Main.Cell();
        cell26 = new Main.Cell();
        cell27 = new Main.Cell();
        cell28 = new Main.Cell();
        cell29 = new Main.Cell();
        cell30 = new Main.Cell();
        cell31 = new Main.Cell();
        cell32 = new Main.Cell();
        cell33 = new Main.Cell();
        cell34 = new Main.Cell();
        cell35 = new Main.Cell();
        cell36 = new Main.Cell();
        cell37 = new Main.Cell();
        cell38 = new Main.Cell();
        cell39 = new Main.Cell();
        cell40 = new Main.Cell();
        cell41 = new Main.Cell();
        cell42 = new Main.Cell();
        cell43 = new Main.Cell();
        cell44 = new Main.Cell();
        cell45 = new Main.Cell();
        cell46 = new Main.Cell();
        cell47 = new Main.Cell();
        cell48 = new Main.Cell();
        cell49 = new Main.Cell();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        CurMonth.setBackground(new java.awt.Color(51, 51, 255));
        CurMonth.setText("January");
        CurMonth.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(CurMonth);

        jPanel2.setLayout(new java.awt.GridLayout(7, 7));

        Sun.setForeground(new java.awt.Color(255, 0, 0));
        Sun.setText("Sun");
        jPanel2.add(Sun);

        Mon.setText("Mon");
        jPanel2.add(Mon);

        Tue.setText("Tue");
        jPanel2.add(Tue);

        Wed.setText("Wed");
        jPanel2.add(Wed);

        Thu.setText("Thu");
        jPanel2.add(Thu);

        Fri.setText("Fri");
        jPanel2.add(Fri);

        Sat.setText("Sat");
        jPanel2.add(Sat);

        cell8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell8);

        cell9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell9);

        cell10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell10);

        cell11.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell11);

        cell12.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell12);

        cell13.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell13);

        cell14.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell14);

        cell15.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell15);

        cell16.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell16);

        cell17.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell17);

        cell18.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell18);

        cell19.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell19);

        cell20.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell20);

        cell21.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell21);

        cell22.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell22);

        cell23.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell23);

        cell24.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell24);

        cell25.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell25);

        cell26.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell26);

        cell27.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell27);

        cell28.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell28);

        cell29.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell29);

        cell30.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell30);

        cell31.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell31);

        cell32.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell32);

        cell33.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell33);

        cell34.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell34);

        cell35.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell35);

        cell36.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell36);

        cell37.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell37);

        cell38.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell38);

        cell39.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell39);

        cell40.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell40);

        cell41.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell41);

        cell42.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell42);

        cell43.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell43);

        cell44.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell44);

        cell45.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell45);

        cell46.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell46);

        cell47.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell47);

        cell48.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell48);

        cell49.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel2.add(cell49);

        setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        this.setBackground(Color.blue);
        this.setForeground(Color.blue);
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(null);
        this.setForeground(null);
    }//GEN-LAST:event_formMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        JFrame MF = new MonthFrame();
        MF.add(new DetailMonthPanel(this.year, this.month));
        MF.show();
        MF.setVisible(true);
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Main.Cell CurMonth;
    private Main.Cell Fri;
    private Main.Cell Mon;
    private Main.Cell Sat;
    private Main.Cell Sun;
    private Main.Cell Thu;
    private Main.Cell Tue;
    private Main.Cell Wed;
    private Main.Cell cell10;
    private Main.Cell cell11;
    private Main.Cell cell12;
    private Main.Cell cell13;
    private Main.Cell cell14;
    private Main.Cell cell15;
    private Main.Cell cell16;
    private Main.Cell cell17;
    private Main.Cell cell18;
    private Main.Cell cell19;
    private Main.Cell cell20;
    private Main.Cell cell21;
    private Main.Cell cell22;
    private Main.Cell cell23;
    private Main.Cell cell24;
    private Main.Cell cell25;
    private Main.Cell cell26;
    private Main.Cell cell27;
    private Main.Cell cell28;
    private Main.Cell cell29;
    private Main.Cell cell30;
    private Main.Cell cell31;
    private Main.Cell cell32;
    private Main.Cell cell33;
    private Main.Cell cell34;
    private Main.Cell cell35;
    private Main.Cell cell36;
    private Main.Cell cell37;
    private Main.Cell cell38;
    private Main.Cell cell39;
    private Main.Cell cell40;
    private Main.Cell cell41;
    private Main.Cell cell42;
    private Main.Cell cell43;
    private Main.Cell cell44;
    private Main.Cell cell45;
    private Main.Cell cell46;
    private Main.Cell cell47;
    private Main.Cell cell48;
    private Main.Cell cell49;
    private Main.Cell cell8;
    private Main.Cell cell9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
