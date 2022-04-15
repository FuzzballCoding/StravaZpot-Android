package com.sweetzpot.stravazpot.authenticaton.model;

import com.google.gson.annotations.SerializedName;
import com.sweetzpot.stravazpot.athlete.model.Athlete;
import com.sweetzpot.stravazpot.authenticaton.model.Token;

import java.util.Date;

public class LoginResult {
    @SerializedName("expires_at") private long expiresAt;
    @SerializedName("expires_in") private long expiresIn;
    @SerializedName("refresh_token") private String refreshToken;
    @SerializedName("access_token") private String token;
    @SerializedName("athlete") private Athlete athlete;

    public Token getToken() {
        return new Token(token);
    }
    
    public long getExpiresAt() {
        return expiresAt;
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public String getTokenValue() {
	    return token;
    }

    public Athlete getAthlete() {
        return athlete;
    }
}
