public class Person {
private String name;
public String getName() {
return name;
}
public void setName(String n
this.name = name;
}
}
...
Person person = new Person();
person.setName("name");
String name = person.getName();