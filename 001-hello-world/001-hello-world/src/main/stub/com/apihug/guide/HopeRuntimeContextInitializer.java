package com.apihug.guide;

import com.apihug.guide.wire.api.HopeApiModule;
import hope.common.Builder;
import hope.common.meta.artifact.Artifact;
import hope.common.meta.cloud.Dependency;
import hope.common.meta.project.Project;
import hope.common.meta.project.ProjectStub;
import hope.common.runtime.RuntimeContext;
import hope.common.spring.RuntimeContextInitializer;
import java.lang.Override;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Component
@Generated("H.O.P.E. Infra Team")
public class HopeRuntimeContextInitializer extends RuntimeContextInitializer {
  @Override
  protected void init() {
    RuntimeContext runTimeCtx = RuntimeContext.INSTANCE;
    runTimeCtx.setDomain("hope");
    runTimeCtx.setProto(new HopeApiModule().project());
    runTimeCtx.setProject(new Builder<Project>() {
      @Override
      public Project build() {
        Project res  = new Project();
        res.setName("001-hello-world");
        res.setDescription("demo for the level-01 hello world case");
        res.setPackageName("com.apihug.guide");
        res.setArtifact(new Builder<Artifact>() {
          @Override
          public Artifact build() {
            Artifact res  = new Artifact();
            res.setGroupId("com.apihug");
            res.setArtifactId("001-hello-world");
            res.setVersion("0.0.4-RELEASE");
            return res;
          }
        }.build());
        ProjectStub stub  = new ProjectStub();
        Dependency dependency  = new Dependency();
        stub.setProto(dependency);
        dependency.setArtifact(new Builder<Artifact>() {
          @Override
          public Artifact build() {
            Artifact res  = new Artifact();
            res.setGroupId("com.apihug.guide");
            res.setArtifactId("001-hello-world-proto");
            res.setVersion("0.0.1");
            return res;
          }
        }.build());
        res.setStub(stub);
        return res;
      }
    }.build());
    runTimeCtx.setStubBuildTime("2023-12-01 15:43:06");
  }
}
