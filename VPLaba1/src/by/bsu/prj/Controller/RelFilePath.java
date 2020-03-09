package by.bsu.prj.Controller;

public class RelFilePath {
    String run() {
        String testFilePath = getResourcePath("scores.txt");
        return testFilePath;
    }

    static String getResourcePath(String file) {
        return RelFilePath.class.getResource("/").getPath() + file;
    }

    public static void main(String[] args) {
       System.out.println(new RelFilePath().run());
    }

}
