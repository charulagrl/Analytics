/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author durga
 */
public class FBDataRetiever {
    static String content_ids;
    static String rule="NO RULE FOUND";
    private String fileName;
    private String content;
    private String final_result="";
    ArrayList attrs=new ArrayList();
    ArrayList[] al;
    File file;
    Pattern p;
    Matcher m;
    public FBDataRetiever(String arg)
    {
        content_ids=arg;
    }
    public static void main(String args[])
    {
        
    }
    public String method()
    {
        try{
        content_ids=content_ids.replace('[', ' ');
        content_ids=content_ids.replace(']', ' ');
        content_ids.trim();
        StringTokenizer st = new StringTokenizer(content_ids, ",\n");
        while(st.hasMoreTokens())
        {
            fileName=st.nextToken().trim();
            file = new File("D:/MY THESIS/ProfileBase/"+fileName+".txt");
            content = FileUtils.readFileToString(file);
            p = Pattern.compile("\"([^\"]*)\"");
            m = p.matcher(content);
            int counter=0;
            while (m.find())
            {
                counter++;
                if((counter%2)!=0)
                attrs.add(m.group(1));
                else m.group(1);
            }
        }
        HashSet set = new HashSet(attrs);
        attrs.clear();
        attrs.addAll(set);
        System.out.println("ID INDEX:"+attrs.indexOf("id"));
        System.out.println(attrs.toString());
        String my_attr = null;
        al=new ArrayList[attrs.size()];
        System.out.println("-------------------");
        for(int i=0;i<attrs.size();++i)
            al[i]=new ArrayList();
        System.out.append("-------------------");
        st = new StringTokenizer(content_ids, ",\n");
        while(st.hasMoreTokens())
        {
            fileName=st.nextToken().trim();
            file = new File("D:/MY THESIS/ProfileBase/"+fileName+".txt");
            content = FileUtils.readFileToString(file);
            p = Pattern.compile("\"([^\"]*)\"");
            m = p.matcher(content);
            int counter=0;
            while (m.find())
            {
                counter++;
                if((counter%2)!=0)
                {
                    my_attr=m.group(1);
                    System.out.println("ATTRIBUTE FOUND: "+my_attr);
                }
                else
                {
                    String data=m.group(1);
                    al[attrs.indexOf(my_attr)].add(data);
                    System.out.println(data+ " ADDED TO ATTRIBUTE  "+my_attr);
                }
            }
        }
        for(int i=0;i<attrs.size();++i)
            System.out.println(al[i].toString());
        for(int i=0;i<attrs.size();++i)
        {
            Hashtable frequencyHash=new Hashtable();
            ArrayList uniqueList=new ArrayList();
            for(int j=0;j<al[i].size();++j)
            {
                 if(uniqueList.contains(al[i].get(j)))
                 {
                     int elementCount=Integer.parseInt(frequencyHash.get(al[i].get(j)).toString());
                     elementCount++;
                     frequencyHash.put(al[i].get(j),elementCount);
                 }
                 else
                 {
                     uniqueList.add(al[i].get(j));
                     frequencyHash.put(al[i].get(j),1);
                 }
            }
            System.out.println(frequencyHash);
            final_result+="REPORT ON "+attrs.get(i).toString()+" "+frequencyHash+"\n";
        }
        }
        catch(Exception e)
        {
            
        }
        //return attrs.toString();
        return final_result;
    }
}
