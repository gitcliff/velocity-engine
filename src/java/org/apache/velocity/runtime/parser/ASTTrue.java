/* Generated By:JJTree: Do not edit this line. ASTTrue.java */

package org.apache.velocity.runtime.parser;

import org.apache.velocity.Context;

public class ASTTrue extends SimpleNode
{
    public ASTTrue(int id)
    {
        super(id);
    }

    public ASTTrue(Parser p, int id)
    {
        super(p, id);
    }

    /** Accept the visitor. **/
    public Object jjtAccept(ParserVisitor visitor, Object data)
    {
        return visitor.visit(this, data);
    }

    public boolean evaluate(Context context)
    {
        return true;
    }        

    public Object value(Context context)
    {
        return new Boolean(true);
    }        
}