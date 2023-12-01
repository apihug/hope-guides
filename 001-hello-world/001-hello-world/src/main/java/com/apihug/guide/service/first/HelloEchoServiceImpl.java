package com.apihug.guide.service.first;

import com.apihug.guide.wire.api.first.HelloEchoService;
import com.apihug.guide.wire.api.first.request.LoginRequest;
import com.apihug.guide.wire.api.first.response.LoginResponse;
import hope.common.guardian.annotation.Version;
import hope.common.meta.annotation.ProtoFrom;
import hope.common.meta.version.Type;
import hope.common.spring.SimpleResultBuilder;
import hope.common.spring.audit.AuditContext;
import hope.common.spring.audit.AuditContextSupplier;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

/**
 * hello world
 */
@Service
@Version(
    version = "0.0.1",
    type = Type.ADD,
    timestamp = "2023-12-01 15:43:06"
)
@ProtoFrom("com/apihug/guide/proto/api/first/hello.proto")
public class HelloEchoServiceImpl implements HelloEchoService {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected final AuditContextSupplier _supplier;

  public HelloEchoServiceImpl(final ObjectProvider<AuditContextSupplier> _supplier) {
    this._supplier = _supplier.getIfAvailable(() -> AuditContextSupplier.EMPTY);
  }

  /**
   * {@inheritDoc}
   *
   */
  @Override
  public void sayHello(final SimpleResultBuilder<String> builder, final String name) {

    builder.notImplemented();

  }

  /**
   * {@inheritDoc}
   *
   */
  @Override
  public void login(final SimpleResultBuilder<LoginResponse> builder,
      final LoginRequest loginRequest) {

    builder.notImplemented();

  }

  protected AuditContext<Long, Long> auditContext() {
    return _supplier.get();
  }
}
