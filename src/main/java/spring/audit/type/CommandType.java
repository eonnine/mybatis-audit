package spring.audit.type;

public enum CommandType {
    NONE,
    INSERT,
    UPDATE,
    DELETE;

    public String getValue() {
        return this.name();
    }

    public boolean isNotNone() {
        return this != CommandType.NONE;
    }
}