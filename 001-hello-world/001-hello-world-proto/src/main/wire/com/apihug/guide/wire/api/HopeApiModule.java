package com.apihug.guide.wire.api;

import hope.common.meta.artifact.Artifact;
import hope.common.meta.project.Project;
import hope.common.meta.project.ProjectStatus;
import hope.common.service.Module;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public class HopeApiModule implements Module<HopeApiCollector> {
  protected final Project project;

  protected final HopeApiCollector api;

  public HopeApiModule() {
    project =  new Project();
    api =  new HopeApiCollector();
    project.setName("001-hello-world-proto");
    project.setDescription("apihug guide first demo proto");
    project.setDomain("hope");
    project.setPackageName("com.apihug.guide");
    project.setApplication("001-hello-world");
    project.setIdentifier("001-hello-world-proto");
    Artifact artifact = new Artifact();
    project.setArtifact(artifact);
    artifact.setArtifactId("001-hello-world-proto");
    artifact.setGroupId("com.apihug");
    artifact.setVersion("0.0.4-RELEASE");
    ProjectStatus status = new ProjectStatus();
    project.setStatus(status);
    status.setCreatedTimestamp("2023-01-01");
    status.setCreatedBy("Aaron");
  }

  @Override
  public Project project() {
    return project;
  }

  @Override
  public HopeApiCollector service() {
    return api;
  }

  @Override
  public String version() {
    return "0.0.4-RELEASE";
  }
}
