package com.sandeep.cloudconnect;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudconnectorApplication {

	@Autowired
	private JdbcTemplate jdbcTemp;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudconnectorApplication.class, args);
	}
	
	@RequestMapping(path="/testDB",produces={"application/json"})
	public List<Album> testDB(){
		System.out.println("===================== Test SYSOUT ================");
		List<Album> listAlbm =  jdbcTemp.query("select * from album",new BeanPropertyRowMapper(Album.class));
		System.out.println("============="+listAlbm.size());
		return listAlbm;
	}
}
