package lyzzcw.work.zspi.annotations;


import lyzzcw.work.zspi.handler.DBProxyFactory;

import java.lang.annotation.*;

/**
 * 数据库配置 SPI
 * 通过 mysql配置来实现spi注入
 * @author Luiz
 * @date 2024/11/22
 */
@Inherited
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@ProxySPI(DBProxyFactory.class)
public @interface DBSPI {

    String value();

}
