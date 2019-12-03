package javax.servlet;

public interface ServletContextListener extends jakarta.servlet.ServletContextListener
{
    @Override
    default void contextInitialized(jakarta.servlet.ServletContextEvent sce)
    {
        contextInitialized(new ServletContextEvent(new ServletContextAdapter(sce.getServletContext())));
    }

    default void contextInitialized(ServletContextEvent sce)
    {
    }

    @Override
    default void contextDestroyed(jakarta.servlet.ServletContextEvent sce)
    {
        contextDestroyed(new ServletContextEvent(new ServletContextAdapter(sce.getServletContext())));
    }

    default void contextDestroyed(ServletContextEvent sce)
    {
    }
}
