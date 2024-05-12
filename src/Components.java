public class Components {

    // * Builder - это паттерн(шаблон) проектирования позволяющий поэтапно создавать сложные объекты

    private String item1;
    private String item2;
    private String item3;
    private String item4;

    public static class Builder {

        private final Components components;

        public Builder() {
            components = new Components();
        }

        public Builder item1(String item1) {
            components.item1 = item1;
            return this;
        }

        public Builder item2(String item2) {
            components.item2 = item2;
            return this;
        }

        public Builder item3(String item3) {
            components.item3 = item3;
            return this;
        }

        public Builder item4(String item4) {
            components.item4 = item4;
            return this;
        }

        public Components build() {
            return components;
        }

    }

    @Override
    public String toString() {
        return "Components{" +
                "item1='" + item1 + '\'' +
                ", item2='" + item2 + '\'' +
                ", item3='" + item3 + '\'' +
                ", item4='" + item4 + '\'' +
                '}';
    }
}
