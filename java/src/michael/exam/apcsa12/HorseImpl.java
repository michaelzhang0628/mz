package michael.exam.apcsa12;

import java.util.Objects;

public class HorseImpl implements Horse {
    private String name;
    private int weight;

    public HorseImpl(String name, int weight) {
        super();
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof HorseImpl))
            return false;
        HorseImpl other = (HorseImpl) obj;
        return Objects.equals(name, other.name) && weight == other.weight;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

}
