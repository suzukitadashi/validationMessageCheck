# config

## ValidationMessages.properties 
```
javax.validation.constraints.NotEmpty.message={0} must not be empty
javax.validation.constraints.Size.message=size must be between {min} and {max},please.

value=value1111 
```

## Form

```
@Setter
@Getter
public class TestForm {

	@NotEmpty
	@Size(min=5, max=100)
	String value;
	
}
```

## run 

http://localhost:8080/test

Press the button without inserting anything.

# Result

## Spring boot 2.1.4

Error messages is no problem.

```
size must be between 5 and 100,please.

value1111 must not be empty
```

## Spring boot 2.1.5

Error message is...

```
size must be between 5 and 100,please.

{0} must not be empty
```

I want to set the value in the part of {0}.
Do you need to do something?
