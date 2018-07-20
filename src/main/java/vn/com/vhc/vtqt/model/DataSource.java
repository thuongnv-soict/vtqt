package vn.com.vhc.vtqt.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class DataSource {
	
	private String address;
	private String port;
	private String sid;
	private String userdb;
	private String password;
	
	public DataSource() {
		super();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getUserdb() {
		return userdb;
	}

	public void setUserdb(String userdb) {
		this.userdb = userdb;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public DataSource(String address, String port, String sid, String userdb, String password) {
		super();
		this.address = address;
		this.port = port;
		this.sid = sid;
		this.userdb = userdb;
		this.password = password;
	}
	
}