package com.ms.project.portafolio.app.zuul.filters;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import lombok.extern.slf4j.Slf4j;

/**
 * @author German Vazquez Renteria Date: 19 jul. 2019 Package Name:
 *         com.ms.project.portafolio.app.zuul.filters Project Name:
 *         ms-zuul-server
 */
@Component
@Slf4j
public class PostFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();

		log.info("POST - {} request to {}", request.getMethod(), request.getRequestURL());
		return null;

	}

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
