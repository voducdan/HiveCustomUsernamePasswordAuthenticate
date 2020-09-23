package org.apache.hive.service.auth;

import java.util.Hashtable;
import javax.security.sasl.AuthenticationException;
//import org.apache.hive.service.auth.PasswdAuthenticationProvider;

public class CustomAuthenticator implements PasswdAuthenticationProvider {

	Hashtable<String, String> store = null;

	public CustomAuthenticator () {
		store = new Hashtable<String, String>();
		store.put("hadoop", "1");
	}

	@Override
	public void Authenticate(String user, String  password)
		throws AuthenticationException {

		String storedPasswd = store.get(user);

		if (storedPasswd != null && storedPasswd.equals(password))
			return;

		throw new AuthenticationException("SampleAuthenticator: Error validating user");
	}

}



