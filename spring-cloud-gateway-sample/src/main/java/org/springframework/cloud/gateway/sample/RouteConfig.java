package org.springframework.cloud.gateway.sample;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RouteConfig
 *
 * @author caoshijia
 * @version 1.0
 * @date 2021/11/15 16:47
 * @description
 */
@Configuration
public class RouteConfig {

	// @Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r -> r.host("").and().path("")
					.filters(f -> {
						f.addRequestHeader("","");
						f.addResponseHeader("","");
						return f;
					})
					.uri(""))
				.route(r -> r.host("").and().path("")
					.filters(f -> f.addRequestHeader("",""))
					.uri(""))
				.build();
	}
}
