#include<iostream>
int max(int a, int b) { return (a > b) ? a : b; }

int knapSack(int wgt[], int val[], int weight, int index){
    if(index==0 || weight==0){
        return 0;
    }
    if(wgt[index]>weight){
         return knapSack(wgt, val, weight, index - 1);
    }
    else
        return max(val[index] + knapSack(wgt, val, weight - wgt[index], index - 1), knapSack(wgt, val, weight, index - 1));
}

int main(){
    int wgt[] = { 1, 2, 3, 4, 5 };
    int value[] = {4, 6, 2, 1, 5};
    int weight = 10;
    std::cout << knapSack(wgt, value, weight, 5);
}