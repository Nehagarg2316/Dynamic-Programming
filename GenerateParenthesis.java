class Solution {
    public void solve(int n,List<String> ans,String str,int open,int close)
    {
        if(str.length()==n*2)
        {
            ans.add(str);
            return;
        }
        if(open<n)
        {
            solve(n,ans,str+'(',open+1,close);
        }
        if(close<open)
        {
            solve(n,ans,str+')',open,close+1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        String str="";
        solve(n,ans,str,0,0);
        return ans;
    }
}