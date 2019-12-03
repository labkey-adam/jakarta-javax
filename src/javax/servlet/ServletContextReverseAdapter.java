package javax.servlet;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterRegistration;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import jakarta.servlet.SessionCookieConfig;
import jakarta.servlet.SessionTrackingMode;
import jakarta.servlet.descriptor.JspConfigDescriptor;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Map;
import java.util.Set;

public class ServletContextReverseAdapter implements jakarta.servlet.ServletContext
{
    private final javax.servlet.ServletContext _servletContext;

    public ServletContextReverseAdapter(ServletContext servletContext)
    {
        _servletContext = servletContext;
    }

    @Override
    public String getContextPath()
    {
        return _servletContext.getContextPath();
    }

    @Override
    public jakarta.servlet.ServletContext getContext(String s)
    {
        return new ServletContextReverseAdapter(_servletContext.getContext(s));
    }

    @Override
    public int getMajorVersion()
    {
        return _servletContext.getMajorVersion();
    }

    @Override
    public int getMinorVersion()
    {
        return _servletContext.getMinorVersion();
    }

    @Override
    public int getEffectiveMajorVersion()
    {
        return _servletContext.getEffectiveMajorVersion();
    }

    @Override
    public int getEffectiveMinorVersion()
    {
        return _servletContext.getEffectiveMinorVersion();
    }

    @Override
    public String getMimeType(String s)
    {
        return _servletContext.getMimeType(s);
    }

    @Override
    public Set<String> getResourcePaths(String s)
    {
        return _servletContext.getResourcePaths(s);
    }

    @Override
    public URL getResource(String s) throws MalformedURLException
    {
        return _servletContext.getResource(s);
    }

    @Override
    public InputStream getResourceAsStream(String s)
    {
        return _servletContext.getResourceAsStream(s);
    }

    @Override
    public RequestDispatcher getRequestDispatcher(String s)
    {
        return new RequestDispatcherReverseAdapter(_servletContext.getRequestDispatcher(s));
    }

    @Override
    public RequestDispatcher getNamedDispatcher(String s)
    {
        return new RequestDispatcherReverseAdapter(_servletContext.getNamedDispatcher(s));
    }

    @Override
    @Deprecated
    public Servlet getServlet(String s) throws ServletException
    {
        try
        {
            return new ServletReverseAdapter(_servletContext.getServlet(s));
        }
        catch (javax.servlet.ServletException e)
        {
            throw new ServletException(e);
        }
    }

    @Override
    @Deprecated
    public Enumeration<Servlet> getServlets()
    {
        throw new NotYetImplementedException();
//        return _servletContext.getServlets();
    }

    @Override
    @Deprecated
    public Enumeration<String> getServletNames()
    {
        return _servletContext.getServletNames();
    }

    @Override
    public void log(String s)
    {
        _servletContext.log(s);
    }

    @Override
    @Deprecated
    public void log(Exception e, String s)
    {
        _servletContext.log(e, s);
    }

    @Override
    public void log(String s, Throwable throwable)
    {
        _servletContext.log(s, throwable);
    }

    @Override
    public String getRealPath(String s)
    {
        return _servletContext.getRealPath(s);
    }

    @Override
    public String getServerInfo()
    {
        return _servletContext.getServerInfo();
    }

    @Override
    public String getInitParameter(String s)
    {
        return _servletContext.getInitParameter(s);
    }

    @Override
    public Enumeration<String> getInitParameterNames()
    {
        return _servletContext.getInitParameterNames();
    }

    @Override
    public boolean setInitParameter(String s, String s1)
    {
        return _servletContext.setInitParameter(s, s1);
    }

    @Override
    public Object getAttribute(String s)
    {
        return _servletContext.getAttribute(s);
    }

    @Override
    public Enumeration<String> getAttributeNames()
    {
        return _servletContext.getAttributeNames();
    }

    @Override
    public void setAttribute(String s, Object o)
    {
        _servletContext.setAttribute(s, o);
    }

    @Override
    public void removeAttribute(String s)
    {
        _servletContext.removeAttribute(s);
    }

    @Override
    public String getServletContextName()
    {
        return _servletContext.getServletContextName();
    }

    @Override
    public ServletRegistration.Dynamic addServlet(String s, String s1)
    {
        throw new NotYetImplementedException();
//        return _servletContext.addServlet(s, s1);
    }

    @Override
    public ServletRegistration.Dynamic addServlet(String s, Servlet servlet)
    {
        throw new NotYetImplementedException();
//        return _servletContext.addServlet(s, servlet);
    }

    @Override
    public ServletRegistration.Dynamic addServlet(String s, Class<? extends Servlet> aClass)
    {
        throw new NotYetImplementedException();
//        return _servletContext.addServlet(s, aClass);
    }

    @Override
    public ServletRegistration.Dynamic addJspFile(String s, String s1)
    {
        throw new NotYetImplementedException();
//        return _servletContext.addJspFile(s, s1);
    }

    @Override
    public <T extends Servlet> T createServlet(Class<T> aClass) throws ServletException
    {
        throw new NotYetImplementedException();
//        return _servletContext.createServlet(aClass);
    }

    @Override
    public ServletRegistration getServletRegistration(String s)
    {
        throw new NotYetImplementedException();
//        return _servletContext.getServletRegistration(s);
    }

    @Override
    public Map<String, ? extends ServletRegistration> getServletRegistrations()
    {
        throw new NotYetImplementedException();
//        return _servletContext.getServletRegistrations();
    }

    @Override
    public FilterRegistration.Dynamic addFilter(String s, String s1)
    {
        throw new NotYetImplementedException();
//        return _servletContext.addFilter(s, s1);
    }

    @Override
    public FilterRegistration.Dynamic addFilter(String s, Filter filter)
    {
        throw new NotYetImplementedException();
//        return _servletContext.addFilter(s, filter);
    }

    @Override
    public FilterRegistration.Dynamic addFilter(String s, Class<? extends Filter> aClass)
    {
        throw new NotYetImplementedException();
//        return _servletContext.addFilter(s, aClass);
    }

    @Override
    public <T extends Filter> T createFilter(Class<T> aClass) throws ServletException
    {
        throw new NotYetImplementedException();
//        return _servletContext.createFilter(aClass);
    }

    @Override
    public FilterRegistration getFilterRegistration(String s)
    {
        throw new NotYetImplementedException();
//        return _servletContext.getFilterRegistration(s);
    }

    @Override
    public Map<String, ? extends FilterRegistration> getFilterRegistrations()
    {
        throw new NotYetImplementedException();
//        return _servletContext.getFilterRegistrations();
    }

    @Override
    public SessionCookieConfig getSessionCookieConfig()
    {
        return _servletContext.getSessionCookieConfig();
    }

    @Override
    public void setSessionTrackingModes(Set<SessionTrackingMode> set)
    {
        throw new NotYetImplementedException();
//        _servletContext.setSessionTrackingModes(set);
    }

    @Override
    public Set<SessionTrackingMode> getDefaultSessionTrackingModes()
    {
        throw new NotYetImplementedException();
//        return _servletContext.getDefaultSessionTrackingModes();
    }

    @Override
    public Set<SessionTrackingMode> getEffectiveSessionTrackingModes()
    {
        throw new NotYetImplementedException();
//        return _servletContext.getEffectiveSessionTrackingModes();
    }

    @Override
    public void addListener(String s)
    {
        _servletContext.addListener(s);
    }

    @Override
    public <T extends EventListener> void addListener(T t)
    {
        _servletContext.addListener(t);
    }

    @Override
    public void addListener(Class<? extends EventListener> aClass)
    {
        _servletContext.addListener(aClass);
    }

    @Override
    public <T extends EventListener> T createListener(Class<T> aClass) throws ServletException
    {
        try
        {
            return _servletContext.createListener(aClass);
        }
        catch (javax.servlet.ServletException e)
        {
            throw new ServletException(e);
        }
    }

    @Override
    public JspConfigDescriptor getJspConfigDescriptor()
    {
        throw new NotYetImplementedException();
//        return _servletContext.getJspConfigDescriptor();
    }

    @Override
    public ClassLoader getClassLoader()
    {
        return _servletContext.getClassLoader();
    }

    @Override
    public void declareRoles(String... strings)
    {
        _servletContext.declareRoles(strings);
    }

    @Override
    public String getVirtualServerName()
    {
        return _servletContext.getVirtualServerName();
    }

    @Override
    public int getSessionTimeout()
    {
        return _servletContext.getSessionTimeout();
    }

    @Override
    public void setSessionTimeout(int i)
    {
        _servletContext.setSessionTimeout(i);
    }

    @Override
    public String getRequestCharacterEncoding()
    {
        return _servletContext.getRequestCharacterEncoding();
    }

    @Override
    public void setRequestCharacterEncoding(String s)
    {
        _servletContext.setRequestCharacterEncoding(s);
    }

    @Override
    public String getResponseCharacterEncoding()
    {
        return _servletContext.getResponseCharacterEncoding();
    }

    @Override
    public void setResponseCharacterEncoding(String s)
    {
        _servletContext.setResponseCharacterEncoding(s);
    }
}
