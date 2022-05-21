package edu.umb.cs680.hw_8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ApfsTest {
	
	private String[] ApfsElementToArray(ApfsElement e) {
		String[] elementInfo = {Boolean.toString(e.isDirectory()), e.getName(), Integer.toString(e.getSize()),
				e.getOwnerName() };
		return elementInfo;
	}
	
	@Test
	public void sameApfsTest() {
		Apfs ApfsOne = Apfs.getApfsFileSystem();
		Apfs ApfsTwo = Apfs.getApfsFileSystem();
		assertSame(ApfsOne, ApfsTwo);
	}

	@Test
	public void getRootDirTest() {
		Apfs ApfsFileSystem = Apfs.getApfsFileSystem();
		ApfsFileSystem.initFileSystem("ApfsFile", 500);
		ApfsDirectory actual = ApfsFileSystem.getRootDir();
		String[] expected = { "true","root", "0","ApfsFile" };
		assertArrayEquals(expected,ApfsElementToArray(actual));
	}

	@Test
	public void createDefaultRootTest() {
		Apfs ApfsFileSystem = Apfs.getApfsFileSystem();
		ApfsDirectory actual = ApfsFileSystem.getRootDir();
		String[] expected = { "true","root", "0", "ApfsFile" };
		assertArrayEquals(expected, ApfsElementToArray(actual));
	}
}