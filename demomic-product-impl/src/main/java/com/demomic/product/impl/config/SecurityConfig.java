package com.demomic.product.impl.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    /*public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorize -> authorize
                .mvcMatchers(HttpMethod.GET, "/", "/products/**")
                .permitAll()
                .anyRequest()
                .authenticated());

        http.oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
        http.sessionManagement(sessionManagement -> sessionManagement
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        http.csrf(AbstractHttpConfigurer::disable);

        return http.build();
    }*/
}
