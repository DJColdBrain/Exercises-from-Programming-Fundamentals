package square;

class Rectangle {
    protected int m_width;
    protected int m_height;

    public Rectangle(int m_width, int m_height) {
        setWidth(m_width);
        setHeight(m_height);
    }

    private void setWidth(int width) {
        m_width = width;
    }

    private void setHeight(int height) {
        m_height = height;
    }

    public int getWidth() {
        return m_width;
    }

    public int getHeight() {
        return m_height;
    }

    public int getArea() {
        return m_width * m_height;
    }
}
