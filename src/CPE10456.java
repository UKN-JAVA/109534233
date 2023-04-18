package gao;

import java.util.Scanner;

public class CPE10456 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int t = sc.nextInt(); 
	        for (int i = 1; i <= t; i++) {
	            int m = sc.nextInt();
	            int n = sc.nextInt();
	            int q = sc.nextInt();
	            char[][] grid = new char[m][n];
	            
	            // read the grid
	            for (int j = 0; j < m; j++) {
	                String row = sc.next();
	                for (int k = 0; k < n; k++) {
	                    grid[j][k] = row.charAt(k);
	                }
	            }
	            
	            // find largest square for each query
	            System.out.println(m + " " + n + " " + q);
	            for (int j = 0; j < q; j++) {
	                int r = sc.nextInt();
	                int c = sc.nextInt();
	                int size = findLargestSquare(grid, r, c);
	                System.out.println(size);
	            }
	        }
	        sc.close();
	    }
	    
	    // find largest square with same characters
	    private static int findLargestSquare(char[][] grid, int r, int c) {
	        int maxSize = 1;
	        int m = grid.length;
	        int n = grid[0].length;
	        
	        // loop through all possible square sizes
	        for (int size = 2; size <= Math.min(m-r, n-c); size++) {
	            char center = grid[r+size/2][c+size/2];
	            boolean isSquare = true;
	            
	            // check if all characters in the square are the same
	            for (int i = r; i <= r+size-1; i++) {
	                for (int j = c; j <= c+size-1; j++) {
	                    if (grid[i][j] != center) {
	                        isSquare = false;
	                        break;
	                    }
	                }
	                if (!isSquare) {
	                    break;
	                }
	            }
	            
	            if (isSquare) {
	                maxSize = size;
	            } else {
	                break;
	            }
	        }
	        
	        return maxSize;
	    }
	}