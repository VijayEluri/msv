/*
 * @(#)$Id: ZeroOrMoreState.java,v 1.6 2003/06/09 20:37:30 kk122374 Exp $
 *
 * Copyright 2001 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * This software is the proprietary information of Sun Microsystems, Inc.  
 * Use is subject to license terms.
 * 
 */
package com.sun.msv.reader.trex;

import com.sun.msv.grammar.Expression;
import com.sun.msv.reader.SequenceState;

/**
 * parses &lt;zeroOrMore&gt; pattern.
 * 
 * @author <a href="mailto:kohsuke.kawaguchi@eng.sun.com">Kohsuke KAWAGUCHI</a>
 */
public class ZeroOrMoreState extends SequenceState {
    protected Expression annealExpression( Expression exp ) {
        return reader.pool.createZeroOrMore(exp);
    }
}
