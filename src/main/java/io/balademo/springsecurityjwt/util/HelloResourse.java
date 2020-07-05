package io.balademo.springsecurityjwt.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.balademo.springsecurityjwt.models.AuthendicationRequest;
import io.balademo.springsecurityjwt.service.MyUserDetailService;
@RestController
public class HelloResourse {
	@Autowired
	private MyUserDetailService userDetailsService;
@Autowired
private AuthenticationManager authenticationManager;
@Autowired
private JwtUtil jwtTokenUtil;
	@RequestMapping({"/hello"})
	public String hello() {
		
		return "Hello WOrld";
	}
@RequestMapping(value="/authendication",method=RequestMapping.POST)
public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthendicationRequest authendicationRequest) throws Exception{
	try{authenticationManager.authenticate(authenticationRequest.getUsername(),authenticationRequest.getpassword())
};
}
catch(BadCredentialsException e) {
	throw new Exception("Incorrect Username or Password",e);
}
final UserDetailsService userDetails=UserDetailsService;
.loadUserByUsername(authenticationRequest.getUsername());
final String jwt=jwtTokenUtil.generateToken(userDetails);
return ResponseEntity.ok(new AuthenticationResponse(jwt));
}
