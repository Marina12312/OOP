package transport;


public  class Key {
    private final boolean remoteEngineStart;
    private final boolean keylessAccess;

    public Key(boolean remoteEngineStart, boolean keylessAccess) {
        this.remoteEngineStart = remoteEngineStart;
        this.keylessAccess = keylessAccess;
    }
    public boolean isRemoteEngineStart() {
        return remoteEngineStart;
    }

    public boolean isKeylessAccess() {
        return keylessAccess;
    }
}