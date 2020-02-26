/**
 * 
 * 
 * Written by Kevin Zheng
 *
 */
public class SheepHerpTester {

    public static void main(String[] args) {

        SheepHeap heap = new SheepHeap(128);
        
        heap.addSheep(new Sheep("Sheep 1",55));
        heap.addSheep(new Sheep("Sheep 2",98));
        heap.addSheep(new Sheep("Sheep 3",21));
        heap.addSheep(new Sheep("Sheep 4",38));
        heap.addSheep(new Sheep("Sheep 5",25));
        heap.addSheep(new Sheep("Sheep 6",45));
        heap.addSheep(new Sheep("Sheep 7",100));
        heap.addSheep(new Sheep("Sheep 8",35));
        heap.addSheep(new Sheep("Sheep 9",58));
        heap.addSheep(new Sheep("Sheep 10",59));
        heap.addSheep(new Sheep("Sheep 11",60));
        heap.addSheep(new Sheep("Sheep 12",67));
        heap.addSheep(new Sheep("Sheep 13",41));
        heap.addSheep(new Sheep("Sheep 14",31));
        heap.addSheep(new Sheep("Sheep 15",113));
        System.out.println("Printing them in min heap order");
        heap.sheepHeapSort();
        System.out.println();
        heap.sheepRollCall();

    }

}