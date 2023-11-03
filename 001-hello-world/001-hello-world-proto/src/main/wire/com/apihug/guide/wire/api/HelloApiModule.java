package com.apihug.guide.wire.api;

import hope.common.meta.artifact.Artifact;
import hope.common.meta.project.Project;
import hope.common.meta.project.ProjectStatus;
import hope.common.service.Module;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public class HelloApiModule implements Module<HelloApiCollector> {
  protected final Project project;

  protected final HelloApiCollector api;

  public HelloApiModule() {
    project =  new Project();
    api =  new HelloApiCollector();
    project.setName("001-hello-world-proto");
    project.setDescription("Hope Guide Hello World");
    project.setDomain("hello");
    project.setPackageName("com.apihug.guide");
    project.setApplication("001-hello-world-proto");
    project.setIdentifier("001-hello-world-proto");
    Artifact artifact = new Artifact();
    project.setArtifact(artifact);
    artifact.setArtifactId("001-hello-world-proto");
    artifact.setGroupId("com.apihug");
    artifact.setVersion("0.0.4-RELEASE");
    ProjectStatus status = new ProjectStatus();
    project.setStatus(status);
    status.setCreatedTimestamp("2023-01-09");
    status.setUpdatedBy("aaron");
  }

  @Override
  public Project project() {
    return project;
  }

  @Override
  public HelloApiCollector service() {
    return api;
  }

  @Override
  public String version() {
    return "0.0.4-RELEASE";
  }
}
