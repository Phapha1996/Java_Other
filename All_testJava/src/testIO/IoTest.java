package testIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

import org.junit.Test;

public class IoTest {

	
	//测试scanner类
	@Test
	public void test(){
		
		Scanner scanner_1 = new Scanner(System.in);
		//Scanner scanner_2 = new Scanner(System.in);
		int a = 0;
		if(scanner_1.hasNextInt()){
		 a = scanner_1.nextInt();
		}
		
		
		String [] array = new String[a];
		
		for(int i=0;i<a&&scanner_1.hasNextLine();i++){
			
			array[i] = scanner_1.nextLine();
			
		}
		
		for(String index:array){
		System.out.println(index);
		}
		
	}
	
	
	
	//测试File类
	
	@Test
	public void testFile(){
		
		//File f = new File("E:\\JavaTest","a.txt");
		//File f = new File("e:\\JavaTest\\b.txt");new文件的方式

		
		/*		String path = this.getClass().getClassLoader().getResource("haha.txt").getPath();
		File f = new File(path);
		得到当前目录文件的方式
		*/
		
		
		
		/*
		 * 新建文件
		 * File f = new File("e:\\JavaTest\\caizhifa.xml");
		try {
			f.createNewFile();
			System.out.println("文件创建成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		//System.out.println(f.length()+"字节\n"+f.getName()+"名字\n"+f.exists()+"是否存在\n"+f.isDirectory()+"是否是一个文件夹");
		
		
		
		
/*		File f = new File("e:\\JavaTest");得到目录下所有的文件
		String[] fileStr = f.list();
		for(String str:fileStr){
			System.out.println(str);
		}
*/		

	
/*		File f = new File("e:\\JavaTest");得到想要的后缀名的文件名字
		FileAccept fa = new FileAccept("java");	//给出了一种程序设计思想，sun公司并不知道你想用什么标准来指定要的文件集合，所以给你暴露一个接口，这个接口中有一个方法，让你自己去实现，sun要做的只是根据你的方法来判定需要的东西放入结果集
		String [] fileStr = f.list(fa);
		for(String str:fileStr){
			System.out.println(str);
		}
*/	
	
	
	}
	
	
	class FileAccept implements FilenameFilter{

		private String lastName;		//（后缀名/匹配）处理器，accept方法中，dir是目录，name是在目录中的一个文件
		
		public FileAccept(){
			super();
		}
		
		public FileAccept(String ln){
			lastName = ln;
		}
		
		public void setLastName(String ln){
			lastName = "."+ln;
		}
		
		public boolean accept(File dir, String name) {
			
			return name.endsWith(lastName);
		}
		
	}
	
	
	
	
	@Test
	public void testRuntime(){

		try{
			Runtime rt = Runtime.getRuntime();
			rt.exec("？？？.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	@Test
	public void testFileInputStream(){
		try {
			FileInputStream in = new FileInputStream(new File("E:\\JavaTest\\a.txt"));
			int n = -1;
			byte[] buff = new byte[20];
			in.skip(36);	//跳过多少字节读文件
			while((n=in.read(buff, 0, 20))!=-1){
				String str = new String(buff,0,n);
				System.out.print(str);
			}
			
			in.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e2){
			e2.printStackTrace();
		}	}
	
	
	
	
	@Test
	public void testFileOutPutStream(){
		
		
		try {
			
			//FileOutputStream out = new FileOutputStream(new File("E:\\JavaTest\\b.txt"));//刷新整个文件重写
			FileOutputStream out = new FileOutputStream(new File("E:\\JavaTest\\b.txt"),true);//可以接着原来的文件写
			byte[] b = "\r\n嘻嘻嘻".getBytes();//(/r/n)联合使用可以换行
			out.write(b);
			out.flush();
			out.close();
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e2){
			e2.printStackTrace();
		}
		
	}
	
	
	//复制文件
	@Test
	public void testCopyIOputStream(){
		
		try {
			FileInputStream in = new FileInputStream(new File("E:\\JavaTest\\a.txt"));
			FileOutputStream out = new FileOutputStream(new File("E:\\JavaTest\\c.txt"),true);
			int n = -1;
			byte[] b = new byte[10];
			
			while((n=in.read(b, 0, 10))!=-1){
				//out.write(b, 0, 10);
				out.write(b);
			}
			out.flush();
			out.close();
			in.close();
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e2){
			e2.printStackTrace();
		}
		
	}
	
	
	@Test
	public void testReader(){
		try {
			Reader in = new FileReader(new File("E:\\JavaTest\\a.txt"));
			
			char[] cs = new char[10];
			int n = -1;
			while((n=in.read(cs, 0, 10))!=-1){
				String str = new String(cs);
				System.out.print(str);
			}
			in.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e2){
			e2.printStackTrace();
		}
		
	}
	

	@Test
	public void testWriter(){
		try {
			//FileWriter out = new FileWriter(new File("E:\\JavaTest\\c.txt"),true);接着文件内容继续写
			FileWriter out = new FileWriter(new File("E:\\JavaTest\\c.txt"));
		/*	char[] c = "我曹你妹妹的大姨妈爹爹杠杠的\r\n么么么么么么哒".toCharArray();
			out.write(c, 0, c.length);		通过字符写进去	*/
			
		/*	out.write("你姑爹？");
			out.write("\r\n是我姑爹?");    写字符串  */
			out.flush();
			out.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		
	}
	
	
	
	
	@Test
	public void testBufferdReader(){
		
		try {
			Reader reader = new FileReader(new File("E:\\JavaTest\\c.txt"));
			BufferedReader br = new BufferedReader(reader);
			String str = "";
			while((str=br.readLine())!=null){
				System.out.println(str);
			}

			br.close();
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e2){
			e2.printStackTrace();
		}
		
		
	}
	
	
	@Test
	public void testBufferedWriter(){
		try {
			Writer writer = new FileWriter(new File("E:\\JavaTest\\c.txt"),true);
			BufferedWriter bw = new BufferedWriter(writer);
			
			for(int i=0;i<5;i++){
				String str = "现在是第"+(i+1)+"行";
				bw.write(str, 0, str.length());
				bw.newLine();
			}
			bw.flush();
			bw.close();
			writer.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Test
	public void testRandomAccessFile(){
		try {
			/*RandomAccessFile raf = new RandomAccessFile(new File("E:\\JavaTest\\c.txt"),"r");
			String str = "";
			while((str=raf.readLine())!=null){
				byte[] b = str.getBytes("iso-8859-1");
				String s = new String(b,"GB2312");
				System.out.println(s+raf.getFilePointer());
			}
			raf.close();读行操作
			*/
			
			
			
			/*RandomAccessFile raf = new RandomAccessFile(new File("E:\\JavaTest\\c.txt"), "r");
			raf.seek(7);//文件指针
			byte[] b = new byte[20];
			int n = -1;
			while((n=raf.read(b, 0, b.length))!=-1){
				
				String str = new String(b,0,n);
				
				System.out.println(str);
				
			}
			
			raf.close();
			读字节操作------乱码
			*/
			
			
			
			File f = new File("E:\\JavaTest\\c.txt");
			RandomAccessFile raf = new RandomAccessFile(f,"rw");
			String str = "我爱你卢艳玲";
			
			raf.skipBytes((int) f.length());
			raf.write(str.getBytes());
			raf.close();	//写操作
			
			
			
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e2){
			e2.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
