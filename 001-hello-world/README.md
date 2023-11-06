
## 步骤

1. 删除 `src/main/wire`
2. `gradlew wire` 生成
3. 查看 `src/main/wire` 目录
4. 查看 `src/main/resources` 目录
   1. `swagger.json` 最新版本 swagger
   2. `hope-domain-*` 最新其他常量信息
   3. `hope-project-meta.json` 最新项目元信息，包含项目描述+编译时间戳
   4. `{application}` 目录
      1. 常量
      2. swagger 历史版本信息


## 命令

```shell
.\gradlew.bat 001-hello-world:001-hello-world-proto:clean wire -x test -x wireTest --stacktrace
.\gradlew.bat 001-hello-world:001-hello-world-proto:clean build -x test -x wireTest --stacktrace
```


## 参考

1. [5分钟开始apihug开发](https://github.com/apihug/apihug.com/blob/master/docs/handbook/001_very_begin.md)