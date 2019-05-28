package JavaExtractor.FeaturesEntities;

public class ProgramRelation {
    private final Property m_Source;
    private final Property m_Target;
    private final String m_Path;
    private final String m_Long_Path;

    public ProgramRelation(Property sourceName, Property targetName, String path, String longPath) {
        m_Source = sourceName;
        m_Target = targetName;
        m_Path = path;
        m_Long_Path = longPath;
    }

    public String toString() {
        return String.format("%s,%s,%s", m_Source.getName(), m_Path,
                m_Target.getName());
    }

    public Property getM_Source() {
        return m_Source;
    }

    public Property getM_Target() {
        return m_Target;
    }

    public String getM_Path() {
        return m_Path;
    }

    public String getM_Long_Path() {
        return m_Long_Path;
    }
}
