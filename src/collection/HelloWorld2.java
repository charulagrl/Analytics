package collection;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import javax.swing.JFrame;
import java.util.Random;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class HelloWorld2 extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2707712944901661771L;
    

	public HelloWorld2() throws IOException
	{
		super("SBSN Tool:Network anotomy visualizer");
                this.setExtendedState(JFrame.MAXIMIZED_BOTH);
                mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();
                Random generator = new Random();
		graph.getModel().beginUpdate();
                ArrayList friends=new ArrayList();
                ArrayList foaf=new ArrayList();
		try
		{
                        int maxFriendId = 0;
                        File file = new File("D:/MY THESIS/COLLECTION/src/collection/one.txt");
                        String content = FileUtils.readFileToString(file);
                        StringTokenizer st = new StringTokenizer(content, "\t\n");
                        while(st.hasMoreTokens())
                        {
                        String id = st.nextToken();
                        int x=Integer.parseInt(id);
                        String friendid=st.nextToken();
                        String timeStamp=st.nextToken();
                        int y=Integer.parseInt(friendid);
                        if(x>y)
                            maxFriendId=x;
                        else    maxFriendId=y;
                        } 
                        Object[] v=new Object[maxFriendId+1];
                        
                       
                        for(int i=1;i<=maxFriendId;i++)
                        {
                             int xc=50+generator.nextInt(1200);
                             int yc=50+generator.nextInt(910);
                             System.out.println(xc+"\t"+yc);
                             v[i]=new Object();
                             v[i]=graph.insertVertex(parent, null,i+"",xc,yc, 30,30);
                        }
                        String content2 = FileUtils.readFileToString(file);
                        StringTokenizer st2 = new StringTokenizer(content2, "\t\n");
                        int ids=Integer.parseInt(JOptionPane.showInputDialog("GIMME THE DAMN ID OF EVENT INITIATOR"));
                        while(st2.hasMoreTokens())
                        {
                            String id = st2.nextToken();
                            int x=Integer.parseInt(id);
                            String friendid=st2.nextToken();
                            String timeStamp=st2.nextToken();
                            int y=Integer.parseInt(friendid);
                            if((x!=y))
                            {
                                if((x==ids)&&(y!=ids))
                                {
                                    friends.add(x);
                                    graph.insertEdge(parent, null, "", v[x], v[y]);
                                }
                                else if((x!=ids)&&(y==ids))
                                {
                                    friends.add(y);
                                    graph.insertEdge(parent, null, "", v[y], v[x]);
                                }
                            }
                        }
                        
			/*
                        graph.insertEdge(parent, null, "virtual connection", v1, v2, "dashed=1;fontColor=red;");*/
		}
		finally
		{
			graph.getModel().endUpdate();
		}
                

		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		getContentPane().add(graphComponent);
	}
	public static void main(String[] args) 
	{
            try{
		HelloWorld frame = new HelloWorld();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 320);
		frame.setVisible(true);
            }
            catch(Exception e){System.out.println(e);}
	}

}
