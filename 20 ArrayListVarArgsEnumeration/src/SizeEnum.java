public enum SizeEnum {
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
    private String abb;

    SizeEnum(String abb) {
        this.abb = abb;
    }

    public String getAbb() {
        return abb;
    }

    @Override
    public String toString() {
        return getAbb();
    }
}
