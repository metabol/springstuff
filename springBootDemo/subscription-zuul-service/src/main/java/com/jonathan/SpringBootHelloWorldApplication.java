package com.jonathan;

/**
 * Basic integration tests for zuul-service  application.
 * @since 2018/06/18
 * @version 0.0.1-SNAPSHOT
 * @author Jonathan Nmaju
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.jonathan.filter.ErrorFilter;
import com.jonathan.filter.PostFilter;
import com.jonathan.filter.PreFilter;
import com.jonathan.filter.RouteFilter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}