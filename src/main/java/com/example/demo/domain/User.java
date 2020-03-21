
package com.example.demo.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class User implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;
    
    @Size(min = 3, max = 20)
    @Column(name = "username", nullable = false, unique = true)
    @Pattern(regexp=".+@.+\\..+")
    private String username;
    
    @Size(min = 6, max = 20)
    @Column(name = "password", nullable = false)
    private String password;
    
    @Column(name = "name", nullable = false)
    private String name;
   
    @Column(name = "lastName", nullable = false)
    private String lastName;
    
    public User() {
    	
    }

	public User(long id,  @Size(min = 3, max = 20) @Pattern(regexp = ".+@.+\\..+") String username,
			 @Size(min = 6, max = 20) String password,  String name,  String lastName) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setEmail(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		 SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority("USER");
		    List<SimpleGrantedAuthority> list = new ArrayList<SimpleGrantedAuthority>();
		    list.add(simpleGrantedAuthority);
		    return list;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
    

}
