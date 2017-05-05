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

	
	//����scanner��
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
	
	
	
	//����File��
	
	@Test
	public void testFile(){
		
		//File f = new File("E:\\JavaTest","a.txt");
		//File f = new File("e:\\JavaTest\\b.txt");new�ļ��ķ�ʽ

		
		/*		String path = this.getClass().getClassLoader().getResource("haha.txt").getPath();
		File f = new File(path);
		�õ���ǰĿ¼�ļ��ķ�ʽ
		*/
		
		
		
		/*
		 * �½��ļ�
		 * File f = new File("e:\\JavaTest\\caizhifa.xml");
		try {
			f.createNewFile();
			System.out.println("�ļ������ɹ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		//System.out.println(f.length()+"�ֽ�\n"+f.getName()+"����\n"+f.exists()+"�Ƿ����\n"+f.isDirectory()+"�Ƿ���һ���ļ���");
		
		
		
		
/*		File f = new File("e:\\JavaTest");�õ�Ŀ¼�����е��ļ�
		String[] fileStr = f.list();
		for(String str:fileStr){
			System.out.println(str);
		}
*/		

	
/*		File f = new File("e:\\JavaTest");�õ���Ҫ�ĺ�׺�����ļ�����
		FileAccept fa = new FileAccept("java");	//������һ�ֳ������˼�룬sun��˾����֪��������ʲô��׼��ָ��Ҫ���ļ����ϣ����Ը��㱩¶һ���ӿڣ�����ӿ�����һ�������������Լ�ȥʵ�֣�sunҪ����ֻ�Ǹ�����ķ������ж���Ҫ�Ķ�����������
		String [] fileStr = f.list(fa);
		for(String str:fileStr){
			System.out.println(str);
		}
*/	
	
	
	}
	
	
	class FileAccept implements FilenameFilter{

		private String lastName;		//����׺��/ƥ�䣩��������accept�����У�dir��Ŀ¼��name����Ŀ¼�е�һ���ļ�
		
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
			rt.exec("������.exe");
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
			in.skip(36);	//���������ֽڶ��ļ�
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
			
			//FileOutputStream out = new FileOutputStream(new File("E:\\JavaTest\\b.txt"));//ˢ�������ļ���д
			FileOutputStream out = new FileOutputStream(new File("E:\\JavaTest\\b.txt"),true);//���Խ���ԭ�����ļ�д
			byte[] b = "\r\n������".getBytes();//(/r/n)����ʹ�ÿ��Ի���
			out.write(b);
			out.flush();
			out.close();
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e2){
			e2.printStackTrace();
		}
		
	}
	
	
	//�����ļ�
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
			//FileWriter out = new FileWriter(new File("E:\\JavaTest\\c.txt"),true);�����ļ����ݼ���д
			FileWriter out = new FileWriter(new File("E:\\JavaTest\\c.txt"));
		/*	char[] c = "�Ҳ������õĴ���������ܸܵ�\r\nôôôôôô��".toCharArray();
			out.write(c, 0, c.length);		ͨ���ַ�д��ȥ	*/
			
		/*	out.write("��õ���");
			out.write("\r\n���ҹõ�?");    д�ַ���  */
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
				String str = "�����ǵ�"+(i+1)+"��";
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
			raf.close();���в���
			*/
			
			
			
			/*RandomAccessFile raf = new RandomAccessFile(new File("E:\\JavaTest\\c.txt"), "r");
			raf.seek(7);//�ļ�ָ��
			byte[] b = new byte[20];
			int n = -1;
			while((n=raf.read(b, 0, b.length))!=-1){
				
				String str = new String(b,0,n);
				
				System.out.println(str);
				
			}
			
			raf.close();
			���ֽڲ���------����
			*/
			
			
			
			File f = new File("E:\\JavaTest\\c.txt");
			RandomAccessFile raf = new RandomAccessFile(f,"rw");
			String str = "�Ұ���¬����";
			
			raf.skipBytes((int) f.length());
			raf.write(str.getBytes());
			raf.close();	//д����
			
			
			
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e2){
			e2.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
