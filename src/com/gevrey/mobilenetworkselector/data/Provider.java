/**
 * 
 */
package com.gevrey.mobilenetworkselector.data;

/**
 * @author sven
 *
 */
public class Provider
{
	private String m_name;

	/*
	 * Default cctor
	 */
	public Provider(String name)
	{
		m_name = name;
	}
	
	/**
	 * @return the name
	 */
	public String getName()
	{
		return m_name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.m_name = name;
	}
	
}
