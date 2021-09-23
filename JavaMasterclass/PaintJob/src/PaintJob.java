public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4,-2.1,1.5,2));
        System.out.println(getBucketCount(-7.25,4.3,2.35));
        System.out.println(getBucketCount(3.26d,0.75d));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket,  int extraBuckets){

        if (width <=0 || height <=0 || areaPerBucket <=0 || extraBuckets < 0 ){
            return -1;
        }

        double area = width*height;
        int bucketsToBuy = (int )Math.ceil(area/areaPerBucket) - extraBuckets;
        return bucketsToBuy;

    } //1st method ends


    public static int getBucketCount(double width,double height,double areaPerBucket){

        if (width <=0 || height <=0 || areaPerBucket <=0){
            return -1;
        }

        double area = width*height;
        int bucketsToBuy = (int )Math.ceil(area/areaPerBucket);
        return bucketsToBuy;


    } //end os 2nd method

    public static int getBucketCount(double area,double areaPerBucket) {

        if (area<=0 || areaPerBucket <=0) {
            return -1;
        }

        int bucketsToBuy = (int) Math.ceil(area / areaPerBucket);
        return bucketsToBuy;
    } //end of 3rd method


}
