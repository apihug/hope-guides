package com.apihug.guide.wire.api.first.response;

import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "登录请求"
)
@ProtoFrom("com/apihug/guide/proto/api/first/response/response.proto")
public class LoginResponse {
  private static final long serialVersionUID = 0L;

  @NotBlank
  @Email
  @Schema(
      description = "邮箱",
      required = true,
      example = "jake@bigger.com"
  )
  protected String email;

  @NotBlank
  @Schema(
      description = "token",
      required = true,
      example = "32321x"
  )
  protected String token;

  public String getEmail() {
    return email;
  }

  public LoginResponse setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getToken() {
    return token;
  }

  public LoginResponse setToken(String token) {
    this.token = token;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder();
    builder.append(", email=").append(email);
    builder.append(", token=").append(token);
    return builder.replace(0, 2, "LoginResponse{").append('}').toString();
  }
}
