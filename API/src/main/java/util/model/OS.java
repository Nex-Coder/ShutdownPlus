package util.model;

public enum OS {
    WINDOWS("Windows"),
    MAC("MacOS"),
    LINUX("Linux"),
    UNSUPPORTED("Windows");

    private final String name;

    OS(String name) {
        this.name = name;
    }

    public String getName() { return name;}
}
