package javax.servlet.http;

import javax.servlet.Adapters;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestAdapter;
import java.io.IOException;
import java.security.Principal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.stream.Collectors;

public class HttpServletRequestAdapter extends ServletRequestAdapter implements HttpServletRequest
{
    private final jakarta.servlet.http.HttpServletRequest _httpServletRequest;

    public HttpServletRequestAdapter(jakarta.servlet.http.HttpServletRequest httpServletRequest)
    {
        super(httpServletRequest);
        _httpServletRequest = httpServletRequest;
    }

    public jakarta.servlet.http.HttpServletRequest unwrap()
    {
        return _httpServletRequest;
    }

    @Override
    public String getAuthType()
    {
        return _httpServletRequest.getAuthType();
    }

    @Override
    public Cookie[] getCookies()
    {
        if (null == _httpServletRequest.getCookies())
            return null;
        return Arrays.stream(_httpServletRequest.getCookies())
            .map(CookieAdapter::new)
            .toArray(Cookie[]::new);
    }

    @Override
    public long getDateHeader(String s)
    {
        return _httpServletRequest.getDateHeader(s);
    }

    @Override
    public String getHeader(String s)
    {
        return _httpServletRequest.getHeader(s);
    }

    @Override
    public Enumeration<String> getHeaders(String s)
    {
        return _httpServletRequest.getHeaders(s);
    }

    @Override
    public Enumeration<String> getHeaderNames()
    {
        return _httpServletRequest.getHeaderNames();
    }

    @Override
    public int getIntHeader(String s)
    {
        return _httpServletRequest.getIntHeader(s);
    }

    @Override
    public String getMethod()
    {
        return _httpServletRequest.getMethod();
    }

    @Override
    public String getPathInfo()
    {
        return _httpServletRequest.getPathInfo();
    }

    @Override
    public String getPathTranslated()
    {
        return _httpServletRequest.getPathTranslated();
    }

    @Override
    public String getContextPath()
    {
        return _httpServletRequest.getContextPath();
    }

    @Override
    public String getQueryString()
    {
        return _httpServletRequest.getQueryString();
    }

    @Override
    public String getRemoteUser()
    {
        return _httpServletRequest.getRemoteUser();
    }

    @Override
    public boolean isUserInRole(String s)
    {
        return _httpServletRequest.isUserInRole(s);
    }

    @Override
    public Principal getUserPrincipal()
    {
        return _httpServletRequest.getUserPrincipal();
    }

    @Override
    public String getRequestedSessionId()
    {
        return _httpServletRequest.getRequestedSessionId();
    }

    @Override
    public String getRequestURI()
    {
        return _httpServletRequest.getRequestURI();
    }

    @Override
    public StringBuffer getRequestURL()
    {
        return _httpServletRequest.getRequestURL();
    }

    @Override
    public String getServletPath()
    {
        return _httpServletRequest.getServletPath();
    }

    @Override
    public HttpSession getSession(boolean create)
    {
        return Adapters.adapt(_httpServletRequest.getSession(create));
    }

    @Override
    public HttpSession getSession()
    {
        return Adapters.adapt(_httpServletRequest.getSession());
    }

    @Override
    public String changeSessionId()
    {
        return _httpServletRequest.changeSessionId();
    }

    @Override
    public boolean isRequestedSessionIdValid()
    {
        return _httpServletRequest.isRequestedSessionIdValid();
    }

    @Override
    public boolean isRequestedSessionIdFromCookie()
    {
        return _httpServletRequest.isRequestedSessionIdFromCookie();
    }

    @Override
    public boolean isRequestedSessionIdFromURL()
    {
        return _httpServletRequest.isRequestedSessionIdFromURL();
    }

    @Override
    @Deprecated
    public boolean isRequestedSessionIdFromUrl()
    {
        return _httpServletRequest.isRequestedSessionIdFromUrl();
    }

    @Override
    public Map<String, String> getTrailerFields()
    {
        return _httpServletRequest.getTrailerFields();
    }

    @Override
    public boolean isTrailerFieldsReady()
    {
        return _httpServletRequest.isTrailerFieldsReady();
    }

    public boolean authenticate(HttpServletResponse httpServletResponse) throws IOException, ServletException
    {
        try
        {
            return _httpServletRequest.authenticate(new HttpServletResponseReverseAdapter(httpServletResponse));
        }
        catch (jakarta.servlet.ServletException e)
        {
            throw new ServletException(e);
        }
    }

    @Override
    public void login(String username, String password) throws ServletException
    {
    }

    @Override
    public void logout() throws ServletException
    {
    }

    @Override
    public Collection<Part> getParts() throws IOException, ServletException
    {
        try
        {
            return _httpServletRequest.getParts().stream()
                .map(PartAdapter::new)
                .collect(Collectors.toList());
        }
        catch (jakarta.servlet.ServletException e)
        {
            throw new ServletException(e);
        }
    }

    @Override
    public Part getPart(String name) throws IOException, ServletException
    {
        try
        {
            return new PartAdapter(_httpServletRequest.getPart(name));
        }
        catch (jakarta.servlet.ServletException e)
        {
            throw new ServletException(e);
        }
    }

    @Override
    public <T extends HttpUpgradeHandler> T upgrade(Class<T> httpUpgradeHandlerClass) throws IOException, ServletException
    {
        return null;  // TODO: Do something here
    }
}
