package com.apihug.guide.infra.security;

import hope.common.service.runtime.Resource;
import hope.common.spring.security.SecurityContext;
import hope.common.spring.security.SecurityCustomizer;
import hope.common.spring.security.checker.Checker;
import java.lang.Override;
import java.util.function.Supplier;
import org.springframework.stereotype.Component;

@Component
public class HopeSecurityCustomizer implements SecurityCustomizer {
  @Override
  public void all(SecurityContext securityContext) {
    // TODO add your global security customized overwrite here;
  }

  @Override
  public Supplier path(SecurityContext securityContext, Resource resource,
      Supplier<Checker> predefined, boolean isDefault) {
    // TODO add your path security customized overwrite here;
    return predefined;
  }
}
