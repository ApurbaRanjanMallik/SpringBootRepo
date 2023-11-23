package com.arm.sb.rnr;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;

//@Component("clrt")
public class CommandLineRunnerTest implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner to test : " + Arrays.toString(args));
	}

}
