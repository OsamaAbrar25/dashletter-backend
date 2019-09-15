package com.dashletter.dashletterbackend.Authentication;

public class SecurityConstants {
    static final String SECRET = "SecretKeyToGenJWTs";
    static final long EXPIRATION_TIME = 864_000_000; // 10 days
    static final String TOKEN_PREFIX = "Bearer ";
    static final String HEADER_STRING = "Authorization";
    public static final String USER_SIGN_UP_URL = "/users/sign-up";
    public static final String MERCHANT_SIGN_UP_URL = "/merchants/sign-up";
}
