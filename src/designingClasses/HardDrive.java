package designingClasses;

import java.util.ArrayList;

public class HardDrive {
	private String name;
	private int capacity;
	private int freeSpace;
	private int fileSize;
	private ArrayList<Integer> file = new ArrayList<Integer>();

	public HardDrive() {
		name = "Bob Smith";
		capacity = 50;
		freeSpace = 0;
		fileSize = 2;
	}

	public HardDrive(String xname, int xcapacity, int xfreeSpace, int xfileSize) {
		name = xname;
		capacity = xcapacity;
		freeSpace = xfreeSpace;
		fileSize = xfileSize;
	}

	public void addFile() {
		file.add(fileSize);
	}

	public void deleteFile() {
		int numFile = 0;
		file.remove(numFile);
	}

	public boolean isFull() {
		if (freeSpace == 0) {
			return true;
		}
		return true;
	}

	public boolean isEmpty() {
		if (freeSpace == capacity) {
			return true;
		}
		return true;
	}

}
