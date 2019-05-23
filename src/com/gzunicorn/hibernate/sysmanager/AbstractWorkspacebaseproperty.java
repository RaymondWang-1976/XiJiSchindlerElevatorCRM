/*
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 *
 * Created Fri Jan 18 17:08:31 CST 2008 by MyEclipse Hibernate Tool.
 */
package com.gzunicorn.hibernate.sysmanager;

import java.io.Serializable;

/**
 * A class that represents a row in the WorkspaceBaseProperty table. 
 * You can customize the behavior of this class by editing the class, {@link Workspacebaseproperty()}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized * by MyEclipse Hibernate tool integration.
 */
public abstract class AbstractWorkspacebaseproperty 
    implements Serializable
{
    /** The cached hash code value for this instance.  Settting to 0 triggers re-calculation. */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.String wsid;
 

    /** The value of the simple wskey property. */
    private java.lang.String wskey;

    /** The value of the simple title property. */
    private java.lang.String title;

    /** The value of the simple link property. */
    private java.lang.String link;

    /** The value of the simple tip property. */
    private java.lang.String enabledflag;
    
    /** The value of the simple tip property. */
    private java.lang.String tip;

    /** The value of the simple ext1 property. */
    private java.lang.String ext1;

    /** The value of the simple ext2 property. */
    private java.lang.String ext2;

    /** The value of the simple ext3 property. */
    private java.lang.String ext3;
    
    private java.lang.String divid;
    
    private java.lang.String jsfuname;
    
    private java.lang.Integer numno;

    public java.lang.Integer getNumno() {
		return numno;
	}

	public void setNumno(java.lang.Integer numno) {
		this.numno = numno;
	}

	/**
     * Simple constructor of AbstractWorkspacebaseproperty instances.
     */
    public AbstractWorkspacebaseproperty()
    {
    }

    /**
     * Constructor of AbstractWorkspacebaseproperty instances given a simple primary key.
     * @param wsid
     */
    public AbstractWorkspacebaseproperty(java.lang.String wsid)
    {
        this.setWsid(wsid);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.String
     */
    public java.lang.String getWsid()
    {
        return wsid;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param wsid
     */
    public void setWsid(java.lang.String wsid)
    {
        this.hashValue = 0;
        this.wsid = wsid;
    }

    /**
     * Return the value of the WsKey column.
     * @return java.lang.String
     */
    public java.lang.String getWskey()
    {
        return this.wskey;
    }

    /**
     * Set the value of the WsKey column.
     * @param wskey
     */
    public void setWskey(java.lang.String wskey)
    {
        this.wskey = wskey;
    }

    /**
     * Return the value of the Title column.
     * @return java.lang.String
     */
    public java.lang.String getTitle()
    {
        return this.title;
    }

    /**
     * Set the value of the Title column.
     * @param title
     */
    public void setTitle(java.lang.String title)
    {
        this.title = title;
    }

    /**
     * Return the value of the Link column.
     * @return java.lang.String
     */
    public java.lang.String getLink()
    {
        return this.link;
    }

    /**
     * Set the value of the Link column.
     * @param link
     */
    public void setLink(java.lang.String link)
    {
        this.link = link;
    }

    /**
     * Return the value of the Tip column.
     * @return java.lang.String
     */
    public java.lang.String getTip()
    {
        return this.tip;
    }

    /**
     * Set the value of the Tip column.
     * @param tip
     */
    public void setTip(java.lang.String tip)
    {
        this.tip = tip;
    }

    /**
     * Return the value of the Ext1 column.
     * @return java.lang.String
     */
    public java.lang.String getExt1()
    {
        return this.ext1;
    }

    /**
     * Set the value of the Ext1 column.
     * @param ext1
     */
    public void setExt1(java.lang.String ext1)
    {
        this.ext1 = ext1;
    }

    /**
     * Return the value of the Ext2 column.
     * @return java.lang.String
     */
    public java.lang.String getExt2()
    {
        return this.ext2;
    }

    /**
     * Set the value of the Ext2 column.
     * @param ext2
     */
    public void setExt2(java.lang.String ext2)
    {
        this.ext2 = ext2;
    }

    /**
     * Return the value of the Ext3 column.
     * @return java.lang.String
     */
    public java.lang.String getExt3()
    {
        return this.ext3;
    }

    /**
     * Set the value of the Ext3 column.
     * @param ext3
     */
    public void setExt3(java.lang.String ext3)
    {
        this.ext3 = ext3;
    }
 

    /**
     * Implementation of the equals comparison on the basis of equality of the primary key values.
     * @param rhs
     * @return boolean
     */
    public boolean equals(Object rhs)
    {
        if (rhs == null)
            return false;
        if (! (rhs instanceof Workspacebaseproperty))
            return false;
        Workspacebaseproperty that = (Workspacebaseproperty) rhs;
        if (this.getWsid() == null || that.getWsid() == null)
            return false;
        return (this.getWsid().equals(that.getWsid()));
    }

    /**
     * Implementation of the hashCode method conforming to the Bloch pattern with
     * the exception of array properties (these are very unlikely primary key types).
     * @return int
     */
    public int hashCode()
    {
        if (this.hashValue == 0)
        {
            int result = 17;
            int wsidValue = this.getWsid() == null ? 0 : this.getWsid().hashCode();
            result = result * 37 + wsidValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }

	public java.lang.String getEnabledflag() {
		return enabledflag;
	}

	public void setEnabledflag(java.lang.String enabledflag) {
		this.enabledflag = enabledflag;
	}

	public java.lang.String getDivid() {
		return divid;
	}

	public void setDivid(java.lang.String divid) {
		this.divid = divid;
	}

	public java.lang.String getJsfuname() {
		return jsfuname;
	}

	public void setJsfuname(java.lang.String jsfuname) {
		this.jsfuname = jsfuname;
	}
}