/*
 * @(#)$Id: Exportable.java,v 1.6 2003/06/09 20:37:19 kk122374 Exp $
 *
 * Copyright 2001 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * This software is the proprietary information of Sun Microsystems, Inc.  
 * Use is subject to license terms.
 * 
 */
package com.sun.msv.grammar.relax;

/**
 * exportable Expression.
 * 
 * @author <a href="mailto:kohsuke.kawaguchi@eng.sun.com">Kohsuke KAWAGUCHI</a>
 */
public interface Exportable {
    boolean isExported();
}
