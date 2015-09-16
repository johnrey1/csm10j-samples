/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch11;

import java.util.Vector;

/**
 *
 * @author johnr
 */
public class InnerClassPointsExample {

    private class Point3D {

        public int x, y, z;

        public Point3D(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }        
        
        @Override
        public boolean equals(Object target){
            if(!(target instanceof Point3D))
                return false;
            
            Point3D pointTarget = (Point3D)target;
            return this.x == pointTarget.x
                   && this.y == pointTarget.y
                    && this.z == pointTarget.z;
        }
    }

    private Vector<Point3D> points = new Vector<Point3D>();

    public void addPoint(int x, int y, int z) {
        points.add(new Point3D(x, y, z));
    }
    
    public boolean hasPoint(int x, int y, int z){
        return points.contains(new Point3D(x, y, z));
    }
}
