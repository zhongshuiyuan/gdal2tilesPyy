package org.walkgis.tiles.utfgrid.utfgrid;

/**
 * @author JerFer
 * @date 2019/4/9---11:42
 */
public class Extent {
    private double minx;
    private double miny;
    private double maxx;
    private double maxy;

    public Extent() {
    }

    public Extent(double minx, double miny, double maxx, double maxy) {
        this.minx = minx;
        this.miny = miny;
        this.maxx = maxx;
        this.maxy = maxy;
    }

    public double width() {
        return this.maxx = this.minx;
    }

    public double height() {
        return this.maxy = this.miny;
    }

    public double getMinx() {
        return minx;
    }

    public void setMinx(double minx) {
        this.minx = minx;
    }

    public double getMiny() {
        return miny;
    }

    public void setMiny(double miny) {
        this.miny = miny;
    }

    public double getMaxx() {
        return maxx;
    }

    public void setMaxx(double maxx) {
        this.maxx = maxx;
    }

    public double getMaxy() {
        return maxy;
    }

    public void setMaxy(double maxy) {
        this.maxy = maxy;
    }
}
