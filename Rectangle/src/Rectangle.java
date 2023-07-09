class Rectangle {
    int length;
    int width;
    String color;

    void setData(int l, int w, String c) {
        this.length = l;
        this.width = w;
        this.color = c;
    }

    int calcArea(){
        int area = length * width;
        return area;
    }
}
