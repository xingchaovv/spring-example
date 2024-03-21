package example.web.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.AbstractRequestLoggingFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 接口请求日志记录
 */
@Component
@Slf4j
@Order(1)
public class WebRequestLogFilter extends AbstractRequestLoggingFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        setIncludeQueryString(true);
        setIncludeClientInfo(true);
        setIncludePayload(true);
        setIncludeHeaders(false);
        setMaxPayloadLength(1024 * 1024);
        super.doFilterInternal(request, response, filterChain);
    }

    @Override
    protected void beforeRequest(HttpServletRequest request, String message) {
        String requestURI = request.getRequestURI();
        log.info("准备处理请求，请求路径:{}，请求详情: {}", requestURI, message);
    }

    @Override
    protected void afterRequest(HttpServletRequest request, String message) {
        String requestURI = request.getRequestURI();
        log.info("完成处理请求，请求路径:{}，请求详情: {}", requestURI, message);
    }
}
