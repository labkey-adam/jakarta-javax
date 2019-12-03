package javax.servlet.jsp;

import javax.el.ELContext;
import javax.servlet.*;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAdapter;
import java.io.IOException;
import java.util.Enumeration;

public class PageContextAdapter extends PageContext
{
    private final jakarta.servlet.jsp.PageContext _pageContext;

    public PageContextAdapter(jakarta.servlet.jsp.PageContext pageContext)
    {
        _pageContext = pageContext;
    }

    @Override
    public void initialize(Servlet servlet, ServletRequest request, ServletResponse response, String errorPageURL, boolean needsSession, int bufferSize, boolean autoFlush) throws IOException, IllegalStateException, IllegalArgumentException
    {
        _pageContext.initialize(servlet, Adapters.adapt(request), Adapters.adapt(response), errorPageURL, needsSession, bufferSize, autoFlush);
    }

    @Override
    public void release()
    {
        _pageContext.release();
    }

    @Override
    public HttpSession getSession()
    {
        return new HttpSessionAdapter(_pageContext.getSession());
    }

    @Override
    public Object getPage()
    {
        return _pageContext.getPage();
    }

    @Override
    public ServletRequest getRequest()
    {
        return Adapters.adapt(_pageContext.getRequest());
    }

    @Override
    public ServletResponse getResponse()
    {
        return Adapters.adapt(_pageContext.getResponse());
    }

    @Override
    public Exception getException()
    {
        return _pageContext.getException();
    }

    @Override
    public ServletConfig getServletConfig()
    {
        return new ServletConfigAdapter(_pageContext.getServletConfig());
    }

    @Override
    public ServletContext getServletContext()
    {
        return new ServletContextAdapter(_pageContext.getServletContext());
    }

    @Override
    public void forward(String relativeUrlPath) throws ServletException, IOException
    {
        try
        {
            _pageContext.forward(relativeUrlPath);
        }
        catch (jakarta.servlet.ServletException e)
        {
            throw new ServletException(e);
        }
    }

    @Override
    public void include(String relativeUrlPath) throws ServletException, IOException
    {
        try
        {
            _pageContext.include(relativeUrlPath);
        }
        catch (jakarta.servlet.ServletException e)
        {
            throw new ServletException(e);
        }
    }

    @Override
    public void include(String relativeUrlPath, boolean flush) throws ServletException, IOException
    {
        try
        {
            _pageContext.include(relativeUrlPath, flush);
        }
        catch (jakarta.servlet.ServletException e)
        {
            throw new ServletException(e);
        }
    }

    @Override
    public void handlePageException(Exception e) throws ServletException, IOException
    {
        try
        {
            _pageContext.handlePageException(e);
        }
        catch (jakarta.servlet.ServletException ex)
        {
            throw new ServletException(ex);
        }
    }

    @Override
    public void handlePageException(Throwable t) throws ServletException, IOException
    {
        try
        {
            _pageContext.handlePageException(t);
        }
        catch (jakarta.servlet.ServletException e)
        {
            throw new ServletException(e);
        }
    }

    @Override
    public void setAttribute(String name, Object value)
    {
        _pageContext.setAttribute(name, value);
    }

    @Override
    public void setAttribute(String name, Object value, int scope)
    {
        _pageContext.setAttribute(name, value, scope);
    }

    @Override
    public Object getAttribute(String name)
    {
        return _pageContext.getAttribute(name);
    }

    @Override
    public Object getAttribute(String name, int scope)
    {
        return _pageContext.getAttribute(name, scope);
    }

    @Override
    public Object findAttribute(String name)
    {
        return _pageContext.findAttribute(name);
    }

    @Override
    public void removeAttribute(String name)
    {
        _pageContext.removeAttribute(name);
    }

    @Override
    public void removeAttribute(String name, int scope)
    {
        _pageContext.removeAttribute(name, scope);
    }

    @Override
    public int getAttributesScope(String name)
    {
        return _pageContext.getAttributesScope(name);
    }

    @Override
    public Enumeration<String> getAttributeNamesInScope(int scope)
    {
        return _pageContext.getAttributeNamesInScope(scope);
    }

    @Override
    public JspWriter getOut()
    {
        return new JspWriterAdapter(_pageContext.getOut());
    }

    @Override
    public javax.servlet.jsp.el.ExpressionEvaluator getExpressionEvaluator()
    {
        throw new NotYetImplementedException();
//        return _pageContext.getExpressionEvaluator();
    }

    @Override
    public ELContext getELContext()
    {
        throw new NotYetImplementedException();
//        return _pageContext.getELContext();
    }

    @Override
    public javax.servlet.jsp.el.VariableResolver getVariableResolver()
    {
        throw new NotYetImplementedException();
//        return _pageContext.getVariableResolver();
    }
}
