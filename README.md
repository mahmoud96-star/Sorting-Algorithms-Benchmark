# Sorting-Algorithms-Benchmark


## 1. Student Information

- **Student Name:** [Mahmoud fituri]
- **University ID:** [3167122]
- **Section Number:** [DSA Group C]
- **Programming Language:** Java
- **Array Size:** 100,000 integers

## 2. Project Description

This project compares the execution time of five sorting algorithms using four different input cases.

### Sorting Algorithms
1. Selection Sort
2. Insertion Sort
3. Bubble Sort

### Input Cases
- Random: Randomly ordered integers.
- Reverse Sorted: Integers arranged from largest to smallest.
- Partially Sorted: Approximately 80% of the data is sorted.
- Fully Sorted: Integers arranged from smallest to largest.

## 3. Experimental Method

The program uses `System.nanoTime()` to measure execution time.

Execution time is calculated in microseconds using:

`Execution Time (µs) = (End Time - Start Time) / 1000`

Each algorithm receives an independent copy of the original input array. Array copying is excluded from the measured execution time.

## 4. Benchmark Results

Replace the placeholders with the actual measurements from your Java program.

| Algorithm | Random (µs) | Reverse (µs) | Partial (µs) | Sorted (µs) |
|---|---:|---:|---:|---:|
| Selection Sort | [5526296] | [5469055] | [2824550] | [2786715] |
| Insertion Sort | [3061897] | [5540674] | [599324] | [127] |
| Bubble Sort | [17639728] | [7477155] | [4682970] | [1948000] |

## 5. Performance Analysis

### O(N²) Algorithms

Selection Sort, Insertion Sort, and Bubble Sort have O(N²) average or worst-case time complexity, although Insertion Sort performs well on already sorted or nearly sorted data.


### Best Performance

Based on the measured results, the best-performing algorithm for each input case is:

- Random: [Insertion]
- Reverse Sorted: [Selection]
- Partially Sorted: [Insertion]
- Fully Sorted: [Insertion]

These conclusions must be based on the actual benchmark measurements.

## 6. Quick Sort and Pivot Selection

Quick Sort selects a pivot and partitions the array into elements smaller than the pivot and elements greater than or equal to it.

If the pivot repeatedly creates highly unbalanced partitions, Quick Sort may degrade to O(N²). This can occur when the last element is consistently selected as the pivot for already sorted or reverse-sorted arrays.

Better pivot strategies, such as randomized or median-of-three selection, can reduce the likelihood of poor partitions.

## 7. Conclusion

This benchmark demonstrates how input order and algorithm design affect sorting performance. The experimental results can be used to compare simple quadratic sorting algorithms with the more scalable Quick Sort algorithms.

## 8. Performance Chart

![Sorting Algorithms Benchmark](Sorting_Algorithms_Execution_Time_Comparison.png)

