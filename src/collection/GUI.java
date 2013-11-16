package collection;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Collections;
import javax.swing.JOptionPane;
/**
 *
 * @author prasad
 */
public class GUI extends javax.swing.JFrame {
    
    /*   DECLARATIONS PORTION */
    static int friendship[][];
    static int friends_inter[][];
    static long friends_times[][];
    static int maxFriendId;
    ArrayList foaf= new ArrayList();
    ArrayList friends= new ArrayList();
    ArrayList commonFriends= new ArrayList(); 
    ArrayList timestamps= new ArrayList();
    public GUI() {
        initComponents();
        this.setTitle("SBSNTool");
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setSize(screenSize.width, screenSize.height);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 51));

        jLabel6.setText(" ");

        jPanel1.setBackground(new java.awt.Color(153, 255, 0));

        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Friends Found");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Friends of Friends Found");

        jTextArea3.setColumns(20);
        jTextArea3.setEditable(false);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton3.setText("SYSTEM CONFIGURATION");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("START");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea4.setColumns(20);
        jTextArea4.setEditable(false);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Active FOAF Found");

        jButton2.setText("BUILD DSEATINATION LIST");

        jTextArea5.setColumns(20);
        jTextArea5.setEditable(false);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jButton4.setText("SUBMITT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("SNAPSHOT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("GENERATE TEST CASE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Filtered FOAF");

        jButton10.setText("SNAPSHOT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jLabel5.setText("NMANSN Tool");

        jLabel8.setText("Analysis Summary");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(39, 39, 39)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(jButton1))
                                        .addComponent(jScrollPane1)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 193, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(232, 232, 232)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane6)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1847, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1873, 1873, 1873)
                        .addComponent(jLabel6))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    System.out.println("Entered into Action Performed block");
    friends.clear();
    foaf.clear();
    commonFriends.clear();
    jTextArea1.setText("");
    jTextArea3.setText("");
    jTextArea4.setText("");
    main2(jTextField1.getText());
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
    
    
    /*  TO DISPLAY HEAP SPACE STATUS */
    long heapSize = Runtime.getRuntime().totalMemory();
    long heapMaxSize = Runtime.getRuntime().maxMemory();
    long heapFreeSize = Runtime.getRuntime().freeMemory();
    int cores = Runtime.getRuntime().availableProcessors();
    
    String str="no.of processors avilable="+cores+"\nheapSize \n"+heapSize+"\nheapMaxSize \n"+heapMaxSize+"\nheapFreeSize \n"+heapFreeSize+"\n Maximum allowable no.of users \n"+(int)Math.ceil(Math.sqrt(heapFreeSize/4));    
    jTextArea2.setText(str);
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
    try{
    new HelloWorld().setVisible(true);}catch(Exception e){System.out.println(e);}
}//GEN-LAST:event_jButton5ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
// TODO add your handling code here:
    try{
    new AutomaticTestCaseGenerator().setVisible(true);}catch(Exception e){System.out.println(e);}
}//GEN-LAST:event_jButton6ActionPerformed

private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
// TODO add your handling code here:
    try{
    new HelloWorld().setVisible(true);}catch(Exception e){System.out.println(e);}
}//GEN-LAST:event_jButton10ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
    JOptionPane.showMessageDialog(rootPane,"Target Destination list submitted \n Facebook Events History Not found,plz load it"); 
    FBDataRetiever f=new FBDataRetiever(fullString);
    String result=f.method();
    jTextArea6.setText(result);
}//GEN-LAST:event_jButton4ActionPerformed
public  void main2(String args)
{
        System.out.println("Entered into main method");
        int dummy_id=Integer.parseInt(args);
        File file = new File("D:/MY THESIS/COLLECTION/src/collection/one.txt");
        
        File file2= new File("D:/MY THESIS/COLLECTION/src/collection/two.txt");
        try
        {
            String content = FileUtils.readFileToString(file);
            StringTokenizer st = new StringTokenizer(content, "\t\n");
            String content2 = FileUtils.readFileToString(file2);
            StringTokenizer st2 = new StringTokenizer(content2, "\t\n");
            
            while(st.hasMoreTokens()) {
                
                String id = st.nextToken();
                int x=Integer.parseInt(id);
                String friendid=st.nextToken();
                String timeStamp=st.nextToken();
                int y=Integer.parseInt(friendid);
                if(x>y)
                    maxFriendId=x;
                else    maxFriendId=y;
            }       
            friendship=new int[maxFriendId+1][maxFriendId+1];
            friends_inter=new int[maxFriendId+1][maxFriendId+1];
            friends_times=new long[maxFriendId+1][maxFriendId+1];
            for(int i=0;i<=maxFriendId;i++)
            {
                for(int j=0;j<=maxFriendId;j++) 
                {
                    friendship[i][j]=0;
                    friends_inter[i][j]=0;
                    friends_times[i][j]=0;
                }
                friendship[i][i]=1;
            }
            System.out.println("PRINTING MATRIX INFO :)");
            while(st2.hasMoreTokens()) {
                long stamp2 = 0;
                String id2=st2.nextToken();
                int x2=Integer.parseInt(id2);
                String friendid2=st2.nextToken();
                int fid2=Integer.parseInt(friendid2);
                String timeStamp2=st2.nextToken();
                try{
                //stamp2=Long.decode(timeStamp2);
                timeStamp2=timeStamp2.trim();
                stamp2=Long.valueOf(timeStamp2);
                }catch(Exception e){
                }
                
                System.out.println("we are now friends_times["+x2+"]["+fid2+"] comparing with "+stamp2);
                long unixTime = System.currentTimeMillis() / 1000L;  
                
                
                    if(friends_times[x2][fid2]<stamp2)
                    {
                    friends_times[x2][fid2]=stamp2;
                    friends_times[fid2][x2]=stamp2;
                    System.out.println("friends_times["+x2+"]["+fid2+"]="+stamp2);
                    }
                    friends_inter[x2][fid2]=friends_inter[x2][fid2]+1;
                    friends_inter[fid2][x2]=friends_inter[fid2][x2]+1;
            }
            st = new StringTokenizer(content, "\t\n");
            while(st.hasMoreTokens()) {
                String id = st.nextToken();
                int x=Integer.parseInt(id);
                String friendid=st.nextToken();
                int y=Integer.parseInt(friendid);
                String timeStamp=st.nextToken();
                friendship[x][y]=1;
                friendship[y][x]=1;
                //System.out.println("x="+x+"\t"+"y="+y);
            }
            
            int id=Integer.parseInt(args);
       
            int counter=0;
            for(int i=1;i<=maxFriendId;i++){
            if(friendship[id][i]==1)
            {
                friends.add(i);
                counter++; 
            }
            }
            jTextArea1.setText(friends.toString());
            fullString=friends.toString();
            for(int j=1;j<counter;j++)
            {
            id=Integer.parseInt(friends.get(j-1).toString());
            for(int i=1;i<=maxFriendId;i++){
            if(friendship[id][i]==1)
                foaf.add(i);
            }
            }
            removeDuplicates(foaf);
            String str_pairs="";
            String dest_list="";
            for(int x=0;x<foaf.size();x++)
            {
                if((foaf.get(x) !=(Object)dummy_id))
                {
                    str_pairs+="("+dummy_id+","+foaf.get(x) +")"+"\n";
                    if(checkForLinkStrength(dummy_id,Integer.parseInt(foaf.get(x).toString()))==1)
                    {
                        dest_list+=foaf.get(x)+"\n";
                    }
                }
                
            }
            jTextArea4.setText(str_pairs);
            jTextArea5.setText(dest_list);
            fullString=fullString+"\n"+dest_list;
            //jTextArea3.setText(str);
        } catch (IOException e)
        {
            //e.printStackTrace();
        }
    }
    
    public int checkForLinkStrength(int id,int foafid)
    {
        System.out.println("checking for time score between "+id+" and "+foafid);
        System.out.println("---------------------------------------------------");
        System.out.println("common friends found are..");
        int mi,mi_vf;
        double numerator=0;
        float DampingFactor=0.5f;
        long t1=0,t2=0;
        float score=0,temp = 0,hm=0;
        long k=0;
        ArrayList interactions= new ArrayList();
        for(int i=1;i<=maxFriendId;i++)
        {
            if((friendship[id][i]==friendship[foafid][i])&&(friendship[foafid][i]==1))
                commonFriends.add(i);
        }
        for(int x=0;x<commonFriends.size();x++)
        {
            System.out.println(commonFriends.get(x));
            System.out.println("counting no.of interaction between "+id+" and "+commonFriends.get(x));
            mi=getValue(id,Integer.parseInt(commonFriends.get(x).toString()));
            interactions.add(mi);
            System.out.println(mi);
            System.out.println("counting no.of interaction between "+foafid+" and "+commonFriends.get(x));
            mi_vf=getValue(foafid,Integer.parseInt(commonFriends.get(x).toString()));
            interactions.add(mi_vf);
            System.out.println(mi_vf);
            long unixTime = System.currentTimeMillis() / 1000L;
            System.out.println("Current unix time stamp "+unixTime);
            System.out.println("Very recent time stamp with common friend "+getRecentTimeStamp(id,foafid,Integer.parseInt(commonFriends.get(x).toString())));
            k=(unixTime/86400)-(getRecentTimeStamp(id,foafid,Integer.parseInt(commonFriends.get(x).toString()))/86400);
            System.out.println("K="+k);
            numerator=(Math.pow(DampingFactor,k));
            
            System.out.println("pow(beta,k)="+numerator);
            t1=getRecentTimeStamp2(id,Integer.parseInt(commonFriends.get(x).toString()));
            t2=getRecentTimeStamp2(foafid,Integer.parseInt(commonFriends.get(x).toString()));
            temp=(float) (temp+(numerator/(Math.abs(t1-t2)+1)));
        }
        float denominator=0;
        int value=interactions.size();
        for(int x=0;x<interactions.size();x++)
        {
            if(Integer.parseInt(interactions.get(x).toString())!=0)
                denominator=denominator+(1/Integer.parseInt(interactions.get(x).toString()));
            else value--;
        }
        if(denominator==0)
            return 0;
        else
        {
        hm=(float)((float)value/denominator);
        score=hm*temp;
        if(score>0)
        {
        System.out.println("Time score of pair("+id+","+foafid+")is more than 0.0");
        return 1;
        }else{return 0;}
        } 
    }
    public static void main(String args[]) {
     java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    String fullString;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void removeDuplicates(ArrayList foaf) {
        HashSet set = new HashSet(foaf);
        HashSet set2 = new HashSet(friends);
                foaf.clear();
                foaf.addAll(set);
                Collections.sort(foaf);
                Collections.sort(friends);
                foaf.removeAll(set2);
                jTextArea3.setText(foaf.toString());
    }

    private int getValue(int id, int friend) {
        return(friends_inter[id][friend]);
    }
    private long getRecentTimeStamp(int id, int foafid, int parseInt) {
        if(friends_times[id][parseInt]>friends_times[foafid][parseInt]){
            return friends_times[id][parseInt];
        }
        else
                return friends_times[foafid][parseInt];
    }

    private long getRecentTimeStamp2(int id, int parseInt) {
        return friends_times[id][parseInt];
    }
}
