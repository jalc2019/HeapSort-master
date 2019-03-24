package com.company;

import java.util.Scanner;

public class HeapSort {

    private static int N;

        public static void sort(int a[])
        {
            heapify(a);
            for (int i = N; i > 0; i--)
            {
                swap(a,0, i);
                N = N-1;
                maxheap(a, 0);
            }
        }

        public static void heapify(int a[])
        {
            N = a.length-1;
            for (int i = N/2; i >= 0; i--)
                maxheap(a, i);
        }




        public static void maxheap(int a[], int i)
        {
            int left = 2*i ;
            int right = 2*i + 1;
            int max = i;
            if (left <= N && a[left] > a[i])
                max = left;
            if (right <= N && a[right] > a[max])
                max = right;

            if (max != i)
            {
                swap(a, i, max);
                maxheap(a, max);
            }
        }



        public static void swap(int a[], int i, int j)
        {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }



        public static void main(String[] args)
        {
            Scanner scaner = new Scanner( System.in );
            int n, i;

            System.out.println("Ingrese la Cantidad de Elementos a Ordenar:");
            n = scaner.nextInt();

            int arr[] = new int[ n ];

            System.out.println("\nIngrese "+ n +" Elementos");
            for (i = 0; i < n; i++)
                arr[i] = scaner.nextInt();

            sort(arr);

            System.out.println("\nElementos Ordenados ");
            for (i = 0; i < n; i++)
                System.out.print(arr[i]+" ");
            System.out.println();


        }




}



