public class Demo {

    public static void main(String[] args) {

        System.out.println(maxProduct(new int[]{1,2,3,0,2,-2}));

    }

    public static int maxProduct(int[] nums) {
        int fmax1, fmax2;
        fmax2 = nums[0];
        for(int i=0; i<=nums.length-1; i++){
            fmax1 = nums[i];
            for(int j=i; j<=nums.length-1; j++){
                if(j > i){
                    fmax1 *= nums[j];
                }
                if(fmax2 < fmax1){
                    fmax2 = fmax1;
                }
            }
        }
        return fmax2;
    }
}
