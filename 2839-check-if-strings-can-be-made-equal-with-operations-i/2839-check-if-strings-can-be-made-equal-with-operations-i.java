class Solution {
    public boolean canBeEqual(String s1, String s2) {
        StringBuilder st1=new StringBuilder();
        StringBuilder st2=new StringBuilder();
        if(s1.charAt(0)==s2.charAt(0))
        {
            st2.append(s1.charAt(0));
            st2.append(s1.charAt(3));
            st2.append(s1.charAt(2));
            st2.append(s1.charAt(1));
        }
        else{
        st1.append(s1.charAt(2));
        st1.append(s1.charAt(1));
        st1.append(s1.charAt(0));
        st1.append(s1.charAt(3));
        String s4=st1.toString();
        if(s2.equals(s4)) return true;
        st2.append(s4.charAt(0));
        st2.append(s4.charAt(3));
        st2.append(s4.charAt(2));
        st2.append(s4.charAt(1));
        }
        String s3=st2.toString();
        System.out.println(s3);
        if(s2.equals(s3)) return true;
        return false;
    }
}