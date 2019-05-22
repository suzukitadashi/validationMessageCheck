package com.example.demo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TestForm {

	@NotEmpty
	@Size(min=5, max=100)
	String value;
	
}
