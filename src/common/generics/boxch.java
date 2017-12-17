package common.generics;

public class boxch {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        boxch boxch = (boxch) o;

        return name != null ? name.equals(boxch.name) : boxch.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "boxch{" +
                "name='" + name + '\'' +
                '}';
    }
}
