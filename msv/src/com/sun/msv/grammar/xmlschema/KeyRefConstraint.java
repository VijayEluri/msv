/*
 * @(#)$Id: KeyRefConstraint.java,v 1.3 2003/06/09 20:37:22 kk122374 Exp $
 *
 * Copyright 2001 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * This software is the proprietary information of Sun Microsystems, Inc.  
 * Use is subject to license terms.
 * 
 */
package com.sun.msv.grammar.xmlschema;

/**
 * keyref constraint.
 * 
 * @author <a href="mailto:kohsuke.kawaguchi@eng.sun.com">Kohsuke KAWAGUCHI</a>
 */
public class KeyRefConstraint extends IdentityConstraint {
    public KeyRefConstraint( String namespaceURI, String localName, XPath[] selector, Field[] fields ) {
        super(namespaceURI,localName,selector,fields);
    }
    
    /**
     * corresponding key constraint.
     * this field is intentionally non-final.
     */
    public KeyConstraint key;
    
    // serialization support
    private static final long serialVersionUID = 1;    
}
