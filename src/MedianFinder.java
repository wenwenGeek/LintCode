import java.time.OffsetDateTime;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * MedianFinder
 *
 * @author bowen.cui
 * @date 2020/8/20 17:20
 **/
class MedianFinder {

    PriorityQueue<Integer> minHeap; //小顶堆，默认容量为11

    PriorityQueue<Integer> maxHeap;//大顶堆，容量11


    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        minHeap = new PriorityQueue<>(); //小顶堆，默认容量为11

        maxHeap = new PriorityQueue<>((i1, i2) -> i2 - i1);//大顶堆，容量11
    }

    public void addNum(int num) {
        if (minHeap.size() == maxHeap.size()) {
            if (minHeap.size() == 0) {
                minHeap.add(num);
            }else{
                if (minHeap.peek() >= num) {
                    maxHeap.add(num);
                } else {
                    minHeap.add(num);
                }
            }
        } else {
            if (minHeap.size() > maxHeap.size()) {
                if (minHeap.peek() > num) {
                    maxHeap.add(num);
                } else {
                    maxHeap.add(minHeap.poll());
                    minHeap.add(num);
                }
            }else{
                if (maxHeap.peek() < num) {
                    minHeap.add(num);
                } else {
                    minHeap.add(maxHeap.poll());
                    maxHeap.add(num);
                }
            }
        }
    }

    public double findMedian() {
        if (maxHeap.size() == 0) {
            return minHeap.peek();
        }
        if (minHeap.size() == 0) {
            return maxHeap.peek();
        }
        if(maxHeap.size()>minHeap.size()) return maxHeap.peek();
        if(maxHeap.size()<minHeap.size()) return minHeap.peek();
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(12);
        medianFinder.addNum(10);
        medianFinder.addNum(13);
        medianFinder.addNum(11);
        medianFinder.addNum(5);
        medianFinder.addNum(15);
        medianFinder.addNum(1);
        medianFinder.addNum(11);
        medianFinder.addNum(6);
        medianFinder.addNum(17);
        medianFinder.addNum(14);
        System.out.println(medianFinder.findMedian());
    }
}
