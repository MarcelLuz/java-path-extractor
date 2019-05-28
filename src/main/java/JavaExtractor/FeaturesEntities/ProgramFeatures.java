package JavaExtractor.FeaturesEntities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ProgramFeatures {
    private final String name;

    private final ArrayList<ProgramRelation> features = new ArrayList<>();

    public ProgramFeatures(String name) {
        this.name = name;
    }

    @SuppressWarnings("StringBufferReplaceableByString")
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append(" ");
        stringBuilder.append(features.stream().map(ProgramRelation::toString).collect(Collectors.joining(" ")));

        return stringBuilder.toString();
    }

    public void addFeature(Property source, String path, String longPath, Property target) {
        ProgramRelation newRelation = new ProgramRelation(source, target, path, longPath);
        features.add(newRelation);
    }

    public String getName() {
        return name;
    }

    public ArrayList<ProgramRelation> getFeatures() {
        return features;
    }

    @JsonIgnore
    public boolean isEmpty() {
        return features.isEmpty();
    }
}
