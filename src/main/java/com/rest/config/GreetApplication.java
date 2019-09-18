package com.rest.config;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.rest.resource.GreetResource;
@ApplicationPath("/api/*")
public class GreetApplication extends Application {

	@Override
	public Set<Object> getSingletons() {
		Set<Object> set=new HashSet<Object>();
		set.add(new GreetResource());
		return set;
	}
	
	/*@Override
	public Map<String, Object> getProperties() {
		return super.getProperties();
	}*/
}
