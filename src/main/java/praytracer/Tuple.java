package praytracer;


public class Tuple {
    double x, y, z, w;

    Tuple(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }


    Tuple add(Tuple t) {
        return new Tuple(x + t.x, y + t.y, z + t.z, w + t.w);
    }

    Tuple sub(Tuple t) {
        return new Tuple(x - t.x, y - t.y, z - t.z, w - t.w);
    }

    Tuple neg() {
        return new Tuple(-x, -y, -z, -w);
    }

    Tuple mul(Tuple t) {
        return new Tuple(x * t.x, y * t.y, z * t.z, w * t.w);
    }

    Tuple mul(double s) {
        return new Tuple(x * s, y * s, z * s, w * s);
    }

    Tuple div(double s) {
        return new Tuple(x / s, y / s, z / s, w / s);
    }

    boolean isPoint() {
        return w == 1;
    }

    boolean isVector() {
        return w == 0;
    }

}


/*
class tuple {


    //Find a nicer way to do this
    bool operator==(const tuple& other) const
    {
        if (equal(this->x, other.x) && equal(this->y, other.y) && equal(this->z, other.z) && equal(this->w, other.w)) return true;
        else return false;
    }
    //operator vector() const {
    //    return vector(this->x, this->y, this->z);
    //}
};

 */