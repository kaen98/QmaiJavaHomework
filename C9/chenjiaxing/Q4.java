package C9;

class Q4 {
    public static void main(String[] args) {
        //3.统计数组【1，5，6，12，1，32，5，6】中每个元素出现的次数。
        int[] arr={1,5,6,12,1,32,5,6};
        int b=0;
        for (int i =0;i<arr.length;i++){
            if (arr[i]==0){
                continue;
            }
            b=0;
            for(int c=0;c<arr.length;c++){
                if (arr[i] == arr[c]){
                    if (i!=c){
                        arr[c] = 0;
                    }
                    b++;
                }
                if((arr.length-1) == c){
                    System.out.println(arr[i]+"出现"+b+"次");
                }
            }

        }
    }
}
