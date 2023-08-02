package top10.interview.questions.graph.dp;

public class LongestCommonSubsequence{

int count = 0;
int lcs(char[] X, char[] Y, int xSize, int ySize) {
	
	System.out.println("Elements in X array = " + String.valueOf(X));
	System.out.println("Elements in Y array = " + String.valueOf(Y));
	System.out.println("Siez of X = " + xSize);
	System.out.println("Siez of Y = " + ySize);
	int printCount = count++; 
	System.out.println("------------------"+printCount+"-------------------------");
	
	
	
	if(xSize ==0 || ySize==0) {
		return 0;
	}
	
	if(X[xSize-1] == Y[ySize-1])
		return 1 + lcs(X, Y, xSize-1, ySize-1);
	else
	return max(lcs(X, Y, xSize, ySize-1),lcs(X, Y, xSize-1, ySize));

}

int max(int a, int b) {
return a > b ? a :b;
}

public static void main(String[] args ) {
	LongestCommonSubsequence lcs = new LongestCommonSubsequence();
	String s1 = "AGGTAB";
	String s2 = "GXTXAYB";
	int xSize = s1.length();
	int ySize = s2.length();
	
	char[] X = s1.toCharArray();
	char[] Y = s2.toCharArray();
	
	System.out.println("Length of LCS is " + " "+ lcs.lcs(X,Y, xSize, ySize));

}
}
