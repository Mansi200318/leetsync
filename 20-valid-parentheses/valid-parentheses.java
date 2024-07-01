class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if (stack.isEmpty()){
                stack.push(a);
            }
            else {
                char top = stack.peek();
                if (a - top == 1 || a - top == 2){
                    stack.pop();
                }
                else {
                    stack.push(a);
                }
            }
            
        } 
        return stack.isEmpty();
        
    }
}