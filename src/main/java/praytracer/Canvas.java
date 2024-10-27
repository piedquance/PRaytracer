package praytracer;

public class Canvas {
    long width, height;
    Color[][] grid;

    Canvas(long width, long height) {
        this.width = width;
        this.height = height;
        grid = new Color[(int)height][(int)width];
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                grid[y][x] = new Color(0,0,0);
            }
        }
    }


    static void write_pixel(Canvas c, int x, int y, Color col) {
        c.grid[y][x] = col;
    }

    static Color pixel_at(Canvas c, int x, int y) {
        return c.grid[y][x];
    }

    void write_pixel( int x, int y, Color col) {
        grid[y][x] = col;
    }

    Color pixel_at(int x, int y) {
        return grid[y][x];
    }

    String canvas_to_ppm(Canvas c) {
        String ppm = "";
        ppm += "P3\n" + c.width + " " + c.height + "\n255\n";
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                double r = grid[y][x].red;
                double g = grid[y][x].green;
                double b = grid[y][x].blue;
                if(r < 0) r = 0;
                if(g < 0) g = 0;
                if(b < 0) b = 0;
                if(r > 1) r = 1;
                if(g > 1) g = 1;
                if(b > 1) b = 1;
                r *= 255;
                g *= 255;
                b *= 255;

                ppm += (int)Math.ceil(r) + " " + (int)Math.ceil(g) + " " + (int)Math.ceil(b);
                if(x < width-1) ppm += " ";
            }
            ppm += "\n";
        }

        return ppm;
    }
}
