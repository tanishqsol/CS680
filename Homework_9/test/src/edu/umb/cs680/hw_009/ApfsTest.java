package edu.umb.cs680.hw_009;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApfsTest {

	private String[] apfsElementToArray(ApfsElement e) {
		String[] elementInfo = {Boolean.toString(e.isDirectory()), e.getName(), Integer.toString(e.getSize()),
				e.getOwnerName() };
		return elementInfo;
	}
	
	@Test
	public void sameAPFSTest() {
		APFS APFSfirst = APFS.getAPFSFileSystem();
		APFS APFSsecond = APFS.getAPFSFileSystem();
		assertSame(APFSfirst, APFSsecond);
	}

	@Test
	public void getRootDirTest() {
		APFS ApfsFileSystem = APFS.getAPFSFileSystem();
		ApfsFileSystem.initFileSystem("ApfsFile", 500);
		ApfsDirectory actual = ApfsFileSystem.getRootDir();
		String[] expected = { "true","root", "0","ApfsFile" };
		assertArrayEquals(expected,apfsElementToArray(actual));
	}

	@Test
	public void createDefaultRootTest() {
		APFS ApfsFileSystem = APFS.getAPFSFileSystem();
		ApfsDirectory actual = ApfsFileSystem.getRootDir();
		String[] expected = { "true","root", "0", "ApfsFile" };
		assertArrayEquals(expected, apfsElementToArray(actual));
	}

}
