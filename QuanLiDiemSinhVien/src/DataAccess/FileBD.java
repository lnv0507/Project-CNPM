/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Entity.BangDiem;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Thanh
 */
public class FileBD {
    File f = new File("BANGDIEM.DAT");
    public void ghiBD(ArrayList<BangDiem> list)
    {
        try{
            if(!f.exists())
                f.createNewFile();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(list);
            oos.close();
        }   
        catch(Exception e){}
    }
    
    public ArrayList<BangDiem> docBD() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        if(!f.exists())
            return new ArrayList<BangDiem>();
        ObjectInputStream ois =new  ObjectInputStream(new FileInputStream(f));
        return (ArrayList<BangDiem>)ois.readObject();
    }
}
