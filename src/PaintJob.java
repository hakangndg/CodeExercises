/*
Function to help Bob with calculating the required buckets of paint
method overloading is used for different scenarios



*/
public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        
        double area = width * height;
        
        if(extraBuckets * areaPerBucket >= area){
            return 0;
        }
        double remaining_area = area - (areaPerBucket * extraBuckets);
        int neededBuckets = (int) Math.ceil(remaining_area / areaPerBucket);
        return neededBuckets;
    }
    
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 ||areaPerBucket <= 0){
            return -1;
        }
        double area = width * height;
        int needed = (int) Math.ceil(area / areaPerBucket);
        return needed;
    }
    
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}