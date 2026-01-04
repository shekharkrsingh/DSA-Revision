package Array;


public class Arr13 {
    public static void main(String[] args) {
        int[] arr={2,1,1,3,1,4,4,4};
        maz(arr);
    }
    private static void maz(int[] arr){
        int n=arr.length;
        int cnt1=0;
        int cnt2=0;
        int el1=-1;
        int el2=-1;
        for(int i:arr){
            if(cnt1==0 && el2!=i){
                cnt1++;
                el1=i;
            }
            else if(cnt2==0 && el1!=i){
                cnt2++;
                el2=i;
            }
            else if(i==el1){
                cnt1++;
            }
            else if(i==el2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i: arr){
            if(i==el1){
                cnt1++;
            }
            if(i==el2){
                cnt2++;
            }
        }
        if(cnt1>n/3){
            System.out.println(el1);
        }
        if(cnt2>n/3){
            System.out.println(el2);
        }
    }
}
