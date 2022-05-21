package edu.umb.cs680.hw_8;

import java.time.LocalDateTime;

public abstract class ApfsElement extends FSElement
{	
	private String ownerName;
	private LocalDateTime lastModified;
	
	public ApfsElement(ApfsDirectory parent, String name, int size, LocalDateTime creationTime, String ownerName,LocalDateTime lastModified)
	{
		super(parent, name, size, creationTime);
		this.ownerName = ownerName;
		this.lastModified = lastModified;
	}
	
	public String getOwnerName() 
	{
		return ownerName;
	}

	public LocalDateTime getLastModified() 
	{
		return lastModified;
	}

	@Override
	public boolean isDirectory() 
	{
		return false;
	}

	@Override
	public boolean isLink() 
	{
		return false;
	}

	@Override
	public boolean isFile() 
	{
		return false;
	}
	
	public static void main(String[]args)
	{
		System.out.println("ApfsElement class success");
	}
}