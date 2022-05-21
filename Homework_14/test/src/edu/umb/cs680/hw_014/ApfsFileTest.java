package edu.umb.cs680.hw_014;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class ApfsFileTest {

	LocalDateTime localTime = LocalDateTime.now();
	Apfs ApfsFileSystem = Apfs.getApfsFileSystem();
	ApfsDirectory root = (ApfsDirectory) ApfsFileSystem.initFileSystem("Apfs", 500);
	ApfsDirectory applications = new ApfsDirectory(root, "applications", 0, localTime,"ApfsFile",localTime);
	ApfsDirectory home = new ApfsDirectory(root, "home", 0, localTime,"ApfsFile",localTime);
	ApfsDirectory code = new ApfsDirectory(home, "code", 0, localTime,"ApfsFile",localTime);
	ApfsFile a = new ApfsFile(applications, "a", 5, localTime,"ApfsFile",localTime);
	ApfsFile b = new ApfsFile(applications, "b", 20, localTime,"ApfsFile",localTime);
	ApfsFile c = new ApfsFile(home, "c", 30, localTime,"ApfsFile",localTime);
	ApfsFile d = new ApfsFile(home, "d", 40, localTime,"ApfsFile",localTime);
	ApfsFile e = new ApfsFile(code, "e", 15, localTime,"ApfsFile",localTime);
	ApfsFile f = new ApfsFile(code, "f", 15, localTime,"ApfsFile",localTime);
	ApfsLink x = new ApfsLink(home, "x", 0, localTime, "ApfsFile", localTime, applications);
	ApfsLink y = new ApfsLink(code, "y", 0, localTime,"ApfsFile",localTime,b);
	
	private String[] ApfsFiletoStringArray(ApfsFile f) {
		String[] fileInfo = { Boolean.toString(f.isDirectory()), f.getName(),f.getParent().getName(),
				Integer.toString(f.getSize()),f.getCreationTime().toString(),f.getOwnerName(), f.getLastModified().toString() };
		return fileInfo;
	}
	
	@Test
	public void checkFiles() {
		assertTrue(a.isFile());
		assertTrue(c.isFile());
		assertTrue(b.isFile());
		assertTrue(d.isFile());
		assertTrue(e.isFile());
		assertTrue(f.isFile());
	}
	
	@Test
	public void checkFileA() {
		String[] expected = { "false", "a", "applications", "5", localTime.toString(), "ApfsFile",localTime.toString() };
		ApfsFile actual = a;
		assertArrayEquals(expected, ApfsFiletoStringArray(actual));
	}
		
	@Test
	public void checkFileB() {
		String[] expected = { "false", "b", "applications", "20", localTime.toString(), "ApfsFile",localTime.toString() };
		ApfsFile actual = b;
		assertArrayEquals(expected, ApfsFiletoStringArray(actual));
		}
		
	@Test
	public void checkFileC() {
		String[] expected = { "false", "c", "home", "30", localTime.toString(), "ApfsFile",localTime.toString() };
		ApfsFile actual = c;
		assertArrayEquals(expected, ApfsFiletoStringArray(actual));
	}
	@Test
	public void checkFileD() {
		String[] expected = { "false", "d", "home","40", localTime.toString(), "ApfsFile",localTime.toString() };
		ApfsFile actual = d;
		assertArrayEquals(expected, ApfsFiletoStringArray(actual));
	}
	
	@Test
	public void checkFileE() {
		String[] expected = { "false", "e", "code", "15", localTime.toString(), "ApfsFile", localTime.toString() };
		ApfsFile actual = e;
	    assertArrayEquals(expected, ApfsFiletoStringArray(actual));
	}
	
	@Test
	public void checkFileF() {
		String[] expected = { "false", "f", "code","15", localTime.toString(), "ApfsFile",localTime.toString() };
		ApfsFile actual = f;
		assertArrayEquals(expected, ApfsFiletoStringArray(actual));
	}


}