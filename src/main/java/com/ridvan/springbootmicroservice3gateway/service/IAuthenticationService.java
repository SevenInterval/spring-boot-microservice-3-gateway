package com.ridvan.springbootmicroservice3gateway.service;

import com.ridvan.springbootmicroservice3gateway.model.User;

public interface IAuthenticationService {
    String signInAndReturnJWT(User signInRequest);
}
