package day02;

public class ArrayConcepts {
    public static void main(String[] args) {
        //One Dimensional Array
        int[] arr = new int[] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                temp.append(arr[j]);
            }
        }
        System.out.println("Duplicate elements in given array: "+temp);
        //Two Dimensional Array
        int[][] a={{1,3,4},{2,4,3},{3,4,5}};
        int[][] b={{1,3,4},{2,4,3},{1,2,4}};
        int[][] c=new int[3][3];

        System.out.println("ADDITION MATRIX");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("SUBTRACTION MATRIX");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]-b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("MULTIPLICATION MATRIX");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
