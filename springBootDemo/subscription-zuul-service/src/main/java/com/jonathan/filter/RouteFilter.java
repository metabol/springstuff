package com.jonathan.filter;

/**
 * Basic integration tests for zuul-service  application.
 * @since 2018/06/18
 * @version 0.0.1-SNAPSHOT
 * @author Jonathan Nmaju
 */


import com.netflix.zuul.ZuulFilter;

public class RouteFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "route";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		System.out.println("Using Route Filter");

		return null;
	}

}