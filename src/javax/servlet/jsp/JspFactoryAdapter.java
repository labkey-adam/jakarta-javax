package javax.servlet.jsp;

import javax.servlet.Adapters;
import javax.servlet.NotYetImplementedException;
import javax.servlet.ServletContextReverseAdapter;

public class JspFactoryAdapter extends JspFactory
{
    private final jakarta.servlet.jsp.JspFactory _jspFactory;

    public JspFactoryAdapter(jakarta.servlet.jsp.JspFactory jspFactory)
    {
        _jspFactory = jspFactory;
    }

    @Override
    public javax.servlet.jsp.PageContext getPageContext(javax.servlet.Servlet servlet, javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, String errorPageURL, boolean needsSession, int buffer, boolean autoflush)
    {
        return new PageContextAdapter(_jspFactory.getPageContext(servlet, Adapters.adapt(request), Adapters.adapt(response), errorPageURL, needsSession, buffer, autoflush));
    }

    @Override
    public void releasePageContext(javax.servlet.jsp.PageContext pc)
    {
        // TODO: Do nothing for now... NYI
        //        throw new NotYetImplementedException();
        //        _jspFactory.releasePageContext(pc);
    }

    @Override
    public JspEngineInfo getEngineInfo()
    {
        return new JspEngineInfoAdapter(_jspFactory.getEngineInfo());
    }

    @Override
    public javax.servlet.jsp.JspApplicationContext getJspApplicationContext(javax.servlet.ServletContext context)
    {
        return new JspApplicationContextAdapter(_jspFactory.getJspApplicationContext(new ServletContextReverseAdapter(context)));
    }
}
