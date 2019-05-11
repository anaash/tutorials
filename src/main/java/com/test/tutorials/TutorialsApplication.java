package com.test.tutorials;

import com.test.tutorials.search.TernarySearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TutorialsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TutorialsApplication.class, args);
		TernarySearch search = context.getBean(TernarySearch.class);
		int [] a = {1,2,3};
		System.out.println(search.quickSortAlgorithm.toString() +"     Result:     " + search.searchIndex(a));
	}
}
