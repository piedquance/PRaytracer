package praytracer;

public class Color extends Tuple{
    double red, green, blue;
    Color(double x, double y, double z) {
        super(x, y, z, 0);
        this.red = x;
        this.green = y;
        this.blue = z;
    }

    Color(Tuple t) {
        super(t.x, t.y, t.z, 0);
        this.red = x;
        this.green = y;
        this.blue = z;
    }

    Color add(Color t) {
        return new Color(x + t.x, y + t.y, z + t.z);
    }

    Color sub(Color t) {
        return new Color(x - t.x, y - t.y, z - t.z);
    }

    Color neg() {
        return new Color(-x, -y, -z);
    }

    Color mul(Color t) {
        return new Color(x * t.x, y * t.y, z * t.z);
    }

    Color mul(double s) {
        return new Color(x * s, y * s, z * s);
    }

    Color div(double s) {
        return new Color(x / s, y / s, z / s);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Color c = (Color) o;
        return eq(x,c.x) && eq(y, c.y) && eq(z, c.z) && eq(w,c.w);
    }
}
