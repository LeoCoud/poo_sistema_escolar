public class Person {
    // Atributos de la clase
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Método para presentarse
    public void presentYourself() {
        System.out.println("Hola, mi nombre es " + name + " y tengo " + age + " años.");
    }

    // Métodos getters y setters (si lo necesitas)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
//set age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person persona = new Person("Leo", 20);
        System.out.println(persona);
    }
}
