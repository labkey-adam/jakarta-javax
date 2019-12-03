package javax.servlet.jsp;

import javax.el.ELContextListener;
import javax.el.ELResolver;
import javax.el.ExpressionFactory;
import javax.servlet.NotYetImplementedException;

public class JspApplicationContextAdapter implements JspApplicationContext
{
    private final jakarta.servlet.jsp.JspApplicationContext _jspApplicationContext;

    public JspApplicationContextAdapter(jakarta.servlet.jsp.JspApplicationContext jspApplicationContext)
    {
        _jspApplicationContext = jspApplicationContext;
    }

    @Override
    public void addELContextListener(ELContextListener listener)
    {
        throw new NotYetImplementedException();
//        _jspApplicationContext.addELContextListener(listener);
    }

    @Override
    public void addELResolver(ELResolver resolver) throws IllegalStateException
    {
        throw new NotYetImplementedException();
//        _jspApplicationContext.addELResolver(elResolver);
    }

    @Override
    public ExpressionFactory getExpressionFactory()
    {
        throw new NotYetImplementedException();
//        return _jspApplicationContext.getExpressionFactory();
    }
}
