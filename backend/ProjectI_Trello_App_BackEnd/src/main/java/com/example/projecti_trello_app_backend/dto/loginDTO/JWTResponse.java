package com.example.projecti_trello_app_backend.dto.loginDTO;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JWTResponse {

    private String accessToken;

    private String refreshToken;

    private String tokenType ;

    private Date issuedAt;

    private Date expireAt;

}
