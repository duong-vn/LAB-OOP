package hust.soict.hedspi.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class NoGarbage {

	public NoGarbage() {
		// TODO Auto-generated constructor stub
	}
	
	
    public static void main(String[] args) {
    	String filename = "C:\\Garbage\\Garbage.txt";
    	byte[] inputBytes = { 0 };
    	long startTime, endTime;

    	try {
    	    inputBytes = Files.readAllBytes(Paths.get(filename));
    	    startTime = System.currentTimeMillis();
    	    StringBuilder outputStringBuilder = new StringBuilder();
    	    for (byte b : inputBytes) {
    	        outputStringBuilder.append((char) b);
    	    }
    	    endTime = System.currentTimeMillis();
    	    System.out.println(endTime - startTime);
    	} catch (IOException e) {
    	    e.printStackTrace();
    	}
    }
        
}
