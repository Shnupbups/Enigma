/*******************************************************************************
 * Copyright (c) 2014 Jeff Martin.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Jeff Martin - initial API and implementation
 ******************************************************************************/
package cuchaz.enigma;


public class ClassFile
{
	private String m_obfName;
	private String m_deobfName;
	
	public ClassFile( String obfName )
	{
		m_obfName = obfName;
	}
	
	public String getName( )
	{
		if( m_deobfName != null )
		{
			return m_deobfName;
		}
		return m_obfName;
	}
	
	public String getObfName( )
	{
		return m_obfName;
	}
	
	public String getDeobfName( )
	{
		return m_deobfName;
	}
	public void setDeobfName( String val )
	{
		m_deobfName = val;
	}
	
	public String getPath( )
	{
		return m_deobfName.replace( ".", "/" ) + ".class";
	}
}