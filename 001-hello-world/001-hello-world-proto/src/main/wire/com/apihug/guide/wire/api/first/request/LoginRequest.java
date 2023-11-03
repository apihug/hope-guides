package com.apihug.guide.wire.api.first.request;

import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "登录请求"
)
@ProtoFrom("com/apihug/guide/proto/api/first/request/request.proto")
public class LoginRequest {
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
      description = "密码",
      required = true,
      example = "123456"
  )
  protected String password;

  protected Boolean rememberMe;

  @Schema(
      description = "租户ID-可选(非己租户则忽略)，前端cookie获取或用户设置,如无，直接进入个人工作间主页",
      example = "42"
  )
  protected Long tenantId;

  public String getEmail() {
    return email;
  }

  public LoginRequest setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public LoginRequest setPassword(String password) {
    this.password = password;
    return this;
  }

  public Boolean getRememberMe() {
    return rememberMe;
  }

  public LoginRequest setRememberMe(Boolean rememberMe) {
    this.rememberMe = rememberMe;
    return this;
  }

  public Long getTenantId() {
    return tenantId;
  }

  public LoginRequest setTenantId(Long tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder();
    builder.append(", email=").append(email);
    builder.append(", password=").append(password);
    builder.append(", rememberMe=").append(rememberMe);
    builder.append(", tenantId=").append(tenantId);
    return builder.replace(0, 2, "LoginRequest{").append('}').toString();
  }
}
