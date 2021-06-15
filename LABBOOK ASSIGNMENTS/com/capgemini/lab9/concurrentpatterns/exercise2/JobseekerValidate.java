package com.capgemini.lab9.concurrentpatterns.exercise2;

public class JobseekerValidate 
{
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public boolean usernameValidate(String username)
	{
		int len=username.length();
		if((len>=12)&&((username.substring(len-4)).equals("_job")))
		{
			return true;
		}
		return false;
	}
}
