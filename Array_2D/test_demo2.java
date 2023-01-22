package Array_2D;

public class test_demo2 
{
    public static void main(String[] args) 
    {
        demo2 obj = new demo2();
        
//        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
//        int a[][] = {{1,2,3,4},{5,6,7,8}};
//        int unsorted[][] = {{7,9,4},{6,2,3},{1,8,5}};
//        int matrix[][] = {{9,9,9,9,9},{8,8,8,8,8},{7,7,7,7,7},{6,6,6,6,6}};
//        int diag[][] = {{9,9,9},{8,8,8},{7,7,7}};
            
//        obj.sumOfD(a);
//        obj.upperHalf(a);
//        obj.sumOfEachRow(a);
//        obj.sumOfEachColumn(a);
//        int b[][] = obj.transpose2(a);
//        int b[][] = obj.transpose3(a);
//        int b[][] = obj.mirror(a);
//        int b[][] = obj.transpose1(a);
//        int c[][] = obj.mirror(b);
//        int b[][] = obj.rotate90(a);
//        obj.rotate90_M3(a);
//        int b[][] = obj.rotate180(a);
//        obj.hzWave(a);
//        obj.vtWave(a);
//        obj.sortMatrix(unsorted);
//        obj.sortEachRow(unsorted);
//        obj.sortEachColumn(unsorted);
//        int b[][] = obj.submatrix(matrix);
//        obj.sortCentre(matrix);
//        obj.sortDiag(diag);
//        obj.traverseBorder(a);
        int n = 6;
        int a[][] = obj.spiralGenerate(n);

        obj.print(a);
    }
}