package javax.servlet.http;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpSession;

import javax.servlet.Adapters;
import javax.servlet.ServletRequestReverseAdapter;
import java.io.IOException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.stream.Collectors;

public class HttpServletRequestReverseAdapter extends ServletRequestReverseAdapter<HttpServletRequest> implements jakarta.servlet.http.HttpServletRequest
{
    public HttpServletRequestReverseAdapter(HttpServletRequest servletRequest)
    {
        super(servletRequest);
    }

    public String getAuthType()
    {
        return _servletRequest.getAuthType();
    }

    public Cookie[] getCookies()
    {
        return _servletRequest.getCookies();
    }

    public long getDateHeader(String name)
    {
        return _servletRequest.getDateHeader(name);
    }

    public String getHeader(String name)
    {
        return _servletRequest.getHeader(name);
    }

    public Enumeration<String> getHeaders(String name)
    {
        return _servletRequest.getHeaders(name);
    }

    public Enumeration<String> getHeaderNames()
    {
        return _servletRequest.getHeaderNames();
    }

    public int getIntHeader(String name)
    {
        return _servletRequest.getIntHeader(name);
    }

    public jakarta.servlet.http.HttpServletMapping getHttpServletMapping()
    {
        return null;  // TODO: need HttpServletMapping and HttpServletMappingReverseAdapter
        //return _servletRequest.getHttpServletMapping();
    }

    public String getMethod()
    {
        return _servletRequest.getMethod();
    }

    public String getPathInfo()
    {
        return _servletRequest.getPathInfo();
    }

    public String getPathTranslated()
    {
        return _servletRequest.getPathTranslated();
    }

    public jakarta.servlet.http.PushBuilder newPushBuilder()
    {
        return null;  // TODO: need PushBuilder and PushBuilderReverseAdapter
        //return _servletRequest.newPushBuilder();
    }

    public String getContextPath()
    {
        return _servletRequest.getContextPath();
    }

    public String getQueryString()
    {
        return _servletRequest.getQueryString();
    }

    public String getRemoteUser()
    {
        return _servletRequest.getRemoteUser();
    }

    public boolean isUserInRole(String role)
    {
        return _servletRequest.isUserInRole(role);
    }

    public Principal getUserPrincipal()
    {
        return _servletRequest.getUserPrincipal();
    }

    public String getRequestedSessionId()
    {
        return _servletRequest.getRequestedSessionId();
    }

    public String getRequestURI()
    {
        return _servletRequest.getRequestURI();
    }

    public StringBuffer getRequestURL()
    {
        return _servletRequest.getRequestURL();
    }

    public String getServletPath()
    {
        return _servletRequest.getServletPath();
    }

    public HttpSession getSession(boolean create)
    {
        return new HttpSessionReverseAdapter(_servletRequest.getSession(create));
    }

    public HttpSession getSession()
    {
        return new HttpSessionReverseAdapter(_servletRequest.getSession());
    }

    public String changeSessionId()
    {
        return _servletRequest.changeSessionId();
    }

    public boolean isRequestedSessionIdValid()
    {
        return _servletRequest.isRequestedSessionIdValid();
    }

    public boolean isRequestedSessionIdFromCookie()
    {
        return _servletRequest.isRequestedSessionIdFromCookie();
    }

    public boolean isRequestedSessionIdFromURL()
    {
        return _servletRequest.isRequestedSessionIdFromURL();
    }

    @Deprecated
    public boolean isRequestedSessionIdFromUrl()
    {
        return _servletRequest.isRequestedSessionIdFromUrl();
    }

    @Override
    public boolean authenticate(jakarta.servlet.http.HttpServletResponse httpServletResponse) throws IOException, jakarta.servlet.ServletException
    {
        try
        {
            return _servletRequest.authenticate(Adapters.adapt(httpServletResponse));
        }
        catch (javax.servlet.ServletException e)
        {
            throw new jakarta.servlet.ServletException(e);
        }
    }

    public void login(String username, String password) throws ServletException
    {
        try
        {
            _servletRequest.login(username, password);
        }
        catch (javax.servlet.ServletException e)
        {
            throw new ServletException(e);
        }
    }

    public void logout() throws ServletException
    {
        try
        {
            _servletRequest.logout();
        }
        catch (javax.servlet.ServletException e)
        {
            throw new jakarta.servlet.ServletException(e);
        }
    }

    public Collection<jakarta.servlet.http.Part> getParts() throws IOException, ServletException
    {
        try
        {
            return _servletRequest.getParts().stream()
                .map(PartReverseAdapter::new)
                .collect(Collectors.toList());
        }
        catch (javax.servlet.ServletException e)
        {
            throw new ServletException(e);
        }
    }

    public jakarta.servlet.http.Part getPart(String name) throws IOException, ServletException
    {
        try
        {
            return _servletRequest.getPart(name);
        }
        catch (javax.servlet.ServletException e)
        {
            throw new ServletException(e);
        }
    }

    @Override
    public <T extends jakarta.servlet.http.HttpUpgradeHandler> T upgrade(Class<T> aClass) throws IOException, jakarta.servlet.ServletException
    {
        return null;
    }

    public Map<String, String> getTrailerFields()
    {
        return _servletRequest.getTrailerFields();
    }

    public boolean isTrailerFieldsReady()
    {
        return _servletRequest.isTrailerFieldsReady();
    }
}
