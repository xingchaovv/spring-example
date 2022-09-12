package com.example.spring.web.http;

import com.google.common.base.CaseFormat;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.*;

/**
 * 自定义参数风格请求（HttpServletRequest 实现）
 *
 * @author Xingchao Zhang
 */
@Slf4j
public class CustomParamStyleRequest extends HttpServletRequestWrapper {

    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request The request to wrap
     * @throws IllegalArgumentException if the request is null
     */
    public CustomParamStyleRequest(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {
        return super.getParameter(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name));
    }

    @Override
    public Enumeration<String> getParameterNames() {
        Collection<String> camelNames = new ArrayList<>();
        Enumeration<String> parameterNames = super.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            camelNames.add(
                    CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, parameterNames.nextElement())
            );
        }
        return Collections.enumeration(camelNames);
    }

    @Override
    public Map<String, String[]> getParameterMap() {
        Map<String, String[]> parameterMap = super.getParameterMap();
        Map<String, String[]> lowerCamelMap = new HashMap<>(parameterMap.size());
        parameterMap.forEach((name, value) -> {
            lowerCamelMap.put((CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, name)), value);
        });
        return lowerCamelMap;
    }

    @Override
    public String[] getParameterValues(String name) {
        return super.getParameterValues(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name));
    }

}
