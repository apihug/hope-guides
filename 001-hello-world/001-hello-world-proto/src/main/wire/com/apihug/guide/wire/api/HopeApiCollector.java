package com.apihug.guide.wire.api;

import hope.common.Builder;
import hope.common.service.Collector;
import hope.common.service.api.Component;
import hope.common.service.api.ComponentItem;
import hope.common.service.api.Validation;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.SpecVersion;
import io.swagger.v3.oas.models.callbacks.Callback;
import io.swagger.v3.oas.models.examples.Example;
import io.swagger.v3.oas.models.headers.Header;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.links.Link;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.parameters.RequestBody;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.tags.Tag;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public final class HopeApiCollector implements Collector<OpenAPI, Schema, ApiResponse, Parameter, Example, RequestBody, Header, SecurityScheme, Link, Callback, Tag> {
  public static final String COMPONENTS_SCHEMAS_REF = Components.COMPONENTS_SCHEMAS_REF;

  protected final OpenAPI api;

  protected final Map<String, Map> servicesContext = new LinkedHashMap();

  protected final Map<String, Map> pathsContext = new LinkedHashMap();

  protected final Map<String, Schema> schemas = new LinkedHashMap();

  protected final Map<String, ApiResponse> responses = new LinkedHashMap();

  protected final Map<String, Parameter> parameters = new LinkedHashMap();

  protected final Map<String, Example> examples = new LinkedHashMap();

  protected final Map<String, RequestBody> requestBodies = new LinkedHashMap();

  protected final Map<String, Header> headers = new LinkedHashMap();

  protected final Map<String, SecurityScheme> securitySchemes = new LinkedHashMap();

  protected final Map<String, Link> links = new LinkedHashMap();

  protected final Map<String, Callback> callbacks = new LinkedHashMap();

  protected final Map<String, Tag> tags = new LinkedHashMap();

  protected final Map<String, Object> extensions = new LinkedHashMap();

  protected final Map<String, String> pathClzMap = new HashMap();

  protected final Map<String, Set<String>> clzPathMap = new HashMap();

  protected final Map<String, Map> clzContextMap = new LinkedHashMap();

  protected final Map<String, Component> componentMap = new LinkedHashMap();

  public HopeApiCollector() {
    this.api =  new OpenAPI();
    Components components = new Components();
    components.setSchemas(schemas);
    components.responses(responses);
    components.setParameters(parameters);
    components.setRequestBodies(requestBodies);
    components.setHeaders(headers);
    components.setExamples(examples);
    components.setSecuritySchemes(securitySchemes);
    components.setLinks(links);
    components.setCallbacks(callbacks);
    components.setExtensions(extensions);
    api.components(components);
    api.setPaths(new Paths());
    _init();
  }

  @Override
  public OpenAPI getApi() {
    return api;
  }

  @Override
  public Map<String, Map> getServicesContext() {
    return servicesContext;
  }

  @Override
  public Map<String, Map> getPathsContext() {
    return pathsContext;
  }

  @Override
  public Map<String, Schema> getSchemas() {
    return schemas;
  }

  @Override
  public Map<String, ApiResponse> getResponses() {
    return responses;
  }

  @Override
  public Map<String, Parameter> getParameters() {
    return parameters;
  }

  @Override
  public Map<String, Example> getExamples() {
    return examples;
  }

  @Override
  public Map<String, RequestBody> getRequestBodies() {
    return requestBodies;
  }

  @Override
  public Map<String, Header> getHeaders() {
    return headers;
  }

  @Override
  public Map<String, SecurityScheme> getSecuritySchemes() {
    return securitySchemes;
  }

  @Override
  public Map<String, Link> getLinks() {
    return links;
  }

  @Override
  public Map<String, Callback> getCallbacks() {
    return callbacks;
  }

  @Override
  public Map<String, Tag> getTags() {
    return tags;
  }

  @Override
  public Map<String, Object> getExtensions() {
    return extensions;
  }

  @Override
  public Map<String, String> getPathClzMap() {
    return pathClzMap;
  }

  @Override
  public Map<String, Set<String>> getClzPathMap() {
    return clzPathMap;
  }

  @Override
  public Map<String, Map> getClzContextMap() {
    return clzContextMap;
  }

  @Override
  public Map<String, Component> getComponentMap() {
    return componentMap;
  }

  public void registerPathClz(String path, String clz) {
    pathClzMap.put(path, clz);
    clzPathMap.computeIfAbsent(clz, s -> new LinkedHashSet<>()).add(path);
  }

  private final void _build_component_com_apihug_guide_wire_api_first_request_LoginRequest() {
    //  Build of the component: LoginRequest proto: com/apihug/guide/proto/api/first/request/request.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.guide.wire.api.first.request.LoginRequest", res);
    res.setClzName("com.apihug.guide.wire.api.first.request.LoginRequest");
    res.setName("LoginRequest");
    res.setProtoFrom("com/apihug/guide/proto/api/first/request/request.proto");
    res.setDescription("登录请求");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("登录请求");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        return res;
      }
    }.build());
    // Add field 0 email
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.String");
    _0.setName("email");
    _0.setFieldName("email");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("邮箱");
        res.setFormat("email");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        res.setExample("jake@bigger.com");
        res.setTypes(Set.of("string"));
        return res;
      }
    }.build());
    _0.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        res.setEmail(true);
        return res;
      }
    }.build());
    _0.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("nature", "EMAIL");
        res.put("name", "nature");
        return res;
      }
    }.build());
    res.addItem(_0);
    // Add field 1 password
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.String");
    _1.setName("password");
    _1.setFieldName("password");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("密码");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        res.setExample("123456");
        return res;
      }
    }.build());
    _1.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_1);
    // Add field 2 remember_me
    ComponentItem<Schema> _2 = new ComponentItem();
    _2.setClz("java.lang.Boolean");
    _2.setName("remember_me");
    _2.setFieldName("rememberMe");
    _2.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("记住我");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        res.setExample("true");
        return res;
      }
    }.build());
    _2.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_2);
    // Add field 3 tenant_id
    ComponentItem<Schema> _3 = new ComponentItem();
    _3.setClz("java.lang.Long");
    _3.setName("tenant_id");
    _3.setFieldName("tenantId");
    _3.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("租户ID-可选(非己租户则忽略)，前端cookie获取或用户设置,如无，直接进入个人工作间主页");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        res.setExample("42");
        return res;
      }
    }.build());
    _3.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_3);
  }

  private final void _build_component_com_apihug_guide_wire_api_first_response_LoginResponse() {
    //  Build of the component: LoginResponse proto: com/apihug/guide/proto/api/first/response/response.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.guide.wire.api.first.response.LoginResponse", res);
    res.setClzName("com.apihug.guide.wire.api.first.response.LoginResponse");
    res.setName("LoginResponse");
    res.setProtoFrom("com/apihug/guide/proto/api/first/response/response.proto");
    res.setDescription("登录请求");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("登录请求");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        return res;
      }
    }.build());
    // Add field 0 email
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.String");
    _0.setName("email");
    _0.setFieldName("email");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("邮箱");
        res.setFormat("email");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        res.setExample("jake@bigger.com");
        res.setTypes(Set.of("string"));
        return res;
      }
    }.build());
    _0.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        res.setEmail(true);
        return res;
      }
    }.build());
    _0.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("nature", "EMAIL");
        res.put("name", "nature");
        return res;
      }
    }.build());
    res.addItem(_0);
    // Add field 1 token
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.String");
    _1.setName("token");
    _1.setFieldName("token");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("token");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        res.setExample("32321x");
        return res;
      }
    }.build());
    _1.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    _1.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("length", 32);
        res.put("name", "string");
        return res;
      }
    }.build());
    res.addItem(_1);
  }

  private final void _build_service_com_apihug_guide_wire_api_first_HelloEchoService() {
    // ----------------------------------------------------
    // START-[Service Context] com.apihug.guide.wire.api.first.HelloEchoService
    Map sc = servicesContext.computeIfAbsent("com.apihug.guide.wire.api.first.HelloEchoService", s-> new LinkedHashMap());
    sc.put("protoFrom", "com/apihug/guide/proto/api/first/hello.proto");
    sc.put("basePath", "/guide");
    List<String> sc_paths = new ArrayList();
    sc.put("paths", sc_paths);
    // --------------------------
    // Register Path of this Service: [1] "/guide/hello"
    sc_paths.add("/guide/hello");
    Map _sc_paths_item_1 = pathsContext.computeIfAbsent("/guide/hello", s-> new LinkedHashMap());
    _sc_paths_item_1.put("action", "GET");
    _sc_paths_item_1.put("method", "SayHello");
    _sc_paths_item_1.put("wrapper", true);
    _sc_paths_item_1.put("pageable", false);
    _sc_paths_item_1.put("request", false);
    _sc_paths_item_1.put("response", false);
    _sc_paths_item_1.put("session", false);
    _sc_paths_item_1.put("inputPlural", false);
    _sc_paths_item_1.put("outputPlural", false);
    _sc_paths_item_1.put("priority", "HIGH");
    _sc_paths_item_1.put("requestRef", "hope.common.adaptor.Empty");
    _sc_paths_item_1.put("responseRef", "hope.common.adaptor.Empty");
    _sc_paths_item_1.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        List<String> _tags = new ArrayList();
        _tags.add("test");
        operation.setTags(_tags);
        operation.setDescription("你好");
        return operation;
      }
    }.build());
    _sc_paths_item_1.put("parameters", new Builder<List<hope.common.service.api.Parameter>>() {
      @Override
      public List<hope.common.service.api.Parameter> build() {
        List<hope.common.service.api.Parameter> res = new ArrayList();
        hope.common.service.api.Parameter<Parameter> _1 = new hope.common.service.api.Parameter();
        _1.setName("name");
        _1.setPlural(false);
        _1.setIn(hope.common.service.api.Parameter.Type.QUERY);
        _1.setDelegator(new Builder<Parameter>() {
          @Override
          public Parameter build() {
            Parameter res  = new Parameter();
            res.setName("name");
            res.setIn("query");
            res.setSchema(new Builder<Schema>() {
              @Override
              public Schema build() {
                Schema res  = new Schema();
                res.setSpecVersion(SpecVersion.V30);
                res.setNullable(false);
                res.setTypes(Set.of("string"));
                return res;
              }
            }.build());
            return res;
          }
        }.build());
        res.add(_1);
        return res;
      }
    }.build());
    _sc_paths_item_1.put("group", "TENANT");
    _sc_paths_item_1.put("empty", false);
    // --------------------------
    // Register Path of this Service: [2] "/guide/login"
    sc_paths.add("/guide/login");
    Map _sc_paths_item_2 = pathsContext.computeIfAbsent("/guide/login", s-> new LinkedHashMap());
    _sc_paths_item_2.put("action", "POST");
    _sc_paths_item_2.put("method", "Login");
    _sc_paths_item_2.put("wrapper", true);
    _sc_paths_item_2.put("pageable", false);
    _sc_paths_item_2.put("request", false);
    _sc_paths_item_2.put("response", false);
    _sc_paths_item_2.put("session", false);
    _sc_paths_item_2.put("inputPlural", false);
    _sc_paths_item_2.put("outputPlural", false);
    _sc_paths_item_2.put("priority", "HIGH");
    _sc_paths_item_2.put("requestRef", "com.apihug.guide.wire.api.first.request.LoginRequest");
    _sc_paths_item_2.put("responseRef", "com.apihug.guide.wire.api.first.response.LoginResponse");
    _sc_paths_item_2.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        List<String> _tags = new ArrayList();
        _tags.add("test");
        operation.setTags(_tags);
        operation.setDescription("登录");
        return operation;
      }
    }.build());
    _sc_paths_item_2.put("group", "CUSTOMER");
    _sc_paths_item_2.put("empty", false);
    // END-[Service Context] com.apihug.guide.wire.api.first.HelloEchoService
    // ----------------------------------------------------
  }

  private final void _merger_api() {
    Info _info =  new Info();
    Contact _contact =  new Contact();
    License _license =  new License();
    ExternalDocumentation _external_documentation =  new ExternalDocumentation();
    Map<String,Object> _infoExtensions =  new LinkedHashMap();
    Map<String,Object> _extensions =  new LinkedHashMap();
    Map<String,Object> _lsExtensions =  new LinkedHashMap();
    Map<String,Object> _ctExtensions =  new LinkedHashMap();
    Map<String,Object> _ex_doc_extensions =  new LinkedHashMap();
    api.setInfo(_info);
    api.setExtensions(_extensions);
    _external_documentation.setExtensions(_ex_doc_extensions);
    api.setExternalDocs(_external_documentation);
    _contact.setExtensions(_ctExtensions);
    _info.setContact(_contact);
    _license.setExtensions(_lsExtensions);
    _info.setLicense(_license);
    _info.setExtensions(_infoExtensions);
    new Builder<String>() {
      @Override
      public String build() {
        _info.setTitle("001-hello-world-proto");
        _info.setDescription("apihug guide first demo proto");
        _info.setVersion("0.0.4-RELEASE");
        _contact.setName("developer@apihug.com");
        _contact.setUrl("https://github.com/apihug/");
        _contact.setEmail("developer@apihug.com");
        _external_documentation.setUrl("https://github.com/apihug/apihug.com/");
        _external_documentation.setDescription("Hope is the best thing");
        return "DONE";
      }
    }.build();
  }

  private void _init() {
    // Build for Component : com.apihug.guide.wire.api.first.request.LoginRequest
    _build_component_com_apihug_guide_wire_api_first_request_LoginRequest();
    // Build for Component : com.apihug.guide.wire.api.first.response.LoginResponse
    _build_component_com_apihug_guide_wire_api_first_response_LoginResponse();
    // Build For Service com.apihug.guide.wire.api.first.HelloEchoService
    _build_service_com_apihug_guide_wire_api_first_HelloEchoService();
    // Build OpenAPI information
    _merger_api();
    api.tags(new ArrayList<>(tags.values()));
  }
}
