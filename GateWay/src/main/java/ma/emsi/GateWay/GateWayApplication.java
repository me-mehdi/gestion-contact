package ma.emsi.GateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
@SpringBootApplication
@EnableDiscoveryClient
public class GateWayApplication {
	@Bean
	DiscoveryClientRouteDefinitionLocator routesDynamique(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dlp){
	    return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);
	}


	public static void main(String[] args) {
		SpringApplication.run(GateWayApplication.class, args);
	}

}
