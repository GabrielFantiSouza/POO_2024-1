public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nHi!");
        String version = System.getProperty("java.version");
        String so = System.getProperty("os.name");
        String soVersion = System.getProperty("os.version");
        System.out.println("Running Java Version "+version+"\n");
        System.out.println("SO:"+so+"."+soVersion);
    }
}