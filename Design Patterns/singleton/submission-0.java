static class Singleton {

    private static volatile Singleton unique = null;
    private String s;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (unique == null) {
            synchronized (Singleton.class) {
                if (unique == null) {
                    unique = new Singleton();
                }
            }
        }
        return unique;
    }

    public String getValue() {
        return s;
    }

    public void setValue(String value) {
        s = value;
    }
    
}
