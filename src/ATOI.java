class ATOI {
    public int myAtoi(String str) {

        str = str.replaceAll("^\\s+", "");
        if(str.length()==0) return 0;
        char ch = str.charAt(0);
        if((ch != '-' && ch != '+') && ((int) ch -'0') < 0 || (int) ch -'0' > 9) return 0;

        System.out.println(str);
        int i = 0;
        int result = 0;
        int pow = 1;

        for(int j = 0; j < str.length(); j++){
            char c = str.charAt(j);

            if( j==0 && (c == '-' || c == '+')) continue;

            if (((int) c -'0') < 0 || (int) c -'0' > 9){
                i=j-1;
                break;
            }
            i=j;
        }

        for(;i>=0;i--){
            char c = str.charAt(i);

            if( i == 0 && (c == '-' || c == '+')) continue;

            long temp = ((long) c - '0') * (long)pow;

            if(temp > Integer.MAX_VALUE - result || i > 10){
                return ch == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result += ((int) c - '0') * pow;
            pow *= 10;
        }

        return ch == '-' ? -result : result;

    }

    public static void main(String args[]){
        ATOI obj = new ATOI();

        System.out.println(obj.myAtoi("20000000000000000000"));
    }
}