package com.auxolabs.general;

public class PaintJob
{
    public static void main(String[] args)
    {
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,1.5));

    }
        public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets)
        {
         if(width>=0 && height>=0 && areaPerBucket>=0 && extraBuckets>0)
         {
         double temp = width*height;
         int res= (int) Math.ceil(temp/areaPerBucket);
         int ref=res-extraBuckets;
         return ref;
         }
         return -1;
        }
        public static int getBucketCount(double width,double height,double areaPerBucket)
        {
            if(width>=0 && height>=0 && areaPerBucket>=0)
            {
                double temp1= width * height;
                int res1 =(int) Math.ceil(temp1/areaPerBucket);
                return res1;
            }
            return -1;
        }
        public static int getBucketCount(double area,double areaPerBucket)
        {
            if(area>=0 && areaPerBucket>=0)
            {
             double temp2= area/areaPerBucket;
             int c = (int) Math.ceil(temp2);
             return c ;
            }
            return -1;
        }
}


