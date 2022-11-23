//An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
//
//You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].
//
//To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.
//
//Return the modified image after performing the flood fill.

public class FloodFill {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[][] image={{1,1,1},{1,1,0},{1,0,1}};
        int[][] res = s.floodFill(image,1,1,2);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }

}
class Solution1{
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        fill(image,sr,sc,color,image[sr][sc]);
        return image;

    }
    public void fill(int[][] image, int sr, int sc, int color,int curr){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length|| image[sr][sc]!=curr){
            return;
        }
        //System.out.println(image[sr][sc]);
        image[sr][sc] = color;
        fill(image,sr+1,sc,color,curr);
        fill(image,sr,sc+1,color,curr);
        fill(image,sr-1,sc,color,curr);
        fill(image,sr,sc-1,color,curr);
    }
}