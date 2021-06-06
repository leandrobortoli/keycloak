package org.keycloak.representations;

import org.keycloak.TokenCategory;

public class AuthorizationToken extends JsonWebToken{

    @Override
    public TokenCategory getCategory() {
        return TokenCategory.AUTHORIZATION;
    }
}
