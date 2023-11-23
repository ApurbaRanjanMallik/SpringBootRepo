package com.arm.sb.rnr;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component("art")
public class ApplicationRunnerTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Non-Option args : " + args.getNonOptionArgs());
		System.out.println("Option names : " + args.getOptionNames());
		System.out.println("Option args names and values : ");
		for (String names : args.getOptionNames()) {
			System.out.println(names + "--->" + args.getOptionValues(names));
		}
	}

}
