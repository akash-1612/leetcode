class Solution {
    public List<String> validStrings(int n) {
        List<String> li = new ArrayList<>();
        recurse("", n, li);
        return li;
    }
    public void recurse(String s, int n, List<String> li) {
        if (s.length() == n) {
            li.add(s);
            return;
        }
        recurse(s + "1", n, li);
        if (s.isEmpty() || s.charAt(s.length() - 1) != '0') {
            recurse(s + "0", n, li);
        }
    }
}