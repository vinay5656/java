package arrayEx;
public class ArrayEx2 {

	public static void main(String[] args) {
		int[][] a = {
				{2,4,3,7,9},
				{5,1,4,8,11},
				{23,54,21,9,32}
		};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<2*(a.length)-1;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}