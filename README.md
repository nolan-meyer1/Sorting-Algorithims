# Sorting-Algorithims

### Overview
This repository contains some of the most popular sorting algorithims written in both Java and Python. The sorting algorithims in this repository are
Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, and lastly Quick Sort. I will go in depth about how these algorithims work! All of the names
for the functions that will be documented below have the same name in both the Java and Python file. 

### Bubble Sort:
This is one of the easiest sorting algorithims to implement and has a time complexity of O(n^2). This will used a nested for loop. The outer for loop will start
at zero and go until the end of the arry. The inner for loop will go the end of the list minus i. The reason we do this is because on each inner for loop we want
to check if current value in the iteration is greater than the next term. If it is we want to swap it. Then we repeat this process until the biggest element is at
the end of the array. That is why we minus i because if we go through the first iteration and now i is equal to one we know that the last element in the array is sorted
so we only want to iterate until the item before that element. 
EX:
![image](https://github.com/nolan-meyer1/Sorting-Algorithims/assets/145584308/d14c0086-c1dc-47aa-954a-351c9317a433)

### Selection Sort:
This algorithim is a similar to bubble sort but a little different. Selection sort also has a time complexity of O(n^2). We will use an outer for loop that will keep track 
of the minimum value, and an inner for loop to iterate over the list. What we will do is set a variable min that is equal to the i of the outer for loop. Then we will have 
an inner for loop that starts at the min value plus one. Then we will iterate over the entire list checking conditions to see if the value that is being iterated over is less
than the min. If it is that is the new min. We will then swap the value of i with the value of min. We will repeat this process until the array is sorted. 
EX:

![image](https://github.com/nolan-meyer1/Sorting-Algorithims/assets/145584308/a0e1e215-94e9-44a0-a681-a178a4895a4b)

### Insertion Sort:
This algorithim also has a time complexity of O(n^2) and will use nested for loops. This time the outer for loop will start at one instead of zero because we want to compare 
it to the element behind it, and we will assign a variable to hold that value. We will the use a while loop that will keep going while the variable is greater than zero and
the current element is less than the element behind it meaning that those elements need to be swapped. It will continue to do this until the array is sorted.

EX:

![image](https://github.com/nolan-meyer1/Sorting-Algorithims/assets/145584308/c90fecb0-57af-469d-9f2c-aa6055e05d95)

### Merge Sort:
This is a recursive algorithim that has a time complexity of O(n log n) meaning it is one of the most effiecient sorting algorithims. What this algorithim will do
is it will cut the algorithim in half by it's midpoint and then it will keep going that until there is only one element on each side. Then at each level the elements 
will be sorted.

EX:

![image](https://github.com/nolan-meyer1/Sorting-Algorithims/assets/145584308/0939e424-7d4f-43dc-ac23-ff83d854a896)

### Quick Sort:
The last algorithim is the Quick Sort algorithim. This is another recursive algorithim that has a time complexity of O(n log n). What this algorithim does is it looks at a pivot
value which is usually a midpoint and then partitions the values so that every element that is less than the pivot is on the left and every value greater than the pivot is on the 
the right. It will then break down similar to merge sort if you make your pivot the midpoint and then do this same process at each level. 

EX:

![image](https://github.com/nolan-meyer1/Sorting-Algorithims/assets/145584308/5718b85c-5773-4ab4-815f-c9afd8e1fffc)


