public class JavaVersion {
    public static void main(String[] args) {
        // 자바 버전 구하기
        String version = System.getProperty("java.version");

        System.out.println("My Java Version= " + version);
    }
}