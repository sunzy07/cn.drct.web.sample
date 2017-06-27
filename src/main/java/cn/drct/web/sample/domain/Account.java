package cn.drct.web.sample.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author sunzy
 * 
 */
@Entity
public class Account {
	@Id
	@GeneratedValue
	private Long id;

	private String username;
	
	private String password;

	private String phone;

	private String email;

	private String nickname;

	private int sex;

	private String address;
	
	private String roles="wx";

	private String validCode;
	
	private long registerTime;

	public String getRoles() {
		return roles;
	}

	/**
	 * 默认角色是微信wx
	 * 多个角色用“，”分开
	 * 类型： 管理员admin、微信wx、部署deploy、
	 * @param roles
	 */
	public void setRoles(String roles) {
		this.roles = roles;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getValidCode() {
		return validCode;
	}

	public void setValidCode(String validCode) {
		this.validCode = validCode;
	}

	public long getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(long registerTime) {
		this.registerTime = registerTime;
	}
	
	public static List<String> getRoles(Account account){
		List<String> roles = new ArrayList<String>();
		if(account.getRoles()==null||account.getRoles().trim().length()==0){
			roles.add("wx");
		}else{
			String[] rolesStr = account.getRoles().split(",|，");
			for (String role : rolesStr) {
				if(role!=null&&role.trim().length()>0){
					roles.add(role);
				}
			}
		}
		return  roles;
	}
	
	public boolean hasRole(String role){
		if(roles!=null){
			return roles.contains(role);
		}
		return false;
	}

}
