package Facade.context.service.impl;

import Facade.context.service.JwtService;

import java.util.UUID;

public class JwtServiceImpl implements JwtService {
    private final static String JWT_PREFIX = "oqwjgifjwigweijqwoifnqwjdq";

    @Override
    public String generateToken() {
        String uuid = UUID.randomUUID().toString();
        return JWT_PREFIX+uuid;
    }
}
