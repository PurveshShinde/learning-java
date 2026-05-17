package com.example.com;

class Order {
    int orderID;
    String customerType;
    double orderValue;
    int deliveryTime;

    Order(int orderID, String customerType, double orderValue, int deliveryTime) {
        this.orderID = orderID;
        this.customerType = customerType;
        this.orderValue = orderValue;
        this.deliveryTime = deliveryTime;
    }

    public String toString() {
        return orderID + ", " + customerType + ", " + orderValue + ", " + deliveryTime + " days";
    }
}

public class DIET_DSA005 {

    public static void main(String[] args) {

        Order[] orders = {
            new Order(101, "Regular", 500.00, 5),
            new Order(102, "Prime", 300.00, 3),
            new Order(103, "Prime", 700.00, 4),
            new Order(104, "Regular", 500.00, 2),
            new Order(105, "Prime", 700.00, 2)
        };

        mergeSort(orders, 0, orders.length - 1);

        for (Order o : orders) {
            System.out.println(o);
        }
    }

    static void mergeSort(Order[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(Order[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Order[] L = new Order[n1];
        Order[] R = new Order[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (compare(L[i], R[j]) <= 0) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    static int compare(Order a, Order b) {

        // 1. Prime first
        if (!a.customerType.equals(b.customerType)) {
            return a.customerType.equals("Prime") ? -1 : 1;
        }

        // 2. Higher order value first
        if (a.orderValue != b.orderValue) {
            return Double.compare(b.orderValue, a.orderValue);
        }

        // 3. Lower delivery time first
        if (a.deliveryTime != b.deliveryTime) {
            return Integer.compare(a.deliveryTime, b.deliveryTime);
        }

        return 0;
    }
}