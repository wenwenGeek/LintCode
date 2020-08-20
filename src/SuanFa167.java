/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa167 {

    public int[] twoSum(int[] numbers, int target) {

        int minPoint = 0;
        int maxPoint = numbers.length-1;

      /*  while(maxPoint<numbers.length){
            if((numbers[minPoint]+numbers[maxPoint]) == target){
                return new int[]{minPoint+1,maxPoint+1};
            }
            if((numbers[minPoint]+numbers[maxPoint]) > target){
                break;
            }
        }*/

        while(true){
            if((numbers[minPoint]+numbers[maxPoint]) == target){
                return new int[]{minPoint+1,maxPoint+1};
            }
            if((numbers[minPoint]+numbers[maxPoint]) > target){
                maxPoint--;
                continue;
            }
            if((numbers[minPoint]+numbers[maxPoint]) < target){
                minPoint++;
                continue;
            }
        }

    }

}
