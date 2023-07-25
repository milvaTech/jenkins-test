package com.sta.projTest03;

import com.sta.projTest03.api.model.Activity;
import com.sta.projTest03.api.model.CatFact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ProjTest03Application {

	//@Value("${api.url}")
	private static String apiURL="https://www.boredapi.com/api/activity";

	static String url = "https://catfact.ninja/fact?max_length=140";

	private static final Logger log = LoggerFactory.getLogger(ProjTest03Application.class);

	public static void main(String[] args) {
		SpringApplication.run(ProjTest03Application.class, args);

	    WebClient.Builder builder = WebClient.builder();

//		String activityStr = builder.build()
//				.get()
//				.uri(apiURL)
//				.retrieve()
//				.bodyToMono(String.class)
//				.block();

		CatFact catFractStr = builder.build()
				.get()
				.uri(url)
				.retrieve()
				.bodyToMono(CatFact.class)
				.block();

		Activity activityStr = builder.build()
				.get()
				.uri(apiURL)
				.retrieve()
				.bodyToMono(Activity.class)
				.block();

		System.out.println("-----------------------------------------------");
		System.out.println(activityStr);
		System.out.println("-----------------------------------------------");
	}



}
