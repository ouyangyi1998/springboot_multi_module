# 多模块开发springboot项目测试
- 对于maven  <packaging>
   - <packaging>pom</packaging>   --------->   父类型都为pom类型
   - <packaging>jar</packaging>      --------->   内部调用或者是作服务使用
   - <packaging>war</packaging>    --------->   需要部署的项目
- 子项目是可以不用设置groupId的，因为它们继承了父亲的groupId
- 父项目的packaging是 pom类型，子项目的packaging是 jar类型
- 这是因为maven的多模块项目中，父模块必须以pom打包类型，同时以<modules>给出所有的子模块  library application
- 对于含有final修饰的成员变量，需要利用构造器装配，否则直接通过getter，setter构造获取会报错
- @ConfigurationProperties注解可以注入在application.properties配置文件中的属性，和@Bean 或者 @Component 能生成spring bean 的注解结合起来使用
- 如果该类只使用了@ConfigurationProperties注解，然后该类没有在扫描路径下或者没有使用@Component等注解，导致无法被扫描为bean，那么就必须在配置类上使用@EnableConfigurationProperties注解去指定这个类，这个时候就会让该类上的@ConfigurationProperties生效，然后作为bean添加进spring容器中
- @Configuation等价于<Beans></Beans>   @Bean等价于<Bean></Bean>
- @Import  作用就是和xml配置的 <import />标签作用一样，允许通过它引入 @Configuration 注解的类 (java config)
