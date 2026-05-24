class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c =='{' || c =='[' || c=='(' ) {
                st.push(c);
            }else if(c =='}' || c ==']' || c==')' ){
                if (st.empty()) {
                    return false;
                }

                Character ch = st.pop();
                if((ch != '{' && c =='}')|| (ch != '(' && c ==')') || (ch != '[' && c ==']')){
                    return false;
                }
            }
        }

        return st.empty();
    }
}
