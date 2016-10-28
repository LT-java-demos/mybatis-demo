#mybatis demo

结合`mybatis`简单实现了`findAllUser()`、`findUserById()`

##环境
- JDK 8
- MySQL
- Gradle

##初始化数据库

将`src/main/resources/config.properties` 中的 `password`的值修改成你自己的`mysql root`的密码。

然后执行：

```shell
$ cd mybatis-demo
$ ./db-initial.sh(需要输入mysql root密码)
```

>提示：Mac下如果执行`./db-initial.sh`报错，尝试使用`. db-initial.sh`

看到如下输出，表示数据库初始化成功

```shell
id name   gender
1  Bulma  female
2  Vegeta male
3  ChiChi female
4  Goku   male
```

##运行demo

```shell
$ cd mybatis-demo
$ gradle run
```

将看到如下输出：

```shell
User{id=1, name='Bulma', gender='female'}
User{id=2, name='Vegeta', gender='male'}
User{id=3, name='ChiChi', gender='female'}
User{id=4, name='Goku', gender='male'}
No.1:User{id=1, name='Bulma', gender='female'}
```

