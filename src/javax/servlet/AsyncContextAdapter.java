package javax.servlet;

import jakarta.servlet.AsyncListener;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class AsyncContextAdapter implements AsyncContext
{
    private final jakarta.servlet.AsyncContext _asyncContext;

    public AsyncContextAdapter(jakarta.servlet.AsyncContext asyncContext)
    {
        _asyncContext = asyncContext;
    }

    @Override
    public ServletRequest getRequest()
    {
        return _asyncContext.getRequest();
    }

    @Override
    public ServletResponse getResponse()
    {
        return _asyncContext.getResponse();
    }

    @Override
    public boolean hasOriginalRequestAndResponse()
    {
        return _asyncContext.hasOriginalRequestAndResponse();
    }

    @Override
    public void dispatch()
    {
        _asyncContext.dispatch();
    }

    @Override
    public void dispatch(String s)
    {
        _asyncContext.dispatch(s);
    }

    @Override
    public void dispatch(ServletContext servletContext, String s)
    {
        _asyncContext.dispatch(servletContext, s);
    }

    @Override
    public void complete()
    {
        _asyncContext.complete();
    }

    @Override
    public void start(Runnable runnable)
    {
        _asyncContext.start(runnable);
    }

    @Override
    public void addListener(AsyncListener asyncListener)
    {
        _asyncContext.addListener(asyncListener);
    }

    @Override
    public void addListener(AsyncListener asyncListener, ServletRequest servletRequest, ServletResponse servletResponse)
    {
        _asyncContext.addListener(asyncListener, servletRequest, servletResponse);
    }

    @Override
    public <T extends AsyncListener> T createListener(Class<T> aClass) throws ServletException
    {
        return _asyncContext.createListener(aClass);
    }

    @Override
    public void setTimeout(long l)
    {
        _asyncContext.setTimeout(l);
    }

    @Override
    public long getTimeout()
    {
        return _asyncContext.getTimeout();
    }
}
