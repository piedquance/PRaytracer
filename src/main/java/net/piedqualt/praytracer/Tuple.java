package net.piedqualt.praytracer;

public class Tuple {
    float x, y, z, w;

    Tuple(float x, float y, float z, float w) {
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

    Tuple div(float t) {
        return new Tuple(x / t, y / t, z / t, w / t);
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