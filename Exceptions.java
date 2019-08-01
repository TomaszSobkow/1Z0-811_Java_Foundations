import java.io.File;
import java.io.IOException;


public class Exceptions{
	public Exceptions(){}

	void createFile(String name) throws IOException {
		int fileCount = 0;
		File f = new File(name);
		fileCount++;
		System.out.println(f+ "  exist? " + f.isFile()+"-->"+fileCount);
		f.createTempFile("To",null);
		f.createNewFile();
		fileCount++;
		System.out.println(name+ "  exist? " + f.isFile()+"-->"+fileCount);

		int[] intArray = new int[5];
		intArray[5] = 12;
	}






	public void testCheckedException() throws Exception {
		File testFile = new File("//testFile.txt");
		testFile.createNewFile();
		System.out.println("File exist: "+ testFile.exists());


	}
	
	public void doThis(){
		System.out.println("Arrived in doThis()");
		try{
			doThat();
		}
		
		catch(Exception exceptionOne){
			System.out.println(exceptionOne);
		}

		System.out.println("Back to doThis()");
	}

	void doThat() throws Exception {
		System.out.println("In doThat");
		throw new Exception();
	}


}