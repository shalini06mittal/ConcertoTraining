package com.boot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

@EnableAuthorizationServer
@Configuration
public class OauthAuthorizationServer extends AuthorizationServerConfigurerAdapter{

	public OauthAuthorizationServer() {
		System.out.println("auth server");
	}
	@Autowired 
	private PasswordEncoder passwordEncoder;
	
	/**
	 * Spring security oauth exposes two endpoints for checking tokens 
	 * (/oauth/check_token and /oauth/token_key) which are by default protected behind denyAll(). 
	 * tokenKeyAccess() and checkTokenAccess() methods open these endpoints for use.
	 */
	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("security");
		security.tokenKeyAccess("permitAll()")
		.checkTokenAccess("isAuthenticated()").allowFormAuthenticationForClients();
	}
	/**
	 * ClientDetailsServiceConfigurer is used to define an in-memory or JDBC implementation 
	 * of the client details service. we have used in-memory implementation. I
	 * t has the following important attributes:
	 * clientId – (required) the client id.
	 * secret – (required for trusted clients) the client secret, if any.
	 * scope – The scope to which the client is limited. If the scope is undefined or empty (the default), the client is not limited by scope.
	 * authorizedGrantTypes – Grant types that are authorized for the client to use. The default value is empty.
	 * authorities – Authorities that are granted to the client (regular Spring Security authorities).
	 * redirectUris – redirects the user-agent to the client’s redirection endpoint. 
	 * It must be an absolute URL.
	 */
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		System.out.println("clients");
		clients.inMemory().withClient("client1").secret(passwordEncoder.encode("secret"))
		.authorizedGrantTypes("authorization_code")
		.authorities("READ_ONLY_CLIENT")
        .scopes("read_profile_info")
        .resourceIds("oauth2-resource")
        //.autoApprove(true)
        .redirectUris("http://localhost:8081/login");
        //.accessTokenValiditySeconds(120)
        //.refreshTokenValiditySeconds(240000);
	}
}
