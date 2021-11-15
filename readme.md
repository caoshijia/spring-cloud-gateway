### 中央maven仓库
```xml
<mirror>
    <id>alimaven</id>
    <name>aliyun maven</name>
    <mirrorOf>*</mirrorOf>
    <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
</mirror>
<mirror>
    <id>springsource-repos</id>
    <name>springsource maven</name>
    <url>http://repo.spring.io/release</url>
</mirror>
```