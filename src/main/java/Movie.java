import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

    Actor actor;

    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;

    }

    public Actor getActor() {
        return actor;
    }
}
