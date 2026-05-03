package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;
import java.io.IOException;

@WebFilter("/home")
public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest  httpReq  = (HttpServletRequest)  request;
        HttpServletResponse httpResp = (HttpServletResponse) response;

        HttpSession session = httpReq.getSession(false);

        boolean connecte = (session != null)
                        && (session.getAttribute("username") != null);

        if (connecte) {
            chain.doFilter(request, response);
        } else {
            httpResp.sendRedirect(httpReq.getContextPath() + "/login");
        }
    }

    @Override
    public void destroy() {
    }
}