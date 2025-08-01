public class Two_D_array {

    public static void printArray(int mat[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean linearSearch(int mat[][], int row, int col, int key) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int maximumRowSum(int mat[][], int row, int col) {
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum = sum + mat[i][j];
            }
          maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }
public static int maximumColSum(int mat[][],int row, int col){
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
       
        }
    }
    return maxsum;
}
public static int diagonalSum(int mat[][], int n,int m){
    int pdsum=0;
    int sdsum=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(i==j){
                pdsum=pdsum+mat[i][j];
            }
           else if(i+j==2){
                sdsum=sdsum+mat[i][j];
            }
        }
    }
    return pdsum+sdsum;
}
 public static boolean  target(int mat[][] ,int key, int row){
    int n=mat[0].length;
    int st=0;
    int et=n-1;
    while(st<=et){
        int mid=st+(et-st)/2;
        if(mat[row][mid]==key){
            return true;
        }else if(key<=mat[row][mid]){
            et=mid-1;
        }else{
            st=mid+1;
        }
    }
    return false;
 }
public static boolean optimalSearching(int mat[][] ,int m,int n,int key){
int sR=0;
int eR=m-1;

while(sR<=eR){
    int midR=sR+(eR-sR)/2;
    if(key>=mat[midR][0] && key<=mat[midR][n-1]){
        // found the row
        return target(mat,key,midR);

}
else if(key>=mat[midR][n-1]){
    sR=midR+1;
}
else{
    eR=midR-1;
}
}
return false;
}
    public static void main(String[] args) {
        // int mat[][]=new int[3][3];
        int mat[][] = { { 1, 2, 3,4}, {  5, 6,7,8 }, { 9,10,11,12 } };
        int row = 3;
        int cols = 3;
        // System.out.println(mat[2][2]);
        // printArray(mat, 3, 3);
        // System.out.println(linearSearch(mat, 3, 3, 80));
        // System.out.println(maximumRowSum(mat, 3, 3));
        // System.out.println(diagonalSum(mat, 3, 3));
        System.out.println(optimalSearching(mat ,3,4,15));
    }

}
