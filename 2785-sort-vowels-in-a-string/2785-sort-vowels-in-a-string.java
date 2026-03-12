class Solution {
    public String sortVowels(String s) {
        char[] a=s.toCharArray();
        String s1="";
        String v="";
        String vow="AaEeIiOoUu";
        for(int i=0;i<s.length();i++)
        {
            if(vow.indexOf(s.charAt(i))!=-1) s1+=s.charAt(i);
        }
        char[] arr=s1.toCharArray();
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(vow.indexOf(a[i])!=-1) a[i]=arr[j++];
        }
        return new String(a);
    }
}