package com.capgemini.exception.first;

import java.io.File;
import java.io.IOException;

public class Demo1 {
public static void main(String[] args) throws IOException {
	File f= new File("mayuri.txt");
	f.createNewFile();
}
}

