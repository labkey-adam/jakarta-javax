package javax.servlet.http;

import javax.servlet.NotYetImplementedException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextAdapter;
import java.util.Enumeration;

public class HttpSessionAdapter implements javax.servlet.http.HttpSession
{
    private final jakarta.servlet.http.HttpSession _httpSession;

    public HttpSessionAdapter(jakarta.servlet.http.HttpSession httpSession)
    {
        _httpSession = httpSession;
    }

    @Override
    public long getCreationTime()
    {
        return _httpSession.getCreationTime();
    }

    @Override
    public String getId()
    {
        return _httpSession.getId();
    }

    @Override
    public long getLastAccessedTime()
    {
        return _httpSession.getLastAccessedTime();
    }

    @Override
    public ServletContext getServletContext()
    {
        return new ServletContextAdapter(_httpSession.getServletContext());
    }

    @Override
    public void setMaxInactiveInterval(int i)
    {
        _httpSession.setMaxInactiveInterval(i);
    }

    @Override
    public int getMaxInactiveInterval()
    {
        return _httpSession.getMaxInactiveInterval();
    }

    @Override
    @Deprecated
    public HttpSessionContext getSessionContext()
    {
        throw new NotYetImplementedException();
//        return _httpSession.getSessionContext();
    }

    @Override
    public Object getAttribute(String s)
    {
        return _httpSession.getAttribute(s);
    }

    @Override
    @Deprecated
    public Object getValue(String s)
    {
        return _httpSession.getValue(s);
    }

    @Override
    public Enumeration<String> getAttributeNames()
    {
        return _httpSession.getAttributeNames();
    }

    @Override
    @Deprecated
    public String[] getValueNames()
    {
        return _httpSession.getValueNames();
    }

    @Override
    public void setAttribute(String s, Object o)
    {
        _httpSession.setAttribute(s, o);
    }

    @Override
    @Deprecated
    public void putValue(String s, Object o)
    {
        _httpSession.putValue(s, o);
    }

    @Override
    public void removeAttribute(String s)
    {
        _httpSession.removeAttribute(s);
    }

    @Override
    @Deprecated
    public void removeValue(String s)
    {
        _httpSession.removeValue(s);
    }

    @Override
    public void invalidate()
    {
        _httpSession.invalidate();
    }

    @Override
    public boolean isNew()
    {
        return _httpSession.isNew();
    }
}
