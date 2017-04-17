package com.microhub.db.druid;

import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;


/**
 * Created by Tony on 2017/4/17 0017.
 * 配置数据源。这里相关的参数会自动赋值到datasource里
 */
@Configuration
public class DruidDataSourceConfiguration  {


	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource druidDataSource() {
		DruidDataSource druidDataSource = new DruidDataSource();
		return druidDataSource;
	}

}
