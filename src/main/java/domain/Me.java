package domain;

import org.springframework.beans.factory.annotation.Value;

public class Me extends Person {

	@Value( "${wgl.name}" )
	private String name;

	@Value( "${wgl.age}" )
	private int age;


}
