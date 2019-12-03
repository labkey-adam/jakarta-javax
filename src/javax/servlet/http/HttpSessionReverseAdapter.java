package javax.servlet.http;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSessionContext;

import javax.servlet.NotYetImplementedException;
import javax.servlet.ServletContextReverseAdapter;
import java.util.Enumeration;

public class HttpSessionReverseAdapter implements jakarta.servlet.http.HttpSession
{
    private final javax.servlet.http.HttpSession _httpSession;

    public HttpSessionReverseAdapter(HttpSession httpSession)
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
        return new ServletContextReverseAdapter(_httpSession.getServletContext());
    }

    @Override
    public void setMaxInactiveInterval(int interval)
    {
        _httpSession.setMaxInactiveInterval(interval);
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
    public Object getAttribute(String name)
    {
        return _httpSession.getAttribute(name);
    }

    @Override
    @Deprecated
    public Object getValue(String name)
    {
        return _httpSession.getValue(name);
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
    public void setAttribute(String name, Object value)
    {
        _httpSession.setAttribute(name, value);
    }

    @Override
    @Deprecated
    public void putValue(String name, Object value)
    {
        _httpSession.putValue(name, value);
    }

    @Override
    public void removeAttribute(String name)
    {
        _httpSession.removeAttribute(name);
    }

    @Override
    @Deprecated
    public void removeValue(String name)
    {
        _httpSession.removeValue(name);
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
