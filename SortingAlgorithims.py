"""
This module can be used to
implement the sorting algorithims
bubble sort, selection sort, insertion sort,
merge sort, and quick sort.

Nolan Meyer

April 18th, 2024
"""

def bubbleSort(array):
    """
    This will iterate over each element in the list.
    It will check if the number is greater than the
    next element in the list. If it is it will swap it.
    After it goes through the first iteration the biggest
    number will be at the end of the list. 
    """

    for i in range(len(array)):

        for number in range(len(array) - i - 1):

            if array[number] > array[number + 1]:
                temp = array[number]
                array[number] = array[number + 1]
                array[number + 1] = temp


def selectionSort(array):
    """
    This will go through each elemet in the list. 
    It will check each value is smaller than the
    minimum value. If it is it will set that to 
    the minimum value. It will swap the value 
    at the first index to the smallest value in 
    the array.
    """

    for i in range(len(array)-1):

        min = i

        for j in range(min + 1,len(array)):

            if array[j] < array[min]:
                min = j
            

        temp = array[i]
        array[i] = array[min]
        array[min] = temp 


def insertionSort(array):
    """
    Will go over every element in the array.
    It will check if the element behind it is 
    greater than. If it is it will keep swapping
    until it's in the right position or until 
    the variable has reached the end of the lift
    """

    for i in range(1,len(array)):

        j = i

        while j > 0 and array[j] < array[j-1]:

            temp = array[j]
            array[j] = array[j -1]
            array[j - 1] = temp
            j-= 1


def mergeSort(array,i,k):
    """
    Takes in an array as a parameter. i is the 
    start value and k is the end value. Will keep 
    dividing the array in half unitl their is only
    one element. Then it will sort at that level. Has
    a helper function called merge
    """

    if i < k:

        #Midpoint
        j = (i + k) // 2

        #Recursivley sorts the left and right side
        mergeSort(array,i,j)
        mergeSort(array,j+1,k)

        #Sorts
        merge(array,i,j,k)


     
def merge(array,i,j,k):
    """
    Takes in the array, starting position, midpoint,
    and end position. Helper function of the mergesort
    that sorts the array. 
    """

    leftPos = i
    rightPos = j + 1 
    mergePos = 0
    mergeNumbers = []

    while leftPos <= j and rightPos <= k:

        if array[leftPos] < array[rightPos]:
            mergeNumbers.append(array[leftPos])
            leftPos += 1
        
        else:
            mergeNumbers.append(array[rightPos])
            rightPos += 1
        
        mergePos += 1
    
    #Checks if their is still some items left
    while leftPos <= j:
        mergeNumbers.append(array[leftPos])
        leftPos += 1
        mergePos += 1
    
    while rightPos <= k:
        mergeNumbers.append(array[rightPos])
        rightPos += 1
        mergePos += 1

    
    #Adds the elements to the list
    for number in range(len(mergeNumbers)):
        array[i + number] = mergeNumbers[number]


def quickSort(array,i,k):
    """
    Takes in an array as a parameter as well as
    the starting value, and end value.
    This will partition each element 
    moving all elements that are less 
    than the pivot to the left and 
    all that are greater than to the right.
    Has a helper function called partition.
    """

    if i >= k:
        return
    
    j = partition(array,i,k)

    quickSort(array,i,j)
    quickSort(array,j+1,k)

    

def partition(array,i,k):
    """
    This function partitions the
    array. It is what will move all values
    less than the pivot to the left and
    all values greater than the pivot to
    the right.
    """

    midpoint = i + (k - i) // 2
    pivot = array[midpoint]
    l = i
    h = k
    done = False

    while (not(done)):

        #Incriments until we find a value that is greater than the pivot
        while (array[l] < pivot):
            l += 1

        #Decreaments until we find a vlaue that is less than the pivot
        while (array[h] > pivot):
            h -=1

        if l >= h:
            done = True
        
        else:
            temp = array[l]
            array[l] = array[h]
            array[h] = temp

            l += 1
            h -= 1
    
    return h







#Test purposes
def main():

    array = [1,56,88,0,5,25,30]
    print(f"Array Unsorted: {array}")

    quickSort(array,0,len(array)-1)

    print(f"Array Sorted: {array}")


if __name__ == "__main__":
    main()