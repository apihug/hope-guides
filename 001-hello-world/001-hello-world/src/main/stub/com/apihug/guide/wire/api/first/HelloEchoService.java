package com.apihug.guide.wire.api.first;

import com.apihug.guide.wire.api.first.request.LoginRequest;
import com.apihug.guide.wire.api.first.response.LoginResponse;
import hope.common.spring.SimpleResultBuilder;
import java.lang.String;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public interface HelloEchoService {
  /**
   * @apiNote
   * 	<p>{@code /guide/hello}
   * 	<p>{@code 你好}
   */
  default void sayHello(SimpleResultBuilder<String> builder, String name) {
    builder.notImplemented();
  }

  /**
   * @apiNote
   * 	<p>{@code /guide/login}
   * 	<p>{@code 登录}
   */
  default void login(SimpleResultBuilder<LoginResponse> builder, LoginRequest loginRequest) {
    builder.notImplemented();
  }
}
