package javax.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

public class ServletRequestAdapter implements javax.servlet.ServletRequest
{
    protected final jakarta.servlet.ServletRequest _servletRequest;

    public ServletRequestAdapter(jakarta.servlet.ServletRequest servletRequest)
    {
        _servletRequest = servletRequest;
    }

    public jakarta.servlet.ServletRequest unwrap()
    {
        return _servletRequest;
    }

    @Override
    public Object getAttribute(String s)
    {
        return _servletRequest.getAttribute(s);
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
    public void setCharacterEncoding(String s) throws UnsupportedEncodingException
    {
        _servletRequest.setCharacterEncoding(s);
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
        return new ServletInputStreamAdapter(_servletRequest.getInputStream());
    }

    @Override
    public String getParameter(String s)
    {
        return _servletRequest.getParameter(s);
    }

    @Override
    public Enumeration<String> getParameterNames()
    {
        return _servletRequest.getParameterNames();
    }

    @Override
    public String[] getParameterValues(String s)
    {
        return _servletRequest.getParameterValues(s);
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
    public void setAttribute(String s, Object o)
    {
        _servletRequest.setAttribute(s, o);
    }

    @Override
    public void removeAttribute(String s)
    {
        _servletRequest.removeAttribute(s);
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
    public RequestDispatcher getRequestDispatcher(String s)
    {
        return new RequestDispatcherAdapter(_servletRequest.getRequestDispatcher(s));
    }

    @Override
    @Deprecated
    public String getRealPath(String s)
    {
        return _servletRequest.getRealPath(s);
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
    public ServletContext getServletContext()
    {
        return new ServletContextAdapter(_servletRequest.getServletContext());
    }

    @Override
    public AsyncContext startAsync() throws IllegalStateException
    {
        return new AsyncContextAdapter(_servletRequest.startAsync());
    }

    @Override
    public AsyncContext startAsync(ServletRequest servletRequest, javax.servlet.ServletResponse servletResponse) throws IllegalStateException
    {
        return null;
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
        return new AsyncContextAdapter(_servletRequest.getAsyncContext());
    }

    @Override
    public DispatcherType getDispatcherType()
    {
        return DispatcherType.valueOf(_servletRequest.getDispatcherType().name());
    }
}
