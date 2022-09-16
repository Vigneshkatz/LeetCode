package leetCode;

public class Is_Subsequence_392 {
	public static boolean isSubsequence(String s, String t) {
        int idx1=0;
        int idx2=0;
        int count=0;
        while(idx1<s.length()&&idx2<t.length())
        {
            if(s.charAt(idx1)==t.charAt(idx2))
            {
                count++;
                idx1++;
                idx2++;
            }else{
                idx2++;
            }
        }
        if(count==s.length())
        {
            return true;
        }else 
            return false;
    }
	public static void main(String[] args) {
		String s1="ieh";
		String s2="vignesh";
		System.out.println(isSubsequence(s1,s2));

	}

}
