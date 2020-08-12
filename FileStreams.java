package checkPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Main{
	public static void main(String[] args) {
		
		try(FileOutputStream fos=new FileOutputStream("e:\\abc1.txt",true)){
			byte b[]=new byte[100];
			System.out.println("Enter the data");
			int k=System.in.read(b);
			fos.write(b, 0, k);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String s="e:\\abc1.txt";
		File f=new File(s);
		try(FileInputStream fis=new FileInputStream(f)){
			byte b[]=new byte[((int)f.length())];
			fis.read(b);
			String ss=new String(b);
			System.out.println(ss);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
