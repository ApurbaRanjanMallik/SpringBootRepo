package com.arm.sb;

import java.util.Set;
import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootProj13SpringBootRunnersWithLambdaExApplication {
	@Bean
	CommandLineRunner createCommandLineRunner() {
//		CommandLineRunner clr = (String... args) -> {
//			System.out.println("From CommandLineRunner : "+Arrays.toString(args));
//		};
//		return clr;

//		***********************************************************************************

//		CommandLineRunner clr = (args) -> System.out.println("From CommandLineRunner : " + Arrays.toString(args));
//		return clr;

//		***********************************************************************************

//		CommandLineRunner clr = args -> System.out.println("From CommandLineRunner : " + Arrays.toString(args));
//		return clr;

//		***********************************************************************************

//		CommandLineRunner clr=args->{
//			for(String string:args) {
//				System.out.println(string);
//			}
//		};
//		return clr;

//		***********************************************************************************

//		CommandLineRunner clr = args -> {
//			System.out.println("CommandLineRunner : ");
//			Stream.of(args).forEach(System.out::println);
//		};
//		return clr;

//		***********************************************************************************

//		CommandLineRunner clr = args -> Stream.of(args).forEach(System.out::println);
//		return clr;

//		***********************************************************************************

		return args -> Stream.of(args).forEach(System.out::println);
	}

	@Bean
	ApplicationRunner createApplicationRunner() {
		return args -> {
			System.out.println("ApplicationRunner : ");
			System.out.println("Non-option arg values : " + args.getNonOptionArgs());
			System.out.println("Option arg names and values : ");
			Set<String> optionArgs = args.getOptionNames();
			optionArgs.forEach(name -> {
				System.out.println(name);
				System.out.println(args.getOptionValues(name));
			});
		};

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProj13SpringBootRunnersWithLambdaExApplication.class, args);
	}

}
