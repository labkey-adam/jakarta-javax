package javax.servlet.http;

public class CookieReverseAdapter extends jakarta.servlet.http.Cookie
{
    private final Cookie _cookie;

    public CookieReverseAdapter(Cookie cookie)
    {
        super(cookie.getName(), cookie.getValue());
        _cookie = cookie;
    }

    @Override
    public void setComment(String purpose)
    {
        _cookie.setComment(purpose);
    }

    @Override
    public String getComment()
    {
        return _cookie.getComment();
    }

    @Override
    public void setDomain(String pattern)
    {
        _cookie.setDomain(pattern);
    }

    @Override
    public String getDomain()
    {
        return _cookie.getDomain();
    }

    @Override
    public void setMaxAge(int expiry)
    {
        _cookie.setMaxAge(expiry);
    }

    @Override
    public int getMaxAge()
    {
        return _cookie.getMaxAge();
    }

    @Override
    public void setPath(String uri)
    {
        _cookie.setPath(uri);
    }

    @Override
    public String getPath()
    {
        return _cookie.getPath();
    }

    @Override
    public void setSecure(boolean flag)
    {
        _cookie.setSecure(flag);
    }

    @Override
    public boolean getSecure()
    {
        return _cookie.getSecure();
    }

    @Override
    public String getName()
    {
        return _cookie.getName();
    }

    @Override
    public void setValue(String newValue)
    {
        _cookie.setValue(newValue);
    }

    @Override
    public String getValue()
    {
        return _cookie.getValue();
    }

    @Override
    public int getVersion()
    {
        return _cookie.getVersion();
    }

    @Override
    public void setVersion(int v)
    {
        _cookie.setVersion(v);
    }

    @Override
    public Object clone()
    {
        return _cookie.clone();
    }

    @Override
    public void setHttpOnly(boolean httpOnly)
    {
        _cookie.setHttpOnly(httpOnly);
    }

    @Override
    public boolean isHttpOnly()
    {
        return _cookie.isHttpOnly();
    }
}
