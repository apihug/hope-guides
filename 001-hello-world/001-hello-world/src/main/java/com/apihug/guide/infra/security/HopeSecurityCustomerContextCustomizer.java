package com.apihug.guide.infra.security;

import hope.common.spring.security.Customer;
import hope.common.spring.security.context.SecurityCustomerContextCustomizer;
import hope.common.spring.security.internal.CustomerLongIdentifyLongTenant;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import org.springframework.stereotype.Component;

@Component
public class HopeSecurityCustomerContextCustomizer implements SecurityCustomerContextCustomizer<HopeCustomer> {
  @Override
  public HopeCustomer create() {
    return new HopeCustomer();
  }

  @Override
  public Customer anonymous() {
    return CustomerLongIdentifyLongTenant.anonymous();
  }

  @Override
  public Class tenantClz() {
    return Long.class;
  }

  @Override
  public Class identifierClz() {
    return Long.class;
  }
}
