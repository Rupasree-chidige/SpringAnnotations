import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Actor {

     private String name;
    private   String gender;
    private  int age;
        Actor(){}

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

        @Autowired
        @Value("Rupa")
        public void setName(String name) {
        this.name = name;

    }

        @Autowired
        @Value("female")
        public void setGender(String gender) {
        this.gender = gender;

    }

        @Autowired
        @Value("22")
        public void setAge(int age) {
        this.age = age;

    }

        public String getName() {
        return name;
    }

        public String getGender() {
        return gender;
    }

        public int getAge() {
        return age;
    }


        @Override
        public String toString() {
        return "Actor(" +
                "name:'" + name + '\'' +
                ", gender:'" + gender + '\'' +
                ", age:" + age +
                ')';
    }
}
