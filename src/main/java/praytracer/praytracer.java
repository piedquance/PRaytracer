package praytracer;

import java.util.concurrent.TimeUnit;

    class Projectile {
    Projectile(Point p, Vector v) {
        this.position = p;
        this.velocity = v;
    }
    Point position;
    Vector velocity;
}

    class Environment {
        Environment(Vector gravity, Vector wind) {
            this.gravity = gravity;
            this.wind = wind;
        }
    Vector gravity;
    Vector wind;
}

public class praytracer {

        static Projectile tick(Environment env, Projectile proj) throws InterruptedException {
        Point position = new Point(proj.position.add(proj.velocity));
        Vector velocity = new Vector(proj.velocity.add(env.gravity).add(env.wind));
        TimeUnit.MILLISECONDS.sleep(100);
            System.out.println(position);
        return new Projectile(position, velocity);
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("external");

        Projectile p = new Projectile(new Point(0,1,0), new Vector(new Vector(1,1,0).normalize()));
        Environment e = new Environment(new Vector(0, -0.1, 0), new Vector(-0.01, 0, 0));

        while(p.position.y >= 0) {
            p = tick(e,p);
        }


    }
}
