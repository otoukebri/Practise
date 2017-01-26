package coordinates;

import java.util.Collections;
import java.util.PriorityQueue;

public class KClosestPoints {
	public static Point[] closestk(Point points[], int k) {
    //max heap
    PriorityQueue<Point> kClosest = new PriorityQueue<>(k, Collections.reverseOrder());

    for (int i = 0; i < points.length; i++) {
        if (kClosest.size() < k) {
        	kClosest.add(points[i]);
        } else if (points[i].getDist() < kClosest.peek().getDist()) {
            kClosest.remove();
            kClosest.add(points[i]);
        }
    }

    return kClosest.toArray(new Point[k]);
}
}

class Point implements Comparable<Point> {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getDist(){
    	return x*x+y*y;
    }

	@Override
	public int compareTo(Point o) {
		int c = Double.compare(getDist(), o.getDist());
		if(c == 0){
			c = Double.compare(x, o.x);
			if(c == 0){
				c = Double.compare(y, o.y);
			}
		}
		return c;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}