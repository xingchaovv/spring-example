package com.example.spring.web.web.servlet;

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

    private EnumerationWrapper enumerationWrapper;

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
        String value = super.getParameter(name);
        if (value != null) {
            return value;
        }
        value = super.getParameter(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name));
        if (value != null) {
            return value;
        }
        return super.getParameter(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, name));
    }

    private static class EnumerationWrapper implements Enumeration<String> {

        private final Enumeration<String> enumeration;

        public EnumerationWrapper(Enumeration<String> enumeration) {
            this.enumeration = enumeration;
        }

        @Override
        public boolean hasMoreElements() {
            return enumeration.hasMoreElements();
        }

        @Override
        public String nextElement() {
            String str = enumeration.nextElement();
            if (str == null) {
                return null;
            }
            if (str.contains("-")) {
                return CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, str);
            }
            if (str.contains("_")) {
                return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, str);
            }
            return str;
        }
    }

    @Override
    public Enumeration<String> getParameterNames() {
        if (enumerationWrapper == null) {
            enumerationWrapper = new EnumerationWrapper(super.getParameterNames());
        }
        return enumerationWrapper;
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
        String[] values = super.getParameterValues(name);
        if (values != null) {
            return values;
        }
        values = super.getParameterValues(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name));
        if (values != null) {
            return values;
        }
        return super.getParameterValues(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, name));
    }

}
