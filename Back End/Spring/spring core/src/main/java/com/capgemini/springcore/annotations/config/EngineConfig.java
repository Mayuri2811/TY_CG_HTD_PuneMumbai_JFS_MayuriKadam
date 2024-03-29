package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotations.beans.Isuzu;
import com.capgemini.springcore.annotations.beans.VolksWagon;
import com.capgemini.springcore.interfaces.Engine;

@Configuration
public class EngineConfig {

@Bean(name="isuzu")
@Primary
public Engine getIsuzu() {
	return new Isuzu();
}	

@Bean(name="vw")
public Engine getVW() {
	return new VolksWagon();
}
}
