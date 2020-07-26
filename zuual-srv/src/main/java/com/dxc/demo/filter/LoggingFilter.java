/**
 * 
 */
package com.dxc.demo.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * @author aeltayary
 *
 */
@Component
public class LoggingFilter extends ZuulFilter {

	private static final Logger logger =LoggerFactory.getLogger(ZuulFilter.class);
	
	
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		
		HttpServletRequest req= RequestContext.getCurrentContext().getRequest();
		logger.debug("request url :{} ",req.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {
		
		return "pre";
	}

	@Override
	public int filterOrder() {
		
		return 1;
	}

}
