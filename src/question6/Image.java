package question6;

public class Image {
    private String fileName;
    private int width, height;

    public Image(String fileName, int width, int height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public boolean isPortrait() {
        return height > width;
    }

    public boolean isLandscape() {
        return width > height;
    }

    public boolean isKnownFileType() {
        return switch (fileName.substring(fileName.lastIndexOf('.'))) {
            case ".gif",
                    ".jpg",
                    ".jpeg",
                    ".png",
                    ".webp",
                    ".bmp" -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        Image image = new Image("name.png", 100, 200);
        System.out.println(image.isLandscape());
        System.out.println(image.isPortrait());
        System.out.println(image.isKnownFileType());
    }
}
