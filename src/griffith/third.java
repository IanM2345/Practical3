package griffith;

import java.util.Scanner;

public class third {
     
	private int length;
    private int width;
    private int height;

    public int calculateVolume(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        return length * width * height;
    }
    public int calculateSurfaceArea() {
        return 2 * ((width * height) + (width * length) + (height * length));
    }

    public int calculateTotalEdgeLength() {
        return 4 * (width + height + length);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the cuboid: ");
        int length = scanner.nextInt();

        System.out.print("Enter the width of the cuboid: ");
        int width = scanner.nextInt();

        System.out.print("Enter the height of the cuboid: ");
        int height = scanner.nextInt();

        third cuboid = new third();
        int volume = cuboid.calculateVolume(length, width, height);

       
        int surfaceArea = cuboid.calculateSurfaceArea();
        int totalEdgeLength = cuboid.calculateTotalEdgeLength();

        System.out.println("Volume of the cuboid: " + volume);
        System.out.println("Surface area of the cuboid: " + surfaceArea);
        System.out.println("Total edge length of the cuboid: " + totalEdgeLength);
    }
}
