package koschei.models;

public class Island2 {

    private Woods wood;

    public Island2(Woods wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
