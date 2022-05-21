package edu.umb.cs680.hw_014;

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

	public static void main(String[]args)
	{
		System.out.println("Apfs-Element Class Successfully Executed");
	}
}