 class Solution {
        public boolean backspaceCompare(String u, String t) {
            String d=t;
            String b=u;
            StringBuilder a = new StringBuilder(u);
            StringBuilder c=new StringBuilder(t);

            int len=a.length();
            int v=0;
            int count = 0;
            while (count != len) {
                v=len-a.length();
                v=count-v;
                String temp=Character.toString(b.charAt(count));
                if(temp.equals("#") && v!=0) {

                    a.deleteCharAt(v-1);
                    a.deleteCharAt(v-1);

                }
                else if(temp.equals("#") && v==0) {
                    a.deleteCharAt(v);
                }

                count = count + 1;
            }

            len=d.length();
            v=0;
            count=0;
            while (count != len) {
                v=len-c.length();
                v=count-v;
                String temp=Character.toString(d.charAt(count));
                if(temp.equals("#") && v!=0) {

                    c.deleteCharAt(v-1);
                    c.deleteCharAt(v-1);

                }
                else if(temp.equals("#") && v==0) {
                    c.deleteCharAt(v);
                }

                count = count + 1;
            }

            if(a.compareTo(c)==0){
                return true;
            }
            else {
                return false;
            }
        }
    }
