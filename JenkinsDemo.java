class JenkinsDemo{
	public static void main(String[] args) {
		String s1="bcb",s2="fabcbaf";
		System.out.println("S1 is substring of S2:"+isSubstring(s1,s2));
	}

	public static boolean isSubstring(String s1,String s2){
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();		
		int n=s2.length(),m=s1.length(),count=0;
		for (int i=0;i<n;++i) {
			if (c1[count]==c2[i]) {
				++count;
				if (count==m) {
					return true;
				}
			}
			else{
				if (count!=0) {
					if(c1[0]==c2[i]){
						count=1;
					}
					else{count=0;}	
				}
			}
		}
		return false;
	}
}
