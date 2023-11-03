
## 步骤

1. 删除 `src/main/wire`
2. `wire` 生成
3. 查看 `src/main/wire` 目录
4. 查看 `src/main/resources` 目录
   1. 



```shell
.\gradlew.bat 001-hello-world:001-hello-world-proto:clean wire -x test -x wireTest --stacktrace
.\gradlew.bat 001-hello-world:001-hello-world-proto:clean build -x test -x wireTest --stacktrace
```
