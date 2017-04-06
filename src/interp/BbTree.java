/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package interp;

import org.antlr.runtime.tree.*;
import org.antlr.runtime.Token;

/**
 * Class to extend the nodes of the AST. It includes two fields
 * to store the value of literals and strings.
 * This class is not strictly necessary, since the literals could
 * be extracted from the "text" fields of the tokens.
 * However, it helps to understand how to extend AST nodes in ANTLR.
 */
 
public class BbTree extends CommonTree {
    /** Field to store integer literals */
    private int intValue;

    /** Field to store string literals (without the enclosing quotes) */
    private String strValue;

    /** Constructor of the class */
    public BbTree(Token t) {
        super(t);
    }

    /** Function to get the child of the node. */
    public BbTree getChild(int i) {
        return (BbTree) super.getChild(i);
    }

    /** Get the integer value of the node. */
    public int getIntValue() { return intValue;}

    /** Define the integer value of the node. */
    public void setIntValue() { intValue = Integer.parseInt(getText()); }

    /** Get the Boolean value of the node. */
    public boolean getBooleanValue() { return intValue != 0; }

    /** Define the Boolean value of the node. */
    public void setBooleanValue() {
        intValue = getText().equals("true") ? 1 : 0;
    }

    /** Get the string value of the node. */
    public String getStringValue() { return strValue; }

    /**
     * Define the string value of the node. It removes the
     * enclosing quotes. In this way, it can be printed as it is.
     */
    public void setStringValue() {
        String s = getText();
        // Do not store the " at the extremes of the string
        strValue = s.substring(1,s.length()-1);
    }
}
