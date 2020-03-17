package p3.recursive.windows.file;

import java.io.File;
import java.util.Stack;

public class FindFile {

	private static Stack<String> entries = new Stack<String>();

	private static boolean find(File path, String fileName) {
		entries.push(path.toString());
		if (path.isDirectory()) {
			File[] directoryListing = path.listFiles();
			for (File subPath : directoryListing) {
				if (find(subPath, fileName))
					return true;
				else
					entries.pop();
			}
		} else {
			if (path.getName().equals(fileName))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String pathString="C:\\Users\\anupo\\OneDrive\\Lenovo\\COMP254\\COMP254-2020";
		pathString=pathString.replace("\\","/" );
		File path=new File(pathString);
		System.out.print("File existence : " );
		System.out.print(find(path,"Lab Assignment 3.docx"));
		
	}

}
