package com.search.mgr.configurer;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ElasticSearchRestClient {

	//http的形式接入es
	@Bean("highLevelClient")
	public RestHighLevelClient highLevelClient() {
		HttpHost httpHost1 = new HttpHost("192.168.203.174", 19200);		//配置你的es地址和端口 我这里是演示所以就只配置一台了
		return new RestHighLevelClient(RestClient.builder(new HttpHost[] { httpHost1 }));
	}
}
