// Faster solution!
class Solution1 {
    public int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0; i<ops.length; i++) {
            if(ops[i].equals("+")) {
                int a = stack.pop(), b = stack.pop();
                stack.push(b);
                stack.push(a);
                stack.push(a+b);
                sum += a+b;
            }else if(ops[i].equals("D")) {
                int c = stack.pop();
                stack.push(c);
                stack.push(c*2);
                sum += c*2;
            }else if(ops[i].equals("C")) {
                sum -= stack.pop();
            }else {
                int n = Integer.parseInt(ops[i]);
                stack.push(n);
                sum += n;
            }
        }
        return sum;
    }
}

class Solution2 {
    public int calPoints(String[] ops) {
        Stack<String> in = new Stack<String>();
        Stack<String> out = new Stack<String>();
        Stack<Integer> res = new Stack<Integer>();
        for(int i=0; i<ops.length; i++) {
            if(ops[i].equals("C"))
                in.pop();
            else
                in.push(ops[i]);
        }
        while(!in.empty())
            out.push(in.pop());
        
        while(!out.empty()) {
            String s = out.pop();
            if(s.equals("D")) {
                int a = res.pop();
                res.push(a);
                res.push(a*2);
            }else if(s.equals("+")) {
                int b = res.pop(), c = res.pop();
                res.push(c);
                res.push(b);
                res.push(b+c);
            }else
                res.push(Integer.parseInt(s));
                
        }
        
        int ans = 0;
        while(!res.empty())
            ans += res.pop();
        
        return ans;
    }
}