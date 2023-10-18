package example.web.util;

import com.google.common.base.CaseFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.*;

/**
 * 转换下划线参数为驼峰风格的 HttpServletRequest 实现
 *
 * @author Xingchao Zhang
 */
public class CamelParamRequestWrapper extends HttpServletRequestWrapper {

    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request The request to wrap
     * @throws IllegalArgumentException if the request is null
     */
    public CamelParamRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {
        if (super.getParameter(name) != null) {
            return super.getParameter(name);
        }
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
        parameterMap.forEach((name, value) -> lowerCamelMap.put((CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, name)), value));
        return lowerCamelMap;
    }

    @Override
    public String[] getParameterValues(String name) {
        if (super.getParameterValues(name) != null) {
            return super.getParameterValues(name);
        }
        return super.getParameterValues(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name));
    }
}
