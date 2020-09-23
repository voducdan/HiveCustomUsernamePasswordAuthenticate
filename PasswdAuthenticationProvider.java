package org.apache.hive.service.auth;

import javax.security.sasl.AuthenticationException;

public interface PasswdAuthenticationProvider {

  void Authenticate(String user, String password) throws AuthenticationException;
}
