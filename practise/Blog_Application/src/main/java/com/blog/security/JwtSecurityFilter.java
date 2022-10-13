package com.blog.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import com.blog.execptions.ResourceNotFoundException;

@Component
public class JwtSecurityFilter extends OncePerRequestFilter {
	
	@Autowired
	private JwtTokenProvider tokenProvider;

	@Autowired
	private CustomDetailService customDetailService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		 // get JWT (token) from http request
        String token = getJWTfromRequest(request);
		


			try {
				if(StringUtils.hasText(token) && tokenProvider.validateJwtToken(token) ) {
					
					String username = tokenProvider.getUsernameFromToken(token);
					
					UserDetails userDetails = customDetailService.loadUserByUsername(username);
					
					UsernamePasswordAuthenticationToken authToken =
							new UsernamePasswordAuthenticationToken( userDetails,null,userDetails.getAuthorities());
					
					authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
					
					SecurityContextHolder.getContext().setAuthentication(authToken);
					
					
				}
			} catch (UsernameNotFoundException | ResourceNotFoundException e) {
				e.printStackTrace();
			}
		
		filterChain.doFilter(request, response);

		
	}

	   // Bearer <accessToken>
    private String getJWTfromRequest(HttpServletRequest request){
            String bearerToken = request.getHeader("Authorization");
            if(StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")){
                return bearerToken.substring(7, bearerToken.length());
            }
            return null;
    }
}
