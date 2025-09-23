//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
// . ---------- 1 ---------
//        for (int i = 1; i < 20; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        ---------- 2 ---------
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

        //       ---------- 3 ---------
//        int n = 7;
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//          ----------- 4 ------

//        int[] numbersArray = new int[11];
//        for (int i = 0; i < numbersArray.length; i++) {
//            numbersArray[i] = i+1;
//            System.out.print(numbersArray[i] + " ");
//        }

//        ----------- 5 -------

//        int[] evenArray = new int[11];
//        for (int i = 0, j = -10; i < evenArray.length; i++, j+=2) {
//            evenArray[i] = j;
//            };
//        for (int i: evenArray) {
//            System.out.print(i + " ");
//        }

//        --------- 6 --------

//        int count = 0;
//        int[] countOdd = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int i = 0; i < countOdd.length; i++) {
//            if (countOdd[i] % 2 != 0) {
//                count ++;
//            }
//        }   System.out.print(count + " ");


//        ----------- 7 ------

//        int[] countOdd = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int sum = 0;
//        for (int i = 0; i < countOdd.length; i++) {
//            sum += countOdd[i];
//        }
//        System.out.print(sum);

//        ------- 8 --------
//         int[] positive = new int [] {1, 6, -3, 7 ,0, -28, -83, 18};
//         int sum = 0;
//         for (int i = 0; i < positive.length; i++) {
//             if (positive[i] >= 0) {
//                 sum += positive[i];
//             }
//         }
//         System.out.print(sum);


//        ----------- 9 --------
//        int addNums[] = new int[]{1,2,3,4,5,6,7};
//        int add = addNums[0];
//        for (int i = 1; i < addNums.length; i++) {
//            add *= addNums[i];
//        }
//        System.out.println(add);

//        ------------ 10 ---------

//        int maxNums[] = new int[]{1,2,3,4,5,6,7};
//        int maxNumber = maxNums[0];
//        for (int i = 1; i < maxNums.length; i++) {
//            if (maxNums[i] > maxNumber) {
//                 maxNumber = maxNums[i];
//            }
//        }
//        System.out.println(maxNumber);
//
//        ---------- 11. Find element which does not have its duplicate using XOR (^) --------

        int arr1[] = new int[]{2,5,7,4,5,4,2};
        int result = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            result = result ^ arr1[i];
        }
        System.out.println(result);

        arr1 = new int[]{2,5,7,4, -356, -86, 0, 25, 11, 8, 5898, -870};
        int number = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (number <= arr1[i]) {
                number = number;
            } else if (number > arr1[i]) {

            }
        }

        Teacher t1 = new Teacher();
        t1.setName("Tamara");
        System.out.println(t1.name);
        System.out.println(t1.getName());
    }
}