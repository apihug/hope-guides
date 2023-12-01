package com.apihug.guide.wire.api.first;

import com.apihug.guide.wire.api.first.request.LoginRequest;
import com.apihug.guide.wire.api.first.response.LoginResponse;
import hope.common.api.Result;
import hope.common.service.annotation.Group;
import hope.common.spring.SimpleResultBuilder;
import hope.common.spring.security.RunTimeSecurityFactory;
import hope.common.spring.security.SecurityManager;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import java.lang.String;
import java.lang.Throwable;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Generated("H.O.P.E. Infra Team")
public class HelloEchoController {
  protected final HelloEchoService _service;

  protected final Logger logger = LoggerFactory.getLogger(getClass());

  public HelloEchoController(HelloEchoService service) {
    this._service = service;
  }

  @GetMapping("/guide/hello")
  @Group(
      group = hope.common.service.api.Group.TENANT
  )
  @Operation(
      description = "你好",
      tags = "test"
  )
  public ResponseEntity<Result<String>> sayHello(@RequestParam(name = "name") final String name) {
    final SimpleResultBuilder<String> builder = new SimpleResultBuilder<String>();

    try {
    	security().check("/guide/hello","name",name );
    	_service.sayHello(builder,name);
    	return builder.done();
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[sayHello] PATH:[/guide/hello]",exception);
    	throw exception;
    }
  }

  @PostMapping("/guide/login")
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "登录",
      tags = "test"
  )
  public ResponseEntity<Result<LoginResponse>> login(
      @RequestBody @Valid LoginRequest loginRequest) {
    final SimpleResultBuilder<LoginResponse> builder = new SimpleResultBuilder<LoginResponse>();
    loginRequest = loginRequest == null ? new LoginRequest(): loginRequest;

    try {
    	security().check("/guide/login","loginRequest",loginRequest );
    	_service.login(builder,loginRequest);
    	return builder.done();
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[login] PATH:[/guide/login]",exception);
    	throw exception;
    }
  }

  public SecurityManager security() {
    return RunTimeSecurityFactory.manager();
  }
}
