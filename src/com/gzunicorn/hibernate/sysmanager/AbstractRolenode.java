/*
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 *
 * Created Sun Aug 21 18:44:53 CST 2005 by MyEclipse Hibernate Tool.
 */
package com.gzunicorn.hibernate.sysmanager;

import java.io.Serializable;

/**
 * A class that represents a row in the RoleNode table. 
 * You can customize the behavior of this class by editing the class, {@link Rolenode()}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized * by MyEclipse Hibernate tool integration.
 */
public abstract class AbstractRolenode 
    implements Serializable
{

    /** The value of the simple roleid property. */
    private java.lang.String roleid;

    /** The value of the simple nodeid property. */
    private java.lang.String nodeid;

    /** The value of the simple writeflag property. */
    private java.lang.String writeflag;

    /**
     * Simple constructor of AbstractRolenode instances.
     */
    public AbstractRolenode()
    {
    }

    /**
     * Return the value of the RoleID column.
     * @return java.lang.String
     */
    public java.lang.String getRoleid()
    {
        return this.roleid;
    }

    /**
     * Set the value of the RoleID column.
     * @param roleid
     */
    public void setRoleid(java.lang.String roleid)
    {
        this.roleid = roleid;
    }

    /**
     * Return the value of the NodeID column.
     * @return java.lang.String
     */
    public java.lang.String getNodeid()
    {
        return this.nodeid;
    }

    /**
     * Set the value of the NodeID column.
     * @param nodeid
     */
    public void setNodeid(java.lang.String nodeid)
    {
        this.nodeid = nodeid;
    }

    /**
     * Return the value of the WriteFlag column.
     * @return java.lang.String
     */
    public java.lang.String getWriteflag()
    {
        return this.writeflag;
    }

    /**
     * Set the value of the WriteFlag column.
     * @param writeflag
     */
    public void setWriteflag(java.lang.String writeflag)
    {
        this.writeflag = writeflag;
    }
}
