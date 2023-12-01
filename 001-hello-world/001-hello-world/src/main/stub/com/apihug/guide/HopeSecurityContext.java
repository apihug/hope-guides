package com.apihug.guide;

import com.apihug.guide.wire.api.HopeApiModule;
import hope.common.spring.security.SecurityContext;
import java.lang.Override;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Component
@Generated("H.O.P.E. Infra Team")
public class HopeSecurityContext extends SecurityContext {
  @Override
  protected HopeApiModule module() {
    return new HopeApiModule();
  }
}
