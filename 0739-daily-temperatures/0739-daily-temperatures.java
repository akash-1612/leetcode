class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] r=new int[t.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<t.length;i++)
        {
            while(!st.isEmpty()&&t[i]>t[st.peek()])
            {
                int j=st.pop();
                r[j]=i-j;
            }
            st.push(i);
        }
        return r;
    }
}