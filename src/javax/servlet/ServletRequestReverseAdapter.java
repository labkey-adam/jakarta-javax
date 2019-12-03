package javax.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

public class ServletRequestReverseAdapter<T extends ServletRequest> implements jakarta.servlet.ServletRequest
{
    protected final T _servletRequest;

    public ServletRequestReverseAdapter(T servletRequest)
    {
        _servletRequest = servletRequest;
    }

    @Override
    public Object getAttribute(String name)
    {
        return _servletRequest.getAttribute(name);
    }

    @Override
    public Enumeration<String> getAttributeNames()
    {
        return _servletRequest.getAttributeNames();
    }

    @Override
    public String getCharacterEncoding()
    {
        return _servletRequest.getCharacterEncoding();
    }

    @Override
    public void setCharacterEncoding(String env) throws UnsupportedEncodingException
    {
        _servletRequest.setCharacterEncoding(env);
    }

    @Override
    public int getContentLength()
    {
        return _servletRequest.getContentLength();
    }

    @Override
    public long getContentLengthLong()
    {
        return _servletRequest.getContentLengthLong();
    }

    @Override
    public String getContentType()
    {
        return _servletRequest.getContentType();
    }

    @Override
    public ServletInputStream getInputStream() throws IOException
    {
        return _servletRequest.getInputStream();
    }

    @Override
    public String getParameter(String name)
    {
        return _servletRequest.getParameter(name);
    }

    @Override
    public Enumeration<String> getParameterNames()
    {
        return _servletRequest.getParameterNames();
    }

    @Override
    public String[] getParameterValues(String name)
    {
        return _servletRequest.getParameterValues(name);
    }

    @Override
    public Map<String, String[]> getParameterMap()
    {
        return _servletRequest.getParameterMap();
    }

    @Override
    public String getProtocol()
    {
        return _servletRequest.getProtocol();
    }

    @Override
    public String getScheme()
    {
        return _servletRequest.getScheme();
    }

    @Override
    public String getServerName()
    {
        return _servletRequest.getServerName();
    }

    @Override
    public int getServerPort()
    {
        return _servletRequest.getServerPort();
    }

    @Override
    public BufferedReader getReader() throws IOException
    {
        return _servletRequest.getReader();
    }

    @Override
    public String getRemoteAddr()
    {
        return _servletRequest.getRemoteAddr();
    }

    @Override
    public String getRemoteHost()
    {
        return _servletRequest.getRemoteHost();
    }

    @Override
    public void setAttribute(String name, Object o)
    {
        _servletRequest.setAttribute(name, o);
    }

    @Override
    public void removeAttribute(String name)
    {
        _servletRequest.removeAttribute(name);
    }

    @Override
    public Locale getLocale()
    {
        return _servletRequest.getLocale();
    }

    @Override
    public Enumeration<Locale> getLocales()
    {
        return _servletRequest.getLocales();
    }

    @Override
    public boolean isSecure()
    {
        return _servletRequest.isSecure();
    }

    @Override
    public jakarta.servlet.RequestDispatcher getRequestDispatcher(String path)
    {
        return new RequestDispatcherReverseAdapter(_servletRequest.getRequestDispatcher(path));
    }

    @Override
    @Deprecated
    public String getRealPath(String path)
    {
        return _servletRequest.getRealPath(path);
    }

    @Override
    public int getRemotePort()
    {
        return _servletRequest.getRemotePort();
    }

    @Override
    public String getLocalName()
    {
        return _servletRequest.getLocalName();
    }

    @Override
    public String getLocalAddr()
    {
        return _servletRequest.getLocalAddr();
    }

    @Override
    public int getLocalPort()
    {
        return _servletRequest.getLocalPort();
    }

    @Override
    public jakarta.servlet.ServletContext getServletContext()
    {
        return new ServletContextReverseAdapter(_servletRequest.getServletContext());
    }

    @Override
    public AsyncContext startAsync() throws IllegalStateException
    {
        return _servletRequest.startAsync();
    }

    @Override
    public jakarta.servlet.AsyncContext startAsync(jakarta.servlet.ServletRequest servletRequest, jakarta.servlet.ServletResponse servletResponse) throws IllegalStateException
    {
        return _servletRequest.startAsync(new ServletRequestAdapter(servletRequest), new ServletResponseAdapter(servletResponse));
    }

    @Override
    public boolean isAsyncStarted()
    {
        return _servletRequest.isAsyncStarted();
    }

    @Override
    public boolean isAsyncSupported()
    {
        return _servletRequest.isAsyncSupported();
    }

    @Override
    public AsyncContext getAsyncContext()
    {
        return _servletRequest.getAsyncContext();
    }

    @Override
    public jakarta.servlet.DispatcherType getDispatcherType()
    {
        return jakarta.servlet.DispatcherType.valueOf(_servletRequest.getDispatcherType().name());
    }
}
