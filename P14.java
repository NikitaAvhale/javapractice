package javaprograms;

import java.util.Scanner;

	public class P14 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1D Array
	        System.out.print("Enter size of 1D array: ");
	        int size1D = sc.nextInt();
	        int[] arr1D = new int[size1D];

	        System.out.println("Enter elements of 1D array:");
	        for (int i = 0; i < size1D; i++) {
	            arr1D[i] = sc.nextInt();
	        }

	        System.out.println("1D Array:");
	        for (int i = 0; i < size1D; i++) {
	            System.out.print(arr1D[i] + " ");
	        }
	        System.out.println("\n");

	        // 2D Array
	        System.out.print("Enter rows and columns of 2D array: ");
	        int rows2D = sc.nextInt();
	        int cols2D = sc.nextInt();
	        int[][] arr2D = new int[rows2D][cols2D];

	        System.out.println("Enter elements of 2D array:");
	        for (int i = 0; i < rows2D; i++) {
	            for (int j = 0; j < cols2D; j++) {
	                arr2D[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("2D Array:");
	        for (int i = 0; i < rows2D; i++) {
	            for (int j = 0; j < cols2D; j++) {
	                System.out.print(arr2D[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();

	        // 3D Array
	        System.out.print("Enter dimensions of 3D array (x y z): ");
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        int z = sc.nextInt();
	        int[][][] arr3D = new int[x][y][z];

	        System.out.println("Enter elements of 3D array:");
	        for (int i = 0; i < x; i++) {
	            for (int j = 0; j < y; j++) {
	                for (int k = 0; k < z; k++) {
	                    arr3D[i][j][k] = sc.nextInt();
	                }
	            }
	        }

	        System.out.println("3D Array:");
	        for (int i = 0; i < x; i++) {
	            System.out.println("Layer " + (i + 1) + ":");
	            for (int j = 0; j < y; j++) {
	                for (int k = 0; k < z; k++) {
	                    System.out.print(arr3D[i][j][k] + " ");
	                }
	                System.out.println();
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}