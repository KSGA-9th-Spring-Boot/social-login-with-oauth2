package org.ksga.springboot.oauth2.security.oauth2.user;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@AllArgsConstructor
@Getter
public abstract class OAuth2UserInfo {
    protected Map<String, Object> attributes;

    public abstract String getId();
    public abstract String getName();
    public abstract String getEmail();
    public abstract String getImageUrl();
}

