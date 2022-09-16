package leetCode;

public class First_Unique_Character_in_a_String_387 {
	public static int firstUniqChar(String s) {
        int startIndex=0;
        if(s.length()==1)
            return 0;
        while(startIndex<s.length())
        {
             int check=0;
            int travelIndex=s.length()-1;
            while(travelIndex>=0)
            {
                if(travelIndex==startIndex)
                {
                    travelIndex--;
                    continue;
                }
                if(s.charAt(startIndex)==s.charAt(travelIndex)){
                    check++;
                    break;
                }
                travelIndex--;
            }
             if(check==0)
                 return startIndex;
            startIndex++;
        }
        return-1;
    }
	public static void main(String[] args) {
		String str="aabb";
		System.out.println(firstUniqChar(str));

	}

}
