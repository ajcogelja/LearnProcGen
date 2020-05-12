import java.awt.image.BufferedImage;

public class GeneratorBackend {

    /* Logic Outline
    take in a seed to allow patterns to be semi random
    set some parameter like requiring a level to have 3 doors or something
    potentially we can create types of rooms
    allow certain combos of room numbers
     */
    Door d;
    FrontSiding f;
    Window w;
    BufferedImage b;
    //Object O is comprised of the above objects

    public GeneratorBackend(Door d, FrontSiding f, Window w){ //constructor
        b = new BufferedImage(128, 64,BufferedImage.TYPE_INT_RGB);
        this.d = d;
        this.f = f;
        this.w = w;
    }

}

class Door {

}

class FrontSiding {

}

class Window {

}
