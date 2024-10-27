package praytracer;

public class Vector extends Tuple{
    Vector(double x, double y, double z) {
        super(x, y, z, 0);
    }

    Vector(Tuple t) {
        super(t.x, t.y, t.z, 0);

    }

    double magnitude()
    {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2) + Math.pow(w,2));
    }

    Tuple normalize() {
        double m = magnitude();
        return new Tuple(x / m, y / m, z / m, w / m);
    }

    double dot(Vector b)
    {
        return x * b.x +
                y * b.y +
                z * b.z +
                w * b.w;
    }

    Vector cross(Vector b)
    {
        return new Vector(
                y * b.z - z * b.y,
                z * b.x - x * b.z,
                x * b.y - y * b.x
        );
    }
}
