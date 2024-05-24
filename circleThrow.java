class Circle {

    double x, y, r;

    public Circle(double centreX, double centreY, double radius) throws InvalidRadiusException {

        if (r <= 0) {

            throw new InvalidRadiusException(radius);

        }

        else {

            x = centreX;
            y = centreY;
            r = radius;

        }

    }

}