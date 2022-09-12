package com.example.spring.web.web.filter;

import com.example.spring.web.http.CustomParamStyleRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 过滤器：自定义参数风格请求
 *
 * @author Xingchao Zhang
 */
@Component
@Slf4j
public class CustomParamStyleRequestFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        ServletRequest wrappedRequest = new CustomParamStyleRequest(request);
        filterChain.doFilter(wrappedRequest, response);
    }
}
