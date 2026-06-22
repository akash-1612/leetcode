class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> h=new HashMap<>();
        h.put('b',0);
        h.put('a',0);
        h.put('l',0);
        h.put('o',0);
        h.put('n',0);
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(h.containsKey(c))
            {
                h.put(c,h.get(c)+1);
            }
        }
        int b=h.get('b');
        int a=h.get('a');
        int l=h.get('l')/2;
        int o=h.get('o')/2;
        int n=h.get('n');
        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
}