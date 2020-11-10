class JenkinsDemo{
	public static void main(String[] args) {
		String s1="bcb",s2="fabcbaf";
		System.out.println("S1 is substring of S2:"+isSubstring(s1,s2));
		System.out.println("S1 and S2 are anagrams:"+isAnagram(s1,s2));
		System.out.println("S1 is palindrom:"+isPalindrom(s1));
		System.out.println("S2 is palindrom:"+isPalindrom(s2));
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

	public static boolean isAnagram(String s1,String s2){
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();		
		int n=s2.length(),m=s1.length();
		if(n!=m){return false;}
		int[] counter=new int[26];
		
		for (int i=0;i<n;++i) {
			++counter[c1[i]-'a'];
			--counter[c2[i]-'a'];
		}

		for (int i=0;i<26;++i) {
			if(counter[i]!=0){
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrom(String s){
		char[] c=s.toCharArray();
		int n=s.length();
		int j=n-1,l=n/2;

		for (int i=0;i<=l;++i) {
			if(c[i]!=c[j]){
				return false;
			}
			else{
				--j;
			}
		}

		return true;
	}
}